package Question4;

import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String arg[]) {
        int n, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        s = SumDigits(n);
        System.out.println("Sum of digits " + s);
    }

    public  static int SumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
