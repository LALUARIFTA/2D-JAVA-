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
public class tugas3 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gd = (Graphics2D) g;

        //persegi
        gd.drawLine(300, 300, 60, 300);   //bawah
        gd.drawLine(60, 60, 60, 300);     //kiri
        gd.drawLine(300, 60, 300, 300);   //kanan
        gd.drawLine(60, 60, 300, 60);     //atas

        //silang antar ujung
        gd.drawLine(60, 60, 300, 300);    //miring membelah kiri atas ke bawah kanan
        gd.drawLine(60, 300, 300, 60);    //miring membelah kanan atas ke bawah kiri

        //segitiga sama kaki
        gd.drawLine(280, 290, 80, 290);     //alas
        gd.drawLine(80, 290, 180, 200);     //kiri
        gd.drawLine(280, 290, 180, 200);    //kanan

        //segitiga sama kaki kebalik
        gd.drawLine(280, 70, 80, 70);       //alas
        gd.drawLine(180, 160, 78, 68);      //kiri
        gd.drawLine(280, 70, 180, 160);     //kanan
    }

    public static void main(String[] args) {
        //objek
        tugas3 m = new tugas3();
        JFrame jf = new JFrame();
        jf.add(m);
        jf.setTitle("persegi dan segitiga");
        //membuat jframe
        jf.setSize(650, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}
