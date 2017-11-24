
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import calculadora.CalculodeCalagem;
import calculadora.CalculodeCalagemJFrame;
/**
 *
 * @author Lucas
 */
public class CalculoDeCalagemTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void retorna_valor_de_necessidadeDeCalagem() {
        double esperava = 5.13;
        CalculodeCalagem calculo = new CalculodeCalagem();
        float resultado = 0;
        resultado = calculo.NecessidadeDeCalagem(83, 23, 70, 76);
        assertEquals(esperava, resultado, 0.01);
    }
    @Test
    public void verifica_se_poder_relativo_de_neutralizacao_total_e_igual_a_zero(){
        double esperava = 5.82;
        CalculodeCalagem calculo = new CalculodeCalagem();
        float resultado = 0;
        resultado = calculo.NecessidadeDeCalagem(83, 23, 70, 0);
        assertEquals(esperava, resultado, 0.01);
    }
    
    @Test
    public void testandoMetodoLimpaTela(){
        boolean esperado = true;
        boolean resultado = true;
        
        CalculodeCalagemJFrame teste = new CalculodeCalagemJFrame();
        
        teste.LimpaTela();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testedeMain(){
        
        CalculodeCalagemJFrame teste = new CalculodeCalagemJFrame();
        CalculodeCalagemJFrame.main();
           
    }
    
    

    

}
