
package ADO_06_Abstratas;

import Aula_12_Classe_Abstrata.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class testaBank {
    public static void main(String[] args) {
        
        Bank b = new Bank("entradaADO.txt");
        int ta = b.getAccounts().size();
        
        for (int i = 0; i < ta; i++) {
            System.out.println(b.TipoBySigla(b.getAccounts().get(i)));
        }
        System.out.println(b.getAccounts());
    }
}
