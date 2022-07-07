import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    static final int SCREEN_WIDTH = 255;
    static final int SCREEN_HEIGHT = 380;

    AppFrame() {

        this.add(new ContentFrame());
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setTitle("Currency");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
