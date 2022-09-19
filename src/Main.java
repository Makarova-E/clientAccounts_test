import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000L, "Antonov", 1000L);
        CheckingAccount checkingAccount = new CheckingAccount(2000L, "Antonov");
        CreditAccount creditAccount = new CreditAccount(-1000L, "Antonov");

        Client client = new Client("Antonov", 3);
        client.add(savingsAccount);
        client.add(checkingAccount);
        client.add(creditAccount);
        client.add(new CreditAccount(-1000L, "Antonov"));

        client.pay(15000);

        for (Account printBalance : client.getAccounts()) {
            System.out.println(printBalance.getBalance());
        }
    }
}
