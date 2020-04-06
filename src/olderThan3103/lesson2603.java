package olderThan3103;

public class lesson2603 {
    public static void main(String[] args){

        String[] stringArray = new String[]{"1","254"};

        int resultValue = 0;

        for (int i = 0; i < stringArray.length; i++) {

            String currentValueString = stringArray[i];


            int currentValue = Integer.parseInt(currentValueString);
            resultValue=resultValue+currentValue;
        }

        System.out.println(resultValue);



    }
}
