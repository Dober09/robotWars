package com.example.jsw.Interface;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends  JFrame implements ActionListener{
    JButton launchBtn ;
    public Frame(){
        launchBtn = new JButton("Start Game");
        launchBtn.setBackground(new Color(46, 143, 94));
        launchBtn.setBounds(390, 620, 150, 50);
        launchBtn.setForeground(new Color(24,24,24));
        launchBtn.setFocusable(false);
        launchBtn.addActionListener(this);

        
        this.setTitle("Robot Wars");
        this.setSize(920,920);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    
        ImageIcon icon= new ImageIcon("src/main/java/za/co/wethinkcode/Interface/img/log.png");
        this.setIconImage(icon.getImage());
        this.add(launchBtn);
        this.getContentPane().setBackground(new Color(24,24,24));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == launchBtn){
            dispose();
            System.out.println("launch command");
            LauchPage lauchPage = new LauchPage();
            lauchPage.setVisible(true);
        }
    }

}
