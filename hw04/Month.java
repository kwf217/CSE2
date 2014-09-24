//Kevin Fogarty
//kwf217
//9/23/14
//CSE2
//HW04-Month Program

//This program should:
//prompt the user to enter an integer for the month (1 for January, 2 for February, etc.)  and then display the number of days in the month

import java.util.Scanner;

public class Month { //new class
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter an int giving the number of the month (1-12) - ");
        int month = myScanner.nextInt();
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) { //all the months with 31 days
            System.out.print("The month has 31 days ");
        }
        else if (month==4 || month==6 || month==9 || month==11) { //all the months with 30 days
            System.out.print("The month has 30 days ");
        }
        else if (month==2) {
            System.out.print("Enter an int giving the year "); //prompt user to input year
            int year = myScanner.nextInt();
            double yearRemainder = year % 4; //modulus operator to find remainder
            if (yearRemainder == 0) { //if the remainder is 0 it is a leap year
                System.out.print("The month has 29 days ");
            }
            else {
                System.out.print("The month has 28 days "); //if it's not a leap year
            } //end of else
        } //end of February else if
        else if (month<1 || month>12) { //if month is not between 1 and 12
                System.out.print("You did not enter an int between 1 and 12 "); //int entered was outside of range
                return;    //leaves the program
        } //end of else if
        
    } //end main method
    
} //end of class