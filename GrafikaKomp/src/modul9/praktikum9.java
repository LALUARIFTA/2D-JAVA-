/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

/**
 *
 * @author gawah
 */
public class praktikum9 extends JFrame {

    public praktikum9() {
        super("Proyeksi");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath gp = new GeneralPath();

        //--- Koordinat Objek 3 Dimensi
        int x1 = 100, y1 = 500 - 200, z1 = 0,
                x2 = 300, y2 = 500 - 200, z2 = 0,
                x3 = 300, y3 = 500 - 200, z3 = 300,
                x4 = 100, y4 = 500 - 200, z4 = 300,
                x5 = 80, y5 = 100, z5 = 200,
                x6 = 240, y6 = 100, z6 = 200,
                x7 = 240, y7 = 240, z7 = 200,
                x8 = 97, y8 = 150, z8 = 320,
                x9 = 290, y9 = 150, z9 = 320,
                x10 = 97, y10 = 150, z10 = 320,
                x11 = 70, y11 = 85, z11 = 320,
                x112 = 205, y112 = 85, z112 = 320
                
                ;

        double E = 1000;

        double x12D = (int) (x1 / (1 - (z1 / E)));
        double y12D = (int) (y1 / (1 - (z1 / E)));

        double x22D = (int) (x2 / (1 - (z2 / E)));
        double y22D = (int) (y2 / (1 - (z2 / E)));

        double x32D = (int) (x3 / (1 - (z3 / E)));
        double y32D = (int) (y3 / (1 - (z3 / E)));

        double x42D = (int) (x4 / (1 - (z4 / E)));
        double y42D = (int) (y4 / (1 - (z4 / E)));

        double x52D = (int) (x5 / (1 - (z5 / E)));
        double y52D = (int) (y5 / (1 - (z5 / E)));

        double x62D = (int) (x6 / (1 - (z6 / E)));
        double y62D = (int) (y6 / (1 - (z6 / E)));

        double x72D = (int) (x7 / (1 - (z7 / E)));
        double y72D = (int) (y7 / (1 - (z7 / E)));

        double x82D = (int) (x8 / (1 - (z8 / E)));
        double y82D = (int) (y8 / (1 - (z8 / E)));

        double x92D = (int) (x9 / (1 - (z9 / E)));
        double y92D = (int) (y9 / (1 - (z9 / E)));
        
        double x10D = (int) (x10 / (1 - (z10 / E)));
        double y10D = (int) (y10 / (1 - (z10 / E)));
        
        double x11D = (int) (x11 / (1 - (z11 / E)));
        double y11D = (int) (y11 / (1 - (z11 / E)));
        
        double x112D = (int) (x112 / (1 - (z112 / E)));
        double y112D = (int) (y112 / (1 - (z112 / E)));

        g2d.setColor(Color.red);

        //(kubus bagian bawah) 
        //garis kotak atas
        gp.moveTo(x12D, y12D);
        //garis kotak kanan
        gp.lineTo(x22D, y22D);

        gp.lineTo(x32D, y32D);
        //garis kotak bawah
        gp.lineTo(x42D, y42D);
        //garis kotak kiri
        gp.lineTo(x12D, y12D);

        //(kubus bagian belakang)
        //garis vertikal atas kiri
        gp.lineTo(x52D, y52D);
        //garis horizontal atas
        gp.lineTo(x62D, y62D);
        //garis vertikal kanan
        gp.lineTo(x72D, y72D);

        //vertikal kiri depan
        gp.moveTo(x82D, y32D);
        gp.lineTo(x82D, y82D);
        //vertikal kanan depan
        gp.moveTo(x92D, y32D);
        gp.lineTo(x92D, y92D);
        //horizontal atas depan
        gp.moveTo(x32D, y10D);
        gp.lineTo(x10D, y10D);
        
        //kiri atas
        gp.lineTo(x11D, y11D);
        //kanan atas
        gp.moveTo(x32D, y10D);
        gp.lineTo(x112D, y112D);
        
        g2d.draw(gp);

    }

    public static void main(String[] args) {
        praktikum9 gambar = new praktikum9();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
