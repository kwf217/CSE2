//Kevin Fogarty
//kwf217
//9/25/14
//CSE2
//Lab 05 - Random Games

//This program should:
//ask the user whether they want to play roulette, craps,or pick a card from a deck of playing cards
//it should then give them a random result from the chosen game


import java.util.Scanner;

public class RandomGames {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- "); //prompt user to input game
        String input = myScanner.next();
        
        char[] gameInput = input.toCharArray();
        if(gameInput.length != 1) { //if the input has any more than 1 digit
            System.out.println("a single character expected");
            return; //leave the program
        }
        
        else {
            
            int RouletteNumber=(int)(Math.random()*37);
            int card=(int)(Math.random()*13);
            int cardSuit=(int)(Math.random()*4)+1; //choose a random suit
            int crapsRoll1 = (int)(Math.random()*7);
            int crapsRoll2 = (int)(Math.random()*7);
            int crapsTot = crapsRoll1 + crapsRoll2;
        
            char game = input.charAt(0); //first char is 0
            
            switch (game) {
                case 'R' : case 'r' :
                        System.out.println("Roulette: "+RouletteNumber);
                        break;
                case 'C' : case 'c' :
                        System.out.println("Craps: "+crapsRoll1+"+"+crapsRoll2+"="+crapsTot);
                        break;
                case 'P' : case 'p' :
                        switch (card){
                            case 1:
                                System.out.print("Ace");
                                break;
                            case 11:
                                System.out.print("Jack");
                                break;
                            case 12:
                                System.out.print("Queen");
                                break;
                            case 13:
                                System.out.print("King");
                                break;
                            default:
                                System.out.print(card);
                                break;
                            }
                            switch (cardSuit){
                                case 1:
                                System.out.print(" of Hearts");
                                break;
                                case 2:
                                System.out.print(" of Diamonds");
                                break;
                                case 3:
                                System.out.print(" of Spades");
                                break;
                                case 4:
                                System.out.print(" of Clubs");
                                break;
                            }
                                
                            System.out.println();
                            break;
                            
                default:
                    System.out.println(input+ " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            
            } //end of switch
        
        } //end of else
        
    } //end of main method
    
} //end of class