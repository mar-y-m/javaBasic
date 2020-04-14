package Lesson0204;

import Lesson0204.animal.Cat;
import Lesson0204.animal.Tiger;
import Lesson0204.animal.Tiger2;
import Lesson0204.location.BetterCity;
import Lesson0204.location.City;

public class StartPoint {

    public static void main(String[] args){

    }

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
    public static void nullLesson (String[] args){
        NullLesson.startLessonExample();
    }
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
    public static void catStuff(){
        System.out.println(Cat.showWeight());

        Cat.drink();
        Cat.eat(3);

        Person.hiCat();
        Person.changeCatName("Bro");
        Person.hiCat();

        System.out.println(Cat.showWeight());
    }
    public static void dogStuff(){
        Person.playWithDog();
    }
    public static void tigerStuff(){
        System.out.println("we have "+Tiger.tigerCounter+" tigers.");

        Tiger tiger = new Tiger();
        System.out.println(tiger.getCurrentCounter());
        System.out.println("tiger name "+ tiger.name);
        tiger.addOneMore();
        tiger.name = "bro";
        System.out.println("tiger has "+tiger.getCurrentCounter());
        System.out.println("tiger name now "+tiger.name);

        System.out.println("now we have "+Tiger.tigerCounter+" tigers.");

        Tiger anotherTiger = new Tiger();
        System.out.println("another tiger has " + anotherTiger.getCurrentCounter());
        System.out.println("another tiger name "+anotherTiger.name);

        System.out.println("we have "+Tiger.tigerCounter+" tigers.");

        new Tiger();
        new Tiger();
        new Tiger();
        System.out.println("we have "+Tiger.tigerCounter+" tigers.");
    }
}
