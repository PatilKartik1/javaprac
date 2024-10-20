// Q2. Write a program to design following GUI using swing. On click of Show button display the
// selected Programming language on screen using label.
// [20 Marks]
// ComboBox Example
// Programming language Selected: Java
// Java
// PH p
// Show

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgrammingLanguageSelector {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Create a JComboBox
        String[] languages = {"Java", "Python", "C++", "JavaScript", "PHP"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(50, 50, 150, 25);
        frame.add(comboBox);

        // Create a label to display the selected language
        JLabel label = new JLabel("Programming language Selected: ");
        label.setBounds(50, 20, 300, 25);
        frame.add(label);

        // Create the Show button
        JButton showButton = new JButton("Show");
        showButton.setBounds(220, 50, 80, 25);
        frame.add(showButton);

        // Add ActionListener to the button
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = (String) comboBox.getSelectedItem();
                label.setText("Programming language Selected: " + selectedLanguage);
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
