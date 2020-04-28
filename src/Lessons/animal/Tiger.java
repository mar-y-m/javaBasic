package Lessons.animal;

public class Tiger extends Animal{
    public static int tigerCounter = 0;
    private int kittenCount = 0;
    public String name = "(empty)";
    public void addOneMore(){
        kittenCount++;
    }

    public int getCurrentCounter(){
        return kittenCount;
    }

    public Tiger(){
        tigerCounter++;
    }

    @Override
    public boolean canSpeak() {
        return false;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "kittenCount=" + kittenCount +
                ", name='" + name + '\'' +
                '}';
    }
}
