package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write yours PESEL");
        String pesel;
        pesel = reader.nextLine();
        System.out.println("Thank you");
        Pesel peselValidator = new Pesel();
        peselValidator.check(pesel);
    peselValidator.sex(pesel);
    peselValidator.dateOfBirth(pesel);
    }


}
