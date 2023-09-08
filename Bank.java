public class Bank {
    public static void main(String[] args){
        
        //create a new AccountManager object
        AccountManager accountManager = new AccountManager(new BankAccount[]{new BankAccount(1, "Kenny", 1000), new BankAccount(2, "Jimmy", 2000), new BankAccount(3, "Henry", 3000)});
        
        //create two new accounts
        accountManager.create(new BankAccount(4, "Alex", 4000));
        accountManager.create(new BankAccount(5, "Rita", 5000));
        
        //transfer money from account 0 to the other accounts
        accountManager.accounts[0].transfer(accountManager.accounts[1], 500);
        accountManager.accounts[0].transfer(accountManager.accounts[2], 500);
        accountManager.accounts[0].transfer(accountManager.accounts[3], 500);
        accountManager.accounts[0].transfer(accountManager.accounts[4], 500);
        
        //print the balance of each account
        for(int i=0; i<accountManager.accounts.length; i++){
            System.out.println(accountManager.accounts[i].getBalance());
        }
    }
}
