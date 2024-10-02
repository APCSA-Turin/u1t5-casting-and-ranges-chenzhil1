import java.util.Scanner;
public class RoundInteger {
    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Please Enter the first score: ");
        // double score1 = scan.nextDouble();
        // scan.nextLine();
        // System.out.print("Please Enter the second score: ");
        // double score2 = scan.nextDouble();
        // scan.nextLine();
        // System.out.print("Please Enter the third score: ");
        // double score3 = scan.nextDouble();
        // scan.nextLine();
        // System.out.print("Please Enter the fourth score: ");
        // double score4 = scan.nextDouble();
        // scan.nextLine();
        // double total = score1 + score2 + score3 + score4;
        // double average = total / 4;
        // int roundedAverage = 0;
        // if (average % 1 >=0.5) {
        //     roundedAverage = (int) average + 1; 
        // }
        // else{
        //     roundedAverage = (int) average;
        // }
        // System.out.println("The average is: " + average);
        // if (roundedAverage >= 65) {
        //     System.out.println("The rounded average is: " + roundedAverage + ", which is passing. ");
        // }
        // else {
        //     System.out.println("The rounded average is: " + roundedAverage + ", which is NOT passing. ");
        // 
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Enter a stock ticker symbol: ");
        
    //     String symbol = scan.nextLine();
    //     System.out.print("How many shares do you own? ");
    //     int share = scan.nextInt();
        
    //     scan.nextLine();
    //     System.out.print("Enter the change in stock price as a positive or negative decimal: ");
    //     double change = scan.nextDouble();
        
    //     double value = (share*change);
    //     int rounded = 0;
    //     if (value >= 0) {
    //         if (value % 1 >=0.5 ) {
    //             rounded = (int) value + 1;  
    //         }
    //         else {
    //             rounded = (int) value;
    //         }
    //     }
    //     else {
    //         if (value % 1 <=-0.5 ) {
    //             rounded = (int) value - 1;  
    //         }
    //         else {
    //             rounded = (int) value;
    //         }
    //     }
    //     System.out.println("Change in stock value: $" + rounded + " dollars");
    Scanner scan = new Scanner(System.in);
    System.out.print("Type in a decimal between 100.00 and 999.00 with up to 2 decimals: ");
    double decimal = scan.nextDouble();
    scan.nextLine();
    int hundreds = (int) ((decimal % 1000) / 100);
    int tens = (int) ((decimal % 100) / 10);
    int ones = (int) ((decimal % 10) / 1);
    int tenths = (int) (((decimal % 1) / 0.1));
    int hundredths = (int) Math.round((decimal - hundreds * 100 - tens * 10 - ones * 1 - tenths * 0.1) * 100);
    if (hundreds == 9) {
        hundreds = 0;
    }
    else{
        hundreds += 1;
    }
    if (tens == 9) {
        tens = 0;
    }
    else{
        tens += 1;
    }
    if (ones == 9) {
        ones = 0;
    }
    else{
        ones += 1;
    }
    if (tenths == 9) {
        tenths = 0;
    }
    else{
        tenths += 1;
    }
    if (hundredths == 9) {
        hundredths = 0;
    }
    else{
        hundredths += 1;
    }
    System.out.println("The adjusted number is: " + hundreds + tens + ones + "." + tenths + hundredths);
    }
}