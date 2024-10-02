import java.util.Scanner;
public class ExactChange {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter an amount in dolars and cents: $");
    double change = scan.nextDouble();
    scan.nextLine();
    int quarters = (int) (change / 0.25);
    change -= quarters * 0.25;
    int dimes = (int) (change / 0.10);
    change -= dimes * 0.10;
    int nickels = (int) (change / 0.05);
    change -= nickels * 0.05;
    int pennies = (int) (change / 0.01);
    int coins = quarters + dimes + nickels + pennies;
    System.out.println("The minimum number of coins is: " + coins);
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
    System.out.println(pennies + " pennies");
  }
}