package com.company;
import java.util.Scanner;
public class Main
{
        public static void main(String[]args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Write the value of x:");
            double x = in.nextDouble();
            if (Math.abs(x) <= 1) {
                System.out.println("Число должно быть меньше или равно 1");
                x = in.nextDouble();
                System.out.println("Введите предел n: ");
                double n = in.nextDouble();
                double sum = 0;
                for (double i = 0; i < n; i++) {
                    sum += (Math.pow(-1, i + 1) * Math.pow(x, 2 * i + 1)) / (2 * i + 1);
                }
                System.out.println("result" + (sum + 3.14 / 2));
            } else {
                System.out.println("ERROR");
            }
        }
}

