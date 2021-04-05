package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[] data = {1.13, -23.45, 1.5, 5.6, -2.8, -5.7, 9.5, -5.9, 21.7, 14.5, 34.1, -34.5, -2.9, 4.6, -6.1 };
        System.out.println(Arrays.toString(data));
        boolean firstNegativeNumber = false;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < data.length; i++) {
            if (!firstNegativeNumber && data[i] < 0) {
                firstNegativeNumber = true;
                continue;
            }
            if (firstNegativeNumber && data[i] > 0) {
                sum = sum + data[i];
            }

        }
        System.out.println("Сумма положительных чисел после первого отрицательного: " + sum);

        average = sum / 7;

        System.out.println("Среднее арифметическое равна: " + average);

    }
}
