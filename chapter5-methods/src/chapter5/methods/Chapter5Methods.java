
package chapter5.methods;

/* CLASS:   CPT 163  Java Programming I
*  @author  Sharon R. Tinkey
*  DATE:    09/04/15
*  CHAPTER: 3
*  PROGRAM: Assignment 2: conditions
*/

import java.util.Scanner;		// required to use Scanner class
/*
This program is a menu...
*/
public class Chapter5Methods {

    /**
     * Main presents the menu.
     * @param  args  no arguments
     */
     public static void main(String[] args) {
     
    // Create Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    String menuSelStr;          // menu item selected
    int menuSelNum;             // menu item selected
 
    do {
        // display menu
        System.out.println("\n\nMy Java Class Assignments");
        System.out.println("=========================\n");
        System.out.println("1. Assignment 1: Word Sum");
        System.out.println("2. Assignment 2: Conditions");      
        System.out.println("3. Assignment 3: Reverse the Word");
        System.out.println("4. Assignment 4: Methods");
        System.out.println("5. Assignment 5: TBD");
        System.out.println("6. EXIT\n");
        System.out.print("Select a program to run: ");
        menuSelStr = keyboard.nextLine();              // get menu item selected
        menuSelNum = Integer.parseInt(menuSelStr);    // change item into number
        
        System.out.println();                 // output a blank line for spacing
    
        // execute the user's selection
        switch (menuSelStr)  {
            case "1":
                menu1();
                break;
            case "2":
                menu2();
                break;
            case "3":
                menu3();
                break;
            case "4":
                menu4();
                break;
            case "5":
                menu5();
                break;
            case "6":
                menu6();
                break;
            default:
                menuDefault();
                break;
        } // switch
    } while (menuSelNum != 6);
    
    System.out.println("\n\nThat's All Folks!!");
    System.exit(0);
    } // main
     
     /*
     Menu option 1: run the Word Count program
     */
     public static void menu1() {
             
        String theWord;                 // word entered by user
        int wordValue = 0;              // holds sum of word
        // Create Scanner object for keyboard input
         
        Scanner wordIn = new Scanner(System.in);

        // prompt user for a word
        System.out.println("The Sum of a Word");
        System.out.println("=================\n");
        System.out.print("Enter a word: ");
        theWord = wordIn.nextLine();        // get word entered
        
         for (int i = 0; i < theWord.length(); i++){
            wordValue += theWord.charAt(i);
        }
         
         // display the reversed word
        System.out.println("\n\nThe sum of the characters in the word " + 
                            theWord + " is " + wordValue + ".");
     }
     
     /*
     Menu option 2: run the Conditions program
     */
     public static void menu2() {
        System.out.println("You chose 2. Assignment 2: Conditions\n");
        System.out.println("Assignment 2 was to write this menu!!");
     }
     
     /*
     Menu option 3: Assignment 3: Reverse the Word
     */
     public static void menu3() {
              
        String theWord;                 // word entered by user
        String revWord = "";            // reversed word 
        char wordChar;                  // holds char from word entered
        int revI;                       // letter position in reverse word

        // Create Scanner object for keyboard input
        Scanner wordIn = new Scanner(System.in);

        // prompt user for a word
        System.out.println("Reverse the Word");
        System.out.println("================\n");
        System.out.print("Enter a word to display in reverse order: ");
        theWord = wordIn.nextLine();        // get word entered
        revI = theWord.length()-1;          // initialize to last letter of word
        
        // reverse the word
         for (int i = 0; i < theWord.length(); i++){
            wordChar = theWord.charAt(revI);
            revWord = revWord + wordChar;
            revI--;
         }
         // display the reversed word
        System.out.println("\n\nThe reverse of the word " + 
                            theWord + " is " + revWord + ".");
    } 
     
     /*
     Menu option 4: TBD
     */
     public static void menu4() {
        System.out.println("You chose 4. Assignment 4: Methods\n");
        System.out.println("Assignment 4 was to rewrite \n" + 
                           "Assignment 2: Conditions \n" +
                           "which is this menu!");
     }
     
     /*
     Menu option 5: TBD
     */
     public static void menu5() {
        System.out.println("You chose 5. Assignment 5: TBD\n");  
     }
     
     /*
     Menu option 6: TBD
     */
     public static void menu6() {
        System.out.println("You chose 6. EXIT\n");  
     }
     
     /*
     Menu option menuDefault: display error message
     */
     public static void menuDefault() {
        System.out.println("ERROR: Your selection must be from 1 to 6.\n" +
                            "Try again.");  
     }
  
} //class


