package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {-4.6, 23.4, 0.54, 12.7, 12.76, -7.8, 11.5, 23.5, 55.6, -2.5, 5.9, 86.90, 31.8, 34.6, 34.8};
        System.out.println(numbers.length);
        boolean numberCheckNegative = false;
        double number  = 0;
        int amount = 0;
        for (double num : numbers){
            if (number < 0){
              numberCheckNegative = true;
            }else if (numberCheckNegative){
                number = num + number;
                amount++;
            }
        }
        System.out.println(number);
        System.out.println(amount);
        System.out.println(number/amount);
    }
}
