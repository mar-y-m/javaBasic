package Lesson0204.animal;

import java.util.Scanner;

public class Dog {

    static String breed = "retriever";
    static String dogName = "Rex";
    static int dogAge = 6;
    static String dogGender = "male";
    static String dogFavouriteToy = "ball";

    public static void gaf(){
        System.out.println("bork!");
    }

    public static int getAge(){
        return dogAge;
    }

    public static void appendYear(int count){
        if (count + dogAge > 200){
            System.out.println("Someone lied on the dog resume.");
        }
        else {
            dogAge = count + dogAge;
            System.out.println("The future is now! The dog is " + dogAge + " years old.");
        }
    }

    public static boolean guessAge(int[] optionArray){

        boolean guess = false;

        for (int i = 0; i < optionArray.length; i++) {
            if(optionArray[i] == dogAge){
                guess = true;
            }
            else {
                guess = false;
            }
        }
        return guess;
    }

    public static int[] ageOptions(){

        int[] optionsArray = new int[3];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Try to guess how old is the dog! You have 3 guesses. Enter your first guess:");
        optionsArray[0] = keyboard.nextInt();

        keyboard = new Scanner(System.in);
        System.out.println("Great! Enter your second guess:");
        optionsArray[1] = keyboard.nextInt();

        keyboard = new Scanner(System.in);
        System.out.println("Thank you! Time for your last guess:");
        optionsArray[2] = keyboard.nextInt();

        return optionsArray;
    }

    public static String getDogName(){
        return dogName;
    }

}
