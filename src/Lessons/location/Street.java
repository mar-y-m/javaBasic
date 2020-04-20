package Lessons.location;

import java.util.Objects;

public class Street {
    public String name = "Lenina";
    public String description = "street";
    public int key = 1;

    public Street(){
        //System.out.println("New street in our city!");
    }

    public Street(String a){
        this();
        name = a;
    }

    public Street(String a, String b, int c){
        this();
        name = a;
        description = b;
        key = c;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return key == street.key &&
                Objects.equals(name, street.name) &&
                Objects.equals(description, street.description);
    }

    public static int checkStreetCopiesCount(Street[] array, Street street){
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(street)){
                count++;
            }
        }
        return count;
    }
}
