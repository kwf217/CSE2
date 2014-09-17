//Kevin Fogarty
//kwf217
//9/16/14
//CSE2
//Cube Root

//import scanner
import java.util.Scanner;
//new class
public class Root {
    public static void main(String[] args) {
        Scanner myScanner; //scanner initialized
        myScanner= new Scanner(System.in);
        System.out.print("Enter a double:"); //prompt user to input double
        //make double variable from input
        double number = myScanner.nextDouble();
        double guess = number/3;
        
        //start guessing
        guess = ((guess*guess*guess)+number)/(3*guess*guess);
        guess = ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess = ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess = ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess = ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess = ((2*guess*guess*guess)+number)/(3*guess*guess); //final guess of the cube root!
        
        double cube = guess*guess*guess; //the cube of the guess
        
        System.out.println("The cube root is: "+guess+":"); //print out the guess of the cube root
        System.out.println(+guess+"*"+guess+"*"+guess+"="+cube); //print the cube of the guess
        
    }
    
}
