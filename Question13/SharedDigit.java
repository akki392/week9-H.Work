package Question13;

public class SharedDigit {
    public static void hasSharedDigit(int a, int b) {

        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            if ((a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10)) {
                boolean answer = true;
                System.out.println(answer);
            }
        } else {
            boolean  answer = false;
            System.out.println(answer);
        }
    }
    public static void main (String[]args){
        hasSharedDigit(12,23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);

    }
}
