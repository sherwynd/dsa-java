package Tutorial.Array;


public class FindMinimum {
    public static void findMinimum(Integer[] array) {
        int min = array[0];

        for(Integer val : array) {
            if(val < min) {
                min = val;
            }
        }

        System.out.println("Output : ");
        System.out.println(min);
    }
}
