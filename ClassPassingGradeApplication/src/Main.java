import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables Field
        int mat, fizik, kimya, turkce, muzik;
        // Scanner Class Defined
        Scanner inp = new Scanner(System.in);
        // User Values Field
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();
        // Process Area

        int notSayisi = 0; // Hesaplanacak not sayısı

        int toplam = 0; // Toplam notlar
        double sonuc = 0; // Ortalama

        // Matematik dersi notunu kontrol et
        if (0 <= mat && mat <= 100) {
            toplam += mat;
            notSayisi++;
        }

        // Fizik dersi notunu kontrol et
        if (0 <= fizik && fizik <= 100) {
            toplam += fizik;
            notSayisi++;
        }

        // Kimya dersi notunu kontrol et
        if (0 <= kimya && kimya <= 100) {
            toplam += kimya;
            notSayisi++;
        }

        // Türkçe dersi notunu kontrol et
        if (0 <= turkce && turkce <= 100) {
            toplam += turkce;
            notSayisi++;
        }

        // Müzik dersi notunu kontrol et
        if (0 <= muzik && muzik <= 100) {
            toplam += muzik;
            notSayisi++;
        }

        // Eğer en az bir dersin notu 0 ile 100 arasında ise ortalama hesapla
        if (notSayisi > 0) {
            sonuc = (double) toplam / notSayisi;
            System.out.println("Ortalamanız : " + sonuc);

            boolean gecti = sonuc >= 55;
            String str = (gecti) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(str);
        } else {
            System.out.println("Girilen notlar 0 ile 100 arasında olmalıdır.");
        }
    }
}
