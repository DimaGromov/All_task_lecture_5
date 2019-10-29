/*
        Придумать и реализовать алгоритм, который определяет - является
        простым или составным введённое число.
 */

import java.util.Scanner;

public class Prostoe_ili_sostavnoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int counter = 0;
        if(num>1){
            for (int i = 1; i <= num ; i++) {
                if((num%i) == 0){
                    counter++;
                }
            }
            if(counter >2){
                System.out.println("Число составное.");
            }else {
                System.out.println("Число простое.");
            }

        }else {
            System.out.println("Число меньше 1!");
        }
    }
}
