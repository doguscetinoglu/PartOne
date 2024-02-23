import java.util.Scanner;

/**
 * @author Doğuş Çetinoğlu
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the number of integers
        System.out.print("How many numbers will you enter?: ");
        int n = scanner.nextInt();

        // Initializing variables to hold minimum and maximum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Looping through each input to find minimum and maximum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Updating minimum if the current number is smaller
            if (num < min) {
                min = num;
            }

            // Updating maximum if the current number is larger
            if (num > max) {
                max = num;
            }
        }

        // Displaying the minimum and maximum numbers
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // Closing the scanner to release resources
        scanner.close();
    }
}