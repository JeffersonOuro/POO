
package ADO_06_Abstratas;

import Aula_12_Classe_Abstrata.*;
import java.util.Date;


public class StateLawAccount extends LawAccount {
    private String state;

    public StateLawAccount(int accountNumber, String password, String owner, 
            double balance, String aim, Date start, Date end, double admFee,
            String state) {
        super(accountNumber, password, owner, balance,aim, start,end,admFee);
        this.state = state;
    }
    
    @Override
    public double getBalance(){
        return super.getBalance();
    }

    @Override
    public String toString() {
        return "\n"+ "StateLawAccount{" + super.toString() 
                   + "state=" + state + '}';
    }
    
}

