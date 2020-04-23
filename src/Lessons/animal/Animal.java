package Lessons.animal;

public abstract class Animal {
    public Animal(){
        super();
        System.out.println("construct an animal");
    }
    public void eat(){
        System.out.println("animal go eat");
    }
    public void drink(){
        System.out.println("animal go drink");
    }
    public void run(){
        System.out.println("animal go run");
    }
}
