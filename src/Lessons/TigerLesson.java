package Lessons;

import Lessons.animal.Tiger;

public class TigerLesson {
    public static void tigerStuff(){
        System.out.println("we have "+ Tiger.tigerCounter+" tigers.");

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
