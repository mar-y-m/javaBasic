package Lessons.HW;

import Lessons.location.BetterCity;

public class NPEArrayHW {
    public static void npeArray(){
        //npe array
        BetterCity[] cityArray = new BetterCity[10];
        BetterCity arrayCity1 = new BetterCity("msk", 8000500);
        BetterCity arrayCity2 = new BetterCity("vrn", 1000000);
        BetterCity arrayCity3 = new BetterCity("spb", 203040);
        cityArray[0] = arrayCity1;
        cityArray[1] = arrayCity2;
        cityArray[2] = arrayCity3;
        for (int i = 0; i < cityArray.length; i++) {
            BetterCity currentCity = cityArray[i];
            if (currentCity != null) {
                System.out.println("current city key is " + currentCity.key);
            }
        }
    }
}
