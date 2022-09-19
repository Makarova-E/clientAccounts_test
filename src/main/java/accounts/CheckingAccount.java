package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(long balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            return super.pay(amount);
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        return super.add(amount);
    }
}
