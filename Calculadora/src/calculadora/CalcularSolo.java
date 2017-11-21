package calculadora;

//SOMA DE BASE
//A soma de bases (SB) nos indica o número de cargas negativas dos coloides do solo que está ocupado pelos cátions básicos trocáveis.
// A soma de bases é utilizado no cálculo das CTC's efetiva 
//e a pH 7 ou potencial, no cálculo da percentagem de saturação por bases (V%) ]
//e no cálculo da percentagem de saturação por Al³+.
// SOMA DE CTC
//A CTC efetiva reflete a capacidade do solo em reter cátions próximo ao valor do pH natural do solo.
public class CalcularSolo {

   private String mensagem;
    

    //Cálculo da soma de bases (SB)
    //SB = K + Ca + Mg + (Na)
    public float calculoBase(float potassio, float calcio, float magnesio, float sodio) {
        float somaBase;
        somaBase = (potassio + calcio + magnesio + sodio);
        return somaBase;
    }
// Cálculo da CTC efetiva (T)
// CTC efetiva (T) = SB + Al

    public float calculoCTC(float somaBase, float Aluminio) {
        float somaCTC;
        if (somaBase != 0) {
            somaCTC = somaBase + Aluminio;
        } else {
            mensagem = "Por favor inclua o valor da base";
        }
        return 0;

    }

}
