package oop;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GameFrame extends JPanel{

    ArrayList<Entita> entitaArrayList = new ArrayList<>();
    public GameFrame(){
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int x = rand.nextInt(0,600) + 1;
            int y = rand.nextInt(0,600) + 1;

            entitaArrayList.add(new Entita(x,y,100,100));
        }

        new Timer(16, e -> {
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        for (Entita entita : entitaArrayList){
            g.setColor(entita.getColor());
            g.fillRect(entita.getX(),entita.getY(),entita.getW(),entita.getH());
        }

    }
}
