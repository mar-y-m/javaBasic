package Lessons.HW;

import Lessons.location.BetterCity;
import Lessons.location.City;

public class CitiesHW {
    public static void cities(){
        //cities
        City city1 = new City();
        city1.cityName = "Lisbon";
        city1.citySize = 100500;
        System.out.println("City #1 is " + city1.cityName + ", and it's this big: "+city1.citySize);

        City city2 = new City();
        System.out.println("City #1 is going to be default: " + city2.cityName + ", and it's going to be empty: "+city2.citySize);

        City city3 = new City();
        System.out.println("Is the city fine? "+ city3.isCityFine());
        city3.changeYourMind("not so much");
        System.out.println("Is the city still fine? "+ city3.isCityFine());

        City city4 = new City();
        city4.cityName = "Berlin";
        System.out.println("Is "+city4.cityName+" fine? "+city4.isCityFine());

        BetterCity cityConstruct = new BetterCity("Rome", 2000000);
        System.out.println("City #5 is " + cityConstruct.cityName + ", and it's this big: "+cityConstruct.citySize);
    }
}
