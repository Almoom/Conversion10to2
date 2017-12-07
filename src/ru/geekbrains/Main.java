package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String str = "";
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Введите число, которое необходимо перевести из десятичной системы счисления в двоичную:");
            int n = scanner.nextInt();
            Fun10to2(n);
            System.out.println(str);
            System.out.println("");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
    public static void Fun10to2(int n) {
        if (n > 1){
            if (n % 2 == 1) {
                str = "1" + str;
                n = n / 2;
                Fun10to2(n);
            } else {
                str = "0" + str;
                n = n / 2;
                Fun10to2(n);
            }
        }else str = "1" + str;
    }
}