public class BankAccount {
    int accountNumber;
    private String name;
    private float balance;

    public BankAccount(){    
    }
    
    public BankAccount(int accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    
    public float getBalance() {
        return this.balance;
    }
    
    public void deposit(float amt) {
        if(amt > 0) {
            this.balance += amt;
        }
    }

    public void withdraw(float amt) {
        if(amt > 0 && this.balance - amt >=0){
            this.balance -= amt;
        }
    }

    public void transfer(BankAccount account, float amt) {
        if(amt > 0 && this.balance - amt >= 0) {
            account.deposit(amt);
            this.withdraw(amt);
        }
    }

    public String toString() {
		return "BankAccount [The account number=" + accountNumber + " + with=" + name + " + has an balance of=" + balance + "]";
    }  
}



