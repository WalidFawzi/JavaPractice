package Chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main (String[] args) {
        System.out.println("Please enter the items quantity");
        Scanner scanner = new Scanner(System.in);
        int totalItems = scanner.nextInt();

        double total = 0 ;

        for (int i = 0; i < totalItems ; i++){
            System.out.println("Please enter the price of the item ");
            double price = scanner.nextDouble();
            total += price;

        }
        scanner.close();
        System.out.println("The Total: " + total);
    }
}
