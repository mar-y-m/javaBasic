package Lessons.HW;

import Lessons.animal.*;

public class TryCatchHW {

    public static void tryCatchHW(){
        Animal[] animals = new Animal[]{new Tiger(), new Sheep(), new Tiger(), new Sheep("dave"), new Sheep("mike", 3)};
        Animal[] animals1 = new Animal[]{new Tiger(), new Tiger(), new Tiger()};
        Animal[] animals2 = new Animal[]{new Sheep("ben"), new Sheep(), new Sheep("tim")};
        Animal[] animals3 = new Animal[3];

        Sheep[] result = filterOnlySheep1(animals);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        };
        try{Sheep[] result1 = filterOnlySheep1(animals1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result1[i]);
        };} catch (Exception e) {
            System.out.println("that was a failure "+e.getMessage());
        }
        Sheep[] result2 = filterOnlySheep1(animals2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result2[i]);
        };
        try{Sheep[] result3 = filterOnlySheep1(animals3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result3[i]);
        };} catch (Exception e) {
            System.out.println("that was a failure "+e.getMessage());
        }

    }
/*
    public static Sheep[] filterOnlySheep(Animal[] animals){
        Animal[] step1 = animals;
        int count = 0;
        for (int i = 0; i < step1.length; i++) {
            if(step1[i] instanceof Sheep){
                step1[i] = step1[i];
                count++;
            }
            else{
                step1[i] = null;
            }
        }
        System.out.println(count);
        for (int i = 0; i < step1.length; i++) {
            System.out.println(step1[i]);
        }
        Animal[] step2 = step1;
        for (int i = 0; i < step2.length; i++) {
            if (i + 1 < step2.length) {
                if (step2[i] == null) {
                    step2[i] = step2[i + 1];
                    step2[i + 1] = null;
                    System.out.println("current animal is "+step2[i]);
                }
            }
        }

        for (int i = 0; i < step2.length; i++) {
            System.out.println(step2[i]);
        }
        Sheep[] result = new Sheep[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = (Sheep) step2[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
*/

    public static Sheep[] filterOnlySheep1(Animal[] animals){
        Sheep[] result=new Sheep[0];
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Sheep){
                Sheep sheep = (Sheep) animals[i];
                Sheep[] oldResult = result;
                result = new Sheep[result.length +1];
                for (int j = 0; j < oldResult.length; j++) {
                    result[j]=oldResult[j];
                }
                result[result.length-1] = sheep;
            }
        }
        return result;
    }

    public static Sheep[] filterSelectedAnimal(Animal[] animals, Animal newAnimal){
/*
        Animal[] result=new Animal[0];
        Class<? extends Animal> animalClass;
        animalClass = newAnimal.getClass();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Sheep){
                Sheep sheep = (Sheep) result[i];
                Sheep[] oldResult = (Sheep[]) result;
                result = new Sheep[result.length +1];
                for (int j = 0; j < oldResult.length; j++) {
                    result[j]=oldResult[j];
                }
                result[result.length-1] = sheep;
            }

        }
*/
        return null;
    }
}
