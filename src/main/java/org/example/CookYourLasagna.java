package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CookYourLasagna {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;

        System.out.println("Welcome to the lasagna time calculator");
        while (bandera) {
            System.out.println("Select the number of the option that you would like to calculate:");
            System.out.println("1. Calculate expected minutes in oven");
            System.out.println("2. Calculate remaining minutes in oven");
            System.out.println("3. Calculate preparation time in minutes");
            System.out.println("4. Calculate Total working time in minutes");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    var time1 = new Lasagna().expectedMinutesInOven();
                    System.out.println("The expected minutes in oven are " + time1 + "  minutes");
                    break;
                case 2:
                    var time2 = new Lasagna().remainingMinutesInOven(20);
                    System.out.println(time2);
                    break;
                case 3:
                    var time3 = new Lasagna().preparationTimeInMinutes(7);
                    System.out.println("Your total preparation time in minutes are " + time3 + " minutes");
                    break;
                case 4:
                    var time4 = new Lasagna().totalTimeInMinutes(5, 30);
                    if (time4 == 0) {
                        System.out.println("Negative numbers are not allowed");
                    } else {
                        System.out.println("Your total working time is " + time4 + " minutes");
                    }
                    break;
            }
            bandera = new Lasagna().banderaCondition();
            if (bandera == false){
                System.out.println("Ending program...");
            }
        }
    }
}
