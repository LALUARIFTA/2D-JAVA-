/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package modul12;

/**
 *
 * @author gawah
 */
import java.awt.*;
import java.awt.event.*;

public class praktikum12 extends Frame implements Runnable {

    Thread animation;
    int frameDelay = 100;
    Image frames[];
    int numFrames;
    int currentFrame = 0;
    long lastDisplay = 0;
    int screenWidth = 600;
    int screenHeight = 600;

    public static void main(String[] args) {
        praktikum12 app = new praktikum12();

    }

    public praktikum12() {
        super("Animasi Grafik");
        setup();
        setSize(screenWidth, screenHeight);
        addWindowListener(new WindowEventHandler());
        show();
        animation = new Thread(this);
        animation.start();
    }

    void setup() {
        setupMenuBar();
        setFont(new Font("default", Font.BOLD, 18));
        Toolkit toolkit = getToolkit();
        frames = new Image[11];
        // objek yang akan ditampilkan
        frames[0] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman1.jpg");
        frames[1] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman2.jpg");
        frames[2] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman3.jpg");
        frames[3] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman4.jpg");
        frames[4] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman5.jpg");
        frames[5] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman6.jpg");
        frames[6] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman7.jpg");
        frames[7] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman8.jpg");
        frames[8] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman1.jpg");
        frames[9] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman2.jpg");
        frames[10] = toolkit.getImage("C:\\Users\\gawah\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\GrafikaKomp\\src\\Image\\stickman1.jpg");

        numFrames = frames.length;
    }

    void setupMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem fileExit = new MenuItem("Exit");
        fileExit.addActionListener(new MenuItemHandler());
        fileMenu.add(fileExit);
        menuBar.add(fileMenu);
        setMenuBar(menuBar);
    }

    public void paint(Graphics g) {
        g.drawImage(frames[currentFrame], 125, 80, this);
    }

    public void run() {
        // Perulangan animasi
        do {
            long time = System.currentTimeMillis();
            if (time - lastDisplay > frameDelay) {
                repaint();
                try {
                    Thread.sleep(frameDelay);
                } catch (InterruptedException ex) {
                }
                ++currentFrame;
                currentFrame %= numFrames;
                lastDisplay = time;
            }
        } while (true);
    }

    class MenuItemHandler implements ActionListener, ItemListener {

        public void actionPerformed(ActionEvent ev) {
            String s = ev.getActionCommand();
            if (s == "Exit") {
                System.exit(0);
            }
        }

        public void itemStateChanged(ItemEvent e) {
        }
    }
//Kelas yang digunakan agar tombol close pada frame bisa berfungsi

    class WindowEventHandler extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
