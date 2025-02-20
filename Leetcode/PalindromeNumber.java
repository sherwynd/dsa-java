package Leetcode;

public class PalindromeNumber {
    public static void palindromeNumber() {
        int number = 101;
        boolean ans = bestAns(number);

        System.out.println(ans);
    }

    public static boolean myAns(int number) {
        int reversed = 0;
        int length = (int)(Math.log10(number) + 1);
        int temp = number;
        for(int i = 1;i <= length;i++){
            int lastDigit = temp%10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }

        if(reversed == number) return true;

        return false;
    }

    public static boolean easyAns(int number) {
        int reversed = 0;
        int length = (int)(Math.log10(number) + 1);
        int temp = number;
        for(int i = 1;i <= length;i++){
            int lastDigit = temp%10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }

        return reversed == number;
    }

    public static boolean bestAns(int x) {
        int rev=0;
        if(x<0) return false;

        for(int i = x;i > 0;i/=10){
            int lastDigit=i%10;
            rev = rev*10+lastDigit;
        }

        return x == rev;
    }
}
