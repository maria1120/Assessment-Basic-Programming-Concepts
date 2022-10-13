package com.assessments.SummativeSums;

public class SummativeSums {

    public static void main(String[] args) {
        int[] myArray = {5,10,15,20};
        //call the method
       System.out.println("Array sum: "+ returnSum(myArray));

    }

 //method to add each number
    public static int returnSum(int[] array){
      int sum = 0;
        for (int j : array) {

            sum += j;
        }
        return sum;
    }

}
