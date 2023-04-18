//gede bagus
package uts;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class test1 extends JFrame {

    int xc = 0, yc = 0;
    int xc1 = 0, yc1 = 0;
    int xc2 = 0, yc2 = 0;
    int xc3 = 0, yc3 = 0;
    int xc4 = 0, yc4 = 0;
//    int xc5 = 0, yc5 = 0;

    public test1() {
        super("Menggambar Lingkaran");
        setSize(600, 600);
        //tengah
        xc = getWidth() / 2;
        yc = getHeight() / 2;

        //atas
        xc1 = getWidth() / 2;
        yc1 = getHeight() / 4;

        //kiri
        xc2 = getWidth() / 4;
        yc2 = getHeight() / 2;

        //kanan
        xc3 = (int) (getWidth() / 1.32);
        yc3 = getHeight() / 2;
        //bswah
        xc4 = getWidth() / 2;
        yc4 = (int) (getHeight() / 1.32);

//        //kanan setengah bwah
//        xc5 = (int) (getWidth() / 1.5);
//        yc5 = (int) (getHeight() / 1.5);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void lingkaranPL01(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL1(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.red);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc);
                y = (int) ((Math.sin((int) i) * r) + yc);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void lingkaranPL02(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc1);
                y = (int) ((Math.sin((int) i) * r) + yc1);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL2(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.BLUE);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc1);
                y = (int) ((Math.sin((int) i) * r) + yc1);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void lingkaranPL03(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL3(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.BLUE);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc2);
                y = (int) ((Math.sin((int) i) * r) + yc2);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void lingkaranPL04(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc3);
                y = (int) ((Math.sin((int) i) * r) + yc3);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL4(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.BLUE);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc3);
                y = (int) ((Math.sin((int) i) * r) + yc3);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }

    public void lingkaranPL05(Graphics g) {
        int r = 105, x = 0, y = 0;

        g.setColor(Color.BLACK);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc4);
                y = (int) ((Math.sin((int) i) * r) + yc4);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 100);

    }

    public void lingkaranPL5(Graphics g) {
        int r = 100, x = 0, y = 0;

        g.setColor(Color.BLUE);
        do {
            r = r - 1;
            for (int i = 0; i <= 3600; i++) {
                x = (int) ((Math.cos((int) i) * r) + xc4);
                y = (int) ((Math.sin((int) i) * r) + yc4);
                g.drawLine(x, y, x, y);
            }
        } while (r >= 0);

    }
    


    public void paint(Graphics g) {

        lingkaranPL02(g);
        lingkaranPL2(g);

        lingkaranPL03(g);
        lingkaranPL3(g);

        lingkaranPL04(g);
        lingkaranPL4(g);

        lingkaranPL05(g);
        lingkaranPL5(g);

        //lingkaran tengah
        lingkaranPL01(g);
        lingkaranPL1(g);

    }

    public static void main(String[] args) {
        test1 gambar = new test1();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
