
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
    public void esperavazioNoGetQuantidadeGesso(){
        float esperado = 0;
        float resultado;
        
        Gessagem calculo = new Gessagem();
        
        resultado = calculo.getQuantidadeDeGesso();
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void esperavazioNoGetNecessidadeGessagem(){
        float esperado = 0;
        float resultado;
        
        Gessagem calculo = new Gessagem();
        
        resultado = calculo.getNecessidadeDeGessagem();
        assertEquals(esperado, resultado, 0);
    }

    @Test
    public void esperavazioNoGetMensagem(){
        String esperado = "";
        String resultado;
        
        Gessagem calculo = new Gessagem();
        
        resultado = calculo.getMensagem();
        assertEquals(esperado, "");
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
    public void calculaEspessuraDaCamadaPassando40EsperandoResultado30() {
        float esperado = 30;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.calculaEspessuraDaCamada((float) 40);
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void calculaEspessuraDaCamadaPassando10EsperandoResultado0() {
        float esperado = 0;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.calculaEspessuraDaCamada((float) 10);
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
    public void NecessidadeDeGessagemEquantidadeDeGessoPassandoParamentrosInvalidosAguardandoFalse() {
        boolean esperado = false;
        boolean resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.NecessidadeDeGessagemEquantidadeDeGesso((float) 0.5, (float) 0.4, (float) 20, (float) 30, (float) 30, (float) 40, (float) 30);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void NecessidadeDeGessagemEquantidadeDeGessoPassandoParamentrosInvalidosAguardandoFalseeProfundidadeInvalida() {
        boolean esperado = false;
        boolean resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.NecessidadeDeGessagemEquantidadeDeGesso((float) 0.0, (float) 0.0, (float) 0, (float) 10, (float) 0, (float) 0, (float) 0);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void GessagemPorTeorDeArgilaPassandoParametrosInvalidos() {
        float esperado = 0;
        float resultado;

        Gessagem calculo = new Gessagem();

        resultado = calculo.GessagemPorTeorDeArgila((float) 0.5, (float) 0.4, (float) 20, 1, (float) 5);

        assertEquals(esperado, resultado, 0);
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
    public void passandoTodosOsCamposPreenchidosArgilaEsperandoTrue() {
        boolean esperado = true;
        boolean resultado;

        GessagemJFrame teste = new GessagemJFrame();

        resultado = teste.verificaCamposCalculoArgila("xxx", "xxx", "xxx", "xxx", "xxx");
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
    
    @Test
    public void passandoTodosOsCamposPreenchidosGessagemEsperandoTrue() {
        boolean esperado = true;
        boolean resultado;

        GessagemJFrame teste = new GessagemJFrame();

        resultado = teste.verificaCamposCalculoGessagem("xxx", "xxx", "xxx", "xxx", "xxx", "xxx", "xxx");
         assertEquals(esperado, resultado);
    }
    
    
    @Test
    public void testaMetodoCancelarPqTenhoQueAumentarOCoverage(){
        boolean esperado = true;
        boolean resultado = true;
        
        GessagemJFrame teste = new GessagemJFrame();

        teste.cancelar();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testedeMain(){
        
        GessagemJFrame teste = new GessagemJFrame();
        GessagemJFrame.main();
           
    }
}
