package alishev;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        /**
        *Это обычный цикл While и здесь много дублирования кода, поэтому здесь уместнее использовать цикл Do While
         * пример будет ниже
         *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру 5");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("введите 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5 - все Ок");
         */

        // Цикл Do While сначала выполняет инструкции и только потом проверяет условие,
        // в то время как цикл while сначала проверяет условие и только потом выполняет инструкции - это и есть их главное отличие
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введите 5");
            value = scanner.nextInt();
        }while (value!=5);
        System.out.println("Вы ввели 5 - все Ок");
    }

}
