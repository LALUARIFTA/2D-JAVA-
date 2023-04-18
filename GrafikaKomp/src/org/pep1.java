/*
 * 
 * 
 * lalu arif trasna ashari(2101010007)
 */
package org;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class pep1 extends JFrame {

    int xc = 0, yc = 0;
    int xc1 = 0, yc1 = 0;
    int xc2 = 0, yc2 = 0;

    public pep1() {

        setSize(600, 600);

        xc = (int) (getWidth() / 2.2);
        yc = getHeight() / 2;

        xc1 = (int) (getWidth() / 1.15);
        yc1 = getHeight() / 2;

        xc2 = (int) (getWidth() / 1.7);
        yc2 = getHeight() / 2;

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void border1(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL1(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.red);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void border2(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc1);
                y = (int) ((Math.sin((int) i) * r) + yc1);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL2(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.red);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc1);
                y = (int) ((Math.sin((int) i) * r) + yc1);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void pupil(Graphics g) {

        g.setColor(Color.BLACK);

        g.fillOval(250, 230, 30, 150);
    }

    public void pupil2(Graphics g) {

        g.setColor(Color.BLACK);

        g.fillOval(500, 230, 30, 150);
    }

    public void kepala(Graphics g) {
        int r = 300, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 290);

    }

    public void warnamuka(Graphics g) {
        int r = 300, x = 0, y = 0;

        g.setColor(Color.ORANGE);
        do {
            r = r - 1;
            for (int i = 0; i <= 8600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void mulut(Graphics g) {

        g.setColor(Color.BLACK);

        g.fillOval(350, 430, 120, 50);

    }

    public void border3(Graphics g) {
        int r = 300, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 290);

    }

    public void badan(Graphics g) {

        g.setColor(Color.BLUE);
        g.fillRect(220, 620, 300, 300);   //badan
        g.fillRect(330, 590, 80, 80);   //leher
        g.fillRect(130, 620, 90, 80);   //bahu kiri
        g.fillRect(520, 620, 90, 80);   //bahu kiri
        g.setColor(Color.lightGray);
        g.fillRect(610, 620, 80, 80);   //lengan kiri
        g.fillRect(90, 620, 80, 80);   //lengan kanan

    }

    public void paint(Graphics g) {

        kepala(g);
        warnamuka(g);

        //badan
        border3(g);
        badan(g);

        //lingkaran kiri
        border1(g);
        lingkaranPL1(g);
        pupil(g);

        //lingkarankanan
        border2(g);
        lingkaranPL2(g);
        pupil2(g);

        mulut(g);

    }

    public static void main(String[] args) {
        pep1 gambar = new pep1();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
