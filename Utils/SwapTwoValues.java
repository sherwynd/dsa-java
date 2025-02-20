package Utils;

public class SwapTwoValues {
    public static <T> void swapTwoValues(T[] arrays, int index1, int index2) {
        T temp = arrays[index1];
        arrays[index1] = arrays[index2];
        arrays[index2] = temp;
    }
}
