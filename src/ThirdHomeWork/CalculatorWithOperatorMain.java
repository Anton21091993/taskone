package ThirdHomeWork;

public class CalculatorWithOperatorMain  {

    public static void main(String[] args) {

        
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        System.out.println(calculator1.division(5.9, 2.9));
        System.out.println(calculator1.multiplying(5.9, 2.9));
        System.out.println(calculator1.minus(5.9, 2.9));
        System.out.println(calculator1.sum(5.9, 2.9));
        System.out.println(calculator1.module(2));
        System.out.println(calculator1.sqrtSomething(25));
        System.out.println(calculator1.stepen(2,3));
        System.out.println(calculator1.division(28,5)*calculator1.stepen(5.6,2)+calculator1.multiplying(15,7) +calculator1.sum(105,31.36));;
    }


}
