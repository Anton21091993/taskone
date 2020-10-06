package HomeWorkSecond;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSecondTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }


        System.out.print("Каждый второй индекс это: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print("индекс " + i + " = " + array[i] + ", ");
            }
        }


    }
}

