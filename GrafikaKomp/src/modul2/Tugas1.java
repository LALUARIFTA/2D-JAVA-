/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gawah
 */
public class Tugas1 extends JPanel {

    public void paint(Graphics g) {

        int xwc1 = 2, ywc1 = 10, xwc2 = 4, ywc2 = -12;    // Word koord titik ujung garis 
        int wl = -20, wr = 50, wb = 80, wt = -10;                // batas ukuran window
//        int xwc1 = -20, ywc1 = 50, xwc2 = 80, ywc2 = -10;    // Word koord titik ujung garis 
//        int wl = 2, wr = 10, wb = 4, wt = 12;                // batas ukuran window

        int vl = 100, vr = 200, vt = 50, vb = 250;           // batas ukuraan vieport
        int xsc1 = -10, ysc1 = -5, xsc2 = 40, ysc2 = 60;     // Screen koord titik ujung garis


        // Menghitung konversi 
        int sx = (vr - vl) / (wr - wl);
        int sy = (vt - vb) / (wt - wb);
        int tx = ((vl * wr) - (wl * vr)) / (wr - wl);
        int ty = ((vb * wt) - (wb * vt)) / (wt - wb);

        xsc1 = (sx * xwc1) + tx;
        ysc1 = (sy * ywc1) + ty;

        xsc2 = (sx * xwc2) + tx;
        ysc2 = (sy * ywc2) + ty;

        super.paint(g);                     //memanggil judul (super) pada gambar
        g.setColor(Color.RED);              //memberikan warna merah pada garis
        g.drawRect(vl, vt, vr, vb);         // gambar segi empat viewport
        g.drawLine(xsc1, ysc1, xsc2, ysc2); //(x1,y1, x2,y2)

    }

    public static void main(String[] args) {
        //objek
        Tugas1 m = new Tugas1();
        JFrame jf = new JFrame();
        jf.add(m);
        jf.setTitle("Tugas 1 Moudul 2");
        //membuat jframe
        jf.setSize(650, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
