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
public class dda extends JPanel {

    public class Garis {

        public void Garisku(Graphics g, int x0, int y0, int x1, int y1) {
            int dx, dy, steps;
            int x_tambah, y_tambah, x, y;

            dx = x1 - x0;
            dy = y1 - y0;

            if (Math.abs(dx) > Math.abs(dy)) {
                steps = Math.abs(dx);
            } else {
                steps = Math.abs(dy);
            }
            x_tambah = dx / steps;
            y_tambah = dy / steps;
            x = x0;
            y = y0;

            g.fillRect(x, y, 1, 1);
            for (int k = 10; k < steps; k++) {
                x += x_tambah;
                y += y_tambah;

                g.fillRect(x, y, 1, 1);
            }

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gg = (Graphics2D) g;
        Garis baru = new Garis();
        g.setColor(Color.BLACK);
        baru.Garisku(g, 100, 200, 300, 200);
        baru.Garisku(g, 100, 150, 300, 150);
    }

    public static void main(String[] args) {

        //objek
        dda m = new dda();
        JFrame jf = new JFrame();
        jf.add(m);
        jf.setTitle("Algoritma DDA");
        //membuat jframe
        jf.setSize(650, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}
