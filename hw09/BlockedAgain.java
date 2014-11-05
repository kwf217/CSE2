//kwf217
//Kevin Fogarty
//11/4/14
//hw09-Blocked Again


import java.util.Scanner;

public class BlockedAgain {
    
    public static boolean checkInt(String r){
        Scanner Scan = new Scanner(r); //scan through string r
        if(Scan.hasNextInt()){ //if the string is an integer, return true
            return true;
        }
        else{
            return false; //if not, false
        } //close else
    } //close checkInt
    
    public static boolean checkRange(int k){ //check the range of the integer
            if(k >= 1 && k <= 9){ //if it is 1-9, return true
                return true;
            }
            else{
                return false; //if not, false
            } //close else
    } //close checkRange
    
    public static int getInt(){
        System.out.println("Enter an in int between 1 and 9, inclusive: ");
        Scanner scan = new Scanner(System.in); 
        String val = scan.next();//scan the user's input
    
        while(true){ //this will keep repeating while it's true
        if(checkInt(val)){ //put the user's input into the checkInt method first, and continue if it is an int
                int y = Integer.parseInt(val); //convert the number to an integer
                if(checkRange(y)){ //put the number into checkRange method
                    return y; //return the input
                }
                else{ //if the number isn't in the range
                    if(!checkRange(y)){
                        System.out.print("You did not enter an int in [1,9]; try again: ");
                        val = scan.next(); //get the user's new input
                    } //close of if
                } //close of else
        } //
        else{ //if it's not an integer
            if(!checkInt(val)){ //just a double check
                System.out.print("You did not enter an int; try again: ");
                val = scan.next(); //get the user's new input
                } //close if
            } //close else
        } //close while
    } //close of getInt method
    
    public static void line(int k){ //method that controls the lines
        int count = 1; //initialize count at 1
        for(int j = 0; j < k; j++){
                System.out.print("-");
            } //close for loop
            System.out.println();
            count += 2;
        } //close method
    
    public static void block(int k){ //block method to block dem loops
        int count = 1;
        System.out.println("Output:");
        for(int i = 1; i <= k; i++){
            for(int j = 0; j < i;j++){
                for(int l = 0; l < count; l++){
                    System.out.print(i);
                }
                System.out.println();
            }   
            line(count); //enter count into line to match dashes with numbers
            count +=2;
        }
    }

    public static void allBlocks(int k){ //put dem blocks togetha
        block(k); //run block
    }
    
    public static void main(String[] r) { //main mf method
        int k;

        k = getInt();
        
        allBlocks(k);
    }
    
} //close of main method
