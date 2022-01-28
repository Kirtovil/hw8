package com.company;


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


    public static void printOS(int OSDives){

        if (OSDives == 0) {
            System.out.println(" для IOS");
        } else if (OSDives == 1) {
            System.out.println(" для Android");
        }
    }

    public static void printVersionAPP(int year) {

        if (year < 2022) {
            System.out.print("установите облегчённую версию приложения");
        } else {
            System.out.print("установите полную версию приложения");
        }
    }

//    задание 3

        public static void printDelivery(int deliveryDistance) {
        int deliveryDay = 1;
            if (deliveryDistance > 20) {
                deliveryDay++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDay++;
            }
            System.out.println("Потребуется дней для даставки карты - " + deliveryDay);
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


    public static void printRevers(int[] number) {
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);

        }
    }


    public static void main(String[] args) {


//        задание 1


        int year = 401;
        printLeapYear(year);


//        задание 2

        int OSDives = 1;
        int YearDives = 2021;
        printVersionAPP(YearDives);
        printOS(OSDives);


//    задание 3

        int distance = 95;
        printDelivery(distance);


//        адание 4

        String A = "Annarasumanara";
        printDouble(A);


//        задание 5


        int[] numbers = {1, 5, 4, 8, 5};
        printRevers(numbers);

    }

}
