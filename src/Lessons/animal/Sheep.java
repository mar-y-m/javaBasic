package Lessons.animal;

public class Sheep {
    public String name = "default name";
    public int countLegs = 4;

    public Sheep(){
        System.out.println("Hi!");
    }

    public Sheep( String a, int b){
        this();
        name = a;
        countLegs = b;
    }

    public Sheep(String c){
        this(c, 10);
        name = c;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", countLegs=" + countLegs +
                '}';
    }
}
