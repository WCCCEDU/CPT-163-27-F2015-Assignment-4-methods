package paa1006.assignment4;

import java.util.Scanner;   // Needed for Scanner class
import java.util.Date;      // Needed for Date and Time
import java.text.DateFormat;    // Needed for Date and Time
import java.text.SimpleDateFormat;  // Needed for Date and Time
import java.util.Calendar;      // Needed for Date and Time
import java.util.concurrent.TimeUnit;

public class Paa1006Assignment4 {

    public static void main(String[] args) {
        
    // Decale variable to test for Do While loop
    Boolean exitP = false;      
    do{
        // Declare variables
        int menuNumber;
        Scanner keyboard = new Scanner(System.in);
        
        // Show User Menu and get input
        System.out.println("--------------------------");
        System.out.println("1. Value of a String");
        System.out.println("2. Current Date and Time");
        System.out.println("3. Programmer's Name");
        System.out.println("4. IDE Used to to Make This");
        System.out.println("5. Programmer's Github Username");
        System.out.println("6. Exit Application");
        System.out.print("Enter a number to select a menu option: ");
        menuNumber = keyboard.nextInt();
        System.out.println("You selected " + menuNumber);
        System.out.println("--------------------------");
     
        // Determine the number entered
        switch (menuNumber)
        {
            case 1:
                // Take a word from user then send it to Method
                Scanner keyboard2 = new Scanner(System.in);
                String word;
                System.out.print("Enter a string: ");
                word = keyboard2.next();
                
                // Call method to get value of string
               ValueOfString(word);
               break;
            case 2:
                // Call method to Display Date and time
                DisplayDateTime();
                break;
            case 3:
                // Call method to display name
                DisplayName();
                break;
            case 4:
                // Call method to display IDE
                DisplayIDE();
                break;
            case 5:
                // Call method to display Github user name
                DisplayGithub();
                break;
            case 6:
                // Call method to display close program message
                exitP = CloseProgram();
                break;
            default:
                // Call method to display wrong input
                WrongInput();
        }
    }while(exitP == false);
}
    
    /**
     * Method which takes a string, and finds its integer value
     * @param word String
     */
    public static void ValueOfString(String word){
        // Initialize a counter for value of string
        int valueTotal = 0;
        
        // Loop to add up chars in the string
        for(int i = 0;i < word.length();i++){
          valueTotal += word.charAt(i);
        }
       
         // Print out information
        System.out.println("The word is " + word);
        for(int i = 0;i < word.length();i++){
         System.out.println(word.charAt(i) + " = " + (int)word.charAt(i));
        }            
        System.out.println("Total = " + valueTotal);      
    }
    
    /**
     * Display Date and Time
     */
    public static void DisplayDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("The current date and time is: " + dateFormat.format(date));
    }
    
    /**
     * Display name
     */
    public static void DisplayName(){
        System.out.println("The programmer's name is Patrick Antoniak.");
    }
    
    /**
     * Display IDE
     */
    public static void DisplayIDE(){
        System.out.println("The IDE used to program this was Netbeans.");
    }
    
    /**
     * Display Github user name
     */
    public static void DisplayGithub(){
        System.out.println("The programmer's Github username is Paa1006.");
    }
    
    /**
     * Close the program by returning the value to end the loop
     * @return Boolean True
     */
    public static Boolean CloseProgram(){
        Boolean exit;
        
        System.out.println("The program is now closing...");
        exit = true;
        return exit;
    }
    
    /**
     * Display wrong input message
     */
    public static void WrongInput(){
        System.out.println("That's not 1, 2, 3, 4, 5, or 6!");
    }
    
}
