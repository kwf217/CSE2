////////////////////////////////////////////////////////////////////////////////
//Kevin Fogarty
//kwf217
//9/8/14
//CSE2
//Arithmetic

//Things to calculate:
//Total cost of each kind of item; sales tax for that total cost
//Total cost of purchases (before tax)
//Total actually paid for this transaction, including sales tax.

// New class
public class Arithmetic {
// main method required for every Java program
    public static void main(String[] args) {

        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;



        //total cost of socks before tax
        double totalSockCost$;   //total cost of socks
        //total sock cost before taxes is price times number
        totalSockCost$=nSocks*sockCost$;
        //make 2 decimal places
        totalSockCost$=totalSockCost$*100;
        totalSockCost$=(int)totalSockCost$;
        totalSockCost$=totalSockCost$/100;
        //total cost of socks tax
        double totalSockTax=totalSockCost$*taxPercent;
        //make 2 decimal places
        totalSockTax=totalSockTax*100;
        totalSockTax=(int)totalSockTax;
        totalSockTax=totalSockTax/100;
        //total cost of socks with taxes
        double totalSockCostwTax=totalSockTax+totalSockCost$;
        //make 2 decimal places
        totalSockCostwTax=totalSockCostwTax*100;
        totalSockCostwTax=(int)totalSockCostwTax;
        totalSockCostwTax=totalSockCostwTax/100.0;
        
        
        //total cost of glasses before tax
        double totalGlassCost$;   //total cost of glasses
        //total glasses cost before taxes is price times number
        totalGlassCost$=nGlasses*glassCost$;
        //make 2 decimal places
        totalGlassCost$=totalGlassCost$*100;
        totalGlassCost$=(int)totalGlassCost$;
        totalGlassCost$=totalGlassCost$/100;
        //total cost of glasses tax
        double totalGlassTax=totalGlassCost$*taxPercent;
        //make 2 decimal places
        totalGlassTax=totalGlassTax*100;
        totalGlassTax=(int)totalGlassTax;
        totalGlassTax=totalGlassTax/100;
        //total cost of glasses with taxes
        double totalGlassCostwTax=totalGlassTax+totalGlassCost$;
        //make 2 decimal places
        totalGlassCostwTax=totalGlassCostwTax*100;
        totalGlassCostwTax=(int)totalGlassCostwTax;
        totalGlassCostwTax=totalGlassCostwTax/100.0;
        
        
        //total cost of envelopes before tax
        double totalEnvelopeCost$;   //total cost of socks
        //total envelope cost before taxes is price times number
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        //make 2 decimal places
        totalEnvelopeCost$=totalEnvelopeCost$*100;
        totalEnvelopeCost$=(int)totalEnvelopeCost$;
        totalEnvelopeCost$=totalEnvelopeCost$/100;
        //total cost of envolope tax
        double totalEnvelopeTax=totalEnvelopeCost$*taxPercent;
        //make 2 decimal places
        totalEnvelopeTax=totalEnvelopeTax*100;
        totalEnvelopeTax=(int)totalEnvelopeTax;
        totalEnvelopeTax=totalEnvelopeTax/100;
        //total cost of envelopes with taxes
        double totalEnvelopeCostwTax=totalEnvelopeTax+totalSockCost$;
        //make 2 decimal places
        totalEnvelopeCostwTax=totalEnvelopeCostwTax*100;
        totalEnvelopeCostwTax=(int)totalEnvelopeCostwTax;
        totalEnvelopeCostwTax=totalEnvelopeCostwTax/100.0;
        
        
        //Total amount paid before taxes
        double totalAmountPaid=totalEnvelopeCost$+totalGlassCost$+totalSockCost$;
        //make 2 decimal places
        totalAmountPaid=totalAmountPaid*100;
        totalAmountPaid=(int)totalAmountPaid;
        totalAmountPaid=totalAmountPaid/100;
        //total amount of taxes paid
        double totalTaxes=totalSockTax+totalGlassTax+totalEnvelopeTax;
        //cast values integers to make 2 decimal places
        totalTaxes=totalTaxes*100;
        totalTaxes=(int)totalTaxes;
        totalTaxes=totalTaxes/100;
        //total amount paid including taxes
        double totalAmountPaidwTaxes=totalSockCostwTax+totalGlassCostwTax+totalEnvelopeCostwTax;
        //make 2 decimal places
        totalAmountPaidwTaxes=totalAmountPaidwTaxes*100;
        totalAmountPaidwTaxes=(int)totalAmountPaidwTaxes;
        totalAmountPaidwTaxes=totalAmountPaidwTaxes/100.0;
        
        
        //print out everything
        System.out.println("The total cost of the socks before tax was $" +totalSockCost$+
        " and the tax on the socks was $" +totalSockTax+ ", so the total paid for this transaction was $" +totalSockCostwTax+ 0 "");
        System.out.println("The total cost of the glasses before tax was $" +totalGlassCost$+
        " and the tax on the glasses was $" +totalGlassTax+ ", so the total paid for this transaction was $" +totalGlassCostwTax+ "");
        System.out.println("The total cost of the envelopes before tax was $" +totalEnvelopeCost$+
        " and the tax on the envelopes was $" +totalEnvelopeTax+ ", so the total paid for this transaction was $" +totalEnvelopeCostwTax+ "");
        System.out.println("The total cost of all the items before tax was $" +totalAmountPaid+
        " and the total tax on the items was $" +totalTaxes+ " so the total paid for all the items was $" +totalAmountPaidwTaxes+ "");
    
        
    }
    
}

