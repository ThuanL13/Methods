package com.pluralsight;

import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in); // Calling for scanner
    public static void main(String[] args) {
        // System.out.println("Coding is so cool!");
        // System.out.println("Hi Sama");

        // message("Sama");
        // message("Jofre");
        // calculateHowManyYearsLeftToWork("Thuan",28);

        System.out.println("What is your name?");
        String name = read.nextLine();
        message(name);
        System.out.println("What is your age?");
        int age = read.nextInt();
        calculateHowManyYearsLeftToWork(name,age);

    }
    public static void message(String name) {
        System.out.println("Hi, you are great " + name);
    }
    public static void calculateHowManyYearsLeftToWork(String name, int age) {
        int retirementAge = 67;
        int years = retirementAge - age;
        System.out.println(name + " still needs to work " + years + " more years");

    read.close();
    }
}
