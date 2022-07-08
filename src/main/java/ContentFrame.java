import Currencies.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentFrame extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 255;
    static final int SCREEN_HEIGHT = 380;
    final Font myFont = new Font("Dialog", Font.BOLD, 24);
    final Font myFontSmall = new Font("Dialog", Font.BOLD, 12);

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
        mainTextField.setFont(myFont);

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
            textFieldCurrencies[i].setFont(myFontSmall);
            this.add(textFieldCurrencies[i]);
        }
        // ----- /textFieldCurrencies -----

        this.add(mainTextField);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button[0]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[0].setText(String.valueOf(data));
            textFieldCurrencies[1].setText(String.valueOf(Dollar.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.valueOf(Dollar.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.valueOf(Dollar.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.valueOf(Dollar.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.valueOf(Dollar.yenExchangeRate(data)));

        }
        if (e.getSource() == button[1]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[1].setText(String.valueOf(data));
            textFieldCurrencies[0].setText(String.valueOf(Euro.dollarExchangeRate(data)));
            textFieldCurrencies[2].setText(String.valueOf(Euro.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.valueOf(Euro.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.valueOf(Euro.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.valueOf(Euro.yenExchangeRate(data)));
        }
        if (e.getSource() == button[2]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[2].setText(String.valueOf(data));
            textFieldCurrencies[0].setText(String.valueOf(Hryvnia.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.valueOf(Hryvnia.euroExchangeRate(data)));
            textFieldCurrencies[3].setText(String.valueOf(Hryvnia.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.valueOf(Hryvnia.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.valueOf(Hryvnia.yenExchangeRate(data)));
        }
        if (e.getSource() == button[3]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[3].setText(String.valueOf(data));
            textFieldCurrencies[0].setText(String.valueOf(Ruble.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.valueOf(Ruble.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.valueOf(Ruble.hryvniaExchangeRate(data)));
            textFieldCurrencies[4].setText(String.valueOf(Ruble.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.valueOf(Ruble.yenExchangeRate(data)));
        }
        if (e.getSource() == button[4]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[4].setText(String.valueOf(data));
            textFieldCurrencies[0].setText(String.valueOf(Zloty.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.valueOf(Zloty.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.valueOf(Zloty.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.valueOf(Zloty.rubleExchangeRate(data)));
            textFieldCurrencies[5].setText(String.valueOf(Zloty.yenExchangeRate(data)));
        }
        if (e.getSource() == button[5]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[5].setText(String.valueOf(data));
            textFieldCurrencies[0].setText(String.valueOf(Yen.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.valueOf(Yen.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.valueOf(Yen.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.valueOf(Yen.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.valueOf(Yen.zlotyExchangeRate(data)));
        }
    }
}
