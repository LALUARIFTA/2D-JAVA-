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
public class pep6 extends JFrame {

    public pep6() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(200, 190, 250, 60); // badan mobil 
        g.fillRect(270, 160, 150, 30); // atap mobil 
       
        g.setColor(Color.BLACK);
        g.fillOval(220, 220, 50, 50);   //ban kiri
        g.fillOval(380, 220, 50, 50);   //ban kanan
        
        g.setColor(Color.black);
        g.fillRect(280, 165, 25, 25); // jendela mobil 
        g.fillRect(310, 165, 25, 25); // jendela mobil 
        g.fillRect(340, 165, 25, 25); // jendela mobil 
        g.fillRect(370, 165, 25, 25); // jendela mobil 
    }

    public static void main(String[] args) {
        pep6 gambar = new pep6();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
