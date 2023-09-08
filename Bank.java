public class Bank {
    public static void main(String[] args){
       
        AccountManager accountManager = new AccountManager(new BankAccount[]{new BankAccount(1, "Kenny", 1000), new BankAccount(2, "Jimmy", 2000), new BankAccount(3, "Henry", 3000), new BankAccount(4, "Nicky", 4000), new BankAccount(5, "Terry", 5000)});
        
        accountManager.accounts[1].transfer(accountManager.accounts[4], 500);
        accountManager.accounts[2].transfer(accountManager.accounts[4], 500);
        accountManager.accounts[3].transfer(accountManager.accounts[4], 500);
        accountManager.accounts[0].transfer(accountManager.accounts[4], 500);
        
        for(int i=0; i<accountManager.accounts.length; i++){
            System.out.println(accountManager.accounts[i].getBalance());
        }
    }
}
