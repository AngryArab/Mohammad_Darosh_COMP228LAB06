import java.util.ArrayList;

public class AccountTest extends Account {


    AccountTest(String deposit, String withdraw) {
        super(deposit, withdraw);
    }

    public static void main(String[] args){




        ArrayList<Account> t = new ArrayList<>();

        for(int i = 4; i > 0; i--){


            Account account = new Account("test" ,"test1");


            account.run();



            System.out.println("Thread name" + Thread.currentThread().getName());

        }












    }



}
