package Lessons;

import Lessons.animal.*;

public class TryLesson {
    public static void startLessonExample(){

        Animal[] animals = new Animal[]{
                new Tiger(),
                new Sheep(),
                new Sheep("mek")};
        //System.out.println(TryLesson.countAnimals(animals[]);
        speakWithAnimal(animals);
        
    }

    private static void speakWithAnimal(Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            System.out.println("i = "+ i);

            try
            {   Animal animal = animals[i];
                System.out.println(animal);
                Sheep sheep = (Sheep) animal;
                sheep.doIt();
            }catch(ClassCastException e)
            {
                System.out.println("все уронили");
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException a){
                System.out.println("Все уронили опять");
                System.out.println(a.getMessage());
            }
            finally {
                System.out.println("finally there");
            }

/*
            if(animal instanceof Sheep)//if(animal.getClass()==Sheep.class)
            {
                System.out.println("Hi sheep!");
                Sheep sheep1 = (Sheep) animal;
                sheep.doIt();
            }
            if(animal instanceof Tiger){
                System.out.println("Hi tiger!");
            }
            if(animal instanceof Animal){
                System.out.println("Hi animal!");
            }
*/

            //System.out.println("Class info" + animal.getClass());

        }
/*
    private int countAnimals(Animal[] animals){
        int result = 0;
        for (int i = 0; i < animals.length; i++) {
            result++;
        }
        return result;
    }
*/

    }

}
