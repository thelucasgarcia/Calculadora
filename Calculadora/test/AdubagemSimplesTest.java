import calculadora.AdubagemSimples;
import calculadora.AdubagemSimplesJFrame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author BMorais
 */
public class AdubagemSimplesTest {
    
    @Test
    public void SomaPrevisto(){
    
        float previsto = 300;
        float resultado;
        AdubagemSimples calculo = new AdubagemSimples();
        resultado = calculo.calculo(60, 20);
        assertEquals(previsto, resultado, 0.001);
    }
    @Test
    public void SomaPrevisto2(){
    
        float previsto = 200;
        float resultado;
        AdubagemSimples calculo = new AdubagemSimples();
        resultado = calculo.calculo(60, 30);
        assertEquals(previsto, resultado, 0.001);
    }
    @Test
    public void limpaBotoesSim() {
        boolean esperado, resultado;
        esperado = resultado = true;
        AdubagemSimplesJFrame calculo = new AdubagemSimplesJFrame();
        calculo.botaoLimpa();
        assertEquals(esperado, resultado);
    }    
    
}
