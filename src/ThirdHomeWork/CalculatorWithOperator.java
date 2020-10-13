package ThirdHomeWork;

public class CalculatorWithOperator implements ICalculator {


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


    public double stepen(double a1, int b1) {

        if (a1 > 0 && b1 > 0) {
            for (int i = 1; i < b1; i++) {
                a1 = a1 * a1;
            }
        }


        return a1;
    }

    public double sqrtSomething(double a) {
        return Math.sqrt(a);
    }

}


