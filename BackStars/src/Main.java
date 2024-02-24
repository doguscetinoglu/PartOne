import java.util.Scanner;

/**
 * @author Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of steps: "); // Prompting user to enter the number of steps
        int n = input.nextInt();

        for (int i = n - 1; i >= 1; i--) { // Rows in reverse order
            for (int k = 1; k <= (n - i); k++) { // Spaces before stars
            }
            for (int j = 1; j <= (2 * i) - 1; j++) { // Stars
                System.out.print("*"); // Printing stars
            }
            System.out.println(); // Moving to the next line after each row
        }

    }
}
