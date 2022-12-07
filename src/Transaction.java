public class Transaction implements Runnable{
    @Override
    public void run() {
        Account.Deposit();
        Account.Withdraw();
    }
}
