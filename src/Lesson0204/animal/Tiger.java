package Lesson0204.animal;

public class Tiger {
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

}
