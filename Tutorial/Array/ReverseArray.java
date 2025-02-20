package Tutorial.Array;

import Utils.PrintValuesOfArray;
import Utils.SwapTwoValues;

public class ReverseArray {
    public static <T> void reverseArray(T[] array) {

        int left = 0;
        int right = array.length-1;

        while (left < right) {
            SwapTwoValues.swapTwoValues(array, left, right);
            left++;
            right--;
        }

        System.out.println("Output");
        PrintValuesOfArray.printValuesOfArray(array);
    }
}
