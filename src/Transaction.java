public class Transaction extends Account implements Runnable{


    Transaction(String deposit, String withdraw) {
        super(deposit, withdraw);
    }

    @Override
    public void run() {



        Deposit();
        Withdraw();




    }




}
