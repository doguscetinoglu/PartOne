import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi oluşturalım.
        double birinciKenar, ikinciKenar, ucuncuKenar;
        double cevre, alan, u;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz ");
        birinciKenar = input.nextInt();
        System.out.print("2. Kenarı Giriniz ");
        ikinciKenar = input.nextInt();
        System.out.print("3. Kenarı Giriniz ");
        ucuncuKenar = input.nextInt();

        cevre = (birinciKenar + ikinciKenar + ucuncuKenar);
        u = ((birinciKenar + ikinciKenar + ucuncuKenar) / 2.0);
        alan = Math.sqrt(u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));
        System.out.println(alan);

    }
}