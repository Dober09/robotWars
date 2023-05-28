package com.example.jsw.entity;


import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.example.jsw.GamePanel;
import com.example.jsw.KeyHandler;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp , KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 4;
        direction = "up";
    }


    public void getPlayerImage(){
        try {
            up1 = ImageIO.read(new File("src/main/java/com/example/jsw/playerA/Hull_north.png"));
            down1 = ImageIO.read(new File("src/main/java/com/example/jsw/playerA/Hull_south.png"));
            right1 = ImageIO.read(new File("src/main/java/com/example/jsw/playerA/Hull_right.png"));
            left1 = ImageIO.read(new File("src/main/java/com/example/jsw/playerA/Hull_left.png"));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public void update() {
        if (keyH.upPressed == true) {
            direction = "up";
            y -= speed;
        } else if (keyH.downPressed == true) {
            direction = "down";
            y += speed;
        } else if (keyH.leftPressed == true) {
            direction = "left";
            x -= speed;
        } else if (keyH.rightPressed == true) {
            direction = "right";
            x += speed;
        }
    }

    public void draw(Graphics2D g2){
        
        BufferedImage image = null;
        switch(direction){
            case "up":
                image = up1;
                break;
            case "down":
                image = down1;
                break;
            case "left":
                image = left1;
                break;
            case "right":
                image = right1;
                break;
            default:
                break;
        }

        g2.drawImage(image,x,y,gp.tileSize,gp.tileSize,null);
    }
    
}
