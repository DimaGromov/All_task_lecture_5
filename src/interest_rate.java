/*
        Вы кладёте в банк М рублей. Годовая ставка - R процентов годовых.
        Вывести на экран, через сколько лет сумма на счету будет больше S,
        если все проценты рекапитализируются.
 */

import java.util.Scanner;

public class interest_rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M;                                          // Размер вклада
        double R;                                       // Процентная ставка
        int S;                                          // Цель
        int year = 0;                                   // Срок достижения цели
        System.out.print("Сумма вклада:\t");
        M = scanner.nextInt();

        System.out.print("Размер процентной ставки:\t");
        R = scanner.nextDouble();
        R /= 100;

        System.out.print("Желаемый размер вклада:\t");
        S = scanner.nextInt();

        while (true) {
            if (M < S) {
                M += (M * R);
                year++;
            } else {
                System.out.println("Срок: " + year);
                return;
            }
        }
        // Почему, если ставить вывод в этом месте, недостижимый вариант?
    }
}
