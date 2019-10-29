/*
        На вход подается ряд чисел.
        Первое число - количество чисел.
        После - числа последовательности, которые вводим.
        Вывести наибольшее из них, которое делится на 6.
        На входе обязательно должно быть одно таким.
 */

import java.util.Scanner;

public class Posledovatelnost1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int num=0 , max = 0;
        for (int i = 0; i < counter; i++) {
            num = scanner.nextInt();
            if ((num%6) == 0){
                if(num>max){
                    max = num;
                }
            }
        }
        System.out.println("Наибольшее число в последовательности, которое делится на 6: " + max);


    }
}
