
package ADO_CARRO;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarroTest {
    
    @Test
    public void tanqueDeGasolinaTest() {
      
        Carro car = new Carro();

        car.encherTanque("Gasolina",10.0);

        car.andar(14.0);

        Assert.assertEquals(9.0, car.getCombustivel(), 0.001);

   }
    
   @Test
   public void tanqueDeAlcoolTest() {

      Carro car = new Carro();

      car.encherTanque("Alcool",10.0);

      car.andar(28.0);

      Assert.assertEquals(8.0, car.getCombustivel(), 0.001);

   }
    


}
