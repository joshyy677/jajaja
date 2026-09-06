import java.util.Scanner;
public class atm {
    public static void main() {
        Scanner input = new Scanner(System.in);
        double balance = 10000;
        int pin = 1234;
        int inputPin,choice;
        double withdraw,deposit;

        System.out.println("ATM Machine");
        System.out.print("Enter Pin : ");
        inputPin = input.nextInt();

        if(inputPin == pin){
            System.out.println("\nSelect Transaction");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.print("Enter Number : ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Current Balance : " + balance);
            }
            else {
                if (choice == 2) {
                    System.out.print("Enter Amount to Withdraw : ");
                    withdraw = input.nextDouble();
                    if (withdraw > 0){
                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Withdrawal Successful");
                            System.out.println("Current Balance : " + balance);
                        }
                        else {
                            System.out.println("Insufficient Balance");
                        }
                    }
                    else {
                        System.out.println("Invalid Input");
                    }
                }
                else {
                    if (choice == 3) {
                        System.out.print("Enter Amount to Deposit : ");
                        deposit = input.nextDouble();
                        if (deposit > 0) {
                            balance = balance + deposit;
                            System.out.println("Deposit Successful");
                            System.out.println("Current Balance : " + balance);
                        }
                        else{
                            System.out.println("Invalid Input");
                        }
                    }
                    else {
                        System.out.println("Invalid Transaction");
                    }
                }
            }
        }
        else{
            System.out.println("Invalid Pin Try Again");
        }
    }
}