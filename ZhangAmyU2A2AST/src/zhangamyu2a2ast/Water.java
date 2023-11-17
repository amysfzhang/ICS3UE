/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zhangamyu2a2ast;
import java.util.Scanner; //This will allow us to read input

/**
 *
 * @author amy
 * Date: Aug 2nd, 2023
 * Calculates amount of water used to manufacture computers
 */
public class Water {
    public static void main(String[] args) {
        //Declaring the scanner
        Scanner input = new Scanner(System.in);
        
        //Declaring a constant to store the tons of water per computer and monitor combo
        final double DBLWATERPERCOMBO = 1.5;
        
        //Giving a prompt to ask the user to enter the number of computer combos they have
        System.out.println("Please enter the number of computer and monitor combos you have: ");
        //Declaring a variable to read the number of computer combos the user has
        int intComputerCombos = input.nextInt();
        
        //Calculating the total tons of water used to manufacture their computer combos
        double dblTotalWater = intComputerCombos * DBLWATERPERCOMBO;
        //Displaying the total water used
        System.out.println(dblTotalWater +" tons of water was used to manufacture your computers and monitors!");
    }
}
