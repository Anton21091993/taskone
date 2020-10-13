package ThirdHomeWork;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        CalculatorWithOperator calculator3 = new CalculatorWithOperator();
        System.out.println(calculator3.division(6.0, 2.0));
        System.out.println(calculator3.multiplying(8.0, 4.0));
        System.out.println(calculator3.minus(5.9, 2.9));
        System.out.println(calculator3.sum(5.9, 2.1));
        System.out.println(calculator3.module(2));
        System.out.println(calculator3.sqrtSomething(25));
        System.out.println(calculator3.stepen(3,2));
        System.out.println(calculator3.division(28,5)*calculator3.stepen(5.6,2)+calculator3.multiplying(15,7) +calculator3.sum(105,31.36));;

    }
}
