/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gawah
 */
public class LineEquation extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        int x1 = 50, x2 = 200, y1 = 50, y2 = 200, x = x1, y = y1;
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        double h = 0;

        g.setColor(Color.RED);
        while (x <= x2) {
            h = (m * x) + b;
            y = (int) h;
            g.drawLine(x, y, x, y);
            x++;

        }
    }

    public static void main(String[] args) {
        //objek
        LineEquation m = new LineEquation();
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
