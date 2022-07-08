import Currencies.*;
import Utilities.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ContentFrame extends JPanel implements ActionListener {

    JTextField mainTextField;
    JButton[] button = new JButton[6];
    JLabel[] labelCurrencies = new JLabel[6];
    JTextField[] textFieldCurrencies = new JTextField[6];

    ContentFrame() {

        this.setPreferredSize(new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));
        this.setBackground(new Color(0xE3BDB4));
        this.setLayout(null);

        mainTextField = new JTextField();
        mainTextField.setBounds(10, 10, 220, 50);
        mainTextField.setFont(Config.myFont);

        // ----- Buttons -----
        for (int i = 0; i < 6; i++) {
            button[i] = new JButton(Config.currencies[i]);
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
            labelCurrencies[i] = new JLabel(Config.currencies[i]);
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
            textFieldCurrencies[i].setFont(Config.myFontSmall);
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
            textFieldCurrencies[0].setText(String.format("%.2f", data));
            textFieldCurrencies[1].setText(String.format("%.2f", Dollar.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.format("%.2f", Dollar.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.format("%.2f", Dollar.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.format("%.2f", Dollar.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.format("%.2f", Dollar.yenExchangeRate(data)));

        }
        if (e.getSource() == button[1]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[1].setText(String.format("%.2f", data));
            textFieldCurrencies[0].setText(String.format("%.2f", Euro.dollarExchangeRate(data)));
            textFieldCurrencies[2].setText(String.format("%.2f", Euro.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.format("%.2f", Euro.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.format("%.2f", Euro.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.format("%.2f", Euro.yenExchangeRate(data)));
        }
        if (e.getSource() == button[2]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[2].setText(String.format("%.2f", data));
            textFieldCurrencies[0].setText(String.format("%.2f", Hryvnia.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.format("%.2f", Hryvnia.euroExchangeRate(data)));
            textFieldCurrencies[3].setText(String.format("%.2f", Hryvnia.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.format("%.2f", Hryvnia.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.format("%.2f", Hryvnia.yenExchangeRate(data)));
        }
        if (e.getSource() == button[3]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[3].setText(String.format("%.2f", data));
            textFieldCurrencies[0].setText(String.format("%.2f", Ruble.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.format("%.2f", Ruble.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.format("%.2f", Ruble.hryvniaExchangeRate(data)));
            textFieldCurrencies[4].setText(String.format("%.2f", Ruble.zlotyExchangeRate(data)));
            textFieldCurrencies[5].setText(String.format("%.2f", Ruble.yenExchangeRate(data)));
        }
        if (e.getSource() == button[4]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[4].setText(String.format("%.2f", data));
            textFieldCurrencies[0].setText(String.format("%.2f", Zloty.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.format("%.2f", Zloty.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.format("%.2f", Zloty.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.format("%.2f", Zloty.rubleExchangeRate(data)));
            textFieldCurrencies[5].setText(String.format("%.2f", Zloty.yenExchangeRate(data)));
        }
        if (e.getSource() == button[5]) {
            double data = Double.parseDouble(mainTextField.getText());
            if (data < 1.0) data = 1.0;
            textFieldCurrencies[5].setText(String.format("%.2f", data));
            textFieldCurrencies[0].setText(String.format("%.2f", Yen.dollarExchangeRate(data)));
            textFieldCurrencies[1].setText(String.format("%.2f", Yen.euroExchangeRate(data)));
            textFieldCurrencies[2].setText(String.format("%.2f", Yen.hryvniaExchangeRate(data)));
            textFieldCurrencies[3].setText(String.format("%.2f", Yen.rubleExchangeRate(data)));
            textFieldCurrencies[4].setText(String.format("%.2f", Yen.zlotyExchangeRate(data)));
        }
    }
}
