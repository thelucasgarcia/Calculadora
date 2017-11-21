package calculadora;

/**
 *
 * @author Erick
 */
public class Gessagem {

    private String mensagem;
    private float quantidadeDeGesso; // tonelada por hectar 
    private float necessidadeDeGessagem; // Kg por hectar a ser aplicado no solo

    public Gessagem() {
        necessidadeDeGessagem = quantidadeDeGesso = 0;
    }

    public void setQuantidadeDeGesso(float quantidadeDeGesso) {
        this.quantidadeDeGesso = quantidadeDeGesso;
    }

    public void setNecessidadeDeGessagem(float necessidadeDeGessagem) {
        this.necessidadeDeGessagem = necessidadeDeGessagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public float getQuantidadeDeGesso() {
        return quantidadeDeGesso;
    }

    public float getNecessidadeDeGessagem() {
        return necessidadeDeGessagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public boolean verificaprofundidadeamostra(float profundidade) {
        if (profundidade > 20) {
            return true;
        } else {
            return false;
        }
    }

    //unidade de medidas -> calcio =  cmolc/dm³, aluminio = cmolc/dm³, saturacaoaluminio = %
    public boolean necessidadeGessagem(float calcio, float aluminio, float saturacaoaluminio) {
        if ((calcio <= 0.4) || (aluminio > 0.5) || (saturacaoaluminio > 30)) {
            return true;
        } else {
            return false;
        }
    }

    //unidade de medidas -> EspessuraDaCamada = cm
    public int calculaEspessuraDaCamada(float EspessuraDaCamada) {

        if ((EspessuraDaCamada < 40) && (EspessuraDaCamada > 20)) {
            return 20;
        } else {
            if ((EspessuraDaCamada < 60) && (EspessuraDaCamada > 30)) {
                return 30;
            }
            mensagem = " A espessura da camada é invalida.";
            return 0;
        }
    }

    public boolean NecessidadeDeGessagemEquantidadeDeGesso(float calcio, float aluminio, float saturacaoaluminio, float profundidade, float necessidadeDeCalcario, float superficieCobertaPeloGesso, float EspessuraDaCamada) {
        mensagem = "";
        if (verificaprofundidadeamostra(profundidade)) {
            if (necessidadeGessagem(calcio, aluminio, saturacaoaluminio)) {
                necessidadeDeGessagem = (float) (necessidadeDeCalcario * 0.3); //valor sera printado no form  
                quantidadeDeGesso = necessidadeDeGessagem * (superficieCobertaPeloGesso / 100) * (calculaEspessuraDaCamada(EspessuraDaCamada) / 20);
                return true;
            } else {
                mensagem = "O solo não necessita de gessagem.";
                return false;
            }
        } else {
            mensagem = "A profundidade da amostra é invalida. A profundidade deve ser superior a 20cm.";
            return false;
        }
    }

    public float GessagemPorTeorDeArgila(float calcio, float aluminio, float saturacaoaluminio, int tipocultura, float argila) {
        if (necessidadeGessagem(calcio, aluminio, saturacaoaluminio)) {
            // cultura anual
            if (tipocultura == 1) {

                necessidadeDeGessagem = argila * 50;
                return necessidadeDeGessagem;
            }
            //cultura perene 
            if (tipocultura == 2) {
                necessidadeDeGessagem = argila * 75;
                return necessidadeDeGessagem;
            }
        } else {
            mensagem = "O solo não necessita de gessagem.";
        }
        return 0;
    }

}
