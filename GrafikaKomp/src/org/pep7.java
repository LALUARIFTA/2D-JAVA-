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
 * @author ~Muliana Safitri
 */
public class pep7 extends JFrame {

    public pep7() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void b1(Graphics g) {

        int x = 3;

        int x1 = 20;
        int y1 = 100;
        int x2 = 40;
        int y2 = 40;

        int q1 = 20;
        int w1 = 65;
        int q2 = 40;
        int w2 = 40;

        int q3 = 20;
        int w3 = 135;
        int q4 = 40;
        int w4 = 40;

        while (x >= 1) {
            x1 = x1 + 130;
            q1 = q1 + 130;
            q3 = q3 + 130;

            x = x - 1;

            g.setColor(Color.pink);
            g.fillOval(115, 100, 40, 40);
            g.fillOval(185, 100, 40, 40);

            g.fillOval(185, 100, 40, 40);
            g.fillOval(245, 100, 40, 40);

            g.fillOval(315, 100, 40, 40);
            g.fillOval(375, 100, 40, 40);

            g.fillOval(445, 100, 40, 40);

            g.fillOval(q1, w1, q2, w2);
            g.fillOval(q3, w3, q4, w4);

            g.setColor(Color.red);
            g.fillOval(x1, y1, x2, y2);
        }
    }

    public void b2(Graphics g) {

        int x = 3;

        int x1 = 20;
        int y1 = 230;
        int x2 = 40;
        int y2 = 40;

        int q1 = 20;
        int w1 = 195;
        int q2 = 40;
        int w2 = 40;

        int q3 = 20;
        int w3 = 265;
        int q4 = 40;
        int w4 = 40;

        while (x >= 1) {
            x1 = x1 + 130;
            q1 = q1 + 130;
            q3 = q3 + 130;

            x = x - 1;

            g.setColor(Color.pink);
            g.fillOval(115, 230, 40, 40);
            g.fillOval(185, 230, 40, 40);

            g.fillOval(185, 230, 40, 40);
            g.fillOval(245, 230, 40, 40);

            g.fillOval(315, 230, 40, 40);
            g.fillOval(375, 230, 40, 40);

            g.fillOval(445, 230, 40, 40);

            g.fillOval(q1, w1, q2, w2);
            g.fillOval(q3, w3, q4, w4);

            g.setColor(Color.red);
            g.fillOval(x1, y1, x2, y2);
        }
    }

    public void b3(Graphics g) {

        int x = 3;

        int x1 = 20;
        int y1 = 360;
        int x2 = 40;
        int y2 = 40;

        int q1 = 20;
        int w1 = 325;
        int q2 = 40;
        int w2 = 40;

        int q3 = 20;
        int w3 = 395;
        int q4 = 40;
        int w4 = 40;

        while (x >= 1) {
            x1 = x1 + 130;
            q1 = q1 + 130;
            q3 = q3 + 130;

            x = x - 1;

            g.setColor(Color.pink);
            g.fillOval(115, 360, 40, 40);
            g.fillOval(185, 360, 40, 40);

            g.fillOval(185, 360, 40, 40);
            g.fillOval(245, 360, 40, 40);

            g.fillOval(315, 360, 40, 40);
            g.fillOval(375, 360, 40, 40);

            g.fillOval(445, 360, 40, 40);

            g.fillOval(q1, w1, q2, w2);
            g.fillOval(q3, w3, q4, w4);

            g.setColor(Color.red);
            g.fillOval(x1, y1, x2, y2);
        }
    }

    public void paint(Graphics g) {
        b1(g);
        b2(g);
        b3(g);
    }

    public static void main(String[] args) {
        pep7 gambar = new pep7();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
