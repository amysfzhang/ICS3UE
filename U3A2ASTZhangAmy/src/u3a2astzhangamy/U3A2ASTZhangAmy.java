/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3a2astzhangamy;
import java.util.Scanner;//Importing Scanner
/**
 *
 * @author Amy Zhang
 * Date: August 9th, 2023
 * Calculates a number squared, cubed, or powered to another number
 * 
 */
public class U3A2ASTZhangAmy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaring Scanner to read user input
        Scanner input = new Scanner(System.in);
        
        //Declaring a variable to store user's choice which can be checked by the do while loop
        int intUserChoice = 0;
        //Declaring a variable to store the base of an exponent
        int intBase = 0;
        //Declaring a variable to store the power of an exponent
        int intPower = 0;
        //Declaring a variable to store the Answer which will be multipled by intBase
        int intAnswer = 1;
        
        do//runs through once to display the user menu before checking the condition
        {
            //Displaying the user menu with 4 choices
            System.out.println("1… Find the value of a number squared (NOTE: 2^2 = 2 x 2)"
                    + "\n2… Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)"
                    + "\n3… Find the value of a number, to any power"
                    + "\n4… Exit");
            
            //Reading user input and storing integer in the variable intUserChoice
            intUserChoice = input.nextInt();
            //intAnswer is reinitialized each time because it stores the answer each time
            //It is initialized to 1 so it can be multipled intPower times by intBase 
            intAnswer = 1;
            
            //A switch case statement that checks directly whether the input is 1, 2, 3 or 4
            switch(intUserChoice) 
            {
                case 1://Runs if user inputs 1
                
                    //Prompting user for the base of the square
                    System.out.println("The integer base of the square is: ");
                    //Reading user's input and storing the number in the variable intBase
                    intBase = input.nextInt();

                    //intPower is initialized to 2 because the base will be squared (raised to the power of 2)
                    intPower = 2;
                    
                    //A for loop that finds the square of a number (intBase)
                    for(int i = 0; i < intPower; i++)//Runs 2 times
                    {
                        intAnswer *= intBase;//Multiplies intSquare by intBase and stores it in intAnswer
                    }
                    
                    //Displaying the intBase (base) and intAnswer of user's input
                    System.out.println("The square of " + intBase + " is "+ intAnswer);
                    break;//to skip other cases (avoiding case fall-through)

                case 2://Runs if user inputs 2
                
                    //Prompting user for the base of the cube
                    System.out.println("The integer base of the cube is: ");
                    //Reading user's input and storing the number in the variable intBase
                    intBase = input.nextInt();

                    //intPower is initialized to 3 because the base will be cubed (raised to the power of 3)
                    intPower = 3;
                    
                    //A for loop that finds the cube of a number (intBase)
                    for(int i = 0; i < intPower; i++)//Runs 3 times
                    {
                        intAnswer *= intBase;//Multiplies intAnswer by intBase and stores it in intAnswer
                    }
                    
                    //Displaying the intBase (base) and intAnswer of user's input
                    System.out.println("The cube of " + intBase + " is "+ intAnswer);
                    break;//to skip other cases (avoiding case fall-through)

                case 3://Runs if user inputs 3
                
                    //Prompting user for the base of the exponent
                    System.out.println("The integer base of the exponent is: ");
                    //Reading user's input and storing the number in the variable intBase
                    intBase = input.nextInt();
                    
                    //Prompting user for the power of the exponent
                    System.out.println("The integer power of the exponent is: ");
                    //Reading user's input and storing the number in the variable intBase
                    intPower = input.nextInt();
                                        
                    //A for loop that finds the square of a number (intBase)
                    for(int i = 0; i < intPower; i++)//Runs intPower number of times
                    {
                        intAnswer *= intBase;//Multiplies intAnswer by intBase and stores it in intAnswer
                    }
                    
                    //Displaying the intBase (base), intPower (power), and intAnswer of user's input
                    System.out.println( intBase +" raised to the power of "+ intPower +" is "+ intAnswer);
                    break;//skips to other cases (avoiding case fall-through)
            } 
            
        } while(intUserChoice != 4);//Continues running unless user inputs 4    
        
        //Displaying a farewell message before ending the program
        System.out.println("Farewell! Hope you found this useful!");
        
    }
}
