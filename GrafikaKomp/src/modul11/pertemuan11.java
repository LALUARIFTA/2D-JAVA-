/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author gawah
 */
public class pertemuan11 extends JFrame {

    public pertemuan11() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void travesiumatas(Graphics g) {
        int xbiru[] = {50, 300, 250, 100};
        int ybiru[] = {370, 370, 270, 270};
        int biru = xbiru.length;
        g.setColor(Color.red);
        g.fillPolygon(xbiru, ybiru, biru);
    }

    public void travesiumbawah(Graphics g) {
        int xbiru[] = {50, 300, 250, 100};
        int ybiru[] = {370, 370, 470, 470};
        int biru = xbiru.length;
        g.setColor(Color.red);
        g.fillPolygon(xbiru, ybiru, biru);
    }

    public void paint(Graphics g) {
        travesiumatas(g);
        travesiumbawah(g);
    }

    public static void main(String[] args) {
        pertemuan11 gambar = new pertemuan11();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
