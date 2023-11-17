/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zhangamyu3a5ast;

/**
 *
 * @author Amy Zhang
 * Date: August 14th, 2023
 * Preforms 9 different calculations using subroutines
 */

import java.util.Scanner; //Import Scanner
import java.text.DecimalFormat;//Importing decimal place

public class ZhangAmyU3A5AST {
 
    /**
     * 
     * @param dblSideA is a positive double > 0
     * @param dblSideB is a positive double > 0
     * @param dblSideC is a positive double > 0
     * @return the area of the triangle using Heron's formula
     */
    public static double getAreaUsingHeron(double dblSideA, double dblSideB, double dblSideC){
        
        //Calculates half the perimeter by adding up all the sides and dividing by two, then stores it in a variable
        double dblSemiPerimeter = (double) (dblSideA + dblSideB + dblSideC)/2.0;
        //Calculates the area by using Heron's forumla
        double dblArea = (double) Math.sqrt(dblSemiPerimeter * (dblSemiPerimeter - dblSideA) * (dblSemiPerimeter - dblSideB) * (dblSemiPerimeter - dblSideC));
        
        //Returns the area of the triangle
        return dblArea;
    }
    
    /**
     * 
     * @param intSquaredCoefficient is a integer 
     * @param intCoefficient is a integer 
     * @param intConstant is a integer 
     * @return the root of the quadratic using the positive sign in the quadratic equation
     */
    public static double getQuadraticRootPositive(int intSquaredCoefficient, int intCoefficient, int intConstant){
        //Declares the discriminant as a variable
        double dblDiscriminant = (intCoefficient * intCoefficient) - (4 * intSquaredCoefficient * intConstant);
        //Calculates the root of the equation using the quadratic formula, but with the positive sign
        double dblPositiveRoot = (double)((-1 * intCoefficient) + Math.sqrt(dblDiscriminant)) / 2.0 * intSquaredCoefficient;        
        
        //Return the positive root of the equation
        return dblPositiveRoot;
    }
    
    /**
     * 
     * @param dblPrincipal is a positive number > 0
     * @param dblInterestRate is a positive number > 0
     * @param intYears is a positive integer > 0
     * @return the amount after compound interest is calculated monthly
     */
    public static double getCompoundInterest(double dblPrincipal, double dblInterestRate, int intYears){
        
        //Declaring a variable to store the number of months where the principal collects interest
        int intTimeFrameMonths = 12 * intYears;
                
        //Loops through the number of months that collect interest
        for (int i = 0; i < intTimeFrameMonths; i++)
        {
            //Multiplies the principle by the monthly interest rate
            dblPrincipal *= (1 + (dblInterestRate / 12));
        }
        
        //Returns the amount after compounded
        return dblPrincipal;
    }
    
    /**
     * 
     * @param intSetSize is a positive integer > 0
     * @param intSelectionSize is a positive integer > 0
     * @return the total number of combinations
     */
    public static int getCombination(int intSetSize, int intSelectionSize){
        //Declaring a variable to keep track of the number of permutations
        int intPermutations = 1;
        
        //A loop that loops through the length of intSelectionSize, but where i is going backwards (ie. 7C3 = 7*6*5)
        for(int i = intSetSize; i > intSetSize - intSelectionSize; i--)
        {
            //Multiplies intPermutations by i (factorial of intPermutations)
            intPermutations *= i;
        }

        //Declaring a variable to keep track of the number of permutations that repeat        
        int intRepeats = 1;
        //A loop that loops finds the factorial of intSelectionSize
        for(int i = 1; i <= intSelectionSize; i++)
        {
            //Multiplies intRepeats by i (factorial of intRepeats)
            intRepeats *= i;
        }
        
        //Divides intPermutations by intRepeats to find the unique number of permutations (aka combinations)
        int intCombination = intPermutations / intRepeats;
        //Returns the total number of combinations
        return intCombination;
    }
    
    /**
     * 
     * @param intSetSize is a positive integer > 0
     * @param intSelectionSize is a positive integer > 0
     * @return the total number of permutations 
     */
    public static int getPermutation(int intSetSize, int intSelectionSize){
        //Declaring a variable to keep track of the number of permutations
        int intPermutations = 1;
        
        //A loop that loops through the length of intSelectionSize, but where i is going backwards (ie. 7C3 = 7*6*5)
        for(int i = intSetSize; i > intSetSize - intSelectionSize; i--)
        {
            //Multiplies intPermutations by i (factorial)
            intPermutations *= i;
        }
        
        //Returns the number of permutations
        return intPermutations;
    }
    
    /**
     * 
     * @param dblRatio is a number
     * @param dblTerm1 is a number
     * @param intIndexN is a positive integer > 0
     * @return the value of the nth term in a geometric sequence
     */
    public static double getGeometricSequenceTerm(double dblRatio, double dblTerm1, int intIndexN){
        
        //Loops through all the term indexes up to intNumOfTerms         
        for (int i = 0; i < intIndexN - 1; i++)
        {
            //Multiply the starting term by the ratio like in the formula (ar^n) where a is the first term, r is ratio, and n is the nth term
            dblTerm1 *= dblRatio;
        }
        
        //Return the Term after it is multipled by the ratio multiple times
        return dblTerm1;
    }
    
    /**
     * 
     * @param dblRatio is a number
     * @param dblTerm1 is a number
     * @param intNumOfTerms is a positive integer > 0
     * @return the sum of the values up to a term in a geometric sequence
     */
    public static double getGeometricSequenceSum(double dblRatio, double dblTerm1, int intNumOfTerms){
        //Declares a variable to store the previous value of the previous term
        double dblPreviousTerm = dblTerm1;
        //Declares a variable to store the total sum of the terms
        double dblTotal = dblTerm1;
        
        //Loops through all the term indexes up to intNumOfTerms 
        for (int i = 0; i < intNumOfTerms - 1; i++)
        {
            //Multiply the previous term by the ratio and then add the term to the tally
            dblTotal += (dblPreviousTerm * dblRatio);
            System.out.println(dblTotal);
            //Update the previous term to be multiplied by the ratio
            dblPreviousTerm *= dblRatio;
        }        
        //Returns the tallied up total sum
        return dblTotal;
    }
    
    /**
     * 
     * @param dblPoint1X is a number
     * @param dblPoint1Y is a number
     * @param dblPoint2X is a number
     * @param dblPoint2Y is a number 
     * @return the y-intercept of a linear equation that crosses both coordinates
     */
    public static double getYIntercept(double dblPoint1X, double dblPoint1Y, double dblPoint2X, double dblPoint2Y){
        //Calculates the slope using the two coordnates and stores it in a variable
        double dblSlope = (dblPoint2Y - dblPoint1Y) / (dblPoint2X - dblPoint1X);
        //Calculates the Y-intercept substituting point1 for x, y
        double dblYIntercept = dblPoint1Y - (dblSlope * dblPoint1X);
        
        //Returns the y-intercept
        return dblYIntercept;
    }
    
    /**
     * 
     * @param dblPoint1X is a number
     * @param dblPoint1Y is a number
     * @param dblPoint2X is a number
     * @param dblPoint2Y is a number
     * @param dblPoint3X is a number
     * @param dblPoint3Y is a number
     * @return the area of the triangle
     */
    public static double getAreaFromCoordinates(double dblPoint1X, double dblPoint1Y, double dblPoint2X, double dblPoint2Y, double dblPoint3X, double dblPoint3Y){
        //Calculate the first side using the distance formula
        double dblSide1 = Math.sqrt(Math.pow(dblPoint2X - dblPoint1X, 2) + Math.pow(dblPoint2Y - dblPoint1Y, 2));
        System.out.println(dblSide1);
        //Calculate the second side using the distance formula
        double dblSide2 = Math.sqrt(Math.pow(dblPoint3X - dblPoint2X, 2) + Math.pow(dblPoint3Y - dblPoint2Y, 2));
        System.out.println(dblSide2);
        //Calculate the third side using the distance formula
        double dblSide3 = Math.sqrt(Math.pow(dblPoint3X - dblPoint1X, 2) + Math.pow(dblPoint3Y - dblPoint1Y, 2));
        System.out.println(dblSide3);
        
        //Calculates the area of the triangle using heron's formula
        double dblArea = getAreaUsingHeron(dblSide1, dblSide2, dblSide3);
                
        //Returns the area of the triangle
        return dblArea;
    }
    
    
    /**
     * Printing the options for the user to select
     */
    public static void printOption(){        
        //Displaying the user menu with all the options for the user to select
        System.out.println("1. Calculate the area of a triangle given lengths of all sides");//Option 1, Case 1
        System.out.println("2. Calculate the root of a quadratic equation (using the positive sign)");//Option 2, Case 2
        System.out.println("3. Calculate the predicted amount for monthly compounded interest");//Option 3, Case 3
        System.out.println("4. Calculate the possible different combinations");//Option 4, Case 4
        System.out.println("5. Calculate the possible permutations (order matters)");//Option 5, Case 5
        System.out.println("6. Calculate the value of a term in a geometric sequence");//Option 6, Case 6
        System.out.println("7. Calculate the sum of the term in a geometric sequence");//Option 7, Case 7
        System.out.println("8. Calculate the y-intercept of a linear equation given 2 coordinates");//Option 8, Case 8
        System.out.println("9. Calculate the area of a triangle given all 3 coordinates");//Option 9, Case 9
        System.out.println("10. Exit the program");//Option 10, false for while loop
    }
    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        //Declare a scanner to read user input
        Scanner input = new Scanner(System.in);
        //Declaring the decimal format to be two decimal places
        DecimalFormat df2 = new DecimalFormat("0.00");

        //Declare a variable to store the choice from the user
        int intChoice = 0;
        
        do//run once to display user menu
        {
            //Call the printOption function to display user menu
            printOption();
            //Store user's input in a variable as the option chosen
            intChoice = input.nextInt();
            
            //Directly switche to the case that mathces user's choice
            switch(intChoice)
            {
                case 1: //Calculate the area of a triangle given lengths of all sides
                    System.out.println("Enter the first side lengths of a triangle: "); //Prompt for user to enter the first side length
                    double dblSideA = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the second side lengths of a triangle: "); //Prompt for user to enter the second side length
                    double dblSideB = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the third side lengths of a triangle: "); //Prompt for user to enter the third side length
                    double dblSideC = input.nextDouble();//Stores the user's answer in a variable
                    
                    //Display the area rounded to the user with a useful message
                    System.out.println("The area of the triangle is: " + df2.format(getAreaUsingHeron(dblSideA, dblSideB, dblSideC)));
                    
                    break;//End of case 1, avoids fall-through
                    
                case 2://Calculate the root of a quadratic equation with only has 1 root using the positive sign(DOES NOT WORK OTHERWISE)
                    System.out.println("Enter the integer that is the coefficient of x^2: ");//Prompt for user to enter the coefficient of x^2
                    int intSquaredCoefficient = input.nextInt();//Stores the user's answer in a variable                   
                    System.out.println("Enter the integer that is the coefficient of x: ");//Prompt for user to enter the coefficient of x
                    int intCoefficient = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the integer that is the constant: ");//Prompt for user to enter the constant
                    int intConstant = input.nextInt();//Stores the user's answer in a variable
                    
                    //Display the root of the quadratic equation
                    System.out.println("The root of the equation is: " + df2.format(getQuadraticRootPositive(intSquaredCoefficient, intCoefficient, intConstant)));                        
                    
                    break;//End of case 2, avoids fall-through

                    
                case 3://Calculate the final amount in a compound interest account given the prinipal, interest rate, and time span
                    System.out.println("Enter in the initial amount (prinipal) that will collect interest: ");//Prompt for user to enter the principal amount of money they start with
                    double dblPrincipal = input.nextInt();//Stores the user's answer for the principal in a variable
                    System.out.println("Enter in the annual interest rate in decimal format: ");//Prompt for user to enter the annual interest on the money
                    double dblInterestRate = input.nextDouble();//Stores the user's answer for the interest rate in a variable
                    System.out.println("Enter in the number of years it will collect interest: ");//Prompt for user to enter the number of years they are leaving the money to collect interest
                    int intYears = input.nextInt();//Stores the user's answer for the number of years in a variable
                    
                    //Display a message with the principal, number of years, interest rate and final amount
                    System.out.println("The $" + dblPrincipal + " after " + intYears + " years  while collecting " + dblInterestRate * 100 + "% interest annually is: \n$" + df2.format(getCompoundInterest(dblPrincipal, dblInterestRate, intYears)));
                    
                    break;//End of case 3, avoids fall-through
                    
                case 4://Calculate the possible different combinations given the set size and selection size
                    System.out.println("Enter the total number of options to pick from: ");//Prompt for user to enter the total number of options in the set
                    int intSetSizeC = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the number of options that can be picked: ");//Prompt for user to enter the total number of options that is choosen at once
                    int intSelectionSizeC = input.nextInt();//Stores the user's answer in a variable
                   
                    //Display a message and call a method to calculate the number of combinations 
                    System.out.println("The number of possible combinations is: " + getCombination(intSetSizeC, intSelectionSizeC));
                    break;//End of case 4, avoids fall-through
                    
                case 5://Calculate the possible permutations (order matters) given the set size and selection size
                    System.out.println("Enter the total number of options to pick from: ");//Prompt for user to enter the total number of options in the set
                    int intSetSizeP = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the number of options that can be picked: ");//Prompt for user to enter the total number of options that is choosen at once
                    int intSelectionSizeP = input.nextInt();//Stores the user's answer in a variable
                    
                    //Display a message and call a method to calculate the number of permutations 
                    System.out.println("The number of possible permutations (order matters) is: " + getPermutation(intSetSizeP, intSelectionSizeP));                    
                    break;//End of case 5, avoids fall-through
                    
                case 6://Calculate the value of a term in a geometric sequence
                    System.out.println("Enter the common ratio of the sequence: ");//Prompt for user to enter the common ratio of the sequence
                    double dblRatioTerm = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the first term of the sequence: ");//Prompt for user to enter the first number in the sequence
                    double dblTerm1Term = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the position of the term you want to find (positive integer): ");//Prompt for user to enter the nth term they are looking for
                    int intIndexNTerm = input.nextInt();//Stores the user's answer in a variable

                    //Display a message with the first term, ratio and call a method to calculate the nth term                    
                    System.out.println("The " + intIndexNTerm + "th term in a sequence that grows by " + dblRatioTerm + " is: " + df2.format(getGeometricSequenceTerm(dblRatioTerm, dblTerm1Term, intIndexNTerm)));
                    break;//End of case 6, avoids fall-through
                    
                case 7://Calculate the sum of the terms in a geometric sequence
                    System.out.println("Enter the common ratio of the sequence: ");//Prompt for user to enter the common ratio of the sequence
                    double dblRatioSum = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the first term of the sequence: ");//Prompt for user to enter the first number in the sequence
                    double dblTerm1Sum = input.nextDouble();//Stores the user's answer in a variable
                    System.out.println("Enter the total number of integers in the sequence: ");//Prompt for user to enter the total number of integers in the sequence
                    int intNumOfTerms = input.nextInt();//Stores the user's answer in a variable

                    //Display a message with the first term, ratio and call a method to calculate the sum of the terms                   
                    System.out.println("The total of " + intNumOfTerms + " terms in a sequence that grows by " + dblRatioSum + " is: " + df2.format(getGeometricSequenceSum(dblRatioSum, dblTerm1Sum, intNumOfTerms)));
                    break;//End of case 7, avoids fall-through                
                    
                case 8://Calculate the Y-intercept of a linear equation given 2 coordinates
                    System.out.println("Enter the x value of the first coordinate: ");//Prompt for user to enter the x of the first coordinate 
                    double dblPoint1X = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the y value of the first coordinate: ");//Prompt for user to enter the y of the first coordinate 
                    double dblPoint1Y = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the x value of the second coordinate: ");//Prompt for user to enter the x of the second coordinate 
                    double dblPoint2X = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the y value of the second coordinate: ");//Prompt for user to enter the y of the second coordinate 
                    double dblPoint2Y = input.nextInt();//Stores the user's answer in a variable

                    //Display a message and call a method to calculate the y-intercept of linear equation
                    System.out.println("The y-intercept of linear equation is: " + df2.format(getYIntercept(dblPoint1X, dblPoint1Y, dblPoint2X, dblPoint2Y)));
                    break;//End of case 8, avoids fall-through
                    
                case 9://Calculate the area of a triangle given all 3 coordinates
                    System.out.println("Enter the x value of the first coordinate (positive): ");//Prompt for user to enter the x of the first coordinate 
                    double dblVertex1X = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the y value of the first coordinate (positive): ");//Prompt for user to enter the y of the first coordinate 
                    double dblVertex1Y = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the x value of the second coordinate (positive): ");//Prompt for user to enter the x of the second coordinate 
                    double dblVertex2X = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the y value of the second coordinate (positive): ");//Prompt for user to enter the y of the second coordinate 
                    double dblVertex2Y = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the x value of the third coordinate (positive): ");//Prompt for user to enter the x of the third coordinate 
                    double dblVertex3X = input.nextInt();//Stores the user's answer in a variable
                    System.out.println("Enter the y value of the third coordinate (positive): ");//Prompt for user to enter the y of the third coordinate 
                    double dblVertex3Y = input.nextInt();//Stores the user's answer in a variable
                    
                    //Display a message and call a method to calculate the area of the triangle
                    System.out.println("The area of the triangle is: " + df2.format(getAreaFromCoordinates(dblVertex1X, dblVertex1Y, dblVertex2X, dblVertex2Y, dblVertex3X, dblVertex3Y)));
                    
                    break;//End of case 9, avoids fall-through            
            
            
            }
        }while(intChoice != 10);//check if a option besides 10 is selected or it will exit program 
        
        System.out.println("Goodbye");//display a goodbye message
                
    }
    
}
