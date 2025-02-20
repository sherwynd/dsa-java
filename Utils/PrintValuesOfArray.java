package Utils;

public class PrintValuesOfArray {
    public static <T> void printValuesOfArray(T[] arrays) {
        for (T val : arrays) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
