//Kevin Fogarty
//kwf217
//9/23/14
//CSE2
//HW04-Course Number

//This program should:
//read a 6 digit number and then prints out the semester and year

import java.util.Scanner;

public class CourseNumber {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        System.out.println("Enter a six digit number giving the course semester- ");
        String courseNumber = myScanner.next();
        char[] myNum = courseNumber.toCharArray(); //used the internet and the textbook to learn how to do arrays
        if(myNum.length != 6) { //if the code has any less than 6 digits
            System.out.println("The number you entered does not have 6 digits");
        }
        //need to cast the string of the first 4 digits representing the year into an integer
        int year = Integer.parseInt("" + myNum[0] + myNum[1] + myNum[2] + myNum[3]); //the two quotation marks implicitly cast it to a string
        //Integer.parseInt takes each char from the array and casts them to an integer
        if(year < 1865 || year > 2014) { //year has to be between 1865 and 2014
            System.out.println("The number was outside the range [186510,201440]");
            return;
        }
        
        int semester = Integer.parseInt("" + myNum[4] + myNum[5]); //last 2 digits represent the semester
        // "" implicitly casts numbers to a string and Integer.parseInt converts it back to an integer
        if(semester % 10 != 0) { //if the semester is not divisible by 10, then the course number is invalid (not 10, 20, 30, or 40)
            System.out.println(semester+ " is not a legitimate semester");
            return;
        }
        
        //go through each value of last two digits
        if(semester>40 || semester<10) { //make sure semester is between 10 and 40
            System.out.println(semester+ " is not a legitimate semester");
        }
        else if(semester==10) {
            System.out.println("The course was offered in the spring semester of " +year);
        }
        else if(semester==20) {
            System.out.println("The course was offered in the summer 1 of " +year);
        }
        else if(semester==30) {
            System.out.println("The course was offered in the summer 2 of " +year);
        }
        else if(semester==40) {
            System.out.println("The course was offered in the fall of " +year);
        } //end of else
        
    } //end main method
    
} //end of class


