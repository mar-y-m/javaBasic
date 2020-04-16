package Lessons.location;

public class Street {
    public String name = "Lenina";
    public String description = "street";
    public int key = 1;

    public Street(){
        System.out.println("New street in our city!");
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
}
