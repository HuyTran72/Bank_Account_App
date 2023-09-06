import java.util.Arrays;
public class AccountManager {
    BankAccount[] accounts;
    
    public AccountManager(BankAccount[] accounts){
        this.accounts = accounts;
    }
    
    public void create(BankAccount account){
        
        this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
        
        this.accounts[this.accounts.length - 1] = account;
    }
    
    
    public void delete(int accountNumber){
        for(int i=0; i<this.accounts.length; i++){
            if(this.accounts[i].accountNumber == accountNumber){
                this.accounts[i] = null;
                break;
            }
        }
    }
    
    
    public void deposit(int accountNumber, float amt){
        for(int i=0; i<this.accounts.length; i++){
            if(this.accounts[i].accountNumber == accountNumber){
                this.accounts[i].deposit(amt);
                break;
            }
        }
    }
    
    
    public void withdraw(int accountNumber, float amt){
        for(int i=0; i<this.accounts.length; i++){
            if(this.accounts[i].accountNumber == accountNumber){
                this.accounts[i].withdraw(amt);
                break;
            }
        }
    }
}
