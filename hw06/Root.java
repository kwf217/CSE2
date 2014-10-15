//Kevin Fogarty
//kwf217
//10/14/14
//CSE2
//HW06-Root

//This program should:
//prompt the user to enter a number
//uses the bisection method to compute the square root of the number
//print the square root


import java.util.Scanner; //import scanner

public class Root{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a double that is greater than 0 to take the square root of: "); //ask user for input
        double number = myScanner.nextDouble();
        double low = 0; //low starts at 0
        double high = number + 1; //high starts as the input plus 1
        double middle = (high + low)/2; //middle is in between high and low
        boolean test = (high-low) > (.0000001 * high); //test conditions for loop
        while(test == true){
            if((middle*middle) > number){ //if the middle number squared is greater than the input, it is too large
                high = middle; //so set the high number to the middle number
                middle = (high+low)/2; //and do it again
            }
            else if((middle*middle)<number){ //if the middle number squared is less than the input, it is too small
                low = middle; //so set teh low number to the middle number
                middle = (high+low)/2; //and do it again
            }
            test = (high-low) > (.0000001 * high); //repeat the test at end of the while loop
        } //end of while loop
        
        System.out.println(middle); //print the square root
    } //end of main method
    
} //end of class
