import java.util.Scanner;

public class lesson2403 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");

        boolean needNewAttempt= true;
        int counter = 0;

        while (needNewAttempt)
        {
            if (counter>= 5)
            {
                System.out.println("loser");
                break;
            }
            if (keyboard.hasNextInt())
            {
                needNewAttempt = false;
                System.out.println("ugadal " + keyboard.nextInt());
            }
            else
            {
                System.out.println("poprobuyte escho raz");
                keyboard = new Scanner(System.in);
                counter++;
            }
        }


//        if (keyboard.hasNextInt())
//        {
//            System.out.println(keyboard.nextInt());
//        }
//        else
//        {
//            System.out.println("try again");
//            keyboard = new Scanner(System.in);
//
//            while ()
//            {
//
//            }
//
//            if (keyboard.hasNextInt())
//            {
//                System.out.println(keyboard.hasNextInt());
//            }
//        }

    }
}
