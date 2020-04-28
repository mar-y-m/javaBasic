package Lessons.location;

import java.util.Arrays;

public class City {

    public String cityName = "default";
    public int citySize;
    private static String cityFine = "very fine";
    public String key = "spb";

    private String name;

    private Street[] streetArray;

    public City(){

    }

    public City(final String name, final Street[] streetArray)
    {
        this.name = name;
        this.streetArray = streetArray;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "name='" + name + '\'' +
                ", streetArray=" + Arrays.toString(streetArray) +
                '}';
    }

    public static String isCityFine(){
        return cityFine;
    }

    public static void changeYourMind (String a){
        cityFine = a;
    }

}
