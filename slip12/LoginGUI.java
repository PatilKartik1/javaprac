/* Q2. Write a program to design a following GUI. Use appropriate Layout and Components. On
 click of login check whether Username and Password is “admin” or not. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel and layout
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Create Username Label
        JLabel userLabel = new JLabel("Username:");
        panel.add(userLabel);

        // Create text field for username
        JTextField userText = new JTextField(20);
        panel.add(userText);

        // Create Password Label
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        // Create password field
        JPasswordField passwordText = new JPasswordField(20);
        panel.add(passwordText);

        // Create Login button
        JButton loginButton = new JButton("Login");
        panel.add(loginButton);

        // Create Reset button
        JButton resetButton = new JButton("Reset");
        panel.add(resetButton);

        // Action for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(panel, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(panel, "Invalid Username or Password");
                }
            }
        });

        // Action for reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordText.setText("");
            }
        });
    }
}
