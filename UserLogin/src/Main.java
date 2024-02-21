import java.util.Scanner;
// @author Doğuş Çetinoğlu , Mrx
public class Main {
    public static void main(String[] args) {
        String userName, password,xdWord; // Variables
        boolean isLoggedIn = false; // Is the user logged in?

        Scanner inpUserName = new Scanner(System.in); // Receiving data from the user
        System.out.println("Welcome! Please Enter Your Desired Username: ");
        userName = inpUserName.nextLine();

        Scanner inputPassword = new Scanner(System.in); // Receiving data from the user
        System.out.println("Welcome! Please Enter Your Desired Password: ");
        password = inputPassword.nextLine();

        System.out.println("Please Wait! ");
        System.out.println(" Your Registration Has Been Successfully Completed!");
        // Login panel
        while (true) {
            System.out.println("Welcome! Please Enter Your Username: ");
            Scanner reCheck = new Scanner(System.in);
            String reName = reCheck.nextLine();
            if (!userName.equals(reName)) {
                System.out.println("Error");

            } else {
                break;
            }

        }
        while (true) {
            System.out.println("Welcome! Please Enter Your Password: ");
            Scanner reChecking = new Scanner(System.in);
            String rePass = reChecking.nextLine();
            if (!password.equals(rePass)) {
                System.out.println("Password Error");
                while (true) {
                    System.out.println("If You Want to Reset Your Password, You Can Say 'yes' ! ");
                    Scanner reEvet = new Scanner(System.in);
                    String reSifre = reEvet.nextLine();
                    if ("yes".equals(reSifre)) {
                        System.out.println("Enter New Password");
                        Scanner newPassInput = new Scanner(System.in);
                        String newPass = newPassInput.nextLine();
                        if (!password.equals(newPass)){
                            System.out.println("Your Password Has Been Successfully Updated!");
                            password = newPass;
                        } else {
                            System.out.println("Şifre Eski Şifre Olduğundan Kaydedilemedi");
                        }


                        isLoggedIn = true;
                        break;


                    } else {
                        System.out.println("You Said No. Exiting the Screen........");
                        isLoggedIn = true;
                        break;
                    }
                }
                break;

            } else {
                System.out.println("Login Successful! ");
                isLoggedIn = false; // Logged in
                break;
            }
        }
        if (isLoggedIn){
            while (true) {
                System.out.println("You are Being Redirected to the Login Screen! ");
                System.out.println("Welcome! Please Enter Your Username: ");
                Scanner reCheck = new Scanner(System.in);
                String reName = reCheck.nextLine();
                if (!userName.equals(reName)) {
                    System.out.println("Error");

                } else {
                    break;
                }
            }
            while (true) {
                System.out.println("Welcome! Please Enter Your Password: ");
                Scanner reChecking = new Scanner(System.in);
                String rePass = reChecking.nextLine();
                if (!password.equals(rePass)) {
                    System.out.println("Password Error");
                    break;
                } else {
                    System.out.println("Login Successful! ");
                    break;
                }
            }

        }
    }
}
