package FifthTask_LoopOperations;

import java.util.Objects;
import java.util.Scanner;

public class IfOperation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи имя:");

        String name = in.nextLine();


        String name1 = "";
        String name2 = "";
        boolean equals = Objects.equals(name1, name2);

        if (name1 == "Вася") {

            System.out.printf("Привет!");
            System.out.println("Я тебя так долго ждал");

            in.close();

        }
    }
}
