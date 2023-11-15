package Question14;

import java.util.Scanner;

public class DiamondPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        int a=1;
        int b;
        while(a<=n)
        {
            b=1;
            while(b++<=n-a)

            {
                System.out.print(" ");
            }
            b=1;
            while(b++<=a*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            a++;
        }
        a=n-1;
        while(a>0)
        {
            b=1;
            while(b++<=n-a)
            {
                System.out.print(" ");
            }
            b=1;
            while(b++<=a*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            a--;
        }
    }
}
