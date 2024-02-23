import java.util.Scanner;

/**
 * Author: Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter a number
        do {
            System.out.println("Enter a Number: ");
            n = scan.nextInt();
            // Checking if the number is even and divisible by 4 and 100
            if (((n % 2) == 0) && (((n % 100) % 4 == 0))){
                sum += n;
            } else {
                // Informing the user that an odd number is entered and proceeding with summation
                System.out.println("Moving on to Summation since an Odd Number is Entered.");
            }

        } while ((n > 0) && (n % 2 == 0));
        // Printing the total sum of even numbers that meet the condition
        System.out.println("Sum: " + sum);
    }
}
