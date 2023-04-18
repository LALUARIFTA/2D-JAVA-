/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gawah
 */
public class tugas1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gd = (Graphics2D) g;
        gd.drawLine(300, 300, 60, 300);   //bawah
        gd.drawLine(60, 60, 60, 300);     //kiri
        gd.drawLine(60, 60, 300, 300);    //miring membelah kiri atas ke bawah kanan

    }

    public static void main(String[] args) {
        //objek
        tugas1 m = new tugas1();
        JFrame jf = new JFrame();
        jf.add(m);
        jf.setTitle("Segitiga Siku-siku");
        //membuat jframe
        jf.setSize(650, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
