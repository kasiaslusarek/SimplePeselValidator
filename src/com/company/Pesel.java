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
            System.out.println("PESEL is too short, pesel should has 11 digits");

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
            System.out.println("You are a women");

        } else System.out.println("You are a men");

    }

    public void dateBirth(String pesel) {
        int dateBirth;
        System.out.println("Yours Birth's number is: " + pesel.substring(4, 6) + "." + pesel.substring(2, 4) + "." + pesel.substring(0, 2));

        }
    }


