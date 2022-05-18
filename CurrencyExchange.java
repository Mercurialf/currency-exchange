import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyExchange {
    JFrame frame = new JFrame("Currency");

    CurrencyExchange(){

        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(10, 10, 220, 50);


        JLabel labelUSD = new JLabel("USD: ");
        labelUSD.setBounds(10, 150, 80, 30);
        JLabel labelEUR = new JLabel("EUR: ");
        labelEUR.setBounds(10, 180, 80, 30);
        JLabel labelUAH = new JLabel("UAH: ");
        labelUAH.setBounds(10, 210, 80, 30);
        JLabel labelRUB = new JLabel("RUB: ");
        labelRUB.setBounds(10, 240, 80, 30);
        JLabel labelPLN = new JLabel("PLN: ");
        labelPLN.setBounds(10, 270, 80, 30);
        JLabel labelJPY = new JLabel("JPY: ");
        labelJPY.setBounds(10, 300, 80, 30);

        JTextField textFieldUSD = new JTextField();
        textFieldUSD.setBounds(50, 150, 180, 30);
        textFieldUSD.setEditable(false);
        JTextField textFieldEUR = new JTextField();
        textFieldEUR.setBounds(50, 180, 180, 30);
        textFieldEUR.setEditable(false);
        JTextField textFieldUAH = new JTextField();
        textFieldUAH.setBounds(50, 210, 180, 30);
        textFieldUAH.setEditable(false);
        JTextField textFieldRUB = new JTextField();
        textFieldRUB.setBounds(50, 240, 180, 30);
        textFieldRUB.setEditable(false);
        JTextField textFieldPLN = new JTextField();
        textFieldPLN.setBounds(50, 270, 180, 30);
        textFieldPLN.setEditable(false);
        JTextField textFieldJPY = new JTextField();
        textFieldJPY.setBounds(50, 300, 180, 30);
        textFieldJPY.setEditable(false);

        JButton buttonUSD = new JButton("USD");
        buttonUSD.setBounds(10, 70, 70, 30);
        buttonUSD.addActionListener(e -> {
            Double data = Double.valueOf(inputTextField.getText());
            textFieldUSD.setText(String.valueOf(data));
            textFieldEUR.setText(String.valueOf(Dollar.euroExchangeRate(data)));
            textFieldUAH.setText(String.valueOf(Dollar.hryvniaExchangeRate(data)));
            textFieldRUB.setText(String.valueOf(Dollar.rubleExchangeRate(data)));
            textFieldPLN.setText(String.valueOf(Dollar.zlotyExchangeRate(data)));
            textFieldJPY.setText(String.valueOf(Dollar.yenExchangeRate(data)));

        });
        JButton buttonEUR = new JButton("EUR");
        buttonEUR.setBounds(85, 70, 70, 30);
        JButton buttonUAH = new JButton("UAH");
        buttonUAH.setBounds(160, 70, 70, 30);
        JButton buttonRUB = new JButton("RUB");
        buttonRUB.setBounds(10, 105, 70, 30);
        JButton buttonPLN = new JButton("PLN");
        buttonPLN.setBounds(85, 105, 70, 30);
        JButton buttonJPY = new JButton("JPY");
        buttonJPY.setBounds(160, 105, 70, 30);


        frame.add(inputTextField);

        frame.add(buttonUSD);
        frame.add(buttonEUR);
        frame.add(buttonUAH);
        frame.add(buttonRUB);
        frame.add(buttonPLN);
        frame.add(buttonJPY);

        frame.add(labelUSD);
        frame.add(labelEUR);
        frame.add(labelUAH);
        frame.add(labelRUB);
        frame.add(labelPLN);
        frame.add(labelJPY);

        frame.add(textFieldUSD);
        frame.add(textFieldEUR);
        frame.add(textFieldUAH);
        frame.add(textFieldRUB);
        frame.add(textFieldPLN);
        frame.add(textFieldJPY);

        frame.setSize(255, 380);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new CurrencyExchange();
    }
}

