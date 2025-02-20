package Tutorial.Array;

public class FindMissingValueInArray {
    public static void findMissingValueInArray(Integer[] array) {

        int n = array.length+1; //n number, since array.length give (n-1)
        int sumOfNumber = n*(n+1)/2; //Sum of 1-n number = n(n+1)/2
        int sumOfArray = 0; //Array value

        for(Integer val : array) {
            sumOfArray+= val;
        }

        System.out.println("Output : ");
        System.out.println(sumOfNumber-sumOfArray);
    }
}
