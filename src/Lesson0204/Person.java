package Lesson0204;

import Lesson0204.animal.Cat;
import Lesson0204.animal.Dog;

public class Person {

    public static void hiCat(){
        System.out.println("Hi " + Cat.name);
    }

    public static void changeCatName(String newName){
        Cat.name = newName;
    }

    public static void playWithDog(){
        Dog.gaf();
        Dog.getAge();
        //Dog.appendYear(226);

         int[] letsGuess = Dog.ageOptions();

        if (Dog.guessAge(letsGuess) == true){
            System.out.println("Wow you've guessed the dog age! It's " + Dog.getAge() + " years old.");
        }
        else {
            System.out.println("Oh no dog's age remains a mystery.");
        }
    }
}
