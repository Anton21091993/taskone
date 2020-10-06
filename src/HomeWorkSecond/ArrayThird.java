package HomeWorkSecond;

import java.util.Scanner;

public class ArrayThird {

    private static ArrayThird Solution;


    public static int pow(int number, int number2) {
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("введи что-то");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);

        System.out.println("введите степень");
        int number2 = scanner.nextInt();
        System.out.println("Вы ввели степень " + number2);

        System.out.println(Solution.pow((int) number, number2));
    }
}
