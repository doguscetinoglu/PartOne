import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Değişkenler
        int ebob = 1, ekok, sayac = 1, degerBir, degerIki;

        // Kullanıcıdan iki değer alınıyor
        System.out.print("1. Değeri Giriniz: ");
        degerBir = input.nextInt();

        System.out.print("2. Değeri Giriniz: ");
        degerIki = input.nextInt();

        // Ebob ve Ekok hesaplanıyor
        while (true) {
            if (degerBir % sayac == 0 && degerIki % sayac == 0) {
                ebob = sayac;
            }
            if (sayac == degerBir || sayac == degerIki) {
                break;
            }
            sayac++;
        }
        ekok = (degerBir * degerIki) / ebob;

        // Sonuçlar ekrana yazdırılıyor
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
