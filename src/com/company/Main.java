package com.company;


import java.util.Arrays;

public class Main {


//    задание 1


    public static void printLeapYear (int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }


//    задание 2


    public static void printUpGrateOS(int OSDives, int year){
        String OS = "";
        if (OSDives == 0) {
            OS = "IOS";
        } else if (OSDives == 1) {
            OS = "android";
        }
        if (year < 2022) {
            System.out.println("установите облегчённую версию приложения для " + OS);
        } else {
            System.out.println("установите полную версию приложения для " + OS);
        }
    }



//    задание 3

        public static  int Delivery(int deliveryDistance) {
        int deliveryDay = 1;
            if (deliveryDistance > 20) {
                deliveryDay++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDay++;
            }
        return deliveryDay;
        }


//        адание 4

    public static void printDouble(String text) {

        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for(char letter : letters) {
            if (letter == prevChar) {
                System.out.println("произошёл дубль символа - " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("дубль не произошёл");


        }

//        задание 5


    public static void reversNumber(int[] number) {
        int star = 0;
        int end = number.length - 1;
        while (star < end) {
            int helper = number[star];
            number[star++] = number[end];
            number[end--] = helper;
        }
    }



    public static void main(String[] args) {


//        задание 1


        int year = 401;
        printLeapYear(year);


//        задание 2

        int OSDives = 0;
        int YearDives = 2022;
        printUpGrateOS(OSDives, YearDives);


//    задание 3

        int distance = 50;
        System.out.println("для доставки потребуется дней - " + Delivery(distance));


//        адание 4

        String A = "Annarasumanara";
        printDouble(A);


//        задание 5


        int[] numbers = {1, 5, 4, 8, 5};
        reversNumber(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
