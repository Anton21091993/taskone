package HomeWorkSecond;

import java.util.Scanner;

public class SecondThirdFouth {

    public static void main(String[] args) throws Exception  {
        Scanner s = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("введите элементы");
        for (int i: a) {
            a[i] = s.nextInt();
        }
        System.out.println("Элементы в обратном порядке");
        for (int i: a ) {
            System.out.println(a[i]);
        }
    }
}
