
import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = scanner.nextDouble();
            double rupee = usdToRupee(usd);
            System.out.println("Converted amount in Rupee: " + rupee);

        } else if (choice == 2) {
            System.out.print("Enter amount in Rupee: ");
            double rupee = scanner.nextDouble();
            double usd = rupeeToUsd(rupee);
            System.out.println("Converted amount in USD: " + usd);

        } else if (choice == 3) {
            System.out.print("Enter amount in EURO: ");
            double euro = scanner.nextDouble();
            double rupee = euroToRupee(euro);
            System.out.println("Converted amount in Rupee: " + rupee);

        } else if (choice == 4) {
            System.out.print("Enter amount in Rupee: ");
            double rupee = scanner.nextDouble();
            double euro = rupeeToEuro(rupee);
            System.out.println("Converted amount in EURO: " + euro);

        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double usdToRupee(double usd) {
        return usd * 83.47; //Date: 06-04-2026
    }

    public static double rupeeToUsd(double rupee) {
        return rupee * 0.01198; //Date: 06-04-2026
    }

    public static double euroToRupee(double euro) {
        return euro * 89.10; //Date: 06-04-2026
    }

    public static double rupeeToEuro(double rupee) {
        return rupee * 0.0113; //Date: 06-04-2026
    }
}