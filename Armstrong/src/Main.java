import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int value,result,div,total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");

        value = scanner.nextInt();
        div = value;
        for (int loop = 0; loop < div; loop++){
            if (value > 0){
                result = value % 10;
                value = value / 10;
                total += result;
            }

        } System.out.println(total);
    }

}