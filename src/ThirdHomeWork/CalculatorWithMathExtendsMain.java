package ThirdHomeWork;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcCopy2 = new CalculatorWithMathExtends();
        System.out.println(calcCopy2.division(5.9, 2.9));
        System.out.println(calcCopy2.multiplying(5.9, 2.9));
        System.out.println(calcCopy2.minus(5.9, 2.9));
        System.out.println(calcCopy2.sum(5.9, 2.9));
        System.out.println(calcCopy2.module(2));
        System.out.println(calcCopy2.sqrtSomething(25));
        System.out.println(calcCopy2.stepen(3,2));
        System.out.println(calcCopy2.division(28,5)*calcCopy2.stepen(5.6,2)+calcCopy2.multiplying(15,7) +calcCopy2.sum(105,31.36));;

    }
}
