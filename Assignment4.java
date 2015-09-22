package assignment4;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Scanner keyboard = new Scanner(System.in);
        int menuChoice;
        int quit; 
        
        do{ //menu loop
            print("Select an option from the list below.");
            print(
                      "1. Author\n"
                    + "2. Class\n"
                    + "3. School\n"
                    + "4. Date\n"
                    + "5. Word Counter\n"
                    + "6. Exit");
            menuChoice = keyboard.nextInt();
            
            while(menuChoice < 1 || menuChoice > 6){ // test menuChoice range
                print("**Please enter a valid menu selection (1-6)**");
                print("Select an option from the list below.");
            print(
                      "1. Author\n"
                    + "2. Class\n"
                    + "3. School\n"
                    + "4. Date\n"
                    + "5. Word Counter\n"
                    + "6. Exit");
            menuChoice = keyboard.nextInt();
            } // end while loop
            
            switch(menuChoice){
                case 1:{ // name
                    getAuthor();
                    break;
                }
                case 2:{ // class
                    getClassName();
                    break;
                }
                case 3:{ // school
                    getCollegeName();
                    break;
                }
                case 4:{ // date
                    getUpdateDate();
                    break;
                }
                case 5:{ // word counter
                    getWordCounter();
                    break;
                } // case5
            } // end switch
        if(menuChoice != 6){
            print("Enter 6 if you wish to quit or another number"
                + " to continue: ");
            quit = keyboard.nextInt();
            if(quit == 6){
                menuChoice = 6;
            } //quit if
        } // not 6 if
        }while(menuChoice != 6); // end menu loop
    }
    /**
     * shortcut for println
     * @param message = words to print
     */
    public static void print(String message){
        System.out.println(message);
    }
    
    /**
     * gets author of program
     */
    public static void getAuthor(){
        print("1. Author: Adam King");
    }
    /**
     * gets college class name
     */
    public static void getClassName(){
        print("2. Class: CPT163 Java Programming 1");
    }
    /**
     * get college name
     */
    public static void getCollegeName(){
        print("3. School: Westmoreland County Community College");
    }
    /**
     * last date program was updated
     */
    public static void getUpdateDate(){
        print("4. Date: Last Updated: 9/22/2015");
    }
    /**
     * word counter program
     */
    public static void getWordCounter(){
        print("5. Word Counter");
        // word = "zouk"
        int letterOne = (int)'z';
        int letterTwo = (int)'o';
        int letterThree = (int)'u';
        int letterFour = (int)'k';
        int wordTotal = letterOne + letterTwo + letterThree 
            + letterFour;
        print(letterOne + " + " +letterTwo + " + " 
            + letterThree + " + " + letterFour+ " = " 
            + wordTotal);
    }
}
