package com.pacman_project;

import java.awt.*;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize( 760, 435);
        setResizable(false);
        setLocationRelativeTo(null);
//        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice device = graphics.getDefaultScreenDevice();
//        device.setFullScreenWindow(this);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Pacman ex = new Pacman();
            ex.setVisible(true);
        });
    }
}