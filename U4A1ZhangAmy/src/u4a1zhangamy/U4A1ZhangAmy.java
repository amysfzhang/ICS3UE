/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4a1zhangamy;

/**
 *
 * @author Amy Zhang
 * Date: August 17, 2023
 * Validates data entered by the user for 6 different stages 
 */
import java.util.Scanner;//Importing the Scanner

public class U4A1ZhangAmy {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Declaring the scanner to read user input

        //Stage 1
        //Displays the opening requirements for this stage
        System.out.println("Stage 1: Please enter a string longer than 6 characters");
        //Reads user input and stores as String (works for any type)
        String strInput = input.nextLine();
        
        //Checks if the string is smaller or equal to 6 characters
        while (strInput.length() <= 6)
        {
            //Prompts user to reenter a valid input
            System.out.println(strInput + " is invalid, please enter a string longer than 6 characters");
            //Reads user input and stores as String
            strInput = input.nextLine();
        }//Continues checking each user input until the string has more than 6 characters
        
        //Stage 2
        //Displays the opening requirements for this stage
        System.out.println("Stage 2: Please enter a string containing a lowercase \"a\"");
        //Reads user input and stores as String (works for any type)
        strInput = input.nextLine();
        
        //Checks if the string contains the character "a"
        while(strInput.indexOf("a") == -1)
        {
            //Prompts user to reenter a valid input
            System.out.println(strInput + " is invalid, please enter a string containing a lowercase \"a\"");
            //Reads user input and stores as String            
            strInput = input.nextLine();
        }//Continues checking each user input until the string contains the character "a"
        
        //Stage 3
        //Displays the opening requirements for this stage
        System.out.println("Stage 3: Please enter a string without the letter \"z\" and between 5 [inclusive] to 15 ]inclusive] character");
        //Reads user input and stores as String (works for any type)        
        strInput = input.nextLine();
        
        //Checks if the string does not contain the character "z", is larger than 15 or smaller than 5 characters        
        while (strInput.indexOf("z") != -1 || strInput.length() > 15 || strInput.length() < 5)
        {
            //Prompts user to reenter a valid input
            System.out.println(strInput + " is invalid, please enter a string without the letter \"z\" and between 5 [inclusive] to 15 [inclusive] characters");
            //Reads user input and stores as String                        
            strInput = input.nextLine();
        }//Continues checking each user input until the string does not contain the character "z", and has 5-15 characters [inclusive]
        
        //Stage 4
        //Declaring a variable to keep track of the user's input
        int intInput = 0;
        //Declaring a temporary variable that stores the input as a string before converting to an int
        String strTemp = "";
        //Declaring a boolean variable to know if intInput has met the requirements
        boolean isValid = false;
        
        //Displays the opening title for this stage
        System.out.println("Stage 4:");
        
        while(!isValid)//Checks if the input is still not valid
        {
            //Displays the opening requirements for this stage
            System.out.println("Please enter an integer between 5 [inclusive] and 500 [inclusive]");
            //Reading an Integer as a String
            strTemp = input.nextLine();

            //Checking if the input is an integer
            try
            {
                //Converting strTemp (String) to intInput (integer)
                intInput = Integer.parseInt(strTemp);
                
                //Checking if the integer is between 5 and 500 inclusive
                if(intInput >= 5 && intInput <= 500)
                {
                    //To make sure our loop doesn't run forever
                    isValid = true;
                }
                else//If the input is an integer, but not within range
                {
                    //Prompts user to reenter a valid input
                    System.out.println("Invalid, " + strTemp + " is not between 5 [inclusive] and 500 [inclusive]");
                }
            }
            //Runs if the input is the wrong type (when converting strTemp to intInput)
            catch(NumberFormatException e)
            {
                //Prompts user to reenter a valid input
                System.out.println("Invalid, " + strTemp + " is not an integer");
            }
        }//Continues checking each user input until it mets the requirements
            
        //Stage 5    
        //Resetting the boolean isValid to false for the new stage
        isValid = false;
        //Displays the opening title for this stage
        System.out.println("Stage 5:");
        
        //Checks if the input is still not valid
        while(!isValid)
        {
            //Displays the opening requirements for this stage
            System.out.println("Please enter a negative integer");
            //Converting strTemp (String) to intInput (integer)
            strTemp = input.nextLine();//Reading an Integer as a String

            //Checking if the input is an integer
            try
            {
                //Converting strTemp (String) to intInput (integer)
                intInput = Integer.parseInt(strTemp);
                
                //Checking if the integer is negative
                if(intInput < 0)
                {
                    //To make sure our loop doesn't run forever
                    isValid = true;
                }
                //If the input is an integer, but not within range
                else
                {
                    //Prompts user to reenter a valid input
                    System.out.println("Invalid, " + strTemp + " is not negative");
                }
            }
            //Runs if the input is the wrong type (when converting strTemp to intInput)
            catch(NumberFormatException e)
            {
                //Prompts user to reenter a valid input                
                System.out.println("Invalid, " + strTemp + " is not an integer");
            }
        }
        
        //Stage 6  
        //Resetting the boolean isValid to false for the new stage        
        isValid = false;
        //Displays the opening title for this stage
        System.out.println("Stage 6:");
        
        //Checks if the input is still not valid
        while(!isValid)
        {
            //Displays the opening requirements for this stage                
            System.out.println("Please enter a positive, odd integer");
            //Reading an Integer as a String
            strTemp = input.nextLine();
                
            try//Checking if the input is an integer
            {
                //Converting strTemp (String) to intInput (integer)
                intInput = Integer.parseInt(strTemp);
                
                //Checking if the integer is positive and has a remainder after divided by 2 (odd)
                if(intInput % 2 == 1 && intInput > 0)
                {
                    //To make sure our loop doesn't run forever
                    isValid = true;
                }
                //If the input is an integer, but not within range
                else
                {
                    //Prompts user to reenter a valid input
                    System.out.println("Invalid, " + strTemp + " is not positive and odd");
                }
            }
            //Runs if the input is the wrong type (when converting strTemp to intInput)
            catch(NumberFormatException e)
            {
                //Prompts user to reenter a valid input                                
                System.out.println("Invalid, " + strTemp + " is not an integer");
            }
        }
        //Displays a congradulatory message for completing all 6 stages
        System.out.println("Congratulations! You have completed all 6 stages!");
        
    }
}
