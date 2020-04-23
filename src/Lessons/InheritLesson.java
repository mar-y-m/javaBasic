package Lessons;

import Lessons.animal.Animal;
import Lessons.animal.Sheep;

public class InheritLesson {
    public static void startLessonExample(){
        Sheep sheep = new Sheep();

        sheep.drink();
        sheep.eat();
        sheep.run();
        sheep.doIt();

        Animal animal = new Sheep();
        animal.drink();
        animal.eat();
        animal.run();

    }
}
