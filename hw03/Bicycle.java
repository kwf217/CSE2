//Kevin Fogarty
//kwf217
//9/16/14
//CSE2
//Bicycle Program

//import scanner
import java.util.Scanner;
//new class
public class Bicycle {
// main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds:"); //ask user to input the number of seconds
        double secTrip = myScanner.nextDouble(); //time value assigned as double
        System.out.print("Enter the number of counts:"); //ask user to input the number of counts
        double countTrip = myScanner.nextDouble(); //count value assigned as double
        
        //all the constants
        double wheelDiameter=27.0, // diameter of wheel
        PI=3.14159, // value of pi
        feetPerMile=5280, // feet per mile
        inchesPerFoot=12, // inches per foot
        secondsPerMinute=60; // seconds per minute
        
        double distanceTrip,timeTrip,mph; //double assigned distance, time, mph
        distanceTrip=countTrip*wheelDiameter*PI; //calculates the distance of trip
        distanceTrip/=inchesPerFoot*feetPerMile; //converts the distance into miles
        timeTrip=secTrip/secondsPerMinute; //calculates the time of the trip in minutes
        mph=(distanceTrip)/(timeTrip/60); //calculates mph for the trip
        
        distanceTrip=distanceTrip*100; //multiply distance by 100
        distanceTrip=(int)distanceTrip; //cast to int
        distanceTrip/=100; //divide by 100 to get 2 decimal places
        
        timeTrip=timeTrip*100; //multiply time by 100
        timeTrip=(int)timeTrip; //cast to int
        timeTrip/=100; //divide by 100 to get 2 decimal places
        
        mph=mph*100; //multiply mph by 100
        mph=(int)mph; //cast to int
        mph/=100; //divide by 100 to get 2 decimal places
        
        System.out.println("The total distance travelled was "+distanceTrip+" and it took "+timeTrip+"minutes to travel this distance."); //print out distance and time
        System.out.println("The average miles per hour was "+mph); //print out average mph
        
        
    } //end main method
    
} //end of class
