package Lesson0204;

import Lesson0204.animal.Cat;

public class Main {

    public static void main(String[] args){

        Person.playWithDog();
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
}
