package oop;

import javax.swing.*;

public class Game extends JFrame {

    public Game() {
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("OOP");
        setResizable(false);

        GameFrame gameFrame = new GameFrame();
        add(gameFrame);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Game().setVisible(true);
        });
    }
}