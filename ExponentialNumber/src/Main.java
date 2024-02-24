import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int n,r,sum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üst değeri giriniz: ");
        n = scanner.nextInt();
        System.out.println("Taban değeri giriniz: ");
        r = scanner.nextInt();
        for(int i = 0; i < r ; i++){
            sum*=n;
        }
        System.out.println(sum);
    }
}