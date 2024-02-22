import java.util.Scanner;

/**
 * This program takes three numbers as input and sorts them in ascending order.
 * @author Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        // Prompt user to input the first number
        System.out.println("Enter the first number:");
        a = input.nextInt();

        // Prompt user to input the second number
        System.out.println("Enter the second number:");
        b = input.nextInt();

        // Prompt user to input the third number
        System.out.println("Enter the third number:");
        c = input.nextInt();

        // Sorting the numbers in ascending order
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("Sorted numbers: " + "a < b < c");
            } else {
                System.out.println("Sorted numbers: " + "a < c < b");
            }

        }  else if ((b < a) && (b < c)) {
            if (a < c){
                System.out.println("Sorted numbers: " + "b < a < c");
            } else {
                System.out.println("Sorted numbers: " + "b < c < a");
            }
        } else {
            if ( a < b) {
                System.out.println("Sorted numbers: " + "c < a < b");
            } else {
                System.out.println("Sorted numbers: " + "c < b < a");
            }
        }
    }
}
