/*
 * jam
 * draw text
 */
package org;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

/**
 *
 * @author gawah
 */
public class pep5 extends JFrame {

    int xc = 0, yc = 0;

    public pep5() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        xc = (int) (getWidth() / 2.15);  //mata
        yc = (int) (getHeight() / 2.5);

    }

    public void kepala(Graphics g) {
        int r = 220, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 12600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 210);

    }

    public void kepala1(Graphics g) {
        int r = 10, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void warnakepala(Graphics g) {
        int r = 210, x = 0, y = 0;

        g.setColor(Color.YELLOW);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void jam(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        //
        Font font = new Font("Serif", Font.PLAIN, 60);
        g2.setFont(font);
        g2.drawString("12", 250, 100);
        //
        g2.setFont(font);
        g2.drawString("9", 100, 250);
        //
        g2.setFont(font);
        g2.drawString("6", 270, 400);
        //
        g2.setFont(font);
        g2.drawString("3", 430, 250);
        //
        g.fillRect(150, 235, 120, 10);   //kumis kanan 1
        g.fillRect(275, 235, 10, 80);   //kumis kanan 1
    }

    public void paint(Graphics g) {
        
        warnakepala(g);
        kepala(g);
        kepala1(g);
        jam(g);

    }

    public static void main(String[] args) {
        pep5 gambar = new pep5();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
