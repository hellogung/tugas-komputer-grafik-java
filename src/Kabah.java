import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Kabah extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Background putih
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Set warna hitam dan ketebalan garis
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));

        // Posisi Ka'bah
        int x = 150;
        int y = 150;
        int w = 200;
        int h = 200;

        // Badan Ka'bah (depan)
        g2d.drawRect(x, y, w, h);

        // Sisi atas (perspektif 3D)
        g2d.drawLine(x, y, x + 40, y - 40);
        g2d.drawLine(x + w, y, x + w + 40, y - 40);
        g2d.drawLine(x + 40, y - 40, x + w + 40, y - 40);

        // Sisi samping kanan
        g2d.drawLine(x + w, y, x + w + 40, y - 40);
        g2d.drawLine(x + w, y + h, x + w + 40, y + h - 40);
        g2d.drawLine(x + w + 40, y - 40, x + w + 40, y + h - 40);

        // Pintu Ka'bah
        g2d.drawRect(x + 70, y + 120, 60, 80);

        // Hajar Aswad (lingkaran di sudut)
        g2d.drawOval(x + w - 40, y + 140, 30, 30);
    }
}