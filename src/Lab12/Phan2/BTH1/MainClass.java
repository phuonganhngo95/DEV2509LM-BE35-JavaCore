package Lab12.Phan2.BTH1;

import java.io.Console;

public class MainClass {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Hệ thống của bạn không hỗ trọ thiết bị Console");
        } else {
            try {
                String username = console.readLine("Nhập Username: ");
                char[] password = console.readPassword("Nhập Password: ");

                System.out.println("Username: " + username);
                System.out.println("Password: " + new String(password));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
