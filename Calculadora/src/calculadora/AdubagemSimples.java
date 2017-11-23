/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author bruno
 */
public class AdubagemSimples {
    
    /*
Onde: 
QA = Quantidade a aplicar               100 x QR 
QR = Quantidade recomendada     QA = -----------------
TN = Teor de nutriente do adubo             TN 
 
Exemplo: 
A recomendação para a adubação de Nitrogênio é 60 kg/ha. Se usarmos como fonte de N  o Sulfato de Amônio ( 20% de N) , a quantidade necessária será: 
            100 x 60           6000 
QA = --------------  = ----------- = 300 kg/ha 
	20 	20 
*/
    
    
    public float calculo(float QuantidadeRecomendada, float TeorDeNutriente) {
        
       float QuantidadeAplicar;
        QuantidadeAplicar = (100 * QuantidadeRecomendada) / TeorDeNutriente;

        return QuantidadeAplicar;

    }

    
}
