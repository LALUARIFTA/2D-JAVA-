/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gawah
 */
public class BresenhamAlgorithm extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gd = (Graphics2D) g;
        int x1 = 100;
        int x2 = 800;
        int y1 = 200;
        int y2 = 500;
        int x = x1;
        int y = y1;

        int dx = x2 - x1;
        int dy = y2 - y1;
        int d1 = 2 * dy;
        int d2 = 2 * (dx - dy);
        int p = d1 - dx;
        x = x1;
        y = y1;

        do {
            if (p >= 0) {
                p = p - d2;
                y = y + 1;
            } else {
                p = p + d1;
                y = y;

            }
            gd.setColor(Color.pink);
            gd.drawLine(x1, y1, x2, y2);
            x = x + 1;
        } while (x >= x2);
    }

    public static void main(String[] args) {
        //objek
        BresenhamAlgorithm m = new BresenhamAlgorithm();
        JFrame jf = new JFrame();
        jf.add(m);
        jf.setTitle("Algoritma Bresenham’s");
        //membuat jframe
        jf.setSize(650, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
