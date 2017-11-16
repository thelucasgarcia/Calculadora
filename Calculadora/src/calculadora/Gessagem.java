package calculadora;

/**
 *
 * @author Erick
 */
public class Gessagem {

    
    //variaveis de retorno
    private float quantidadeDeGesso; // tonelada por hectar 
    private float necessidadeDeGessagem; // Kg por hectar a ser aplicado no solo
    
    
    //variaveis de form
    private float calcio;
    private float aluminio;
    private float saturacaoaluminio;
    private float profundidadeamostra;
    private float necessidadeDeCalcario;
    
    // variaveis form Necessidade de gessagem e quantidade de gesso
    private float superfícieCobertaPeloGesso; //%
    private float EspessuraDaCamada; //cm
    
    public Gessagem (){
    
    }
    
    //profundidade do solo deve ser superior a 20cm para amostra ser valida
    //unidade de medidas -> profundidade = cm
    public boolean verificaprofundidadeamostra(float profundidade) {
        if (profundidade > 20) {
            return true;
        } else {
            return false;
        }
    }

    //todos os criterios devem ser atendidos para verificar necessidade de Gessagem 
    //unidade de medidas -> calcio =  cmolc/dm³, aluminio = cmolc/dm³, saturacaoaluminio = %
    public boolean necessidadeGessagem(float calcio, float aluminio, float saturacaoaluminio) {
        if ((calcio <= 0.4) || (aluminio > 0.5) || (saturacaoaluminio > 30)) {
            return true;
        } else {
            return false;
        }
    }
    
    //unidade de medidas -> EspessuraDaCamada = cm
    public int calculaEspessuraDaCamada (float EspessuraDaCamada){
        int pf = 0;
        if ((EspessuraDaCamada < 40) && (EspessuraDaCamada > 20) ){
            pf = 20;
            return pf;
        }
        if ((EspessuraDaCamada < 60) && (EspessuraDaCamada > 30) ){
            pf = 30;
            return pf;
        }
        return 0;
    }

    //formula para calculo de gessagem -- opcao 1 form
    //unidade de medidas -> necessidadeDeCalcario = tonelada/hectar
    public boolean NecessidadeDeGessagemEquantidadeDeGesso(float profundidade, float necessidadeDeCalcario, float superfícieCobertaPeloGesso, float EspessuraDaCamada) {
        //a amostra necessita ser de profundidade menor que 20cm || true = >20 = amostra invalida, false = <20 = amostra valida
        // o nivel de necessidade de calcario, é o recomendado para a camada de 0 a 20cm. 
        if (verificaprofundidadeamostra(profundidade)) {
            return false; //amostra invalida 
        } else {
           if (necessidadeGessagem(calcio, aluminio, saturacaoaluminio)){
               
               necessidadeDeGessagem = (float) (necessidadeDeCalcario * 0.3); //valor sera printado no form  
               quantidadeDeGesso = necessidadeDeGessagem * (superfícieCobertaPeloGesso/100) * (calculaEspessuraDaCamada(EspessuraDaCamada)/20); 
               System.out.print("Necessidade de gessagem:" +necessidadeDeGessagem);
               System.out.print("Quantidade de gesso:" + quantidadeDeGesso);
               return true;
           }else{
               return false; //nao necessita de gessagem
           }    
        }
    }

}
