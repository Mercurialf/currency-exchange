import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    static final int SCREEN_WIDTH = 255;
    static final int SCREEN_HEIGHT = 380;

    AppFrame() {

        this.setTitle("Currency");
        this.setSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(new Color(0xC2B092));
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
