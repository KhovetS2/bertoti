import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject{
    private List<Observer> observers;
    private List<Account> accounts;

    public Bank() {
        this.observers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Bank state has changed.");
        }
    }

    public void addAccount(Account account) {
        accounts.add(account);
        notifyObservers();
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
