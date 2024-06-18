import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements Observer, ActionListener{
    private Bank bank;
    private ControllerInterface controller;
    private JTextField accountNumberField;
    private JTextField initialBalanceField;
    private JTextArea displayArea;
    private JButton addButton;
    private JButton exitButton;

    public View(Bank bank) {
        this.bank = bank;
        this.controller = new Controller(this, bank);
        bank.registerObserver(this);
        createView();
    }

    public void createView() {
        setTitle("Bank Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberLabel.setBounds(50, 20, 150, 30);
        add(accountNumberLabel);

        accountNumberField = new JTextField();
        accountNumberField.setBounds(200, 20, 150, 30);
        add(accountNumberField);

        JLabel initialBalanceLabel = new JLabel("Initial Balance:");
        initialBalanceLabel.setBounds(50, 60, 150, 30);
        add(initialBalanceLabel);

        initialBalanceField = new JTextField();
        initialBalanceField.setBounds(200, 60, 150, 30);
        add(initialBalanceField);

        addButton = new JButton("Add Account");
        addButton.setBounds(50, 100, 150, 30);
        addButton.addActionListener(this);
        add(addButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(200, 100, 150, 30);
        exitButton.addActionListener(this);
        add(exitButton);

        displayArea = new JTextArea();
        displayArea.setBounds(50, 140, 300, 100);
        add(displayArea);
    }

    @Override
    public void update(String message) {
        displayArea.append(message + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String accountNumber = accountNumberField.getText();
            double initialBalance = Double.parseDouble(initialBalanceField.getText());
            controller.addAccount(accountNumber, initialBalance);
        } else if (e.getSource() == exitButton) {
            controller.exit();
        }
    }

    public void displayMessage(String message) {
        displayArea.append(message + "\n");
    }


}
