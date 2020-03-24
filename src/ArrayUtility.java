public class ArrayUtility {

    /**
     * 1 Вернуть сумму элементов массива
     */
    public static int returnArrayElementsSum(int[] arrays)
    {
        int result=0;
        for (int i=0; i < arrays.length; i++)
        {
            result  = arrays[i] + result;
        }
        return result;
    }

    /**
     * 2 Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     */
    public static int[] appendNewValue(int[] oldArray, int newValue)
    {
        int[] newArray = new int[oldArray.length + 1];

        for (int i=0; i<oldArray.length; i++){
            newArray[i]=oldArray[i];
        }
        newArray[newArray.length-1] = newValue;
        return newArray;
    }

    /**
     * 3 Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     */
    public static int[] appendNew2Values(int[] oldArray, int newValue, int secondNewValue)
    {
        int[] result;
        result = appendNewValue(oldArray, newValue);
        result = appendNewValue(result, secondNewValue);
        return result;
    }

    /**
     * 4 Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов
     */
    public static int[] appendNewValues(int[] oldArray1, int[] oldArray2)
    {
        int[] result = new int[oldArray1.length + oldArray2.length];

        for (int i = 0; i < oldArray1.length; i++) {
            result[i] = oldArray1[i];
        }
        for (int i = oldArray1.length; i < result.length; i++) {
            result[i]=oldArray2[i-oldArray1.length];
        }
        return result;
    }

    /**
     * 5 Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором не будет значений равных value
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1}
     *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12, 2}, value=2, результат {100, 12}
     */
    public static int[] deleteAllSameValuesFromArray(int[] oldArray, int value)
    {
        for (int i = 0; i < oldArray.length; i++) {

            if(oldArray[i]==value){
                oldArray[i]=0;
            };
            oldArray[i]=oldArray[i];
        }
        int[] step2Array = oldArray;
        for (int i = 0; i < step2Array.length; i++) {
            if (i + 1 < step2Array.length) {
                if (step2Array[i] == 0) {
                    step2Array[i] = step2Array[i + 1];
                    step2Array[i + 1] = 0;
                }
            }
        }
        int[] step3Array=step2Array;

        for (int i = 0; i < step3Array.length; i++) {
            if(step3Array[i]==0){
                int[] result = new int[i];

                for (int j = 0; j < result.length; j++) {
                    result[j]=step3Array[j];
                }
                return result;
            }
        }

        return oldArray;

    }

    /**
     * 6 Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов, без повторов
     *
     *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 3}
     *  Пример 2.: При вызове метода с аргументами oldArray1 = {11, 2}, oldArray1 = {10000}, результат {11, 2, 10000}
     */
    public static int[] appendAllUniqueValues(int[] oldArray1, int[] oldArray2)
    {
        return oldArray1;
    }

    /**
     * 7 Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором будет присутствовать новое значение и массив будет отсортирован по возрастанию
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1, 2}
     *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12}, value=22, результат {2, 12, 22, 100}
     */
    public static int[] appendNewValueAndSort(int[] oldArray, int value)
    {
        int[] result;
        result=appendNewValue(oldArray,value);

                for (int i = 0; i < result.length; i++) {
            for (int j = i+1; j < result.length; j++) {
                if(result[j]>result[j+1]){
                    int next=result[j];
                    result[j]=result[j+1];
                    result[j+1]=next;
                }
            }

        }

        return result;
    }
}