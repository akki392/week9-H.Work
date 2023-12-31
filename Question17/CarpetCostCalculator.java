package Question17;

public class CarpetCostCalculator {
    public class Floor {
        double width; double length;
        public Floor(double width, double length) {

            if(width<0){
                this.width=0;
            }else{
                this.width=width;
            }
            if (length<0){
                this.length=0;
            }
            else{
                this.length=length;
            }

        }
        public double getArea() {
            double area = width * length;
            return area;
        }
    }
    public  class  Carpet  {
        double cost;
        public Carpet(double cost ) {
            if(cost<0){
                this.cost=0;
            }
            else {
                this.cost=cost;
            }
        }
        public double getCost(){
            return this.cost;
        }
    }
    public class Calculator  {
        Floor floor1;
        Carpet carpet1;
        public Calculator(Floor floor1, Carpet carpet1) {
            this.floor1=floor1;
            this.carpet1=carpet1;
        }
        public double getTotalCost() {
            double total = floor1.getArea() *carpet1.getCost();
            return total;
        }
    }
    public static void main(String[] args) {
        CarpetCostCalculator ccc = new CarpetCostCalculator();
        Floor floor1 =ccc.new Floor(2.75,4.0);
        Carpet carpet1 =ccc.new Carpet(3.5);
        Calculator calculator1 =ccc.new Calculator(floor1,carpet1);
        System.out.println("total= " +calculator1.getTotalCost());
        carpet1 =ccc. new Carpet(1.5);
        floor1 =ccc. new Floor(5.4, 4.5);
        calculator1 = ccc. new Calculator(floor1, carpet1);
        System.out.print("total= "+calculator1.getTotalCost());
    }
}
