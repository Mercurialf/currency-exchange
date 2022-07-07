import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentFrame extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 255;
    static final int SCREEN_HEIGHT = 380;
    JTextField mainTextField;

    JButton[] button = new JButton[6];
    String[] currencies = {"USD", "EUR", "UAH", "RUB", "PLN", "JPY"};

    ContentFrame(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(new Color(0xE3BDB4));
        this.setLayout(null);

        mainTextField = new JTextField();
        mainTextField.setBounds(10,10,220,50);

        // ----- Buttons -----
        for(int i = 0; i < 6; i++) {
            button[i] = new JButton(currencies[i]);
            switch (i) {
                case 0 -> button[i].setBounds(10, 70, 70, 30);
                case 1 -> button[i].setBounds(85, 70, 70, 30);
                case 2 -> button[i].setBounds(160, 70, 70, 30);
                case 3 -> button[i].setBounds(10, 105, 70, 30);
                case 4 -> button[i].setBounds(85, 105, 70, 30);
                case 5 -> button[i].setBounds(160, 105, 70, 30);
            }
            button[i].setLayout(null);
            button[i].addActionListener(this);
            this.add(button[i]);
        }
        // ----- Buttons -----

        this.add(mainTextField);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button[0]) {
            mainTextField.setText("Test");
        }
    }
}
