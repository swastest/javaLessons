package alishev;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("введите что-нибудь");
        String st = s.nextLine();
        System.out.println("вы ввели: "+st);

        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println("Вы ввели число: " +x);
    }

}
