package Question12;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        PrimeOrNot obj = new PrimeOrNot();
        obj.m1();
    }

    public void m1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        if(a>1){
            System.out.println("is a prime number");
        }
        if (a<= 1) {
            System.out.println(" is a not prime number");

            for (int i = 2; i< a; i++) {
                if (a % i == 0) {
                    System.out.println(" is a not prime number");
                }
            }
        }

    }
}
