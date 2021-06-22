
package ADO_06_Abstratas;

import Aula_12_Classe_Abstrata.*;


public class RegularAccount extends BankAccount {
    private double specialBalance;

    public RegularAccount(int accountNumber, String password, String owner, 
            double balance, double specialBalance) {
        super(accountNumber, password, owner, balance);
        this.specialBalance = specialBalance;
    }
    
    @Override
    public double getBalance(){
        return balance + specialBalance;
    }

    public double getSpecialBalance() {
        return specialBalance;
    }

    public void setSpecialBalance(double specialBalance) {
        this.specialBalance = specialBalance;
    }
    
    @Override
    public String toString() {
        return "\n RegularAccount{"+ "accountNumber=" + accountNumber + 
                ", password=" + password + ", owner=" + owner + 
                ", balance=" + balance + ", specialBalance=" + specialBalance + '}';
    }  
}
