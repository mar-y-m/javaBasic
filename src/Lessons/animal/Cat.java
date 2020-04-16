package Lessons.animal;

public class Cat {

    private static int weight = 100;
    public static String name = "Barsik";

    public static void drink(){
        System.out.println("Cat drink");
    }

    public static void eat(int countTimes){

        int a = 10;
        for (int i = 0; i < countTimes; i++) {

            System.out.println("Cat eat. Current weight = " + weight);
            weight++;

        }
    }

    public static int showWeight(){
        return weight;
    }

    public static int setWeight(int newWeight){
        return weight=newWeight;
    }
}
