package Question2;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge mm = new MinAndMaxInputChallenge();
        mm.setMinimum();
    }

    public boolean setMinimum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:  " );
        int number = input.nextInt();
        int max = input.nextInt();
        int min = input.nextInt();
        while (number <= min) {
            min = number;
            if(min!=number){
                return false;
            }
            break;
        }
        System.out.println("mininum no:  " + min);
        while (number >= max) {
            max = number;
            if(max!=number){
                return false;
            }
            break;
        }
        System.out.println("maximum no:  " + max);
        return false;
    }
}





