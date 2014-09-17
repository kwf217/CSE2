//Kevin Fogarty
//kwf217
//9/16/14
//CSE2
//Lab03-BigMac

//This program gets inputs for the number of Big Macs, the cost per Big Mac, and the sales tax, and spits out a price.


//import scanner
import java.util.Scanner;
//new public class
public class BigMac {
    //create main method
    public static void main(String[] args) {
        Scanner myScanner; //declare instance of the scanner
        myScanner = new Scanner( System.in ); //tells scanner to accept input
        
        System.out.print("Enter number of Big Macs (an integer >0): "); //prompt user to input number of big macs
        int nBigMacs = myScanner.nextInt(); //input is integer
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx):");
        double bigMac$=myScanner.nextDouble(); //cost needs extra precision
        System.out.print("Enter the percent tax as a whole number (xx):"); //user inputs percent
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //the user's input is percent, but I need a proportion
        double cost$;
        int dollars, //whole dollar amount of cost
            dimes,pennies; //for storing digits to right of decimal for the cost$
        cost$= nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //(int)(6.73*10) % 10->67 %10->10
        //where the % (mod) operator returns the remainder after the division
        //583%100->83, 27%5-> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +
        " per BigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
    } //end of main method
    
} //end of class
