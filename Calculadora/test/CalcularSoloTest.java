
import calculadora.CalcularSolo;
import calculadora.CalcularSoloJFrame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class CalcularSoloTest {
    @Test
   public void retornarOCalculoSomaDaBasePassandoTodosOsValores(){
       float esperado = 40;
       float resultado;
       
       CalcularSolo calculo = new CalcularSolo();
       
       resultado = calculo.calculoBase((float) 10,(float) 10,(float) 10,(float) 10);
       assertEquals(esperado, resultado, 0);
       
   }
   @Test
   public void retornarOCaculoSomaCtcPassandoTodosOsValores(){
       float esperado = 50;
       float resultado;
       
       CalcularSolo calculoctc = new CalcularSolo();
       
       resultado = calculoctc.calculoCTC((float)40,(float)10);
       assertEquals(esperado, resultado, 0);
   }  
   
}
