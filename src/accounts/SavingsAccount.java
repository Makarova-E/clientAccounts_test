package accounts;

public class SavingsAccount extends Account {
    private long minBalance;

    public SavingsAccount(long balance, String name, long minBalance) {
        super(balance, name);
        this.minBalance = minBalance;
    }

    public long getMinBalance() {
        return minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        return super.add(amount);
    }
}
