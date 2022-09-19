package accounts;

public class Account {
    protected long balance;
    protected String name;

    public Account(long balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public boolean pay(long amount) {
        balance -= amount;
        return balance >= 0;
    }

    public boolean add(long amount) {
        balance += amount;
        return balance >= 0;
    }
}
