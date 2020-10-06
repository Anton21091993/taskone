package HomeWorkSecond;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArraySecond {

    static int calculateFactorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("Введите какое-либо число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);

        System.out.println("теперь выведем ход вычислений в консоль ");


        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(calculateFactorial(number));

    }
}
