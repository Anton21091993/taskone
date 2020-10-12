package ThirdHomeWork;

public class CalculatorWithCounterInterface {

    ICalculator icalc = new ICalculator() {
        @Override
        public double division(double a, double b) {
            return 0;
        }

        @Override
        public double multiplying(double a, double b) {
            return 0;
        }

        @Override
        public double minus(double a, double b) {
            return 0;
        }

        @Override
        public double sum(double a, double b) {
            return 0;
        }

        @Override
        public double module(double c) {
            return 0;
        }

        @Override
        public double stepen(double d, int e) {
            return 0;
        }

        @Override
        public double sqrtSomething(double a) {
            return 0;
        }
    };


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

    public void getCountOperation() {
        return;
    }


}
