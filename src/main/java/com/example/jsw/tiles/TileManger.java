package com.example.jsw.tiles;

import java.awt.Graphics2D;
import java.io.File;

import javax.imageio.ImageIO;

import com.example.jsw.GamePanel;

public class TileManger {
    GamePanel gp;
    Tile[] tile;

    public TileManger(GamePanel gp){
        this.gp = gp;
        tile = new Tile[10];
        getTileImage();
    }

    public void getTileImage(){
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(new File("src/main/java/com/example/jsw/tiles/image/grass.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(new File("src/main/java/com/example/jsw/tiles/image/wall.png"));
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(new File("src/main/java/com/example/jsw/tiles/image/water.png"));

        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2){
        g2.drawImage(tile[0].image,0,0,gp.tileSize,gp.tileSize,null);
        g2.drawImage(tile[1].image,48,0,gp.tileSize,gp.tileSize,null);
        g2.drawImage(tile[2].image,96,0,gp.tileSize,gp.tileSize,null);
    }
}
