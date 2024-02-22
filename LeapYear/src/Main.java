import java.util.Scanner;

/**
 * This program determines whether a given year is a leap year or not.
 * @author Doğuş Çetinoğlu
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Year value received from the user
        int yearValue;
        System.out.print("Please enter the year: ");
        yearValue = input.nextInt();

        // Checking if the year is a leap year
        if (yearValue % 4 == 0) {
            if (yearValue % 100 == 0) {
                if (yearValue % 400 == 0) {
                    System.out.print(yearValue + " is a leap year! ");
                } else {
                    System.out.print(yearValue + " is not a leap year! ");
                }
            } else {
                System.out.print(yearValue + " is a leap year! ");
            }
        } else {
            System.out.print(yearValue + " is not a leap year! ");
        }
    }

}
