import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variables Field
        int mat, fizik, kimya, turkce, tarih, muzik;
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

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();
        // Process Area
       int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
       double sonuc = toplam / 6.0;
       System.out.println("Ortalamanız : " + sonuc);

      boolean gecti = sonuc >= 60;
      String str = (gecti) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
       System.out.println(str);
    }
}