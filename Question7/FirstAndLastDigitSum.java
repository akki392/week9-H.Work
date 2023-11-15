package Question7;

public class FirstAndLastDigitSum {
    public static void SumFirstAndLastDigit(int number) {
        int result, rev = 0, firstdigit, lastdigit, sum;
        lastdigit = number % 10;
        while (number > 0) {
            result= number % 10;
            rev = rev * 10 + result;
            number = number / 10;
        }
        firstdigit = rev % 10;
        sum = firstdigit + lastdigit;
        System.out.println("Sum of first and last digits:" + sum);

        if (number<0){
            System.out.println("Parameter is negative"+-1);
        }

    }
    public static void main (String[]args){

        FirstAndLastDigitSum ob = new FirstAndLastDigitSum();
        ob.SumFirstAndLastDigit(1221);

    }
}
