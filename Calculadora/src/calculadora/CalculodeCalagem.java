/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.String.format;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author Lucas
 */
public class CalculodeCalagem {

      
     private int poderRelativoDeNeutralizacaoTotal;
    
/*  
NC = Necessidade de calagem em toneladas por hectare (ton./ha) 
CTC = Capacidade de troca catiônica (análise de solo) 
V1 =  Valor atual de saturação por bases (análise de solo) 
V2 = Valor desejado de saturação de bases (recomendação para a cultura) 
PRNT = Poder relativo de neutralização total (dados na embalagem do calcário). 
Quando o PRNT não é determinado, adota-se o valor médio de 67% 
 */
        public CalculodeCalagem(){
            this.poderRelativoDeNeutralizacaoTotal = 67;
        }
        public float NecessidadeDeCalagem(float capacidadeDeTrocaCationica,
                        float valorAtualDeSaturacaoDeBases,
                        float valorDesejadoDeSaturacaoDeBases,
                        float poderRelativoDeNeutralizacaoTotal){
            
            float necessidadeDeCalagem;
            
            if (poderRelativoDeNeutralizacaoTotal == 0) {
                poderRelativoDeNeutralizacaoTotal = this.poderRelativoDeNeutralizacaoTotal;
            }
            
            necessidadeDeCalagem = capacidadeDeTrocaCationica * (valorDesejadoDeSaturacaoDeBases - valorAtualDeSaturacaoDeBases)/( 10 * poderRelativoDeNeutralizacaoTotal);
       
                    
            return necessidadeDeCalagem;
            
            
        }
}
