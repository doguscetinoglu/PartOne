import java.util.Scanner;

/**
 * @author Doğuş Çetinoğlu
 */

public class Main {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;
        double average = 0;
        boolean check = true;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        number = inp.nextInt();

        // Loop through numbers from 1 to the input number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is divisible by both 3 and 4
            if ((i % 3 == 0) && (i % 4 == 0)) {
                // If divisible, update sum and count
                sum += i;
                count++;
                average = sum / count; // Update average
                check = false; // If not divisible, set check to false
            } else {

            }
        }
        // If there are numbers divisible by both 3 and 4
        if (!check) {
            // Print the average of those numbers
            System.out.println("Average of numbers divisible by 3 and 4: " + average);
        } else {
            // If no such numbers found, print a message
            System.out.println("No number divisible by both 3 and 4 found.");
        }
    }
}
