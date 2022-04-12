import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // food mover application
        String mainItem;
        String sideItem;
        int mainQuantity;
        int sideQuantity;
        // constant prices for mains/sides
        double mainPrice = 5.99;
        double sidePrice = 3;
        double totalPrice;

        // initialize scanner to read user input
        Scanner scanner = new Scanner(System.in);

        /*****
         * Taking customer's order
         ****/
        // ask user for main item selection
        System.out.println("Please enter your main meal selection: ");
        mainItem = scanner.nextLine();
        // ask user for quantity of main item
        System.out.println("How many " + mainItem + "'s would you like?");
        mainQuantity = scanner.nextInt();
        // consume the new line so we can continue
        scanner.nextLine();
        // Customer name's their price
        System.out.println("Price of " + mainItem + "?");
        mainPrice = scanner.nextDouble();
        // consume the new line
        scanner.nextLine();
        // ask user for side item selection
        System.out.println("Please enter your side item selection: ");
        sideItem = scanner.nextLine();
        // ask user for quantity of side item
        System.out.println("How many " + sideItem + "'s would you like?");
        sideQuantity = scanner.nextInt();
        // consume the new line so we can continue
        scanner.nextLine();
        // Customer names their price for side item
        System.out.println("Price of " + sideItem + "?");
        sidePrice = scanner.nextDouble();

        /*****
         * Calculating the customer's total order price
         ****/
        totalPrice = (mainQuantity * mainPrice) + (sideQuantity * sidePrice);

        /*****
         * Show customer their total
         ****/
        System.out.println("Your total for your " + mainQuantity + " " + mainItem + "/s and "
                + sideQuantity + " " + sideItem + "/s will be $" + totalPrice);
    }

}
