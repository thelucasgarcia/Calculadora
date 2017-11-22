
import calculadora.Gessagem;
import calculadora.GessagemJFrame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Erick
 */
public class GessagemTest {

    @Test
    public void necessidadeDeGessagemPassandoTodosValoresInferioresAoEsperado() {
        boolean esperado = false;
        boolean resultado;
        float calcio, aluminio, saturacaoaluminio;

        Gessagem calculo = new Gessagem();

        calcio = (float) 0.5;
        aluminio = (float) 0.4;
        saturacaoaluminio = (float) 20;

        resultado = calculo.necessidadeGessagem(calcio, aluminio, saturacaoaluminio);
        assertEquals(esperado, resultado);
    }

    @Test
    public void necessidadeDeGessagemPassandoTodosValoresSuperioresAoEsperado() {
        boolean esperado = true;
        boolean resultado;
        float calcio, aluminio, saturacaoaluminio;

        Gessagem calculo = new Gessagem();

        calcio = (float) 0.3;
        aluminio = (float) 0.5;
        saturacaoaluminio = (float) 35;

        resultado = calculo.necessidadeGessagem(calcio, aluminio, saturacaoaluminio);
        assertEquals(esperado, resultado);
    }

    @Test
    public void calculaEspessuraDaCamadaPassando25EsperandoResultado20() {
        float esperado = 20;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.calculaEspessuraDaCamada((float) 25);
        assertEquals(esperado, resultado, 0);

    }

    @Test
    public void verificaprofundidadeamostraPassandoAmostraDeProfundidadeInvalida() {
        boolean esperado = false;
        boolean resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.verificaprofundidadeamostra((float) 19);
        assertEquals(esperado, resultado);
    }

    @Test
    public void NecessidadeDeGessagemEquantidadeDeGessoPassandoParamentrosValidosAguardandoTrue() {
        boolean esperado = true;
        boolean resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.NecessidadeDeGessagemEquantidadeDeGesso((float) 0.3, (float) 0.5, (float) 35, (float) 30, (float) 30, (float) 40, (float) 30);

        assertEquals(esperado, resultado);
    }

    @Test
    public void GessagemPorTeorDeArgilaPassandoParametrosValidosAguardando250OP1() {
        float esperado = 250;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.GessagemPorTeorDeArgila((float) 0.3, (float) 0.5, (float) 35, 1, (float) 5);

        assertEquals(esperado, resultado, 0);
    }

    @Test
    public void GessagemPorTeorDeArgilaPassandoParametrosValidosAguardando150OP2() {
        float esperado = 150;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.GessagemPorTeorDeArgila((float) 0.3, (float) 0.5, (float) 35, 2, (float) 2);

        assertEquals(esperado, resultado, 0);
    }

    @Test
    public void passandoTodosOsCamposVaziosArgilaEsperandoFalse() {
        boolean esperado = false;
        boolean resultado;

        GessagemJFrame teste = new GessagemJFrame();

        resultado = teste.verificaCamposCalculoArgila("", "", "", "", "");
        assertEquals(esperado, resultado);
    }

    @Test
    public void passandoTodosOsCamposVaziosGessagemEsperandoFalse() {
        boolean esperado = false;
        boolean resultado;

        GessagemJFrame teste = new GessagemJFrame();

        resultado = teste.verificaCamposCalculoGessagem("", "", "", "", "", "", "");
         assertEquals(esperado, resultado);
    }

}
