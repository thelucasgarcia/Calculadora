
import calculadora.AdubagemComposta;
import calculadora.AdubagemCompostaJFrame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rafael
 */
public class AdubagemCompostaTest {

    @Test
    public void multiplicaAeBPassando10e20Esperando200() {
        float esperado = 200;
        float resultado;

        AdubagemComposta calculo = new AdubagemComposta();
        resultado = calculo.multiplicaAeB(10, 20);
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void divideAeBcomCPassando100e10Esperando10() {

        float esperado = 10;
        float resultado;

        AdubagemComposta calculo = new AdubagemComposta();
        resultado = calculo.divideAeBcomC(100, 10);
        assertEquals(esperado, resultado, 0.001);

    }

    @Test
    public void testeMetodoVerificaCamposVazios() {
        boolean esperado = false;
        boolean resultado;

        AdubagemCompostaJFrame calculo = new AdubagemCompostaJFrame();

        resultado = calculo.verificaCampo("", "", "");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testeMetodoVerificaCamposPreenchidos() {
        boolean esperado = true;
        boolean resultado;

        AdubagemCompostaJFrame calculo = new AdubagemCompostaJFrame();

        resultado = calculo.verificaCampo("xx", "xx", "xx");
        assertEquals(esperado, resultado);
    }

    @Test
    public void limpaBotoesPQsim() {
        boolean esperado, resultado;
        esperado = resultado = true;
        AdubagemCompostaJFrame calculo = new AdubagemCompostaJFrame();
        calculo.botaoReset();
        assertEquals(esperado, resultado);
    }


}
