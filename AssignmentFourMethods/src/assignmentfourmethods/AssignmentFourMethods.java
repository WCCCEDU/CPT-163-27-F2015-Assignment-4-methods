
package assignmentfourmethods;
import java.util.Scanner; //for keyboard scanner


public class AssignmentFourMethods {

   public static void main(String[] args) {
        int code;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("If you would like to play Simon Says please enter the"
                + " number ten. To find out if you are eating health enter fifteen. "
                + "To see if today is your lucky day enter twenty. To see if you "
                + "were born lucky enter twenty-five. To see the value"
                + "of the word perfect enter the number 100. To exit type 1.");
        code = keyboard.nextInt();
       if(code==10){
           ten();//method 10 called
        }
       else if (code==15){
           fifteen();//method 15 called
       }
       else if (code==20){
           twenty(); //method 20 called
       }
       else if (code==25){
           twentyfive(); //method 25 called
       }
       else if(code==100){
           hundred(); //method 100 called
       }
    System.out.println("This program has ended.");
       }
   
/*
   Used if user enters value of 10
   */
   public static void ten(){
  int streetNumber;  
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter your street number");
            streetNumber = keyboard.nextInt();
            
            if (streetNumber < 100)
            {
                System.out.println("Simon says to ten jumping jacks.");
            }
            else if (streetNumber > 600)
            {
                System.out.println("Go and get yourself a candy bar.");
            }
    
}
/*
   uses if user enters 15
   */
public static void fifteen(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your favorite food that you must eat.");
       int numberOfMeals;     
       numberOfMeals=keyboard.nextInt();
            
            if (numberOfMeals >= 3)
            {
                System.out.println("Looks like you are on the right track!");
            }
            else if (numberOfMeals < 3) 
            {        
                System.out.println("You need to start eating more pizza.");
            } 
}
/*
used if user enter 20
*/
public static void twenty(){
    int yourAge;    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your age, be honest.");
            yourAge=keyboard.nextInt();
            
            if (yourAge >= 19)
            {
                System.out.println("Today is your lucky day!");
        }
            else if(yourAge <= 18)
            {  
                System.out.println("You will not be lucky untill you take a"
                        + " programming class!");
            }
}
/*
if user enters 25
*/
public static void twentyfive(){
    int yourBirthYear;     
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your birth year.");
            yourBirthYear=keyboard.nextInt();
         
            if (yourBirthYear > 1980)
            {
                System.out.println("You were born this way, which is lucky!");
            }
            else if (yourBirthYear <1900)
            {
                System.out.println("Wow you are really old, but stil lucky!");
            }
            else if (yourBirthYear > 2015)
            {
                System.out.println("Sorry you are not lucky because yoou "
                        + "weren't born yet.");
            }
}
/*
if user enter 100
*/
public static void hundred(){
            char letterOne='p';
            char letterTwo='e';
            char letterThree='r';
            char letterFour='f';
            char letterFive='e';
            char letterSix='c';
            char letterSeven ='t';
            int asciiSum;
       
            asciiSum= (int)letterOne + (int)letterTwo + (int)letterThree + (int)letterFour + 
                    (int)letterFive + (int)letterSix + (int)letterSeven; 
       
            System.out.println("The word is 'perfect'.");
            System.out.println("The sum of the word perfect is " + asciiSum + " .");
}
//main part of program 
 

    }
    

