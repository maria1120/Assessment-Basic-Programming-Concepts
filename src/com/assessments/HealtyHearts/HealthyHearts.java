package com.assessments.HealtyHearts;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        age = input.nextInt();
        //calculate maximum rate
        int maximumRate = 220-age;
        //calculate the range
       int targetRateHigh = (int)(0.85 * maximumRate);
       int targetRateLow = (int)(0.50 * maximumRate);

        //print results
        System.out.println("Your maximum heart rate should be " + maximumRate + " beats per minute");
        System.out.println("Your target HR Zone is " + targetRateLow + "-" + targetRateHigh);





    }



}
