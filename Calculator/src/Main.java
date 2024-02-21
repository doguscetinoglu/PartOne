import java.util.Scanner;

/**
 * This program performs basic arithmetic operations based on user input.
 * @author Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        int n1, n2, select, result; // Variables declaration

        Scanner input = new Scanner(System.in); // Getting input from user
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        System.out.println("1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division");
        System.out.print("Enter your choice based on the operation number: ");
        select = input.nextInt();

        if(select == 1) {   // Operation area
            result = n1 + n2;
            System.out.println("Result of the operation: " + result);
        } else if (select == 2) {
            result = n1 - n2;
            System.out.println("Result of the operation: " + result);
        } else if (select ==3) {
            result = n1 * n2;
            System.out.println("Result of the operation: " + result);
        } else if (select == 4) {
            if(n2 != 0){
                result = n1 / n2;
                System.out.println("Result of the operation: " + result);
            } else {
                    System.out.println("Bir Sayı 0'a Bölünemez! ");
            }
    } else {
            System.out.println("Invalid operation number! Please try again.");
        }
    }
}
