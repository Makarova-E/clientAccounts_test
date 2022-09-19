package clients;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClientTest {
    Client clientTest;
    Account account;
    Account account2;

    @BeforeEach
    void setUp() {
        int maxAccounts = 2;
        clientTest = new Client("Ivan", maxAccounts);
        account = new CreditAccount(-1000, "Ivan");
        account2 = new SavingsAccount(10000, "Ivan", 1000);
        clientTest.add(account);
        clientTest.add(account2);
    }

    @Test
    @DisplayName("Проверка добавления счета")
    void addNewAccount() {
        Assertions.assertEquals(2, clientTest.getAccounts().length);
    }

    @Test
    @DisplayName("Проверка превышения максимального количества счетов")
    void addAccountGreaterThanMax() {
        Account account3 = new CheckingAccount(1500, "Ivan");
        Assertions.assertFalse(clientTest.add(account3));
    }
}
