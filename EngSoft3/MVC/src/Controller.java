public class Controller implements ControllerInterface {
    private View view;
    private Bank bank;

    public Controller(View view, Bank bank) {
        this.view = view;
        this.bank = bank;
    }

    @Override
    public void addAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        bank.addAccount(account);
        view.displayMessage("Account added successfully.");
        view.displayMessage("Account:"+accountNumber);
        view.displayMessage("Balance:"+initialBalance);
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
