package assignment4methods;

import java.util.Scanner;

public class Assignment4Methods {
    
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     //menu graphics intro.    
     System.out.println("\t*************************************\n"
                      + "\t*       Steve's Calculator          *\n"
                      + "\t*************************************");
     //menu selection items   
     System.out.println( "1: Addition\n"
                       + "2: Subtraction\n"
                       + "3: Multiplication\n"
                       + "4: Division\n"
                       + "5: Word Counter\n"
                       + "6: Exit Program\n");
     
  
     System.out.print("Please Pick An Option: ");
     int userInputNum = scan.nextInt();//user input
     System.out.print("\n");
     //menu selection if statements.
     if (userInputNum == 1){//Runs add() method
         add();
     }
     else if(userInputNum == 2){//Runs subtract() method
         subtract();
     }
     else if(userInputNum == 3){//Runs multiplication method
         multi();
     }
     else if(userInputNum == 4){//Runs division method
         divide();
     }
     else if(userInputNum == 5){//Runs the word counter method
         wordCounter();
     }
     else if(userInputNum == 6){//Runs the end program method
         exit();
     }
     else{//Runs the error method
         error();
     }   
    }
       
    /**
     * This method is for the addition part of the program
     * It takes x and y and adds them together
     */
    public static void add(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 + var2;
        System.out.println("The answer is: " + product + "\n");
    }
    
    /**
     * This method gives you the product of  x - y.
     */
    public static void subtract(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 - var2;
        System.out.println("The answer is: " + product + "\n");
    }
    
    /**
     * this is for multiplication, it takes x*y and returns the product.
     */
    public static void multi(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 * var2;
        System.out.println("The answer is: " + product + "\n");
    }
    
    /**
     * This takes x and divides it by y, and give you the product.
     */
    public static void divide(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter in your Numerator: ");
         double var1 = scan.nextDouble();
         System.out.print("Please enter in your Denominator: ");
         double var2 = scan.nextDouble();
         if (var2 != 0)
         {
         double product = var1 / var2;
         System.out.println("The answer is: " + product + "\n");
         }
         else
             System.out.println("Nothing is divisible by 0.");
    }
    
    /**
     * This is the old word counter program from the first week in java.
     */
    public static void wordCounter()
    {
        
        char L = 'L';
        char O = 'O';
        char V = 'V';
        char E = 'E';
        
        int sum = (L + O + V + E);
        
        System.out.println("The word that I choose is \"Love\"\n");
        
        System.out.print("The Ascii value for L is ");
        System.out.println((int)L);
        System.out.print("The Ascii value for O is ");
        System.out.println((int)O);
        System.out.print("The Ascii value for V is ");
        System.out.println((int)V);
        System.out.print("The Ascii value for E is ");
        System.out.println((int)E);
        
        System.out.println("\nThe sum of the Ascii values is: " + (int)(sum)
                    + "\n");
    }
    
    /**
     * This method exits the program.
     */
    public static void exit(){
        System.out.println("Goodbye!");
         System.exit(0);
    }
    
    /**
     * If you type in any number < 1 || > 6 this line will print
     * and it will also exit the program for you.
     */
    public static void error(){
        System.out.println("You did not enter a valid number.\n"
                  + "Goodbye!");
    }
}
