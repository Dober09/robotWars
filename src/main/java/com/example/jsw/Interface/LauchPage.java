package com.example.jsw.Interface;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LauchPage extends JFrame {

    JTextField textField;
    JComboBox dropBox;
    JButton btn;

    LauchPage() {
        // label
        JLabel label = new JLabel("Enter Robot Name");
        label.setBounds(90, 40, 200, 30)
        ;
        // textfield
        textField = new JTextField();
        textField.setBounds(90, 70, 200, 30);
        // select box
        String[] robotsMake = { "Select robot make", "rifle", "shotgun", "sniper" };
        dropBox = new JComboBox(robotsMake);
        dropBox.setBounds(90, 120, 200, 30);

        // submition box
        btn = new JButton("Launch Robot");
        btn.setBackground(new Color(46, 143, 94));
        btn.setBounds(90, 180, 200, 30);
        btn.setForeground(new Color(24, 24, 24));
        btn.setFocusable(false);

        this.add(label);
        this.add(textField);
        this.add(dropBox);
        this.add(btn);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

   
}
