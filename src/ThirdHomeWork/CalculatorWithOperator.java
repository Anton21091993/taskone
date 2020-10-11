package ThirdHomeWork;

public class CalculatorWithOperator {


    public double division(double a, double b) {
        return a / b;

    }

    public double multiplying(double a, double b) {
        return a * b;

    }

    public double minus(double a, double b) {
        return a - b;

    }

    public double sum(double a, double b) {
        return a + b;

    }

    public double module(double c) {


        return (c >= 0) ? c : -c;


    }

  /*  public double stepen (int d, int e){
        //for ()
    }*/

   public double koren(int d, int e){
        return Math.sqrt(e);
   }



}
