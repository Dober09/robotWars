package com.example.jsw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.example.jsw.entity.Player;
import com.example.jsw.tiles.TileManger;

public class GamePanel  extends JPanel implements Runnable{
    // Screen Setting
    final int originalTileSize = 16;
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; //48*48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    final int screenWidth = tileSize * maxScreenCol;  // 760 px;
    final int screenHeight = tileSize * maxScreenRow; // 576 px

    Thread gameThread;
    TileManger tileM = new TileManger(this);
    KeyHandler KeyH = new KeyHandler();
    Player player = new Player(this, KeyH);

    //player default position
    // int playerX = 100;
    // int playerY = 100;
    // int playerSpeed = 4;
    
    // FPS
    int FPS = 60;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(KeyH);
        this.setFocusable(true);
    }


    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){
        double drawInterval =  1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long current;
        while (gameThread != null) {
            current = System.nanoTime();
            delta += (current -lastTime) / drawInterval;
            lastTime = current;

            if(delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }

   
public void update(){
    player.update();
}

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        tileM.draw(g2);
        player.draw(g2);
        g2.dispose();
    }
}
