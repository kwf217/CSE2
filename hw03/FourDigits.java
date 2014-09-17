//Kevin Fogarty
//kwf217
//9/16/14
//CSE2
//Four Digits


//import scanner
import java.util.Scanner;
//new class
public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner; //scanner initiallized
        myScanner = new Scanner(System.in);

        System.out.print("Enter a double: "); //ask user for input
        double number = myScanner.nextDouble();
        int intNumber = (int)number; //make int
        number = number * 10000; //multiply by 10000
        intNumber = 10000; //cast to int
        int printNumber = (int)number - intNumber;
        double printNum = number % intNumber;
       
        System.out.println("The digits are "+ (int)printNum); //print the digits
        
    }

}
