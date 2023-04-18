/*
 * 
 * 
 */
package org;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *  panda
 * @author Heldanurafidah
 */
public class pep4 extends JFrame {

    int xc = 0, yc = 0;
    int xc1 = 0, yc1 = 0;
    int xc2 = 0, yc2 = 0;
    int xc3 = 0, yc3 = 0;
    int xc4 = 0, yc4 = 0;
    int xc5 = 0, yc5 = 0;
    int xc6 = 0, yc6 = 0;
    int xc7 = 0, yc7 = 0;

    public pep4() {
        setSize(600, 600);

        xc = (int) (getWidth() / 1.0);  //mata
        yc = (int) (getHeight() / 1.5);

        xc1 = (int) (getWidth() / 2.0); //mata
        yc1 = (int) (getHeight() / 1.5);

        xc2 = (int) (getWidth() / 2); //pupil kiri
        yc2 = (int) (getHeight() / 1.5);

        xc3 = (int) (getWidth() / 1); //pupil kanan
        yc3 = (int) (getHeight() / 1.5);

        xc4 = (int) (getWidth() / 1.33); //hidung
        yc4 = (int) (getHeight() / 1.15);

        xc5 = (int) (getWidth() / 1.35); //kepala
        yc5 = (int) (getHeight() / 1.45);
        
        xc6 = (int) (getWidth() / 2.5); //telinga kiri
        yc6 = (int) (getHeight() / 2.5);
        
        xc7 = (int) (getWidth() / 0.9); //telinga kanan
        yc7 = (int) (getHeight() / 2.5);

        
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void mata1(Graphics g) {
        int r = 105, x = 0, y = 0;

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

    public void mata2(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc1);
                y = (int) ((Math.sin((int) i) * r) + yc1);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void pupil(Graphics g) {
        int r = 30, x = 0, y = 0;

        g.setColor(Color.white);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void pupi2(Graphics g) {
        int r = 30, x = 0, y = 0;

        g.setColor(Color.white);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc3);
                y = (int) ((Math.sin((int) i) * r) + yc3);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void hidung1(Graphics g) {
        int r = 50, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc4);
                y = (int) ((Math.sin((int) i) * r) + yc4);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void mulut(Graphics g) {

        g.setColor(Color.BLACK);

        g.fillOval(370, 600, 150, 40);

    }

    public void kepala(Graphics g) {
        int r = 300, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc5);
                y = (int) ((Math.sin((int) i) * r) + yc5);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 290);

    }

    public void kepalakulit(Graphics g) {
        int r = 290, x = 0, y = 0;

        g.setColor(Color.pink);
        do {
            r = r - 1;
            for (int i = 0; i <= 50000; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc5);
                y = (int) ((Math.sin((int) i) * r) + yc5);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    
    public void telingakiri(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc6);
                y = (int) ((Math.sin((int) i) * r) + yc6);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }
    public void telingakanan(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc7);
                y = (int) ((Math.sin((int) i) * r) + yc7);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }
    public void paint(Graphics g) {
        telingakiri(g);
        telingakanan(g);
        
        
        kepala(g);
        kepalakulit(g);
        
        mata1(g);
        mata2(g);

        pupil(g);
        pupi2(g);

        hidung1(g);

        mulut(g);

    }

    public static void main(String[] args) {
        pep4 gambar = new pep4();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
