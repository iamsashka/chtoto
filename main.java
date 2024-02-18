package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                    Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                    Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
            } else if (a == b && b == c) {
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
            } else if (a == b || b == c || c == a) {
                System.out.println("a, b и c являются сторонами равнобедренного треугольника");
            } else {
                System.out.println("a, b и c являются сторонами обычного треугольника");
            }
        } else {
            System.out.println("a, b и c не могут образовать треугольник");
        }

        scanner.close();
    }
}
