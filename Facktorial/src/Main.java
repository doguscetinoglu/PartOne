import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n = 4;
        int r = 3;
        int sum = 1;
        int sum2 = 1;
        int result;

        for(int i = 1; i <= n ; i++){
            sum *= i;
        }

        for(int i = 1; i <= r ; i++){
            sum2 *= i;
        }

        result = (sum2 * (sum - sum2)) / sum;

        System.out.println("Sonuç " + result);


    }
}