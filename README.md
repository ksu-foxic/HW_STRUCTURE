# HW_STRUCTURE
package ru.netology.service;

public class CustomsService {

    public static final int CALCULATE_CUSTOMS(int a, int b) {
        int sum = a / 100 + b * 100;
        System.out.println("Размер пошлины (в руб.) составит: " + sum);
        return sum;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
         System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        ru.netology.service.CustomsService.CALCULATE_CUSTOMS(price,weight);
    }
 }
