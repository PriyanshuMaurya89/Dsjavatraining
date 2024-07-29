import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class currencyconverter2 extends JFrame {

    public JComboBox<String> fromCurrency;
    public JComboBox<String> toCurrency;
    public JTextField amountField;
    public JLabel resultLabel;

    public static final String[] currencies = {"USD", "EUR", "GBP", "INR"};
    public static final double[][] conversionRates = {
            {1.0, 0.85, 0.75, 74.0},   // USD to USD, EUR, GBP, INR
            {1.18, 1.0, 0.88, 87.0},   // EUR to USD, EUR, GBP, INR
            {1.34, 1.14, 1.0, 98.0},   // GBP to USD, EUR, GBP, INR
            {0.013, 0.011, 0.010, 1.0} // INR to USD, EUR, GBP, INR
    };

    public currencyconverter2() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        fromCurrency = new JComboBox<>(currencies);
        toCurrency = new JComboBox<>(currencies);
        amountField = new JTextField(10);
        resultLabel = new JLabel("Converted Amount: ");

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        add(new JLabel("From: "));
        add(fromCurrency);
        add(new JLabel("To: "));
        add(toCurrency);
        add(new JLabel("Amount: "));
        add(amountField);
        add(convertButton);
        add(resultLabel);
    }

    private void convertCurrency() {
        try {
            int fromIndex = fromCurrency.getSelectedIndex();
            int toIndex = toCurrency.getSelectedIndex();
            double amount = Double.parseDouble(amountField.getText());
            double convertedAmount = amount * conversionRates[fromIndex][toIndex];
            resultLabel.setText("Converted Amount: " + String.format("%.2f", convertedAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new currencyconverter2().setVisible(true);
            }
        });
    }
}



