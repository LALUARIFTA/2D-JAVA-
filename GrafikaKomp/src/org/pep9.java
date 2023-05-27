/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author gawah
 */
public class pep9 extends JFrame {

    int xc = 0, yc = 0;
    int xc1 = 0, yc1 = 0;
    int xc2 = 0, yc2 = 0;
    int xc3 = 0, yc3 = 0;

    public pep9() {
        setSize(600, 600);

        xc = (int) (getWidth() / 1.0);  //mata
        yc = (int) (getHeight() / 1.5);

        xc1 = (int) (getWidth() / 2.0); //mata
        yc1 = (int) (getHeight() / 1.5);

        xc2 = (int) (getWidth() / 2); //pupil kiri
        yc2 = (int) (getHeight() / 1.5);

        xc3 = (int) (getWidth() / 1); //pupil kanan
        yc3 = (int) (getHeight() / 1.5);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void mata1(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.white);
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

        g.setColor(Color.white);
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
        int r = 40, x = 0, y = 0;

        g.setColor(Color.blue);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void pupil1(Graphics g) {
        int r = 15, x = 0, y = 0;

        g.setColor(Color.black);
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
        int r = 40, x = 0, y = 0;

        g.setColor(Color.blue);
        do {
            r = r - 1;
            for (int i = 0; i <= 5600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc3);
                y = (int) ((Math.sin((int) i) * r) + yc3);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void pupil22(Graphics g) {
        int r = 15, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 15600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc3);
                y = (int) ((Math.sin((int) i) * r) + yc3);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 1);

    }

    public void mulut(Graphics g) {
        g.fillRect(370, 600, 170, 10);   //bibir

        g.fillRect(400, 600, 50, 50);   //kumis kanan 1
        g.fillRect(470, 600, 50, 50);   //kumis kanan 1

        g.fillOval(430, 500, 160, 40);
        g.setColor(Color.yellow);
        g.fillOval(400, 510, 160, 20); //HIDUNG DALAM

    }

    public void kulit(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(150, 150, 600, 600);   //badan

    }



    public void paint(Graphics g) {

        kulit(g);
        mata1(g);
        mata2(g);

        pupil(g);

        pupi2(g);
        pupil1(g);
        pupil22(g);
        mulut(g);

    }

    public static void main(String[] args) {
        pep9 gambar = new pep9();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
