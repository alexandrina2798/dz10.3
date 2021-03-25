package main.java;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        final int size = 10;
        System.out.print("Введите модификатор (целое число) для работы с массивами: ");
        int modifier = new Scanner(System.in).nextInt();

        //+
        int[] arrS = FillingArray.getFilledArray(size, modifier, Integer::sum);

        for (Integer n : arrS) {
            System.out.print(n + " ");
        }
        System.out.println();

        //*
        int[] arrM = FillingArray.getFilledArray(size, modifier, (s, m) -> s * m);

        for (Integer n : arrM) {
            System.out.print(n + " ");
        }
        System.out.println();

        //odd
        int[] arrOdd = FillingArray.getFilledArray(size, modifier, (s, m) -> {
                    if (s % 2 == 0) {
                        return s / 2 + m;
                    } else {
                        return s * s - m;
                    }
                }
        );

        for (Integer n : arrOdd) {
            System.out.print(n + " ");
        }
        System.out.println();

        //random
        //Массив заполненный случайными числами от нуля до модуля суммы индекса и модификатора
        int[] arrRand = FillingArray.getFilledArray(size, modifier, (s, m) -> (int) (Math.random() * Math.abs(m + s)));

        for (Integer n : arrRand) {
            System.out.print(n + " ");
        }
        System.out.println();

        //число в массиве = 1, если индекс и модификатор одинаковой четности, иначе 0
        int[] arrOddable = FillingArray.getFilledArray(size, modifier, (s, m) -> {
            if (s % 2 == m % 2) {
                return 1;
            } else {
                return 0;
            }
        });

        for (Integer n : arrOddable) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}
