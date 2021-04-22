package com.company;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LineInTheMiddle {
  public static void drawImage(Graphics graphics) {
    //draw a red horizontal line to the canvas' middle
    //draw a green horizontal line to the canvas' middle

    graphics.setColor(Color.ORANGE);
    graphics.drawLine(10,50,310,50);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(10,100,310,100);



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
