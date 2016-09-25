
public class Accounts {

    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0.0);
        
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println(mattsAccount.toString());
        System.out.println(myAccount.toString());
    }

}
