/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author gawah
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Praktikum7 extends JFrame {

    public Praktikum7() {
        super("Tugas7");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath gp = new GeneralPath();

        //--- Menggambar Area Visible
        int xmin = 200, ymin = 100, xmax = 600, ymax = 500;
        g2d.setPaint(Color.GREEN);
        gp.moveTo(xmin, ymin);
        gp.lineTo(xmax, ymin);
        gp.lineTo(xmax, ymax);
        gp.lineTo(xmin, ymax);
        gp.lineTo(xmin, ymin);
        g2d.draw(gp);

        //--- Menggambar garis
        int x1 = 100, y1 = 50, x2 = 700, y2 = 500;
        g2d.drawLine(x1, y1, x2, y2);

        // --- Menghitung Gradien Garis
        double m = (y2 - y1) / (x2 - x1);

        //--- Menghitung titik potong 
        int xp1 = (int) (x1 + ((ymax - y1) / m));
        int yp2 = (int) (y1 + (m * (xmin - x1)));

        //--- Memotong Garis 
        g2d.drawLine(xmin, yp2, xp1, ymax);
    }

    public static void main(String[] args) {
        Praktikum7 gambar = new Praktikum7();

        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
