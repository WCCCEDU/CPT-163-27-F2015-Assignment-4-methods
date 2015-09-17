
package assignment4;

import java.util.Scanner;

public class Assignment4 {

    /**
     * Curtis Kunkle
     * Assignment 4
     * This program uses methods to display the results
     * of a multiple choice survey.
     */
    public static void main(String[] args) {
        
        //declare character for user input
        int choice;
        
        //new scanner object!
        Scanner keyboard = new Scanner(System.in);
        
        //Output prompt, list killer Peavey tube amps
        print("What is the best high-gain Peavey tube Amplifier?");
        print("1: Classic Series");
        print("2: ValveKing");
        print("3: 6505");
        print("4: XXX");
        print("5: JSX");
        print("6: Butcher");
        print("7: QUIT");
        
        //accepts the first integer of the user's input
        choice = keyboard.nextInt();
        
        //error checking.  
        while(choice != 1 && choice != 2 &&
              choice != 3 && choice != 4 &&
              choice != 5 && choice != 6 && choice != 7){
         print("Invalid choice! Try again.");
         choice = keyboard.nextInt();
        }
         
        //Output results with methods!
        classic(choice);
        valveking(choice);
        Sixty505(choice);
        xxx(choice);
        jsx(choice);
        butcher(choice);
        quit(choice);
    }
    /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
    public static void classic(int choice){
       if(choice == 1){
       print("You chose Classic Series. Thanks for your contribution!");
       }
    }
     /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
   public static void valveking(int choice){
       if(choice == 2){
       print("You chose ValveKing. Thanks for your contribution!");
       }
    }
     /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
   public static void Sixty505(int choice){
       if(choice == 3){
       print("You chose 6505. Thanks for your contribution!");
       }
   }
     /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
   public static void xxx(int choice){
       if(choice == 4){
       print("You chose XXX. Thanks for your contribution!");
       }
   }
     /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
   public static void jsx(int choice){
       if(choice == 5){
       print("You chose JSX. Thanks for your contribution!");
       }
   }
     /**
     * passes integer to method. Checks the integer
     * and possibly displays a message
     * @param choice 
     */
   public static void butcher(int choice){
       if(choice == 6){
       print("You chose Butcher. Thanks for your contribution!");
       }
   }
     /**
     * passes integer to method. If the integer
     * passed equals 7, terminates the program
     * @param choice 
     */  
   public static void quit(int choice){
       if(choice == 7){
        System.exit(0);
       }
   }
     /**
     * A more convenient way to print lines!
     * @param choice 
     */
   public static void print(String str){
       System.out.println(str);
   }
}
