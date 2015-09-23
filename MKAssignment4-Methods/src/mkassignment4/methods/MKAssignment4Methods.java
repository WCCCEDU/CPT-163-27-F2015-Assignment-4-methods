
package mkassignment4.methods;

/**
 *This program demonstrates the use of methods.
 */
import java.util.Scanner;
public class MKAssignment4Methods {

    public static void main(String[] args) {
      
    int number; // The users selection
        
        Scanner keyboard = new Scanner(System.in);
       
        //Menu options
        System.out.println("1. Run Assignment 1 - Hangry");
        System.out.println("2. View my favorit Fish");
        System.out.println("3. Run HelloWorld");
        System.out.println("4. View my favorite Adventure Time character");
        System.out.println("5. Quit");
        
        //Get users option
        System.out.println("Please enter the number of the option"
                + " above that you would like to select");
        System.out.print("and then press Enter on your keyboard: " );
        number = keyboard.nextInt();
        
        //Confirm the users choice
        System.out.println("You chose " + number + ".");
         
        //Output based on choice
        if (number == 1)
            denied(); 
         else if (number == 2) 
            favFish();
         else if (number == 3)
            sorry();
         else if (number == 4)
             favCharacter();
         else if (number == 5)
             System.exit(0);
         else 
             notValid();
    }
        
    /**
     * Displays a denied message.
     */
    public static void denied() {
        System.out.println("Your request is denied.");  
        
    }
    /**
     * Displays my favorite fish.
     */
    public static void favFish() {
        System.out.println("My favorite fish is salmon.");
    }
    /**
     * Displays apology.
     */
    public static void sorry() {
        System.out.println("Sorry, your request has been denied.");
    }
    /**
     * Displays my favorite character.
     */
    public static void favCharacter() {
        System.out.println("My favorite character is Marceline.");
    }
    /**
     * Displays invalid selection message
     */
    public static void notValid() {
        System.out.println("Your selection is not valid.");
    }
    
}

