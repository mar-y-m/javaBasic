public class howtosquare {
    public static void main(String[] args)
    {
        int a=56;
        int b=45;

        int resultRight=rightResult(a, b);
        int resultLeft=leftResult(a, b);

        System.out.println("Left side = "+ resultLeft);
        System.out.println("Right side = "+resultRight);

        System.out.println("Result is "+ (resultLeft==resultRight));
        if (resultLeft==resultRight) {
            System.out.println(resultLeft +" equals "+ resultRight);
        }
        else {
            System.out.println(resultLeft +" does not equal "+resultRight);
        }
    }

    public static int rightResult(int a, int b)
    {
        int c=2;
        int doubleSum= a * b * 2;
        return (int) (Math.pow(a,c) + Math.pow(b,c) + doubleSum);
    }
    public static int leftResult(int a, int b)
    {
        int sum = a + b;
        return sum * sum;
    }



}