import java.util.Scanner;
// @ Doğuş Çetinoğlu , Xls
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting 3 numbers from the user
        System.out.print("Please enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int c = scanner.nextInt();
        // Calculation according to the operation order
        int result = a + b * c - b;
        // Printing the result to the screen
        System.out.println("Result of the operation: " + result);
    }
}