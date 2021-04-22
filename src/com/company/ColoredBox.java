package com.company;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColoredBox {

  public static void drawImage(Graphics graphics) {
    // Draw a box that has different colored lines on each edge

    graphics.setColor(Color.ORANGE);
    graphics.drawLine(10,10,310,10);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(310,10,310,310);

    graphics.setColor(Color.red);
    graphics.drawLine(310,310,10,310);

    graphics.setColor(Color.BLUE);
    graphics.drawLine(10,10,10,310);





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