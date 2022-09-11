//Test Account
//Driver class

public class TestAccount {
    public static void main (String[] args) {
    //create account object
        Account acct1 = new  Account(100.00);
        System.out.println("acct1: " + acct1.toString());
        Account acct2 = new Account(); //Default constructore
        System.out.println("acct2: " + acct2.toString()); //acct2.toString
        acct1.Deposit(1000.0);
        acct1.Withdraw(500.0);
        System.out.println("acct1: " + acct1);

    }//End of Main

} //End of Class
