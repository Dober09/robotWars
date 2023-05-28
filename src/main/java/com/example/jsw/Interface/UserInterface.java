package com.example.jsw.Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class UserInterface {
    public static void main(String[] args) {
        Frame frame=new Frame();

        ImageIcon image = new ImageIcon("src/main/java/za/co/wethinkcode/Interface/img/hero.jpg");
        Border border = BorderFactory.createLineBorder(new Color(46,143,94), 3);

        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("LET THE ROBOT WARS BEGIN");
        label.setForeground(new Color(46, 143, 94));
        label.setFont(new Font("Robot",Font.BOLD,24));
        label.setIconTextGap(20);
        label.setBackground(new Color(24,24,24));
        label.setOpaque(true);
        label.setBorder(border);

        label.setHorizontalAlignment(JLabel.CENTER);
       
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        frame.add(label);
        frame.setVisible(true);
    }
}
