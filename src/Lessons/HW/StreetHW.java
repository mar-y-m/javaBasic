package Lessons.HW;

import Lessons.location.Street;

public class StreetHW {
    public static void newStreet(){
        Street[] streetArray = new Street[10];
        streetArray[0] = new Street();
        streetArray[1] = new Street("Kirova");
        streetArray[2] = new Street("Podedy", "bulvar", 24);

        for (int i = 0; i < streetArray.length; i++) {
            Street currentStreet = streetArray[i];
            if(currentStreet != null){
                System.out.println(currentStreet);
            }
            else{
                currentStreet = new Street();
                System.out.println(currentStreet);
            }
        }
    }

}
