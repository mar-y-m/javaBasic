package Lessons.animal;

import java.util.Objects;

public class Sheep extends Animal {
    public String name = "default name";
    public int countLegs = 4;

    public Sheep(){
        super();
        System.out.println("Hi!");
    }

    public void drink(){
        System.out.println("sheep go drink");
    }

    @Override
    public boolean canSpeak() {
        return true;
    }

    public void doIt(){
        System.out.println("do it");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return countLegs == sheep.countLegs &&
                Objects.equals(name, sheep.name);
    }

}
