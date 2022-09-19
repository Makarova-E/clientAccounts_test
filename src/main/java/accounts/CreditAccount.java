package accounts;

public class CreditAccount extends Account {

    public CreditAccount(long balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(long amount) {
        balance -= amount;
        return balance < 0;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= Math.abs(balance)) {
            balance += amount;
            return true;
        }
        return false;
    }
}
