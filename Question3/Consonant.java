package Question3;

import java.util.Scanner;

public class Consonant {

    public void VowelOrConsonant() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch;
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 's' || ch == 'z' || ch == 'd' || ch == 'e' || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E') {
            System.out.println("Entered character " + ch + " is  Vowel");

        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + " is Consonent");

        } else
            System.out.println("Not alphabet");
        }
    public static void main (String[ ]arg)
    {
        Consonant vc = new Consonant();
        vc.VowelOrConsonant();
    }
}
