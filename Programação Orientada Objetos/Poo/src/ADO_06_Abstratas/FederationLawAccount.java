
package ADO_06_Abstratas;

import Aula_12_Classe_Abstrata.*;
import java.util.Date;

public class FederationLawAccount extends LawAccount {
    private String judgeInstance;

    public FederationLawAccount(int accountNumber, String password, String owner, 
            double balance, String aim, Date start, Date end, double admFee,
            String judgeInstance) {
        super(accountNumber, password, owner, balance,aim, start,end,admFee);
        this.judgeInstance = judgeInstance;
    }
    
    @Override
    public double getBalance(){
        return super.getBalance();
    }

    @Override
    public String toString() {
        return "\n"+ "FederationLawAccount{" + super.toString() +
                          "judgeInstance=" + judgeInstance + '}';
    }
    
}
