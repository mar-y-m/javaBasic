package Lesson0204;

import Lesson0204.animal.Cat;
import Lesson0204.animal.Tiger;
import Lesson0204.animal.Tiger2;

public class StartPoint {

    public static void main(String[] args){
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
}
