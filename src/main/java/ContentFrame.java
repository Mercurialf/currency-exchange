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
    JLabel[] labelCurrencies = new JLabel[6];
    JTextField[] textFieldCurrencies = new JTextField[6];

    ContentFrame() {

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(new Color(0xE3BDB4));
        this.setLayout(null);

        mainTextField = new JTextField();
        mainTextField.setBounds(10, 10, 220, 50);

        // ----- Buttons -----
        for (int i = 0; i < 6; i++) {
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
            button[i].setFocusable(false);
            this.add(button[i]);
        }
        // ----- /Buttons -----

        // ----- LabelCurrencies -----
        for (int i = 0; i < 6; i++) {
            labelCurrencies[i] = new JLabel(currencies[i]);
            switch (i) {
                case 0 -> labelCurrencies[i].setBounds(10, 150, 80, 30);
                case 1 -> labelCurrencies[i].setBounds(10, 180, 80, 30);
                case 2 -> labelCurrencies[i].setBounds(10, 210, 80, 30);
                case 3 -> labelCurrencies[i].setBounds(10, 240, 80, 30);
                case 4 -> labelCurrencies[i].setBounds(10, 270, 80, 30);
                case 5 -> labelCurrencies[i].setBounds(10, 300, 80, 30);
            }
            labelCurrencies[i].setLayout(null);
            this.add(labelCurrencies[i]);
        }
        // ----- /LabelCurrencies -----

        // ----- textFieldCurrencies -----
        for (int i = 0; i < 6; i++) {
            textFieldCurrencies[i] = new JTextField("0.0");
            switch (i) {
                case 0 -> textFieldCurrencies[i].setBounds(50, 150, 180, 30);
                case 1 -> textFieldCurrencies[i].setBounds(50, 180, 180, 30);
                case 2 -> textFieldCurrencies[i].setBounds(50, 210, 180, 30);
                case 3 -> textFieldCurrencies[i].setBounds(50, 240, 180, 30);
                case 4 -> textFieldCurrencies[i].setBounds(50, 270, 180, 30);
                case 5 -> textFieldCurrencies[i].setBounds(50, 300, 180, 30);
            }
            textFieldCurrencies[i].setEditable(false);
            this.add(textFieldCurrencies[i]);
        }
        // ----- /textFieldCurrencies -----

        this.add(mainTextField);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button[0]) {
            mainTextField.setText("Test");
        }
    }
}
