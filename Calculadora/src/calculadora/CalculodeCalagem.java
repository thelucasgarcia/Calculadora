/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.String.format;

/**
 *
 * @author Lucas
 */
public class CalculodeCalagem {

        private float PRNT;
    
/*  
NC = Necessidade de calagem em toneladas por hectare (ton./ha) 
CTC = Capacidade de troca catiônica (análise de solo) 
V1 =  Valor atual de saturação por bases (análise de solo) 
V2 = Valor desejado de saturação de bases (recomendação para a cultura) 
PRNT = Poder relativo de neutralização total (dados na embalagem do calcário). 
Quando o PRNT não é determinado, adota-se o valor médio de 67% 
 */
        public CalculodeCalagem(){
            this.PRNT = 67;
        }
        public float NC(int CTC,float V1,float V2,float PRNT){
            
            float nc;
            
            if (PRNT == 0) {
                PRNT = this.PRNT;
            }
            
            nc = CTC*(V2-V1)/(10*PRNT);
     
            return nc;
            
            
        }
}
