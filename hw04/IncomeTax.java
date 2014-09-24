//Kevin Fogarty
//kwf217
//9/23/14
//CSE2
//HW04-Income Tax

//This program should:
//prompt the user to enter an int that gives the thousands of dollars of income and then writes out the amount of tax on the income


import java.util.Scanner;

public class IncomeTax { //new class
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        System.out.print("Enter an int giving the number of thousands- ");
        int income = myScanner.nextInt();
        if (income<20) { //if income is less than 20 thousand
            double taxRate = 5; //tax is 5%
            double taxIncome = (income*1000) *.05; //tax income is the tax rate times income
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income>=20 && income<40) { //if income is between 20 and 40 thousand
            double taxRate = 7; //tax is 7%
            double taxIncome = (income*1000) *.07; //tax income is the tax rate times income
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income>=40 && income<78) { //if income is between 40 and 78 thousand
            double taxRate = 12;
            double taxIncome = (income*1000) *.12; //tax income is the tax rate times income
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income>=78) { //if income is over 78 thousand
            double taxRate = 14;
            double taxIncome = (income*1000) *.14; //tax income is the tax rate times income
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income<0) {
            System.out.print("You did not enter a positive int");
            return;    //leaves the program
        } //end of else
        
         System.out.println(); //new line
        
    } //end main method
    
} //end of class