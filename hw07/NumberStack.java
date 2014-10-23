//Kevin Fogarty
//kwf217
//10/14/14
//CSE2
//HW06-Roulette

//This program should:
//force the user to enter an integer between 1 and 9, inclusive, and then print out displays that depend on the value entered
//The first stack should be created only using for loops, the second stack should be created only using while loops, and the third stack should be created only using do-while loops

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- "); //prompt user to enter number
            int num = scan.nextInt();
            System.out.println(); //makes a space
            System.out.println("For Loop:"); 
            System.out.println(); //another space
            int oddCounter = 1; //initialize at 1
            for(int i=1; i<=num; i++) {
                for(int k = 0; k < i; k++){
                for(int j=0; j<oddCounter; j++){
                    System.out.print(i); //print out i
                }
                System.out.println(); //space
                }
                for(int d = 0; d < oddCounter; d++){ //for d=0
                    System.out.print("-");
                }
                System.out.println();
                oddCounter += 2; //add 2 to the oddCounter to get to the next odd
            }
            System.out.println(); //space
            System.out.println("While Loop:");
            System.out.println(); //space
            //initialize variables for while loop
            int m = 1; 
            int n = 0;
            int o = 0;
            int p = 0;
            int oddCount = 1; //set oddCount to 1
            while(m <= num){ //while their input is greater than 1
                while(n < m){ //and while m is greater than n
                    while(o < oddCount){ //while it's positive
                        System.out.print(m); //print the value of m
                        o++; //then add one to o
                    }
                    System.out.println(); //space
                    n++; //add one to n
                    o = 0; //reset o to 0
                }
                while(p < oddCount){
                    System.out.print("-");
                    p++; //add one to p
                }
                System.out.println(); //space
                oddCount += 2; 
                m++;
                n = 0;
                p = 0;
            }
            
            System.out.println(); //space
            System.out.println("Do-While Loop:");
            System.out.println(); //space
            //initialize variables for do-while loop
            int w = 1;
            int x = 0;
            int y = 0;
            int z = 0;
            int oddCnt = 1;
            do{
                do{
                    do{
                       System.out.print(w);
                        y++; 
                    }while(y < oddCnt);
                    System.out.println(); //space
                    x++;
                    y = 0;
                }while(x < w);
                do{
                    System.out.print("-");
                    z++; //add one to z
                }while(z < oddCnt); //while z is less than the count
                System.out.println(); //space
                oddCnt += 2; //add 2 to count
                w++;
                z = 0;
                x = 0;
            
            }while(w <= num);
            
    }
}

//By the way I know they're not symmetric. I couldn't figure out how to make them symetrical with the space so oh well