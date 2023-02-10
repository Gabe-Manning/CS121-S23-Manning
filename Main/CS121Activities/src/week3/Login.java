package week3;

import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {

        String userName = "GManning";
        String password = "12345";

        String user = JOptionPane.showInputDialog("What is your username?");
        String pw = JOptionPane.showInputDialog("What is your password?");


        if (userName.equals(user) && password.equals(pw))
            System.out.println("Welcome to CS121");
        else if (userName.equals(user) && !password.equals(pw))
            System.out.println("Incorrect password");
        else if (!userName.equals(user) && password.equals(pw))
            System.out.println("Incorrect username");
        else
            System.out.println("Both incorrect");

    }
}
