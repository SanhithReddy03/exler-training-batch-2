import java.util.*;
class demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Welcome to mallareddy university");
            System.out.println("have you visited our site earlier");
            reply = sc.nextLine();
            if (reply.equals("no")) {
                System.out.println("login here");
                System.out.println("enter ur id and pwd");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }

        } while (loginid.equals("sunny") && pwd.equals("sunny"));
    }
}
