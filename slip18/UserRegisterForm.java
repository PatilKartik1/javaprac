// Q2. Write a program to design following screen using swing components

import javax.swing.*;
import java.awt.*;

public class UserRegisterForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("New User Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());
        
        // Create layout constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around elements
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Create Labels
        JLabel lblFirstName = new JLabel("First name");
        JLabel lblLastName = new JLabel("Last name");
        JLabel lblEmail = new JLabel("Email address");
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
        JLabel lblMobile = new JLabel("Mobile number");
        
        // Create TextFields
        JTextField txtFirstName = new JTextField(15);
        JTextField txtLastName = new JTextField(15);
        JTextField txtEmail = new JTextField(15);
        JTextField txtUsername = new JTextField(15);
        JTextField txtPassword = new JPasswordField(15);
        JTextField txtMobile = new JTextField(15);
        
        // Create Register Button
        JButton btnRegister = new JButton("Register");
        
        // Arrange components using GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(lblFirstName, gbc);
        gbc.gridx = 1;
        frame.add(txtFirstName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(lblLastName, gbc);
        gbc.gridx = 1;
        frame.add(txtLastName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(lblEmail, gbc);
        gbc.gridx = 1;
        frame.add(txtEmail, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(lblUsername, gbc);
        gbc.gridx = 1;
        frame.add(txtUsername, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(lblPassword, gbc);
        gbc.gridx = 1;
        frame.add(txtPassword, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        frame.add(lblMobile, gbc);
        gbc.gridx = 1;
        frame.add(txtMobile, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        frame.add(btnRegister, gbc);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
