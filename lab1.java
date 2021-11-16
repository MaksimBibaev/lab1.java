package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        System.out.println("Введите любое число");
        int b =scanner.nextInt();
        System.out.println("Введите любое число");
        int c = scanner.nextInt();
        System.out.println("Введите любое число");
        int d =scanner.nextInt();
        System.out.println("Вы ввели число "+ a);
        System.out.println("Вы ввели число "+ b);
        System.out.println("Вы ввели число "+ c);
        System.out.println("Вы ввели число "+ d);
        int answer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println("Минимальное число:"+ answer);

    }
}
