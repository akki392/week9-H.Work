package Question18;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
      return firstNumber;

    }
    public double getSecondNumber(){
      return secondNumber;
    }
    public void setFirstNumber(double a){
        this.firstNumber=a;
    }
    public void setSecondNumber(double b){
        this.secondNumber=b;
    }
    public double getAdditionResult(){
         double ans =firstNumber+secondNumber;
         return ans;
    }
    public double getSubtractionResult(){
        double  ans =firstNumber-secondNumber;
        return ans;
    }
    public double getMultiplicationResult(){
        double ans = firstNumber * secondNumber;
        return ans;
    }
    public double getDivisionResult(){
        double ans = secondNumber / firstNumber;
        return ans;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " +calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}
