package Question1;

import java.util.Scanner;

public class Read10Number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter value:  ");
            int x=sc.nextInt();
            count=count+x;
            Scanner close;
        }

        System.out.println("The sum is: "+count);

    }
}
