package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //2
        int clientDeviceYear = 2011;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            } else
                System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            } else
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //3
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else {
            System.out.println(year + " год не является високосным");
        }
        //4
        int deliveryDistance = 95;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней:" + 1);
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + 3);
        } else System.out.println("Больше 100км не доставляется>");

        //5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет");
                break;

        }

    }
}
