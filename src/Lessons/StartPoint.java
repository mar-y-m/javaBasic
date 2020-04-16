package Lessons;

import Lessons.HW.CitiesHW;
import Lessons.HW.NPEArrayHW;
import Lessons.HW.StreetHW;

public class StartPoint {

    public static void main(String[] args){
        StreetHW.newStreet();
    }


    public static void nullLesson (String[] args){
        NullLesson.startLessonExample();
    }
    public static void ConstructorLesson (String[] args){
        ConstructorLesson.startLessonExample();
    }
    public static void npeArray(){
        NPEArrayHW.npeArray();
    }
    public static void citiesHW(){
        CitiesHW.cities();
    }
    public static void catStuff(){
        CatLesson.catStuff();
    }
    public static void dogStuff(){
        Person.playWithDog();
    }
    public static void tigerStuff(){
        TigerLesson.tigerStuff();
    }
}
