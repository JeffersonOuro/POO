
package ADO_06_Abstratas;

import Aula_12_Classe_Abstrata.*;


public class SavingsAccount extends BankAccount{
    private double interestRate; //taxa de juros

    public SavingsAccount(int accountNumber, String password, 
                        String owner, double balance, double interestRate) {
        super(accountNumber, password, owner, balance);//chama o construtor da superclasse
        this.interestRate = interestRate;
    }
   
    @Override
    public double getBalance(){
        // Devolve o saldo da poupança
        return balance*(1+interestRate);
    }

    
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "\n SavingsAccount{"+ "accountNumber=" + accountNumber + 
                ", password=" + password + ", owner=" + owner + 
                ", balance=" + balance + ", interestRate=" + interestRate +'}';
    }   
    
}
