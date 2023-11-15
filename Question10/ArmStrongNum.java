package Question10;

import java.util.Scanner;

public class ArmStrongNum {

    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num, num1, sum = 0, tot;
        num=scan.nextInt();
        tot = num;
        while (num != 0) {
            num1 = num % 10;
            num = num / 10;
            sum = sum + (num1 * num1 * num1);
        }
        if (sum == tot) {
            System.out.println(" is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }
    }
}
