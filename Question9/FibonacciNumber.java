package Question9;

public class FibonacciNumber {

    public static void main(String[] args) {


        int max = 10, num1 = 1, num2 = 1;
        System.out.print("Fibonacci Series of " + max + " numbers:");

        int i = 1;
        while (i <= max) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
