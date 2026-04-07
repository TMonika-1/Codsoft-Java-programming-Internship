
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int balance =25000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("withdrawn successfully: " + withdrawAmount);
                        System.out.println("Your new balance is: " + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("deposited succesfully: " + depositAmount);
                    System.out.println("Your new balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
        

            }
        }

    }
}