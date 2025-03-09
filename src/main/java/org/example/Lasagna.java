package org.example;

import java.util.Scanner;

public class Lasagna {
    Scanner scan = new Scanner(System.in);
    public int expectedMinutesInOven(){
        return 40;
    }

    public String remainingMinutesInOven(int minutesInOven){

        if (minutesInOven < 0) {
            return "Negative numbers are not allowed";
        }

        if (minutesInOven > 40){
            int result = minutesInOven - 40;
            return String.format("Your lasagna is overcooked by %d minutes", result);
        } else if (minutesInOven < 40) {
            int result = 40 - minutesInOven;
            return String.format("the remaining oven time is %d minutes", result);
        }
        return "The lasagna is perfectly cooked";
    }

    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven){
        if (layers < 0 && minutesInOven < 0){
            return  0;
        }
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + minutesInOven;
    }

    public boolean banderaCondition(){
        System.out.println("Would you like to continue with the program? (s/n)");
        String result = scan.next();
        if (result.equalsIgnoreCase("s")){
            return true;
        }
        return false;
    }
}
