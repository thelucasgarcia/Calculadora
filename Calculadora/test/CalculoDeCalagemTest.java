
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
}
