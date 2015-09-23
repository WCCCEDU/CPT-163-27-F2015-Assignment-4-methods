
package assignment4methods;

import java.util.Scanner;

public class Assignment4Methods {

    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        print("Please select which program you would like to open:");
        print("For word counter enter  1 \nFor games enter 2");
        print("For internet browser enter 3 \nFor fallout enter 4");
        print("For starcraft enter 5 \nTo exit enter 0");
        int choice = keyboard.nextInt();
        if(choice == 1){
            wordCounter();
        } else if(choice == 2){
            games();
        } else if(choice == 3){
            browser();
        } else if(choice ==4){
            fallout();
        } else if(choice == 5){
            starCraft();
        } else if(choice == 0){
            exit();
            
        } else {
            
        }
        
    }
    /**
     * a simple text printer to make printing lines simple
     * @param text whatever line you want to print
     */
    public static void print(String text){
       System.out.println(text);
    }
    /**
     * runs the word counter application
     */
    public static void wordCounter(){
        print("you have chosen to open the word counter");
        String word = "Dogmeat";
        int sum = 0;
        for(int i = 0; i<word.length(); i++){
          int letter = word.charAt(i);
          sum += letter;
          }   
        System.out.println(sum);
    }
    /**
     * references the 1980's film "War Games"
     */
    public static void games(){
        print("You have shosen to open games\n"
                + "Hello Doctor Falken. \nShall we play a game?");
    }
    /**
     * displays the choice of going on the internet
     */
    public static void browser(){
        print("you have chosen to open the internet browser\n"
                + "enjoy browsing the interwebs!");
    }
            
    /**
     * displays that they would like to play Fallout as well as the opening line
     * from the game
     */
    public static void fallout(){
        print("you have chosen to open Fallout\n"
                + "War, war never changes.");
    }
           
    /**
     * displays that user wants to play Star Craft as well as one of the most
     * iconic lines from the game
     */
    public static void starCraft(){
        print("you have chosen to open Starcraft\n"
                + "You want a piece of me boy?");
    }
           
    /**
     * indicates the user cannot follow simple instructions and prompts them to
     * try again
     */
    public static void poorChoice(){
        print("You have chosen poorly. You must enter a number between 0 and 6"
                + "\nTry again.");
    }
    
    /**
     * exits the program
     */
    public static void exit(){
        print("Thank you for your time");
        System.exit(0);
    }
}
