/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zhangamyu2a2ast;
import java.util.Scanner; //This will allow us to read input
import java.text.DecimalFormat; //This will allow us to do rounding

/**
 *
 * @author amy
 * Date:  Aug 2nd, 2023
 * Calculates subtotal, tax, and grand total of peripheral devices ordered
 */
public class Shopping {
    public static void main(String[] args) {
        //Declaring the scanner
        Scanner input = new Scanner(System.in);
        //Declaring the decimal format as hundredths
        DecimalFormat df2 = new DecimalFormat("0.00");
    
        //Declaring constants to store the prices of items and the tax percentage
        final double DBLUSBPRICE = 19.99, DBLKEYBOARDPRICE = 50, DBLCOMPUTERMOUSE = 26, DBLTAX = 0.13;
                
        //Giving a prompt to enter the number of USB storage devices they would like to order
        System.out.println("Please enter the amount of USB storage devices you would like to order: ");
        //Declaring a variable to read the number of USB storage devices ordered
        int intUsbsOrdered = input.nextInt();
        //Giving a prompt to enter the number of keyboards they would like to order
        System.out.println("Please enter the amount of keyboards you would like to order: ");
        //Declaring a variable to read the number of keyboards ordered
        int intKeyboardsOrdered = input.nextInt();
        //Giving a prompt to enter the number of computer mice they would like to order
        System.out.println("Please enter the amount of computer mice you would like to order: ");
        //Declaring a variable to read the number of USB storage devices ordered
        int intComputerMiceOrdered = input.nextInt();
        
        //Calculating the subtotal and storing it in a variable  
        double dblSubtotal = ((intUsbsOrdered * DBLUSBPRICE) + (intKeyboardsOrdered * DBLKEYBOARDPRICE) + (intComputerMiceOrdered * DBLCOMPUTERMOUSE));
        //Calculating the tax and storing it in a variable
        double dblTax = dblSubtotal * DBLTAX;
        //Calculating the Grand total and storing it in a variable
        double dblGrandTotal = dblSubtotal +dblTax;
        
        //Displaying the subtotal, amount of tax, and grand total of their order
        System.out.println("Your subtotal is: $"+ df2.format(dblSubtotal));
        //Displaying the amount of tax on their order
        System.out.println("The amount of tax is: $"+ df2.format(dblTax));
        //Displaying the grand total of their order
        System.out.println("Your grand total is: $"+ df2.format(dblGrandTotal));
        
        //Displaying a thank you and farewell message to the user
        System.out.println("Thank you for ordering at Amy's and we hope you enjoyed your visit!");
        
    }
}
