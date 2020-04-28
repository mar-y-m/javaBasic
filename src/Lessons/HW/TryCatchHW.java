package Lessons.HW;

import Lessons.animal.*;

import java.util.Arrays;

public class TryCatchHW {

    public static void tryCatchHW(){
        Animal[] animals = new Animal[]{new Tiger(), new Sheep(), new Tiger(), new Sheep("dave"), new Sheep("mike", 3)};
        Animal[] animals1 = new Animal[]{new Tiger(), new Tiger(), new Tiger()};
        Animal[] animals2 = new Animal[]{new Sheep("ben"), new Sheep(), new Sheep("tim")};
        Animal[] animals3 = new Animal[3];

        Animal[] filter = filterSelectedAnimal(animals, new Tiger());
        System.out.println(Arrays.toString(filter));
        Animal[] filter1 = filterSelectedAnimal(animals1, new Tiger());
        System.out.println(Arrays.toString(filter1));
        Animal[] filter2 = filterSelectedAnimal(animals2, new Tiger());
        System.out.println(Arrays.toString(filter2));
        Animal[] filter3 = filterSelectedAnimal(animals3, new Tiger());
        System.out.println(Arrays.toString(filter3));

        Animal[] result = filterOnlySheep1(animals);
            System.out.println(Arrays.toString(result));
        Animal[] result1 = filterOnlySheep1(animals1);
            System.out.println(Arrays.toString(result1));
        Animal[] result2 = filterOnlySheep1(animals2);
            System.out.println(Arrays.toString(result2));
        Animal[] result3 = filterOnlySheep1(animals3);
            System.out.println(Arrays.toString(result3));

    }

    public static Animal[] filterOnlySheep1(Animal[] animals){
        Animal[] result=new Sheep[0];

        for (Animal animal: animals) {
            if(animal instanceof Sheep){
                result = prepareNewArray(result);
                Sheep sheep = (Sheep) animal;
                result[result.length-1] = sheep;
            }
        }
        return result;
    }
    private static Animal[] prepareNewArray(Animal[] oldArray){
        Animal[] result = new Animal[oldArray.length +1];
        for (int j = 0; j < oldArray.length; j++) {
            result[j]=oldArray[j];
        }
        return result;
    }

    public static Animal[] filterSelectedAnimal(Animal[] animals, Animal newAnimal){
        Animal[] result = new Animal[0];

        for(Animal animal: animals) {
            try{if (animal.getClass()==newAnimal.getClass()) {
                result = prepareNewArray(result);
                Animal newOne = animal;
                result[result.length-1] = newOne;
            }} catch (NullPointerException e) {
                System.out.println("oh no! "+e.getMessage());
            }
        }
        return result;
    }
}
