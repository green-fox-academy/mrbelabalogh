package com.company;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToTheCenter {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Draw at least 3 lines with that function using a loop

    graphics.setColor(Color.ORANGE);
    graphics.drawLine(0,50,160,160);

    graphics.drawLine(0,50,160,160);
      for (int i=0; i<3; i++) {
        if (i == 1) {
          graphics.setColor(Color.BLUE);
          graphics.drawLine(0,i*160,160,160);
        }

        if (i == 2) {
          graphics.setColor(Color.GREEN);
          graphics.drawLine(0,i*320,160,160);
        }

      }






  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack(); }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);





    }


  }
}

