import javax.swing.*;

public class CurrencyExchange {
    JFrame frame = new JFrame("Currency Exchange");

    CurrencyExchange(){

        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(10, 10, 190, 100);

        JButton buttonUSD = new JButton("USD");
        buttonUSD.setBounds(210, 10, 80, 30);
        JButton buttonEUR = new JButton("EUR");
        buttonEUR.setBounds(295, 10, 80, 30);
        JButton buttonUAH = new JButton("UAH");
        buttonUAH.setBounds(210, 45, 80, 30);
        JButton buttonRUB = new JButton("RUB");
        buttonRUB.setBounds(295, 45, 80, 30);
        JButton buttonPLN = new JButton("PLN");
        buttonPLN.setBounds(210, 80, 80, 30);
        JButton buttonJPY = new JButton("JPY");
        buttonJPY.setBounds(295, 80, 80, 30);

        JLabel labelUSD = new JLabel("USD: ");
        labelUSD.setBounds(10, 110, 80, 30);
        JLabel labelEUR = new JLabel("EUR: ");
        labelEUR.setBounds(10, 130, 80, 30);
        JLabel labelUAH = new JLabel("UAH");
        labelUAH.setBounds(10, 150, 80, 30);


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

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CurrencyExchange();
    }
}
