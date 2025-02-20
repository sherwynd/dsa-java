package Utils;

import java.util.Random;

public class GenerateIntegerOfArray {
    public static Integer[] generateIntegerOfArray(int size, int min, int max) {
        Random rand = new Random();

        System.out.println("Generated numbers are within "+min+" to "+max);
        Integer[] res = new Integer[size];

        for(int i = 0; i < size; i++) {
            res[i] = rand.nextInt(max - min + 1) + min;
        }

        PrintValuesOfArray.printValuesOfArray(res);

        return res;
    }
}
