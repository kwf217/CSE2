// Kevin Fogarty
// kwf217
// 9/5/14
// CSE2 Lab 02

// This code should:
// print the number of minutes for each trip
// print the number of counts for each tirp
// print the distance of each trip in miles
// print the distance for the two trips combined

// New class
//
public class Cyclometer {
// main method required for every Java program
    public static void main(String[] args) {
        
        int secsTrip1=480; // number of seconds for trip 1
        int secsTrip2=3220; // number of seconds for trip 2
        int countsTrip1=1561; // rotation count for trip 1
        int countsTrip2=9037; // rotation count for trip 2
        
        double wheelDiameter=27.0, // diameter of wheel
        PI=3.14159, // value of pi
        feetPerMile=5280, // feet per mile
        inchesPerFoot=12, // inches per foot
        secondsPerMinute=60; // seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance; // total distance of trip 1
        
        System.out.println("Trip 1 took "+ 
        (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; // gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // distance of trip 2 (miles)
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of main method
    
} //end of class

