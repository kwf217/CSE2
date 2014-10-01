//Kevin Fogarty
//kwf217
//9/16/14
//CSE2
//Lab04-BigMacAgain

//This program uses the Scanner class to obtain from users how many Big Macs they want and whether they want an order of fries. 
//It then prints out the total cost of the meal. Big Macs still cost $2.22 each,  and an order of fries costs $2.15.


//import scanner
import java.util.Scanner;
//new public class
public class BigMac {
    //create main method
    public static void main(String[] args) {
        Scanner myScanner; //declare instance of the scanner
        myScanner = new Scanner( System.in ); //tells scanner to accept input
        
        double BigMac$ = 2.22; //price of big mac
        double Fries$ = 2.15; //price of fries

        System.out.println("Enter number of Big Macs (an integer >0): "); //prompt user to input number of big macs
        int nBigMacs = myScanner.nextInt(); //get input
        if (myScanner.hasNextInt(True)) { //checks if the the user input an integer
            if(nBigMacs>=0) { //if input is an integer
                double BigMacCost$; //cost is double
                BigMacCost$= nBigMacs * BigMac$; //cost is number times price
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+" x 2.22 = "+BigMacCost$+);
            } //close of if
            else {
                System.out.println("You did not enter an integer > 0");
                return; //leaves the program
            } //close of else
        } //close of if    
        else
            System.out.println("You did not enter an integer");
            return; //leaves the program
        } //close of else
            
        
        System.out.println("Do you want an order of fries (Y/y/N/n)?");
        String response = myScanner.next();
        if (response.equals("Y") || response.equals("y")) {
            double BigMacCost$ = nBigMacs * BigMac$;
            System.out.println("You ordered fries at a cost of $2.15.");
            System.out.println("The total cost of the meal is "+(BigMacCost$+Fries$));
        }
        else if (response.equals("N") || response.equals("n")) {
            //if they don't order fries
            double BigMacCost$ = nBigMacs * BigMac$;
            System.out.println("The total cost of the meal is "+BigMacCost$);
        }
        else if (!response.equals("N") || !response.equals("n") || !response.equals("Y") || !response.equals("y")) {
            //if user doesn't input N n Y or y
            System.out.println("You did not enter one of 'Y', 'y', 'N', 'n'");
            return;
        } //end of else
        
    } //end of main method
    
} //end of class