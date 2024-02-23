/**
 * @author Doğuş Çetinoğlu (Xls) , Furkan Aydemir (Abreek)
 *
 */
public class Main {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++){
            int check = 0;
            for (int x = 2; x < i ; x++){
                if (i % x == 0){
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                System.out.print(i + " ");
            }
        }
    }
}