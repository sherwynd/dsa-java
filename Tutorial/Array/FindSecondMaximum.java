package Tutorial.Array;

public class FindSecondMaximum {
    public static void findSecondMaximum(Integer[] array) {
        int max = array[0];
        int res = array[0]; //Second Max Value

        for (Integer val : array) {
            if (val > max) {
                res = max;
                max = val;
            } else if (val > res && val != max) {
                res = val;
            }
        }

        System.out.println("Output : ");
        System.out.println(res);
    }
}
