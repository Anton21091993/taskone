package ThirdHomeWork;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    @Override
    public double division(double a, double b) {
        return super.division(a, b);
    }

    @Override
    public double multiplying(double a, double b) {
        return super.multiplying(a, b);
    }

    @Override
    public double minus(double a, double b) {
        return super.minus(a, b);
    }

    @Override
    public double sum(double a, double b) {
        return super.sum(a, b);
    }

    public double getModule()
    {
        return 2.0;
    }

    public double getKoren()
    {

        return 4.0;

    }

}
