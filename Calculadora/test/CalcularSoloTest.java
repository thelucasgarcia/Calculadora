
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
   
   @Test
   public void passandoTodosOsCamposVaziosSomaBaseEsperandoFalse(){
       boolean esperado = false;
       boolean resultado;
       
       CalcularSoloJFrame teste = new CalcularSoloJFrame();
       
       resultado = teste.verificaCamposCalculoSomaBase("", "", "", "");
       assertEquals (esperado,resultado);
   }
   
   @Test
   public void passandoTodosOsCamposPreenchidosSomaBaseEsperandoTrue(){
       boolean esperado = true;
       boolean resultado;
       
       CalcularSoloJFrame teste = new CalcularSoloJFrame();
       
       resultado = teste.verificaCamposCalculoSomaBase("xxx", "xxx", "xxx", "xxx");
       assertEquals (esperado,resultado);
   }
   @Test
   public void passandoTodosOsCamposVaziosCalculoCTCEsperandoFalse(){
           boolean esperado = false;
           boolean resultado;
           
           CalcularSoloJFrame teste = new CalcularSoloJFrame();
           
           resultado = teste.verificaCamposCalculoCTC("","");
           assertEquals (esperado, resultado);
   
  }
   @Test
      public void passandoTodosOsCamposPreenchidosCalculoCTCEsperandoTrue(){
           boolean esperado = true;
           boolean resultado;
           
           CalcularSoloJFrame teste = new CalcularSoloJFrame();
           
           resultado = teste.verificaCamposCalculoCTC("xxx","xxx");
           assertEquals (esperado, resultado);
   
  }
        @Test
    public void limpaBotoesVerificaTrue() {
        boolean esperado, resultado;
        esperado = resultado = true;
        CalcularSoloJFrame verificado = new CalcularSoloJFrame();
        verificado.botaoReset();
        assertEquals(esperado, resultado);
    }
    @Test
    public void limpaBotoesDoisVerificaTrue() {
        boolean esperado, resultado;
        esperado = resultado = true;
        CalcularSoloJFrame verifica2 = new CalcularSoloJFrame();
        verifica2.botaoReset2();
        assertEquals(esperado, resultado);
    }
    @Test
    public void VerificaIfSomaBase(){
        CalcularSolo calculo = new CalcularSolo();
        int esperado =0;
        
        int retorno = (int) calculo.calculoCTC(0, 40);
        assertEquals(esperado, retorno);
        
    }
}
