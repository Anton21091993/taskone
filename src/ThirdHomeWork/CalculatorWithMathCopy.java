package ThirdHomeWork;

public class CalculatorWithMathCopy {


    public double division2(double a, double b) {
        return a / b;

    }

    public double multiplying2(double a, double b) {
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

    public double stepen(double d, int e) {
        for (int i = 0; i < e; i++) {
            if ((i > 0)) ;
            d = d * d;
        }
        return d;
    }

    public double sqrtSomething(double a) {
        return Math.sqrt(a);
    }
}
