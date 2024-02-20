import java.util.Scanner;
// @Doğuş Çetinoğlu, xls
public class Main {
    public static void main(String[] args) {
    double tutar,kdvOran,kdvTutar,kdvliTutar;
        // Taking the value
    Scanner input = new Scanner(System.in);
    System.out.print("Ücret Tutarını Giriniz : ");
    tutar = input.nextDouble();
    // Print the VAT calculations only in this area.
    if (tutar <= 1000){
        kdvOran = 0.18;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

    }
    else {
        kdvOran = 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
    }
    //Only print the VAT calculations here.
    System.out.println("KDV'siz Tutar : " + tutar);
    System.out.println("KDV Oranı : " + kdvOran);
    System.out.println("KDV Tutarı : " + kdvTutar);
    System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}