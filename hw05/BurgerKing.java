//Kevin Fogarty
//kwf217
//9/27/14
//CSE2
//HW05-Burger King

//This program should:
//prompt the user to enter a choice of a burger, a soda, or fries
//prompts the users for details of their choices

import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        System.out.print("Enter a letter to indicate a choice of: \n\tBurger (B or b) \n\tSoda (S or s) \n\tFries (F or f) "); //prompt user for input (\n\ puts it on new line)
        String input = myScanner.next();
        
        char[] choice = input.toCharArray(); //make input an array
        if(choice.length != 1) { //if the input has any more than 1 digit
            System.out.println("a single character expected");
            return; //leave the program
        }
        
        else { //if the input has 1 digit
        
            char choice2 = input.charAt(0); //first char is 0
        
            switch (choice2) {
                case 'B' : case 'b' : //if they ask for a burger
                    System.out.print(" Enter A or a for all the 'fixins' \n C or c for chesse \n N or n for none of the above ");
                    String burger = myScanner.next();
                    char toppings = burger.charAt(0);
                    switch (toppings){ //cases for toppings
                        case 'A': case 'a':
                            System.out.println("You ordered a burger with all the fixins");
                            break;
                        case 'C': case 'c':
                            System.out.println("You ordererd a burger with cheese");
                            break;
                        case 'N': case 'n':
                            System.out.println("You ordered a burger");
                            break;
                        default:
                            System.out.println("You did not enter any of A, a, C, c, N, n");
                            break;
                    }
                    break;
                case 'S': case 's':
                    System.out.print("Do you want a Coke (C or c), \n\t Pepsi (P or p), \n\t Sprite (S or s), \n\t or Mountain Dew (M or m)- "); //what type of soda do they want
                    String drink = myScanner.next();
                    char sodaChoice = drink.charAt(0);
                    switch (sodaChoice) {
                        case 'c': case 'C':
                            System.out.println("You ordered a Coke");
                            break;
                        case 'P': case 'p':
                            System.out.println("You orderd a Pepsi");
                            break;
                        case 'S': case 's':
                            System.out.println("You ordered a Sprite");
                            break;
                        case 'M': case 'm':
                            System.out.println("You ordered a Mountain Dew");
                            break;
                        default:
                            System.out.println("You did not enter any of C, c, P, p, S, s, M, or m");
                            break;
                    }
                    break;
                case 'F': case 'f':
                    System.out.print("Do you want a large or small order of fries (l,L,s, or S)- "); //what size fries
                    String fries = myScanner.next();
                    char size = fries.charAt(0);
                    switch(size) {
                        case 'L': case 'l':
                            System.out.println("You ordered large fries");
                            break;
                        case 'S': case 's':
                            System.out.println("You ordered small fries");
                            break;
                        default:
                            System.out.println("You did not enter any of L, l, S, or s");
                            break;
                    }
                    break;
                default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                    break;
              
            } //end of switch
        
        } //end of else
        
    } //end of main method
    
} //end of class