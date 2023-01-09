package com.zetcode;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class magnify extends JFrame {

    // object
    static magnify m;

    // image
    Image i;

    // default constructor
    magnify()
    {
        // create a frame
        super("magnify");

        // set size of frame
        setSize(200, 220);
        show();

        // function to magnify the image
        work();
    }

    // main function
    public static void main(String args[])
    {

        // object of class
        m = new magnify();
    }

    public void work()
    {
        try {
            // create a robot
            Robot r = new Robot();

            // while the frame is visible
            while (isVisible()) {
                // get the position of mouse
                Point p = MouseInfo.getPointerInfo().getLocation();

                // create a screen capture around the mouse pointer
                i = r.createScreenCapture(new Rectangle((int)p.getX() - 30,
                        (int)p.getY() - 30, 150, 150));

                // repaint the container
                repaint();
            }
            // exit the program
            System.exit(0);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // paint function
    public void paint(Graphics g)
    {

        // draw the image
        g.drawImage(i, 0, 0, 300, 300, this);
    }
}