package Lesson0204.location;

public class City {

    public String cityName = "default";
    public int citySize;
    private static String cityFine = "very fine";
    public String key = "spb";

    public static String isCityFine(){
        return cityFine;
    }

    public static void changeYourMind (String a){
        cityFine = a;
    }


}
