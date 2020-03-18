public class lesson1203 {
    public static void main(String[] args) {
        int[] integerArray;
        integerArray = new int[]{1, 2, 3};

        System.out.println("Default array: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        int resultFirstTask = ArrayUtility.returnArrayElementsSum(integerArray);

        System.out.println("Result 1st task: " + resultFirstTask);

        int[] resultSecondTask = ArrayUtility.appendNewValue(integerArray, 100);
        System.out.println("Result 2nd task: ");
        for (int i : resultSecondTask) {
            System.out.println(i);
        }

        int[] resultThirdTask = ArrayUtility.appendNew2Values(integerArray, 15,121);
        System.out.println("Result 3d task: ");
        for (int i : resultThirdTask) {
            System.out.println(i);
        }

/*
        for(int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }

        int[] arrayHW = new int[]{1,2,3,4,5};
        System.out.println(args.length);

        for (int i=0; i< args.length; i++) {
            System.out.println(args[i]);
        }
*/


    }
}
