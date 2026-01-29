import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class LoginRegisterSystem {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Register Method
    public static void register() {
        System.out.println("\n===== REGISTER =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Save user
        users.add(new User(username, password));

        System.out.println("✅ Registration Successful!\n");
    }

    // Login Method
    public static void login() {
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check user
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("✅ Login Successful! Welcome " + username + " 🤍\n");
                return;
            }
        }

        System.out.println("❌ Invalid Username or Password!\n");
    }

    // Main Menu
    public static void main(String[] args) {

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Choose Option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    System.out.println("Thank you! Bye 🤍");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid Choice!\n");
            }
        }
    }
}
