//Kevin Fogarty
//kwf217
//9/27/14
//CSE2
//HW05-Boola Boola

//This program should:
//have three boolean variables to each of which the value of true or false is randomly assigned
//combine the three variables with random choices of && and || and store the result
//then present the expression to the user and ask the user to state the result of of the expression

import java.util.Scanner;

public class BoolaBoola {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        
        //generate random number and make it an integer that is either 1 or 2
        int randomNumber1 = (int)(Math.random()*2);
        int randomNumber2 = (int)(Math.random()*2);
        int randomNumber3 = (int)(Math.random()*2);
        
        //initialize 3 booleans
        boolean boolean1;
        boolean boolean2;
        boolean boolean3;
        
        //assign value of true if random number is 1 and false if random number is 2
        if (randomNumber1 == 1){ 
            boolean1 = true;
        }
        else{
            boolean1 = false;
        }
        
        if (randomNumber2 == 1){ 
            boolean2 = true;
        }
        else{ 
            boolean2 = false;
        }
        
        if (randomNumber3 == 1){ 
            boolean3 = true;
        }
        else{ 
            boolean3 = false;
        }
        
        //need a random operatoin to be chosen (either && or ||)
        int randomOperation1 = (int)(Math.random()*2);
        int randomOperation2 = (int)(Math.random()*2);
        
        //initialize variables that identify the operator
        int id1 = 0;
        int id2 = 0;
        
        if (boolean1 == true){ //statement if 1 is randomly generated
            System.out.print("Does true");
        }
        else {
            System.out.print("Does false"); //if boolean1 = false, print "Does false"
        }
        
        //need different options for operator so use switch
        switch (randomOperation1){
            case 0:                     
                System.out.print(" &&");
                id1 = 1;
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        
        //id value of 1 means it's a && and value of 0 is ||
        
        if (boolean2 == true){
            System.out.print(" true");
        }
        else {
            System.out.print(" false");
        }
        switch (randomOperation2){
            case 0:
                System.out.print(" &&");
                id2 = 1; //record value for second operation 
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        if (boolean3 == true){ //3rd boolean value
            System.out.print(" true"); 
        }
        else{
            System.out.print(" false");
        }
        System.out.print(" have the value true (t/T) or false (f/F)? "); //finish the question
        
        String input = myScanner.next(); //ask user for input
        
        if (id1 == 1 && id2 == 1){ //if both of the operations are &&
            if ((boolean1 && boolean2 && boolean3) && (input.equals("t") || input.equals("T"))){ //if the iput is t and the operations above are followed they're right
                System.out.println("Correct");
            }
            else if (!(boolean1 && boolean2 && boolean3) && (input.equals("f") || input.equals("F"))){ //the user is also right
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong; try again"); //if not one of those cases, they aren't right
            }
        }
        else if (id1 == 1 && id2 == 0){ //if it is && then ||
            if ((boolean1 && boolean2 || boolean3) && (input.equals("t") || input.equals("T"))){ //if the iput is t and the operations above are followed they're right
                System.out.println("Correct");
            }
            else if (!(boolean1 && boolean2 || boolean3) && (input.equals("f") || input.equals("F"))){ //the user is also right
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong; try again"); //if not one of those cases, they aren't right
            }
        }
        else if (id1 == 0 && id2 == 0){   //if it is || then ||
            if ((boolean1 || boolean2 || boolean3) && (input.equals("t") || input.equals("T"))){ //if the input is t and the operations above are followed they're right
                System.out.println("Correct");
            }
            else if (!(boolean1 || boolean2 || boolean3) && (input.equals("f") || input.equals("F"))){ //the user is also right
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong; try again"); //if not one of those cases, they aren't right
            }
        }
        else if (id1 == 0 && id2 == 1){   //if it is || then &
            if ((boolean1 || boolean2 && boolean3) && (input.equals("t") || input.equals("T"))){ //if the input is t and the operations above are followed they're right
                System.out.println("Correct");
            }
            else if (!(boolean1 || boolean2 && boolean3) && (input.equals("f") || input.equals("F"))){ //the user is also right
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong; try again"); //if not one of those cases, they aren't right
            } //end of else
        
        } //end of else if
        
    } //end of main method
    
} //end of class