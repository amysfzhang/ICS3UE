/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zhangamyu2a2ast;
import java.util.Scanner; //This will allow us to read input

/**
 *
 * @author amy
 * Date: Aug 2nd, 2023
 * Calculates income tax
 */
public class IncomeTax {
    public static void main(String[] args) {
        //Declaring the scanner
        Scanner input = new Scanner(System.in);
        
        //Declaring constants to store the rate of tax in brackets one to four
        final double DBLTAXBRACKETONE = 0.15, DBLTAXBRACKETTWO = 0.205, DBLTAXBRACKETTHREE = 0.26, DBLTAXBRACKETFOUR = 0.29;
        //Declaring integer values off the first three bracket cutoffs
        final int INTBRACKETONECUTOFF = 53359, INTBRACKETTWOCUTOFF = 106717, INTBRACKETTHREECUTOFF = 165430;
        
        //Giving a prompt for the user to enter their annual salary
        System.out.println("Please enter in your annual salary (no commas or $): ");
        //Declaring a variable to read their annual salary
        double dblSalary = input.nextDouble();
        
        //Calculating the tax for bracket 1 and storing it in a variable
        double dblIncomeTax = INTBRACKETONECUTOFF * DBLTAXBRACKETONE;
        //Calculating the tax for bracket 2 by subtracting their salary from the cutoff for bracket 1 and adding it to a variable
        dblIncomeTax = dblIncomeTax + ((INTBRACKETTWOCUTOFF - INTBRACKETONECUTOFF) * DBLTAXBRACKETTWO);
        //Calculating the tax for bracket 3 by subtracting their salary from the cutoff for bracket 2 and adding it to a variable
        dblIncomeTax = dblIncomeTax + ((INTBRACKETTHREECUTOFF - INTBRACKETTWOCUTOFF) * DBLTAXBRACKETTHREE);
        //Calculating the tax for bracket 4 by subtracting their salary from the cutoff for bracket 3 and adding it to a variable
        dblIncomeTax = dblIncomeTax + ((dblSalary - INTBRACKETTHREECUTOFF) * DBLTAXBRACKETFOUR);
        
        //Displaying the income tax in the console and rounding it to the hundredths
        System.out.println("Your income tax is: $"+ dblIncomeTax);
    }
}
