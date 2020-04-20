package Lessons.HW;

import Lessons.location.Street;

public class StreetArrayHW {
    public static void streetArrayCount(){

        Street street1 = new Street();
        Street street2 = new Street("Kirova");
        Street street3 = new Street("Pirogova", "street", 12);
        Street street4 = new Street("Pushkinskaya", "ulitsa", 10);
        Street street5 = new Street("Nikitinskaya");

        Street[] streetArray = new Street[]{street1, street1, street1, new Street(),
                street2, street2, street2,
                street3, street3,
                street4,
                street5, street5, street5, street5, street5};


        System.out.println("We have "+Street.checkStreetCopiesCount(streetArray, street5)+" equal streets in the city.");

    }
}
