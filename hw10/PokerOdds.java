//Kevin Fogarty
//kwf217
//11/18/14
//CSE2
//HW10


import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();  //generate random hands and ask user if they want another
        simulateOdds(); //randomly generate 10000 hands and count the number of times that a hand with a pair 
    }

    public static boolean hasDups(int n[]) { //from FindDuplicates
        for (int i = 0; i < n.length; i++) {
            for (int k = i + 1; k < n.length; k++) {
                if (n[i] == n[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] showHands() {
        do {
            for (int i = 0; i < hand.length; i++) {
                int num = (int)((Math.random()) * 52 + 1);
                num = hand[i];
            }
        } while (hasDups(n))
        return n;
    }

    // I know this is completely wrong but I've been messing with this for so long so I give up

    public static void indicators(int n[]) {
        int heart[] = new int[5];
        int jack[] = new int[5];
        int queen[] = new int[5];
        int club[] = new int[5];
        int hearts = 0;
        int jacks = 0;
        int queens = 0;
        int clubs = 0;
        
        n[] = showHands();
        for (int i = 0; i < n.length; i++) {
            int rank = n[i]%13;
            int suit = n[i]/13;
            if (suit == 0) {
                    switch (rank) {
                        case 0:
                            heart[hearts] = n[i];
                            heartsInd++;
                        case 2:
                            heart[hearts] = "K";
                            hearts++;
                            break;
                }
            }
            else{
                heart[hearts] = n[i] + "";
                hearts++;
            }
            
            if(n[i] > 13 && n[i] <= 26){
                if(n[i] >=24){
                    switch(n[i]){
                        case 24;
                            club[clubs] = "J";
                            clubs++;
                        case 25:
                            club[clubs] = "Q";
                            clubs++;
                        case 26:
                            club[clubs] = "K";
                            clubs++;
                        default:
                            club[clubs] = "A";
                            clubs++;
                   
                    }
                }
            }
        }
    }
}
