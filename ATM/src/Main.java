
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, price;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals(userName) && password.equals(password)) {
                System.out.println("Ortak ATM Hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış");
                    System.out.print("Lütfen Seçim Yapınız!  : ");
                    select = input.nextInt();
                    if (select > 4 || select < 1){
                        System.out.println("Yanlış Seçim Yaptınız Tekrar Seçim Yapınız!");
                        continue;
                    }
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz! : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz! : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye");
                                System.out.println("Lütfen Hesabınızdaki Tutar Kadar Çekim Yapınız!");
                                System.out.println("Hesabınızdaki Tutar : " + balance);
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızdaki Tutar : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış İşlemi Yapılıyor...");
                    }
                } while (select != 4);
                System.out.println("Çıkış İşlemi Başarılı!");
                break;
            } else {

                }
            }
        }
    }