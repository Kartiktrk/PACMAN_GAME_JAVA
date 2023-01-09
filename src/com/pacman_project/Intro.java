package com.pacman_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;

public class Intro {
    public static void main(String[] args) throws IOException, FontFormatException {
        ShowIntro w = new ShowIntro();
    }
}


class ShowIntro extends JFrame{

    Font Lot;
    static Font CrackMan;
    Font video;
    public ShowIntro() throws IOException, FontFormatException {
        Lot = Font.createFont(Font.TRUETYPE_FONT , new File("Lot.otf"));
        GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        g.registerFont(Font.createFont(Font.TRUETYPE_FONT , new File("Lot.otf")));
        CrackMan = Font.createFont(Font.TRUETYPE_FONT , new File("CrackMan.TTF"));
        g.registerFont(Font.createFont(Font.TRUETYPE_FONT , new File("CrackMan.TTF")));
        video = Font.createFont(Font.TRUETYPE_FONT , new File("videobeast80s.TTF"));
        g.registerFont(Font.createFont(Font.TRUETYPE_FONT , new File("videobeast80s.TTF")));
        JLabel q = new JLabel("Learn with PAC-MAN");
        JButton leaderboard = new JButton("LeaderBoard");
        JButton newgame = new JButton("New Game");
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.black);
        leaderboard.setFont(new Font("Lot", Font.PLAIN, 20));
        newgame.setFont(new Font("Lot" , Font.PLAIN, 20));
        leaderboard.setBackground(Color.black);
        leaderboard.setForeground(Color.yellow);
        newgame.setBackground(Color.black);
        newgame.setForeground(Color.yellow);
        q.setFont(new Font("CrackMan", Font.PLAIN, 35));
        q.setBackground(Color.black);
        q.setForeground(Color.yellow);
        q.setBounds(410 , 20 , 500 , 100);
        setSize(1800, 900);
        Dimension size = leaderboard.getPreferredSize();
        leaderboard.setBounds(470 , 250 , 300 , 100);
        newgame.setBounds(470 , 400 , 300 , 100);


        BufferedImage myPicture = ImageIO.read(new File("maze.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setBounds(5, 220 , 300 , 300);


        BufferedImage burger = ImageIO.read(new File("burg.png"));
        JLabel junkfood = new JLabel(new ImageIcon(burger));
        junkfood.setBounds(895 , 250 , 300 , 300);

        BufferedImage fruits = ImageIO.read(new File("healthy.jpg"));
        JLabel healthy = new JLabel(new ImageIcon(fruits));
        healthy.setBounds(450, 20 , 300 , 300);

        BufferedImage chery = ImageIO.read(new File("cherry.png"));
        JLabel cherry = new JLabel(new ImageIcon(chery));
        cherry.setBounds(50 , 100 , 200 , 200);

        BufferedImage appl = ImageIO.read(new File("apple.png"));
        JLabel apple = new JLabel(new ImageIcon(appl));
        apple.setBounds(930 , 100 , 200 , 200);


        add(picLabel);
        add(junkfood);
        add(healthy);
        add(cherry);
        add(apple);
        add(q);
        add(leaderboard);
        add(newgame);
        setSize(1280,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leaderboard.addActionListener(e -> {
            Leaderboard t = null;
            try {
                t = new Leaderboard();
            } catch (Exception r) {

            }
        });
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> {
                    try {
                        new ShowLevels();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (FontFormatException ex) {
                        throw new RuntimeException(ex);
                    }
                });
                dispose();
            }
        });
    }

}
