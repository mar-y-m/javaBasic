package Lesson0204;

import Lesson0204.animal.Cat;
import Lesson0204.animal.Dog;

import java.util.Scanner;

public class Person {

    public static void hiCat(){
        System.out.println("Hi " + Cat.name);
    }

    public static void changeCatName(String newName){
        Cat.name = newName;
    }

    public static void playWithDog(){
        Dog.gaf();
        System.out.println("You can hear one good boy barking! His name is " + Dog.getDogName() + ".");

         int[] letsGuess = Dog.ageOptions();

        if (Dog.guessAge(letsGuess) == true){
            System.out.println("Wow you've guessed the dog age! It's " + Dog.getAge() + " years old.");
        }
        else {
            System.out.println("Oh no dog's age remains a mystery.");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to know how old will "+Dog.getDogName()+" be in future? Set the timespan yourself!");

        int count = keyboard.nextInt();
        Dog.appendYear(count);
    }
}
