package HomeWorkSecond;

import java.util.Arrays;
import java.util.Scanner;

public class SecondOneFouthTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();

        int[] array = new int[length];


        for (int i : array) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

    }
}