import java.util.Scanner;

/**26
 * @author Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Temperature Value: ");
        temperature = input.nextInt();

        // Check temperature range and provide activity recommendations
        if (temperature < 5) {
            System.out.println("Perfect Weather for Skiing!");
        } else if (temperature < 15) {
            System.out.println("Today's Weather is Perfect for Watching a Movie!");
        } else if (temperature < 25) {
            System.out.println("Today's Weather is Perfect for Picnic!");
        } else {
            System.out.println("Weather is Great Today, Let's Go Swimming!");
        }
    }
}
