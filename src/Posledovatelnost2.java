/*
        На вход подается последовательность чисел. Найти их сумму.
        Последовательность заканчивается вводом нуля.
 */

import java.util.Scanner;

public class Posledovatelnost2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Сумма чисел последовательности: " + sum);
    }
}
