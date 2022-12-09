public class Account extends Thread{




    private String threadName;


    Account(String deposit, String withdraw){


        threadName = deposit + withdraw;


        System.out.println("Creating " + threadName) ;

    }



    public void Deposit(){

           threadName = "$300 has been deposited";

    }

    public void Withdraw(){


        threadName = "$4000 has been withdrawn";

    }




}
