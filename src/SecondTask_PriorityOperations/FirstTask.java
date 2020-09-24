package SecondTask_PriorityOperations;

public class FirstTask {

    public static void main(String[] args) {
        int a = 5;
        int b =2;
        int c =8;
        System.out.println(5 + 2 / 8); // 8 сначала дробь потом сложение

        System.out.println((5 + 2) / 8); // 0 сначала скобки потом деление

      //  System.out.println((5 + 2++) / 8);  2++ некорректно ипсользовать в качетсве пер

       // System.out.println((5 + 2++) / --8); аналогично плюс еще и --8

      //  System.out.println((5 * 2 >> 2++) / --8); аналогично выше

       // System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8); ...

    //    System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8);  ...

        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); //false потому что то,что идет после двойных амперсант ннекорректно то есть 144 не больше 119

        System.out.println(true && false); //false потому что по умолчаниж фолс принимает


    }
}
