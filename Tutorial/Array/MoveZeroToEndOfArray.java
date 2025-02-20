package Tutorial.Array;

import Utils.PrintValuesOfArray;
import Utils.SwapTwoValues;

public class MoveZeroToEndOfArray {
    public static void moveZeroToEndOfArray(Integer[] array) {

        int left = 0;
        int right = array.length-1;

        while (left < right) {
            PrintValuesOfArray.printValuesOfArray(array);

            if (array[left] == 0 && array[right] == 0) { // or array[left] == 0 the loop still the same
                right--;
            } else if (array[left] != 0) {
                left++;
            } else {
                SwapTwoValues.swapTwoValues(array, left, right);
                right--;
            }

        }

        PrintValuesOfArray.printValuesOfArray(array);
    }
}
