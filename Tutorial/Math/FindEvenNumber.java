package Tutorial.Math;

import Utils.PrintValuesOfArray;

public class FindEvenNumber {
    public static void findEvenNumber(Integer[] array) {

        int count = 0;

        for (Integer value : array) {
            if (value % 2 == 0) {
                count++;
            }
        }

        Integer[] res = new Integer[count];
        int resCount = 0;
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                res[resCount] = integer;
                resCount++;
            }
        }

        System.out.println("Output");
        PrintValuesOfArray.printValuesOfArray(res);
    }
}
