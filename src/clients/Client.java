package clients;

import accounts.Account;

public class Client {
    private String nameClient;
    private int maxAccounts;
    private Account[] accounts;

    public Client(String nameClient, int maxAccounts) {
        this.nameClient = nameClient;
        this.maxAccounts = maxAccounts;
        accounts = new Account[maxAccounts];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("Добавлен счет " + account.getClass().getSimpleName());
                return;
            }

        }
        System.out.println("Мест для добавления нового счёта нет!");
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].pay(amount)) {
                return true;
            }

        }
        return false;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getMaxAccounts() {
        return maxAccounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
