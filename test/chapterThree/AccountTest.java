package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(-50_000);
        assertEquals(0, myAccount.getBalance());

    }
    @Test
    public void depositPositiveAmount_balanceIncreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(2000);
        assertEquals(2000, myAccount.getBalance());

    }
    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(2000);
        myAccount.deposit(4000);
        assertEquals(6000, myAccount.getBalance());


    }

    @Test
    public void withdrawNegativeAmount_balanceDecreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.withdraw(-20000);
        assertEquals(0, myAccount.getBalance());

    }

    @Test
    public void withdrawAmount_balanceDecreasesTest(){
        Account myAccount = new Account();
        assertEquals(1200, myAccount.getBalance());

        myAccount.withdraw(200);
        assertEquals(1200, myAccount.getBalance());

    }
    @Test
    public void withdrawPositiveAmount_balanceDecreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.withdraw(50000);
        assertEquals(200, myAccount.getBalance());

    }
}
