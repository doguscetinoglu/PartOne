import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();


        for (int i = 4; i <= n; i*=4){
            System.out.println("4'ün Kuvvetleri " + i);
        }
        System.out.println("-----------------------");
        for (int i = 5; i <= n; i*=5){
            System.out.println("5'in Kuvvetleri " +i);
        }
    }
}