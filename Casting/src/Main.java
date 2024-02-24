import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int tamSayi = 0;
    double ondalikSayi = 0;



        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Tam Sayi Giriniz : ");
        tamSayi = input.nextInt();
        System.out.println("Lütfen Ondalikli Sayi Giriniz : ");
        ondalikSayi = input.nextDouble();

        int resultint = (int) ondalikSayi;
        double resultdouble = tamSayi;

        System.out.println(resultdouble);
        System.out.println(resultint  );


    }
}