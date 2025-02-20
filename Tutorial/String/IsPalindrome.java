package Tutorial.String;

import Utils.SwapTwoValues;

public class IsPalindrome {
    public static boolean isPalindrome(String word) {

        char[] rev = word.toCharArray();
        int left = 0;
        int right = word.length()-1;

        while (left < right) {
            if(rev[left] != rev[right]) {
                System.out.println("false");
                return false;
            }
            left++;
            right--;
        }

        System.out.println("true");
        return true;
    }
}
