package olderThan3103;

public class HelloWorld
{
//    public static boolean isCorrectSum()
//    {
//        boolean result3 = sum(20000, 0) == 4;
//        boolean result2 = sum(3, 2) == 4;
//
//        boolean result1 = sum(2, 2) == 4;
//        return result1;
//    }
    public static int sum2Values(int firstArg, int secondArg)
    {
        return firstArg + secondArg;
    }
    public static void main(String[] args)
    {

        int actualSum = sum2Values(2, 8);
        int expectedSum = 10;

        if(actualSum == expectedSum) {
            System.out.println("Hello World!");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static int sum(int a, int b)
    {
        return a+b;
    }
}
