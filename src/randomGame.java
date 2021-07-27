import java.util.Random;

import java.util.Scanner;

import java.util.*;

public class randomGame  {

    public static void main(String[] args) {

    // Random START
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

    // variables
        boolean right = false;
        int guesser;
        int number;
        int counter = 0;



    // Creating the random integer
        
        number = random.nextInt(100);
       


    // this loops makes it so that if they break from the maximum 
    // number of times a user can guess or if they correctly make
    // then it breaks
        for (int i = 0; i < 5; i++ ) {


            while (!right && counter < 5) {
            	
            	//
                System.out.print("Pick a number between 1 and 100: ");
                guesser = scanner.nextInt();
                
                
              //This is if it's the input matching the answer
                if (guesser == number) {
                    right = true;
                    System.out.println("You're a WINNER!");
                    break;
         
                } else if(guesser < 1 || guesser > 100) {
                	System.out.println("Try again");
                	
                	
                	
                }  else if (number < guesser) {
                    System.out.println("Lower");
                    counter++;


                } else if (number > guesser) {
                    System.out.println("Higher");
                    counter++;

                    
                } 

            }
            }
     //When it breaks this checks to see if its a loss
        if (counter >= 5) {
        System.out.println("You Lose");
        }

    }


}
