package calculadora;

/**
 *
 * @author Erick
 */
public class Gessagem {

    
    //variaveis de retorno
    private String mensagem;
    private float quantidadeDeGesso; // tonelada por hectar 
    private float necessidadeDeGessagem; // Kg por hectar a ser aplicado no solo
    
    
    //variaveis de form
   // private float calcio;
   // private float aluminio;
   // private float saturacaoaluminio;
   // private float profundidadeamostra;
    
    
    // variaveis form Necessidade de gessagem e quantidade de gesso
   // private float superficieCobertaPeloGesso; //%
   // private float EspessuraDaCamada; //cm
  //  private float necessidadeDeCalcario;
    
    
    
    public Gessagem (){
        necessidadeDeGessagem = quantidadeDeGesso = 0; 
    }
    
    public void setQuantidadeDeGesso(float quantidadeDeGesso) {
        this.quantidadeDeGesso = quantidadeDeGesso;
    }

    public void setNecessidadeDeGessagem(float necessidadeDeGessagem) {
        this.necessidadeDeGessagem = necessidadeDeGessagem;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
/*

    public void setCalcio(float calcio) {
        this.calcio = calcio;
    }

    public void setAluminio(float aluminio) {
        this.aluminio = aluminio;
    }

    public void setSaturacaoaluminio(float saturacaoaluminio) {
        this.saturacaoaluminio = saturacaoaluminio;
    }

    public void setProfundidadeamostra(float profundidadeamostra) {
        this.profundidadeamostra = profundidadeamostra;
    }

    public void setNecessidadeDeCalcario(float necessidadeDeCalcario) {
        this.necessidadeDeCalcario = necessidadeDeCalcario;
    }

    public void setSuperficieCobertaPeloGesso(float superfícieCobertaPeloGesso) {
        this.superficieCobertaPeloGesso = superfícieCobertaPeloGesso;
    }

    public void setEspessuraDaCamada(float EspessuraDaCamada) {
        this.EspessuraDaCamada = EspessuraDaCamada;
    }
*/
    public float getQuantidadeDeGesso() {
        return quantidadeDeGesso;
    }

    public float getNecessidadeDeGessagem() {
        return necessidadeDeGessagem;
    }
    
    public String getMensagem(){
        return mensagem;
    }
/*
    public float getCalcio() {
        return calcio;
    }

    public float getAluminio() {
        return aluminio;
    }

    public float getSaturacaoaluminio() {
        return saturacaoaluminio;
    }

    public float getProfundidadeamostra() {
        return profundidadeamostra;
    }

    public float getNecessidadeDeCalcario() {
        return necessidadeDeCalcario;
    }

    public float getSuperfícieCobertaPeloGesso() {
        return superficieCobertaPeloGesso;
    }

    public float getEspessuraDaCamada() {
        return EspessuraDaCamada;
    }
*/    
    
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
        if ((EspessuraDaCamada < 40) && (EspessuraDaCamada > 20) ){
            return 20;
        }else{
            if ((EspessuraDaCamada < 60) && (EspessuraDaCamada > 30) ){
                return 30;
            }
            mensagem = " A espessura da camada é invalida.";
            return 0;
        }
    }

    //formula para calculo de gessagem -- opcao 1 form
    //unidade de medidas -> necessidadeDeCalcario = tonelada/hectar
    public boolean NecessidadeDeGessagemEquantidadeDeGesso(float calcio, float aluminio, float saturacaoaluminio, float profundidade, float necessidadeDeCalcario, float superficieCobertaPeloGesso, float EspessuraDaCamada) {
        mensagem = "";
        if (verificaprofundidadeamostra(profundidade)) {
            if (necessidadeGessagem(calcio, aluminio, saturacaoaluminio)){
               necessidadeDeGessagem = (float) (necessidadeDeCalcario * 0.3); //valor sera printado no form  
               quantidadeDeGesso = necessidadeDeGessagem * (superficieCobertaPeloGesso/100) * (calculaEspessuraDaCamada(EspessuraDaCamada)/20); 
               System.out.print("Necessidade de gessagem:" +necessidadeDeGessagem);
               System.out.print("Quantidade de gesso:" + quantidadeDeGesso);
               return true;
           }else{
               mensagem = "O solo não necessita de gessagem.";
               return false;
           }  
        } else {
            mensagem = "A profundidade da amostra é invalida."
                    + "A profundidade deve ser superior a 20cm.";    
            return false;
        }
    }
    
    //formula para calculo de gessagem -- opcao 2 form
    //unidades de medida -> tipocultura = opção de menu, argila = % de argila
    public float GessagemPorTeorDeArgila (float calcio, float aluminio, float saturacaoaluminio, int tipocultura, float argila){
        if (necessidadeGessagem(calcio, aluminio, saturacaoaluminio)){
            // cultura anual
            if (tipocultura == 1){

                necessidadeDeGessagem = argila * 50;
                return necessidadeDeGessagem;
            }
            //cultura perene 
            if (tipocultura == 2){
                necessidadeDeGessagem = argila * 75;
                return necessidadeDeGessagem;
            }
        }else{
            mensagem = "O solo não necessita de gessagem.";
        }
        return 0;
    }

}
