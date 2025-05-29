package ru.netology.service;

public class CustomsService {

    public static final int CalculateCustoms(int a, int b) {
        final int WEIGH_DUTY = 100;
        int sum = a / 100 + b * WEIGH_DUTY;
        System.out.println("Размер пошлины (в руб.) составит: " + sum);
        return sum;
    }
}