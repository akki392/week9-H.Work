package Question6;

import java.util.Scanner;

public class TriangleWithNumber {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Input number of rows : ");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        for (a=1;a<=c;a++)
        {
            for (b=1;b<=a;b++)
                System.out.print(b);

            System.out.println();

        }
    }
}
