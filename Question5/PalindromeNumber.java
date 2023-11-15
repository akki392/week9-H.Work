package Question5;

import java.util.Scanner;

public class PalindromeNumber {

    public static int reverse(int number) {
        int y;
        int n;
        for (n = 0; n <= number; n++) {
            y = number % 10;
            number = number / 10;
            n = n * 10 + y;
            return n;
        }
        return n;
    }

    public static boolean isPalindrome(int number) {
        int n = reverse(number);
        boolean result ;
        if (n == number) {
            if (n != number) {
                result=true;
                System.out.println("The number " + number + " is a Palindrome" + ".");
            }
        } else {
            result=false;
            System.out.println("The number " + number + " is not a " + "Palindrome" + ".");
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Please enter an integer. ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean Final = isPalindrome(number);
        System.out.println(Final);

    }
}
