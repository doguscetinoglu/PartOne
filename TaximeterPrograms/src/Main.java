import java.util.Scanner;

// @ Doğuş Çetinoğlu , Xls

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Total Amount: " + total);
    }
}
