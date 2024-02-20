import java.util.Scanner;
/**
 * @author Doğuş Çetinoğlu , Xls
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User height and weight information inputs
        System.out.println("Please enter your height (m): ");
        double userHeight = input.nextDouble();

        System.out.println("Please enter your weight (kg): ");
        double userWeight = input.nextDouble();

        // Calculating Body Index
        double vki = userWeight/(userHeight*userHeight);
        System.out.println("Your Body Mass Index is: "+ vki);
    }
}