package assignment.pkg4.methods;

import java.util.Scanner;

public class Assignment4Methods {

    public static void main(String[] args) {
    //new scanner object
	Scanner keyboard = new Scanner(System.in);
	
	int choice;
	
	System.out.println("Who is your favorite adventure time character out of these 6!?");
	System.out.println("(please enter the number accompanying the character)" + "\n");
	System.out.println("1. Finn" + "\n" + "2. Jake" + "\n" + "3. Marceline");
	System.out.println("4. Simon" + "\n" + "5. Princess Bubblegum" + "\n" + "6. Gunther" + "\n");
        System.out.println("You may also enter 0 to exit.");
	
	choice = keyboard.nextInt();
        charProcessing(choice);
    }
    



    public static void charProcessing(int choice) {
        String character;
        switch(choice){
            case 0:
                character = "none of the characters. sorry for interrupting your day";
                finalChoice(character);
                break;
            case 1:
                character = "Finn the Human";
                finalChoice(character);
                break;
            case 2:
                character = "Jake the Dog";
                finalChoice(character);
                break;
            case 3:
                character = "Marceline the Vampire";
                finalChoice(character);
                break;
            case 4:
                character = "Simon, the Ice King";
                finalChoice(character);
                break;
            case 5:
                character = "Princess Bubblegum";
                finalChoice(character);
                break;
            case 6:
                character = "Gunther the Penguin";
                finalChoice(character);
                break;    
        }
    }    

    public static void finalChoice(String character){
        System.out.println("You have selected " + character);
    }
    
}