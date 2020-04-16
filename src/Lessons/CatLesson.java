package Lessons;

import Lessons.animal.Cat;

public class CatLesson {
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
