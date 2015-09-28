/**
 * @author Samantha Shurie 
 * 
 * JAVA I - CPT 163-27:
 * This program is a modification of assignment 2, where we were to design a
 * menu application. This program moves each of the previous menu options into
 * their own methods.
 */


package arevyn24.assignment.pkg4;
import java.util.Random;    //needed to generate random numbers
import java.util.Scanner;   //needed for reading user input

public class Assignment4Methods {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer input = 0; //User menu selection
       Scanner keyboard = new Scanner(System.in);
       
       
      //While loop: run this menu as long as the user does not enter 6 on the main menu
        do {
            
            printMenu();
            print("\nEnter a menu number: ");
            input = keyboard.nextInt();
            print("\n");
           
            switch(input) {
                case 1:
                    wordValueCalc();
                    break;
                case 2:
                    gradeCalc(keyboard);
                    break;
                case 3:
                   loopingLyrics(keyboard);
                    break;
                case 4:
                    slotMachine(keyboard);
                    break;
                case 5:
                    reverseWord(keyboard); ;
                    break;
                case 6:
                    print("EXIT\n");
                    break;
                default:
                    print("Oops! Try again.\n");  
                    break;
            }  //end switch  
        }while(input != 6);  //end while
        print("\tProgram Ended - Goodbye!\n");
               
    }    // end main method
    
    
    /**
     * Print method prints a string value to the console
     * @param msg string value
     */
    public static void print(String msg) {
        System.out.print(msg);
    }   //end print method
    
    
    /**
     * PrintMenu() prints the array items to the console using a for loop
     */
    public static void printMenu() {
        String[] menuItems = {
           "Word Value Calculator", "Grade Calculator","Song Lyrics Loop",
        "Slot Machine Simulator","Reverse Words", "Exit"
       };
       
        print("\n\t\tMENU\n\n");
        
       for(int i=0; i < menuItems.length; i++) {
           print((i+ 1) + ". " + menuItems[i]+"\n");
       }
    };  //end printMenu method
    
    
    /**
    * wordValueCalc() accepts a word, retrieves the numeric value of each
    * character in the word, adds the sum of their values, and prints the sum. 
    */
    public static void wordValueCalc() {
      //ASSIGNMENT 1 CODE
        char uprH = 'H';
        char lwrU = 'u';
        char lwrF = 'f';
        char lwrL = 'l';
        char lwrE = 'e';
        char lwrP = 'p';
        int asciiSum;
        
        print("WORD CALCULATOR\n"
                + "\tThe word is 'Hufflepuff'\n");
        print("\t" + uprH + " " + lwrU + " " + lwrF + " " + lwrF + " " +
                lwrL + " " + lwrE + " " + lwrP + " " + lwrU + " " + lwrF +
                 " " + lwrF+"\n");

        asciiSum = uprH + lwrU + lwrF + lwrF + lwrL + lwrE + lwrP + 
                lwrU + lwrF + lwrF;

        print("\tThe sum of the word is: " + asciiSum + "\n\n");
    }     //end wordValueCalc method
    
    
    /**
     * gradeCalc() accepts a value from the user and calculates and prints their
     * score, percentage and letter grade
     * @param keyboard Scanner keyboard reads user input 
     */
    public static void gradeCalc(Scanner keyboard) {
      //IN CLASS PROJECT
        Double yourPoints;
        Double maxPoints;
        Double percentage;
        char grade;
        String score;

         print("GRADE CALCULATOR\n");
         print("\tEnter YOUR SCORE: ");
         yourPoints = keyboard.nextDouble(); 
         print("\tEnter MAX POINTS: ");
         maxPoints = keyboard.nextDouble(); 
         percentage = (yourPoints/maxPoints) * 100;

         if(percentage >= 90) {
                grade = 'A';
         } else if (percentage >= 80) {
             grade = 'B';
         } else if (percentage >= 70) {
             grade = 'C';
         } else if (percentage >= 60) {
             grade = 'D';
         } else {
             grade = 'F';
         }
         
         score = String.format("Your grade: %.2f" + " " + grade + "\n\n", percentage);
         print(score);
        
    };      //end gradeCalc method
    
    
    /**
     * loopingLyrics() accepts a number from the user that stores in the variable
     * representing the number of times a loop executes. The loop prints array items
     * one by one. User can repeat or return to menu.
     * @param keyboard Scanner accepts user input
     */
    public static void loopingLyrics(Scanner keyboard) {
      //LOOPING LYRICS
        Integer numLoops;
        /*Each line of the song is stored in the lyrics array. The user
          chooses how many lines of lyrics will be printed (also the number
          of times the loop will be executed).
        */
        String[] lyrics = {
          "Adventure Time,", "Come on, grab your friends", "We'll go to" , 
            "very distant lands", "With Jake the Dog", "And Finn the Human",
            "The fun will never end,", "It's Adventure Time!"
        };    

        //title and description
        print("SONG LYRICS LOOP\n" + "\tEnter a number from"
                + " 1-8. This will be the number of times the loop"
                + " executes: ");
        numLoops = keyboard.nextInt();

        do { 
            /*If input is not a number between 1-8, prompt the user
              to enter a new value. Keep looping until they enter a
              correct value*/
            while (numLoops > 8 || numLoops <= 0) {
                print("Oops! Try again. Enter a number from"
                                    + " 1-8.\n");
                numLoops = keyboard.nextInt();
            }
            /*
              In this for loop, the variable i represents the location
              inside the lyrics[] array. numLoops is the user-chosen
              number that decides how many lines of lyrics will be 
              printed Each time the loop runs, i is increased, making
              the next line of the song print out
            */
            for(int i=0; i < numLoops; i++) {
                print("\t\t" + lyrics[i] +"\n");
            } 
            print("\nEnter a number 1-8 to loop again or 9 to"
                    + " return to main menu: ");
            numLoops = keyboard.nextInt();
        } while (numLoops != 9);
    };      //end loopingLyrics method
    
    
    /**
    * slotMachine lets the user play a text version of a slot machine game. Enter
    * a bet and double or triple the bet amount based on the number of matching
    * symbols
    * @param keyboard Scanner object reads user input
    */  
    public static void slotMachine(Scanner keyboard) {
      //Chapter 4 Exercise 22: Slot Machine Simulation (page 267)
      //Objective: Create a program that simulates a slot machine
        Integer betAmt, winnings;
        Integer[] randoms = {0,0,0}; //will hold values to be converted to strings
        String[] slotValues = {" "," "," "};
        String slot1 = " ",slot2 = " ", slot3 = " " ; //hold text representation of randoms

      //read user bet amount
        print("SLOT MACHINE\n"
                + "\tPlace Your Bet (dollar amount [Integer]): ");
        betAmt = keyboard.nextInt();
        
        while(betAmt != 0) {
            //validates user input betAmt
            while(betAmt < 0 && betAmt > 100) {
                print("\tTry an amount between 1 and 100: ");
                betAmt = keyboard.nextInt();  
            }

           /*assign random values to each of the three slots
            *spin.nextInt(6) will generate a random number from 0 and 5
            * slotValue() method assigns text value to each slot
            */
            for(int i = 0; i < 3; i++) {
                randoms[i] = (new Random()).nextInt(6);
                slotValues[i] = slotValue(randoms[i]);
            }

          //print all 3 slots
            print("\n\t[ " + slotValues[0] + " ] [ " + slotValues[1] + " ] [ "
                     + slotValues[2] + " ]\n\n");

          //calculate winning amount
          //if NONE are equal (probably the most likely)  
            if(!slotValues[0].equals(slotValues[1]) &&
                    !slotValues[0].equals(slotValues[2]) &&
                    !slotValues[1].equals(slotValues[2])){

                winnings = 0;
                print("\tSorry! Better luck next time!\n");

          //some are equal, determine if there are 2 or 3 matching    
          }else{
              if(slotValues[0].equals(slotValues[1]) &&
                       slotValues[0].equals(slotValues[2])){

                   winnings = betAmt * 3; //3 Matching
                   print("\tCongratulations! 3 Matching!\n");
               }else{
                   winnings = betAmt * 2; //2 Matching
                   print("\t2 Matching!\n");
               }    
           } //end winnings if-else statement

           //print winnings
           print("\tYou Won: $" + winnings
                    + "\nTo play again, enter a bet amount or enter 0(zero) to"
                   + " return to the main menu: ");
           betAmt = keyboard.nextInt();
       }    //end while loop
    }   //end slotMachine method
    
    
    /**
     * Assigns and returns a slot value to each random number spun
     * @param random integer ranging from 0 to 5
     * @return String value - symbol of slot value
     */
    public static String slotValue(Integer random) {
        String slotWord = " ";
        
        if (random == 0) {
            slotWord = "Cherries";
        } else if (random == 1){
            slotWord = "Oranges";
        } else if (random == 2){
            slotWord = "Plums";
        } else if (random == 3){   
            slotWord = "Bells";
        } else if (random == 4){
            slotWord = "Melons";
        } else {
            slotWord = "Bars";
        }
        
        return slotWord;
    };  //end SlotValue Method
    
    
    /**
     * reverseWord() accepts a word given by the user and prints the word back
     * with the characters in reverse order
     * @param keyboard Scanner object reads user input
     */
    public static void reverseWord(Scanner keyboard) {
      //declare variables
        String word = "default";
        String reverseWord="";
        char letter;
        
      //accept input
        print("Enter a word to print backwards: ");
        word = keyboard.nextLine();
        
      //validate user entry
        while(word.length() < 5) {
            print("*Please enter a word that is 5 characters or longer: ");
            word = keyboard.nextLine();
        }
            
      //loop word
      /*start at (length - 1(last character)) and stop at 0,
      /*decrementing by 1. Store character in this position in a variable
      /*add those variables together by looping*/
        for(int i = (word.length() - 1); i > -1;i--) {
            letter = word.charAt(i);
            reverseWord = reverseWord + letter;
        }
        
      //print reverseWord
        print("Your word backwards---> " + reverseWord + "\n\n");
        
    }       //end reverseWord method
    
    
}   //end of class
    
