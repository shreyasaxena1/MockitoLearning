package TestException;


import org.junit.Test;


public class CashierTest {


    @Test (expected = IllegalArgumentException.class)
    public void validTransactionUnacceptedCurrency(){
        Cashier.validateTransaction("UAD",100);
    }

    @Test (expected = InvalidTransactionException.class)
    public void validTransactionNegativeAmount(){
        Cashier.validateTransaction("USD",-100);
    }

}
