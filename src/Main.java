import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
//            Buat JFrame
            JFrame frame = new JFrame("Menggambar Kabah");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(550, 550);
            frame.setLocationRelativeTo(null);

//            Buat JPanel
            Kabah image = new Kabah();
            image.setBackground(Color.WHITE);
            frame.add(image);


//            Tampilkan Frame
            frame.setVisible(true);
        });
    }
}