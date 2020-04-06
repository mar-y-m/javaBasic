package olderThan3103;

public class lesson1203 {
    public static void main(String[] args) {
        int[] integerArray;
        integerArray = new int[]{3, 100, 2, 4};

        System.out.println("Default array: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

/*
        int resultFirstTask = olderThan3103.ArrayUtility.returnArrayElementsSum(integerArray);

        System.out.println("Result 1st task: " + resultFirstTask);

        int[] resultSecondTask = olderThan3103.ArrayUtility.appendNewValue(integerArray, 100);
        System.out.println("Result 2nd task: ");
        for (int i : resultSecondTask) {
            System.out.println(i);
        }

        int[] resultThirdTask = olderThan3103.ArrayUtility.appendNew2Values(integerArray, 15,121);
        System.out.println("Result 3d task: ");
        for (int i : resultThirdTask) {
            System.out.println(i);
        }
*/

/*
        int[] forthArray = new int[]{2,6,25};

        int[] resultForthTask = olderThan3103.ArrayUtility.appendNewValues(integerArray, forthArray);
        System.out.println("Result 4th task: ");
        for (int i : resultForthTask) {
            System.out.println(i);
        }
*/

        int[] resultFifthTask = ArrayUtility.deleteAllSameValuesFromArray(integerArray, 2);
        System.out.println("Result 5th task: ");
        for (int i = 0; i < resultFifthTask.length; i++) {
            System.out.println(resultFifthTask[i]);
        }

/*
        int[] resultSixthTask = olderThan3103.ArrayUtility.appendAllUniqueValues(integerArray, forthArray);
        System.out.println("Result 6th task: ");
        for (int i : resultForthTask) {
            System.out.println(i);
        }

        int[] resultSeventhTask = olderThan3103.ArrayUtility.appendNewValueAndSort(forthArray, 7);
        System.out.println("Result 7th task: ");
        for (int i : resultSeventhTask) {
            System.out.println(i);
        }
*/

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