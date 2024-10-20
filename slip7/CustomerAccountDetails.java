// Q2. Write a program to design the following GUI using Swing components. On click of submit
// button check whether user has entered all the details or not. If any details are missing then display
// appropriate message on screen using label.
// [20 Marks]
// Customer account Details
// Name of Customer:
// Of Bank
// Account NO-
// Put Number:
// Subma

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerAccountDetails {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Customer Account Details");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create labels
        JLabel nameLabel = new JLabel("Name of Customer:");
        nameLabel.setBounds(20, 20, 150, 25);
        JLabel bankLabel = new JLabel("Name of Bank:");
        bankLabel.setBounds(20, 60, 150, 25);
        JLabel accountLabel = new JLabel("Account No:");
        accountLabel.setBounds(20, 100, 150, 25);
        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setBounds(20, 140, 150, 25);
        
        // Create text fields
        JTextField nameField = new JTextField();
        nameField.setBounds(180, 20, 200, 25);
        JTextField bankField = new JTextField();
        bankField.setBounds(180, 60, 200, 25);
        JTextField accountField = new JTextField();
        accountField.setBounds(180, 100, 200, 25);
        JTextField panField = new JTextField();
        panField.setBounds(180, 140, 200, 25);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 180, 100, 30);

        // Create label to display messages
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(20, 220, 350, 25);

        // Add action listener to submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check for missing details
                if (nameField.getText().isEmpty() || bankField.getText().isEmpty() || 
                    accountField.getText().isEmpty() || panField.getText().isEmpty()) {
                    messageLabel.setText("Please fill in all the details.");
                } else {
                    messageLabel.setText("Details submitted successfully!");
                }
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(bankLabel);
        frame.add(accountLabel);
        frame.add(panLabel);
        frame.add(nameField);
        frame.add(bankField);
        frame.add(accountField);
        frame.add(panField);
        frame.add(submitButton);
        frame.add(messageLabel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
