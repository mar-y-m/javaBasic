public class HW0503Long {

    public static int countShort(int a, int b)
    {
       int bracketSum = a + b;
       int bracket1 = bracketSum * bracketSum;
       return bracket1;
    }
    public static int countFull(int a, int b)
    {
        int a2 = a * a;
        int b2 = b * b;
        int abSum = a + b;
        int bracket2 = a2 + b2 + abSum + abSum;
        return bracket2;
    }
    public static void main(String[] args)
    {
        int firstResult = countShort(2,2);
        int secondResult = countFull(2,2);

        System.out.println(firstResult);
        System.out.println(secondResult);

        if (firstResult==secondResult)
        {
            System.out.println(firstResult + " equals " + secondResult);
        }
        else
        {
            System.out.println(firstResult + " does not equal " + secondResult);
        }
    }
}
