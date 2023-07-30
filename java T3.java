import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class CurrencyConverter {
    // Exchange rates (as constants for simplicity, but these should be fetched from
    // an API in a real application)
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.73;
    private static final double USD_TO_JPY = 110.42;
    private static final double EUR_TO_USD = 1.18;
    private static final double GBP_TO_USD = 1.37;
    private static final double JPY_TO_USD = 0.0091;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Currency Converter Menu:");
            System.out.println("1. USD to EUR");
            System.out.println("2. USD to GBP");
            System.out.println("3. USD to JPY");
            System.out.println("4. EUR to USD");
            System.out.println("5. GBP to USD");
            System.out.println("6. JPY to USD");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertCurrency("USD", "EUR", USD_TO_EUR);
                    break;
                case 2:
                    convertCurrency("USD", "GBP", USD_TO_GBP);
                    break;
                case 3:
                    convertCurrency("USD", "JPY", USD_TO_JPY);
                    break;
                case 4:
                    convertCurrency("EUR", "USD", EUR_TO_USD);
                    break;
                case 5:
                    convertCurrency("GBP", "USD", GBP_TO_USD);
                    break;
                case 6:
                    convertCurrency("JPY", "USD", JPY_TO_USD);
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using the Currency Converter!");
        scanner.close();
    }

    private static void convertCurrency(String fromCurrency, String toCurrency, double exchangeRate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in " + fromCurrency + ": ");
        double amount = scanner.nextDouble();

        double convertedAmount = amount * exchangeRate;
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
    }
}
