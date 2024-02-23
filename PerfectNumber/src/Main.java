import java.util.Scanner;

/**
 * @author Doğuş Çetinoğlu, PurpleMoon
 */

public class Main {
    public static void main(String[] args) {
        int number,total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayıyı Giriniz! : ");
        number = input.nextInt();



        for (int a = 1; a < number; a++){
            if (number % a == 0){
                total += a;

            } else {
            }
        }
        if (total == number){
            System.out.println(number + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

    }
}