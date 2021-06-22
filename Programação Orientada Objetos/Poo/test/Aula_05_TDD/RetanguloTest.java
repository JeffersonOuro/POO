package Aula_05_TDD;


import Aula_05_ADO_01_TDD.Retangulo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class RetanguloTest {
    @Test
    public void testeArea() {
          Retangulo r = new Retangulo(5,10,20,30);
          Assert.assertEquals (600, r.area());
    }

    @Test
    public void testeTransladar() {
          Retangulo r = new Retangulo(5,10,20,30);
          Assert.assertEquals (5, r.getX());
          r.transladar(10,10);
          Assert.assertEquals (15, r.getX());
          assertEquals (20, r.getY());
    }

    
}
