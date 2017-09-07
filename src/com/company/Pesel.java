package com.company;

import java.util.ArrayList;
import java.util.List;


public class Pesel {
    int pesel_leght = 11;
    boolean women = true;
    boolean man = false;
    String pesel;

    public static void check(String pesel) {
        int[] weight = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        if (pesel.length() != 11)
            System.out.println("PESEL is too short, PESEL should has 11 digits");

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += Integer.parseInt(pesel.substring(i, i + 1)) * weight[i];
        }
        int checkNumber = result % 10;
        checkNumber = 10 - checkNumber;
        checkNumber = checkNumber % 10;
        if (Integer.parseInt(pesel.substring(10, 11)) == checkNumber) {
            System.out.println("PESEL is ok");

        } else {
            System.out.println("PESEL is not valid");
        }

    }

    public void sex(String pesel) {
        String sex;
        if (Integer.parseInt(pesel.substring(9, 10)) % 2 == 0) {
            System.out.println("You are a women.");

        } else System.out.println("You are a men.");

    }

    public void dateOfBirth(String pesel) {
        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        switch (pesel.substring(2,3)){
            case "8":
            case "9":
                year += 1800;
                month -= 80;
                break;
            case "0":
            case "1":
                year += 1900;
                break;
            case "2":
            case "3":
                year += 2000;
                month -= 20;
                break;
            case "4":
            case "5":
                year += 2100;
                month -= 40;
                break;
            case "6":
            case "7":
                year += 2200;
                month -= 60;
                break;
                default:break;


        }


        System.out.printf("Yours brith's date is: %02d.%02d.%02d ",day ,month ,year);


    }
}

