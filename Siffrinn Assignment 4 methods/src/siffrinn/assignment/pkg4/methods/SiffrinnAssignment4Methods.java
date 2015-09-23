
package siffrinn.assignment.pkg4.methods;

/**
 * author: Katrina Siffrinn
 * class: CPT 163 JAVA 1
 * date: 9/22/2015
 * assignment: 4 - methods
 * modifications made from assignment 2 menu 
 */


import java.util.Scanner;   //required to use scanner class

//This program uses methods to execute a menu of 
//choices a user must pick from.

public class SiffrinnAssignment4Methods {

    /**
     * Main method displays the menu.
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        //create scanner  object for keyboard input
        Scanner keyboard = new Scanner(System.in);  
        
        int userChoice;
        
         
        
            //displays question and then choices
            //allows user to input a number to indicate their choice
            System.out.println("What would you like for lunch?");
            System.out.println("Enter the number of your choice below and press enter");
            System.out.println("1) Turkey sandwich");
            System.out.println("2) Alphabet soup");
            System.out.println("3) Macaroni and cheese");
            System.out.println("4) Pizza");
            System.out.println("5) Salad");
            System.out.println("6) If you would like to see my program HelloWorld?");
            System.out.println("7) Exit");
            
            //stores chosen number as input
            userChoice = keyboard.nextInt();
                                           
               
            //determines output     
                if (userChoice == 1)
                   sandwich();
                   
                else if(userChoice == 2)
                    soup();
                  
                else if (userChoice == 3)
                    pasta();
                   
                else if (userChoice == 4)
                     pizza();
                
                else if (userChoice == 5)
                    salad();
                  
                else if (userChoice == 6)
                    program();
                  
                else if (userChoice == 7)
                    exit();
                                    
               else
                   invalid();  
                  
        
                                
         } 
            /*
            * passes the userChoice through the string above.
            * displays a message when userChoice is selected.
            */
            
          
    public static void sandwich(){
            System.out.println("Great choice!");
    } 
    
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */
    public static void soup(){            
            System.out.println("Be careful, it's hot.");
                    
    }                
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */
        public static void pasta(){                
            System.out.println("Comfort food at it's finest.");       
    }    
        
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */
     public static void pizza(){               
            System.out.println("Let me warm that up for you.");
    }
     
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */               
    public static void salad(){           
            System.out.println("Excellent choice for a warm day.");
    }
    
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */           
    public static void program(){            
            System.out.println("Sorry it's not available right now.");
    }
    
            /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */   
     public static void exit(){             
            System.out.println("Exit");
}              
                    
             /*
            *passes the userChoice through the string above.
            *displays a message when userChoice is selected.
            */          
    public static void invalid(){        
            System.out.println("Invalid choice.");
                 
            }    
        }    
         
              
    
