package Tutorial.Array;

public class FindSecondMaximum {
    public static void findSecondMaximum(Integer[] array) {
        int max = array[0];
        int res = array[0];

        for(Integer val : array) {
            if(val > max) {
                max = val;
                res
            }
        }

        System.out.println("Output : ");
        System.out.println(min);
    }
}
