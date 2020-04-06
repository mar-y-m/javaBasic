package lesson3103Pack.actor;

public class Person {

    public static void walk(){
        System.out.println("person walk");
    }

    public static void eat(){
        System.out.println("person eat");
    }

    public static void play(){
        System.out.println("person play");
    }

    private static void sleep(){
        System.out.println("person sleep");
    }

    public static void sleepLongTime(){
        sleep();
        System.out.println("long time");
    }

    public static void speakWithFish(){
        Fish.doNothingAgain();
    }
}
