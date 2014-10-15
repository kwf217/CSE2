//Kevin Fogarty
//kwf217
//10/14/14
//CSE2
//HW06-Roulette

//This program should:
//use a random number generator to simulate a person’s betting on 100 spins
//run the simulation 1000 times and collect data on the outcome
//compute the number of times you lose everything, the total winnings, and compute the number of times I walked away with a profit in one session of 100 spins of the wheel


import java.util.Scanner; //import scanner

public class Roulette {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number 1-38 to bet on: ");
        int bet = myScanner.nextInt();
        //have to initialize all the variables that you use to count
        int Trials = 0;
        int NumberLosses = 0;
        int NumberWins = 0; 
        int Profit = 0;
        int ThreeWins = 0;
        int LoseAll = 0;
        int LoseSome = 0;
        int Wins = 0;
        
        while(Trials < 1000){ //we want to do 1000 trials of 100 spins each
            int count = 0;
            while(count < 100){ //100 spins 
                Wins = 0;
                int number = (int)(Math.random()*39);
                if(number == bet){ //you win if the random number (cast to an int) is the number you input
                    NumberWins++; //add one to count of winning number
                    Profit+= 36; //add $36 to profit
                    Wins++; //add one to count of total wins
                }
                else{
                    NumberLosses++; //your number loses
                    Profit--; //you lose $1
                }
                count++; //add one to the count (99 times through loop left)
            } //close while loop
            
            if(Wins >= 3){ //if you win 3 times, add one to count for ThreeWins
                ThreeWins++;
            }
            else if (Wins == 2 || Wins == 1){ //if you only win twice or once, you lose some money
                LoseSome++;
            }
            else if(Wins == 0){ //if you don't win at all, you lose all of your money that round of 100
                LoseAll++;
            }
            Trials++; //add one to the number of trials (999 times through loop left)
            
        } //close while loop
        
        int TotalWinnings = NumberWins*36; //total winnings was just number of times your number won times 36
        
        //print out everything asked for
        
        System.out.println("The number of rounds of 100 spins in which you lost all of your money was "+LoseAll);
        System.out.println("Your total winnings (of all simulations added together) was $"+TotalWinnings+" but your net profit was still " +Profit); //wasn't sure which you wanted so I said both
        System.out.println("The number of rounds of 100 spins in which you walked away with a profit was "+ThreeWins);
        
    } //close main method
    
} //close class
