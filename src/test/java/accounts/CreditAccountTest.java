package accounts;

import org.junit.jupiter.api.*;

public class CreditAccountTest {
    CreditAccount creditAccount;
    long balanceAccount = -100L;
    long payMoney = 200;

    @BeforeEach
    void setUp() {
        creditAccount = new CreditAccount(balanceAccount, "Ivan");
    }

    @Test
    @DisplayName("Проверка оплаты с кредитного счета")
    void payWithinLimits() {
        Assertions.assertTrue(creditAccount.pay(payMoney));
    }

    @Test
    @DisplayName("Пополнение кредитного счета выходя за пределы допустимого")
    void addCreditOutOfLimits() {
        long amount = 1000;
        Assertions.assertFalse(creditAccount.add(amount));
    }

}
