/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.CalculodeCalagemJFrame;
import calculadora.IndexJFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class IndexTest {
    
    public IndexTest() {
    }
    
    @Test
    
    public void Tela_de_inicio_botoes(){
        boolean esperado = true;
        boolean resultado = true;
        
        IndexJFrame teste = new IndexJFrame();
        
        assertEquals(esperado, resultado);
    }
}
