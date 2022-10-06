package LoginSystem;

import CustomScanner.Scanner;

public class UserAccount {
    private String username;
    private String password;
    public final boolean isAdmin;

    UserAccount(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return this.username;
    }

    public void changeUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void changePassword() {

        while (true) {
            String oldPassword = Scanner.getString("Enter old password [Press X to cancel]");
            if (oldPassword.equals("X")) {
                System.out.println("Cancelled operation");
                return;
            }
            if (!oldPassword.equals(this.password)) {
                System.out.println("Old password do not match");
                continue;
            } else
                break;
        }

        while (true) {
            String newPass = Scanner.getString("Enter new password [Press X to cancel]");
            if (newPass.equals("X")) {
                System.out.println("Cancelled operation");
                return;
            }
            if (newPass.equals(this.password)) {
                System.out.println("New password cannot be the same as old password");
                continue;
            }

            String confirmPass = Scanner.getString("Confirm new password [Press X to cancel]");
            if (confirmPass.equals("X")) {
                System.out.println("Cancelled operation");
                return;
            }
            if (!newPass.equals(confirmPass)) {
                System.out.println("Passwords do not match. Re-Enter the passwords");
                continue;
            }

            {
                this.password = newPass;
                System.out.println("Password updated");
            }
        }

    }

    public boolean checkLoginCredentials(String username, String password) {
        return (username.equals(this.username) && password.equals(this.password));
    }

}