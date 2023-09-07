package org.example;

import components.Dino;
import components.GamePanel;
import components.Ground;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame mainWindow = new JFrame("Dino");
    public static int WIDTH = 800;
    public static int HEIGHT = 500;

    public void createAndShowUI() {
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = mainWindow.getContentPane();
        GamePanel gamePanel = new GamePanel(WIDTH, HEIGHT);
        gamePanel.addKeyListener(gamePanel);
        gamePanel.setFocusable(true);
        container.setLayout(new BorderLayout());
        container.add(gamePanel, BorderLayout.CENTER);
        mainWindow.setSize(WIDTH, HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);
        Dino rex = new Dino();
        rex.setJumpFactor(29);
        Ground ground = new Ground(HEIGHT);
        gamePanel.setObstacleIntervalAndSpeed(300, 20);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().createAndShowUI();
            }
        });

    }


}