package com.assessments.DogGenetics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    //asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog.
    //It should assign a random percentage to 5 dog breeds (that should add up to 100%!)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] breed = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        int [] percentage = new int[breed.length];


        //ask and save the dog name
        System.out.println("What is your dog's name?");
        String dogName = input.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        System.out.println();
        System.out.println();
        //Assign random values for the percents
        for(int i=0; i<percentage.length; i++) {
            percentage[i] = (int) (Math.random() * (100 - 1) + 1);
        }
         //print the two Arrays
        for(int j=0; j<breed.length; j++){
            System.out.println(percentage[j] + "% " + breed[j] );
        }
        }

    }



















