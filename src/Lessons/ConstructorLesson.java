package Lessons;

import Lessons.animal.Sheep;

public class ConstructorLesson {

    public static void    startLessonExample()
    {
//        Sheep sheep1 = new Sheep();
//        System.out.println("sheep 1 = "+sheep1.name+". sheep legs = "+sheep1.countLegs);
//
//        Sheep sheep2 = new Sheep("aleksey", 17);
//        System.out.println("sheep 2 = "+sheep2.name+". sheep legs = "+sheep2.countLegs);
//
//        System.out.println(sheep1);
//        System.out.println(sheep2.toString());

        Sheep[] sheepArray = new Sheep[]{new Sheep("name", 5), new Sheep(), new Sheep("mee")};
        for (int i = 0; i < sheepArray.length; i++) {
            System.out.println(sheepArray[i]);
        }
    }
}
