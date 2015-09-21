
package methodswitch;

import java.util.Scanner;

/**
 *
 * @author Seth Frosch
 */
public class MethodSwitch {

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        
        // Reformatted the menu options to give one per line.
        System.out.println("Enter '1' to play FIZZBUZZ.\n" + 
                "Enter '2' to view the value of your chosen word.\n" + 
                "Enter '3' to use the salary calculator.\n" + 
                "Enter '4' to check your grade.\n" + 
                "Enter '5' to play Truth or Dare.\n" + 
                "Enter '6' or any other number to EXIT.");
        number = keyboard.nextInt();
        
        /**
         * The switch method takes the user input number from 1 to 5 to run
         * the appropriate method. 6 or any other number will end the program.
         */
        switch (number)
        {
            case 1:
                fizzBuzz();
                break;
            case 2:
                wordValue();
                break;
            case 3:
                salaryCalculator();
                break;
            case 4:
                checkGrade();
                break;
            case 5:
                truthDare();
                break;
            default:
                goodbye();
        }
    }
    
    /**
     * Takes a user inputted number which if divisible by 3 outputs fizz,
     * by 5 buzz, and both fizzbuzz. Neither gives an invalid statement.
     */
    public static void fizzBuzz(){
        int fbNumber;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number to play FIZZBUZZ:");
        fbNumber = keyboard.nextInt();
                
        if (fbNumber % 3 == 0 && fbNumber % 5 == 0){
            System.out.println("FIZZBUZZ");
        }
        else if (fbNumber % 3 == 0){
            System.out.println("FIZZ");
        }
        else if (fbNumber % 5 == 0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println("Invalid number");
        }
    }
    
    /**
     * Takes a user inputted word and uses a for loop with the charAt method
     * to find the ascii value of each letter and then totals them in an
     * accumulator.
     */
    public static void wordValue(){
        String userWord;
        int letter = 0;
        int total = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the word you want to see the value of:");
        userWord = keyboard.nextLine();
        
        for(int i = 0; i < userWord.length(); i++){
            letter = userWord.charAt(i);
            System.out.println(letter);
            total += letter;
        }
        System.out.println(total);
    }
    
    /**
     * Takes user inputted hours and wage and multiplies them to get a total 
     * amount.
     */
    public static void salaryCalculator(){
        double hours;
        double wage;
        double salary;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of hours worked:");
        hours = keyboard.nextDouble();
        System.out.println("Enter the wage per hour:");
        wage = keyboard.nextDouble();
        salary = wage * hours;
                
        System.out.printf("The weekly salary is $%,.2f\n",salary);
    }
    
    /**
     * Takes a user inputted score to find the matching letter grade with if 
     * else statements.
     */
    public static void checkGrade(){
        double grade;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your current score out of 100:");
        grade = keyboard.nextDouble();
                
        if (grade >= 90){
            System.out.println("You have an A.");
        }
        else if (grade >= 80){
            System.out.println("You have a B.");
        }
        else if (grade >= 70){
            System.out.println("You have a C.");
        }
        else if (grade >= 60){
            System.out.println("You have a D.");
        }
        else{
            System.out.println("You have an F.");
        }
    }
    
    /**
     * Takes a user inputted response and ignores the case to either be equal
     * to true or false and output the correct response with an invalid
     * statement if it is neither.
     */
    public static void truthDare(){
        String response;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter 'Truth' or 'Dare':");
        response = keyboard.next();
                
        if (response.equalsIgnoreCase("TRUTH")){
            System.out.println("Tell me how you really feel about this program.");
        }
        else if (response.equalsIgnoreCase("DARE")){
            System.out.println("I dare you to do a code review of this program.");
        }
        else{
            System.out.println("Invalid entry.");
        }
    }
    
    /**
     * Outputs a farewell message if a valid number was not submitted.
     */
    public static void goodbye(){
        System.out.println("Goodbye.");
    }
}
