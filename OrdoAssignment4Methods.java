package ordoassignment4methods;

import java.util.Scanner;

public class OrdoAssignment4Methods {

    public static void main(String[] args) {
        boolean quitSelected = false; // Determines whether or not to keep showing the menu.
        int choiceCounter = 0; // Variable to see how many valid choices were made.
        
        while(quitSelected == false)
        {
            System.out.println("What would you like to do today?");
            System.out.println("Enter the letter of your choice\n");
            System.out.println("A) Demonstrate flipping the display of an entered word");
            System.out.println("B) Fizz/Buzz");
            System.out.println("C) Count to 50");
            System.out.println("D) Code all day");
            System.out.println("E) Watch the sunset");
            System.out.println("Q) Quit\n");

            String userChoice = getWord();
            
            choiceCounter += 1; // Add to the choice counter plus one.  Reverted later if invalid or Quit.
            
            switch (userChoice) // Select A-E or Q for Quit.
            {
                case "A":
                    characterDemo(); // Start the word flipping demo
                    break;
                case "B":
                    fizzBuzz(); // Start the Fizz/Buzz demo.
                    break;
                case "C":
                    countToFifty(); // Start the Count to 50 demo.
                    break;
                case "D":
                    System.out.println("\nYou should take a break;  (Get it?)\n");
                    break;
                case "E":
                    System.out.println("\nBe sure to wear sunglasses!\n");
                    break;
                case "Q":
                    choiceCounter -= 1; // Not counting Quit as a choice
                    System.out.println("\nBye!\n\nValid choices made: " + choiceCounter);
                    quitSelected = true;
                    break;
                default: // All other values
                    System.out.println("\nInvalid choice!\n");
                    choiceCounter -= 1;
                    break;
            }
        }
    }
    
    public static void characterDemo(){ // Option A ... demonstrate the display of an entered word flipped backwards.
        String word = "";
        
        do{
            String backwardsWord = "";
            print("Enter a word or QUIT to exit.\n");
            
            word = getWord();
            
            if(word.equals("QUIT")){
                print("\nThank you for using this program!");
            }else{
                for(int x=0;x<word.length();x++){
                    char curChar = word.charAt(x);
                    backwardsWord = curChar + backwardsWord;
                }
                print("\n" + backwardsWord);
            }
        }while(!word.equals("QUIT"));
    }
    
    public static String getWord(){ // Method used to get the keyboard string input.
    Scanner myWordInput = new Scanner(System.in);
    return myWordInput.next();
    }
    
    public static int getInt(){  // Method used to get the keyboard integer input.
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
    
    public static void print(String str){ // Method used to print output to the screen.
    System.out.println(str);
    }
    
    public static void fizzBuzz(){  // Demonstrate the Fizz/Buzz app.
        System.out.println("Enter a number: ");
        
        int number = getInt();
        
        if(number % 3 == 0){
            System.out.println("Fizz");
        }
        if(number % 5 == 0){
            System.out.println("Buzz");
        }        
    }
    
    public static void countToFifty(){
        int count = 0;
        while(count < 50){
            if(count%5==0){
            }else{
                print(Integer.toString(count));
            }
            count++;
        }
            print(Integer.toString(count));
    }
}
