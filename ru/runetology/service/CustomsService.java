package ru.netology.service;

public class CustomsService {
    static final int WEIGH_DUTY = 100;

    public static int CalculateCustoms(int a, int b) {
        int sum = a / 100 + b * WEIGH_DUTY;
        System.out.println("Размер пошлины (в руб.) составит: " + sum);
        return sum;
    }
}

