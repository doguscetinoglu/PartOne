import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double apple, orange, tomato, banana, eggplant, totalCost; // Variable declarations

        Scanner input = new Scanner(System.in); // Using Scanner class to get input from user
        System.out.print("Enter the weight of apples: ");
        apple = input.nextDouble();

        System.out.print("Enter the weight of oranges: ");
        orange = input.nextDouble();

        System.out.print("Enter the weight of tomatoes: ");
        tomato = input.nextDouble();

        System.out.print("Enter the weight of bananas: ");
        banana = input.nextDouble();

        System.out.print("Enter the weight of eggplants: ");
        eggplant = input.nextDouble();

        // Calculation
        totalCost = (apple * 2.14) + (orange * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5.0);
        System.out.println("Total cost: " + totalCost + " TL");
    }
}
