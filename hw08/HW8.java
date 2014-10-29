//Kevin Fogarty
//kwf217
//10/28/14
//CSE2
//HW8


import java.util.Scanner;
public class HW8{
  
  
  public static char getInput(Scanner input, String chars){
    
    while(true){
    
      String value = input.next();
    
      if(value.length() != 1){ //the length should be 1
        System.out.print("You should enter exactly one character- ");
      }
      else{ //only one character is entered
        char chr = value.charAt(0); //looks at the first character
    
        if(chars.indexOf(chr) != -1){ //if the first character is one that we want, return
          return chr;
        }
        else{ //if we don't want it, prompt user to enter character from list
            System.out.print("You did not enter a character from the list "+ chars +"; try again- ");
        }
      }
    }
  }
  
  
  public static char getInput(Scanner input, String chars, int iterations){
    
    for (int i = 0; i < iterations; i++){ //set up for loop (initialize i and add 1)
    
      String value = input.next(); 
    
      if(value.length() != 1){ //if length is not one
        System.out.print("You should enter exactly one character- "); //prompt user to input 1 charcter
      }
      else{
        char chr = value.charAt(0); //find value of 1st char
    
        if(chars.indexOf(chr) != -1){ //if character is in desired list
          return chr; //return
        }
        else{ //if not in desired list, prompt user to try again
            System.out.print("You did not enter a character from the list " 
            + chars +"; try again- ");
        }
      }
    }
    System.out.println(); //print error
    System.out.println("You failed after " + iterations + " tries"); //they failed because they did not enter desired character in 5 tries
    return ' ';
  }
  
  
  public static char getInput(Scanner input, String prompt, String chars){ //new method
    
    while(true){
    
      System.out.println(prompt);
      System.out.print("Enter one of: ");
      for(int i = 0; i < chars.length(); i++){ //set up for loop
        System.out.print("'" + chars.charAt(i) + "',"); //print out the numbers with ' ',
      }
      System.out.print("- "); //print the dash
      String value = input.next();
      System.out.println();
    
      if(value.length() != 1){ //if it's not one character
        System.out.println("Enter exactly one character"); //prompt to enter one
      }
    
      else{
        char chr = value.charAt(0);
    
        if(chars.indexOf(chr) != -1){ //has to be char from desired list
          return chr;
        }
        else{ //print error message
            System.out.println("You did not enter an acceptable character ");
        }
      }
    }
  }
  
 // this is the code that was given to us
  public static void main(String []arg){
	char input; 
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //after the 5th attempt, they fail
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	} //close of if
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'"); 
  } //close of method
} //close of class
