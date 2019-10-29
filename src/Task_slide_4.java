/*
        Число загаданное от 1 до 1000.
        Программа в случае неверного ввода пользователя будет подсказывать -
        введённое пользователем число больше или меньше загаданного.
 */

import java.util.Scanner;

public class Task_slide_4 {
    public static void main(String[] args) {
        int num = 756;
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Введите число: ");
            guess = scanner.nextInt();
            if (guess < num) {
                System.out.println("Загаданное число больше.");
            }

            if (guess > num) {
                System.out.println("Загаданное число меньше.");
            }
        } while (guess != num);
        System.out.println("Верно!");
    }

}
