import javax.swing.*;
import java.awt.*;

public class DrawImage extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        Cast ke Graphics2D untuk filter lebih advanced
        Graphics2D g2d = (Graphics2D) g;

//        Set anti-aliasing untuk garis lebih halus
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

//        Gambar garis horizontal
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(50, 50, 350, 50);

        // Gambar garis vertikal
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(100, 100, 100, 300);

        // Gambar garis diagonal
        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(4));
        g2d.drawLine(150, 100, 350, 300);

        // Gambar beberapa garis membentuk pola
        g2d.setColor(Color.ORANGE);
        g2d.setStroke(new BasicStroke(1));
        for (int i = 0; i < 10; i++) {
            g2d.drawLine(200, 150 + i * 10, 300, 150 + i * 10);
        }

        // Gambar garis dengan warna gradasi
        g2d.setStroke(new BasicStroke(5));
        for (int i = 0; i < 5; i++) {
            g2d.setColor(new Color(255, 50 * i, 100));
            g2d.drawLine(50, 350 + i * 10, 350, 350 + i * 10);
        }
    }


}
