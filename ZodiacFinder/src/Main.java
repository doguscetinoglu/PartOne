import java.util.Scanner;

/**
 * @author Doğuş Çetinoğlu
 */
public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month you were born in: ");
        month = input.nextInt();

        System.out.println("Please enter the day you were born on: ");
        day = input.nextInt();

        // Validation for input month and day
        if (month > 12){
            System.out.println("No Such month. Enter Again.");
            month = input.nextInt();
        } else if (day > 31){
            System.out.println("No Such day. Enter Again.");
            day = input.nextInt();
        } else {

        }

        // Determining the zodiac sign based on birth month and day
        if (((day >= 21) && (month == 1)) || ((day <= 19) && (month == 2))){
            System.out.println("You are an Aquarius.");
        } else if (((day >= 20) && (month == 2)) || ((day <= 20) && (month == 3))) {
            System.out.println("You are a Pisces.");
        } else if (((day >= 21) && (month == 3)) || ((day <= 20) && (month == 4))) {
            System.out.println("You are an Aries.");
        } else if (((day >= 21) && (month == 4)) || ((day <= 21) && (month == 5))) {
            System.out.println("You are a Taurus.");
        } else if (((day >= 22) && (month == 5)) || ((day <= 21) && (month == 6))) {
            System.out.println("You are a Gemini.");
        } else if (((day >= 22) && (month == 6)) || ((day <= 22) && (month == 7))) {
            System.out.println("You are a Cancer.");
        } else if (((day >= 23) && (month == 7)) || ((day <= 21) && (month == 8))) {
            System.out.println("You are a Leo.");
        } else if (((day >= 22) && (month == 8)) || ((day <= 23) && (month == 9))) {
            System.out.println("You are a Virgo.");
        } else if (((day >= 24) && (month == 9)) || ((day <= 23) && (month == 10))) {
            System.out.println("You are a Libra.");
        } else if (((day >= 24) && (month == 10)) || ((day <= 22) && (month == 11))) {
            System.out.println("You are a Scorpio.");
        } else if (((day >= 23) && (month == 11)) || ((day <= 22) && (month == 12))) {
            System.out.println("You are a Sagittarius.");
        } else if (((day >= 23) && (month == 12)) || ((day <= 20) && (month == 1))) {
            System.out.println("You are a Capricorn.");
        } else {
            System.out.println("Error Please Try Again."); // Default message if month and day do not correspond to any sign
        }
    }
}
