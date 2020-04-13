package Lesson0204;

import Lesson0204.animal.Tiger;

public class NullLesson {

    public static void startLessonExample(){

        int [] array = new int [6];

        Tiger [] tigerArray;
        tigerArray = new Tiger[]{new Tiger(), new Tiger(), null, new Tiger()};

        for (int i = 0; i < tigerArray.length; i++) {
            Tiger currentTiger = tigerArray[i];
            System.out.println(tigerArray[i]);

            if(currentTiger!=null){
                currentTiger.name = "степан";
                System.out.println(currentTiger.name);
            }
        }

    }
}
