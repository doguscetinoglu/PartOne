import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        int first = 0;
        int second = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz! : ");
        n = input.nextInt();
        for (int i = 3; i <= n; i++){
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;

        }
    }
}