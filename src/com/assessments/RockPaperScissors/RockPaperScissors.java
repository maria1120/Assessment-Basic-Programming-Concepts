package com.assessments.RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int numberOfRounds, userChoice, computerChoice;
       int userScore = 0;
       int computerScore = 0;
       boolean play = true;


       //Greet the user and ask how many times wants to play
        System.out.print("Let's play!");

        while(play) {
            System.out.println("How many rounds you want to play?");
            //Take the input
            numberOfRounds = input.nextInt();
            if (!isCorrectInput(numberOfRounds)) {
                System.out.println("Wrong value");
              play = false;
            }
            else {

                do {
                    System.out.println(" We have " + numberOfRounds + " rounds.");
                    System.out.println("Please choose from: 1.Rock, 2.Paper, 3.Scissors");

                    userChoice = input.nextInt();
                    // if the number is out of range 1-3, ask for input again
                    if(userChoice > 3 || userChoice <1 ){
                        System.out.println("Please enter 1, 2 or 3");
                        userChoice = input.nextInt();
                    }
                    // Random choice for the computer
                    computerChoice = (int) (Math.random() * (3 - 1) + 1);

                    if (computerChoice == userChoice) {
                        System.out.println("Tie");
                        numberOfRounds--;
                    }

                    else if(userWins(userChoice, computerChoice)){
                        userScore += 1;
                        numberOfRounds--;
                    }
                    // if The computer win the round
                    else {
                        computerScore +=1;
                        numberOfRounds--;
                    }
                 // end of the do-while loop when number of rounds = 0
                }while (numberOfRounds>0);
                // Display results
                System.out.println("Computer score: " + computerScore + " Your score: " + userScore);
                checkTheWinner(userScore,computerScore);
                System.out.println();
                //Ask user if he wants to play again
                System.out.println("Would you like to play again? If you want to stop, press 1");
                int start = input.nextInt();
               // if not, terminate while loop
                if(start == 1){
                    play = false;
                }


            }
        }


    }


    //Method to check is the input number of games valid
       public static boolean isCorrectInput(int choice){
      return choice > 0 && choice <= 10;
       }

       //Method to check is user winning
      public static boolean userWins (int userChoice, int computerChoice){
        switch(userChoice){
            case 1: // if the user chose Rock
                return computerChoice ==3;
            case 2: // if the user chose Paper
               return computerChoice == 1;


            case 3://If the computer chose Scissors
                return computerChoice == 2;

        }

          return false;
      }

      //method to display the result
     public static void checkTheWinner(int userScore, int computerScore){
         if(userScore > computerScore){
             System.out.println("You won! Congrats!");
         }
         else if (userScore == computerScore) {
             System.out.println("It is a tie");
         }
         else {
             System.out.println("Better luck next time");
         }
     }

}
