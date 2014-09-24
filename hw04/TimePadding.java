//Kevin Fogarty
//kwf217
//9/23/14
//CSE2
//HW04-Time Padding

//This program should:
//prompt the user enter an positive integer giving the number of seconds that have passed during the day
//then display the time in conventional form

import java.util.Scanner; //import scanner

public class TimePadding {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in); //initialize scanner
        System.out.print("Enter the time in seconds: "); //prompt user to input time in seconds
        int secondsInput = myScanner.nextInt(); //seconds is int
        double Hours = secondsInput/3600.0; //dividing by 3600 converts seconds into hours
        int intHours = (int)Hours; //casts hours into an integer
        double hourDecimal = Hours - intHours; //by subtracting the integer value of hours from the double you get a decimal (minutes in terms of hours)
        double Minutes = hourDecimal * 60; //converts decimal into minutes
        int intMinutes = (int)Minutes; //casts minutes into an integer
        double minuteDecimal = Minutes - intMinutes; //by subtracting the integer value of minutes from the double you get a decimal (seconds in terms of minutes)
        double Seconds = minuteDecimal * 60; //converts decimal into seconds
        int intSeconds = (int)Seconds; //casts seconds to an int
        
        if (Minutes < 10){ //if less than 10 minutes there must be a padding 0
            System.out.print("The time is " +intHours+ ":0" +intMinutes);
        }
        else{
            System.out.print("The time is " +intHours+ ":" +intMinutes); //no padding 0 needed
        }
        if (Seconds < 10){ //if less than 10 seconds there must be a padding 0
            System.out.print(":0" +intSeconds);
        }
        else{
            System.out.print(":" +intSeconds); //no padding 0 needed
        }
            System.out.println();
            
    } //end of main method
    
} //end of class
