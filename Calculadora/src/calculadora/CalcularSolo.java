package calculadora;

//SOMA DE BASE
//A soma de bases (SB) nos indica o número de cargas negativas dos coloides do solo que está ocupado pelos cátions básicos trocáveis.
// A soma de bases é utilizado no cálculo das CTC's efetiva 
//e a pH 7 ou potencial, no cálculo da percentagem de saturação por bases (V%) ]
//e no cálculo da percentagem de saturação por Al³+.
// SOMA DE CTC
//A CTC efetiva reflete a capacidade do solo em reter cátions próximo ao valor do pH natural do solo.
public class CalcularSolo {

    private float somaBase;
    private float somaCTC;
    private float calculoCTCaPH;
    private String mensagem;

    //Metodo Construtor
    public CalcularSolo() {
        somaBase = 0;
        somaCTC = 0;
    }
    //SET

    public void setsomaBase(float somaBase) {
        this.somaBase = somaBase;
    }

    public void setsomaCTC(float somaCTC) {
        this.somaCTC = somaCTC;
    }

    public void setcalculoCTCaPH(float calculoCTCaPH) {
        this.calculoCTCaPH = calculoCTCaPH;
    }

    //GET
    public float getsomaBase() {
        return somaBase;
    }

    public float getsomaCTC() {
        return somaCTC;
    }

    public float getcalculoCTCaPH() {
        return calculoCTCaPH;
    }

    //Cálculo da soma de bases (SB)
    //SB = K + Ca + Mg + (Na)
    public float calculo(float potassio, float calcio, float magnesio, float sodio) {
        somaBase = (potassio + calcio + magnesio + sodio);
        return somaBase;
    }
// Cálculo da CTC efetiva (T)
// CTC efetiva (T) = SB + Al

    public float calculo(float somaBase, float Aluminio) {
        if (somaBase != 0) {
            somaCTC = somaBase + Aluminio;
        } else {
            mensagem = "Por favor inclua o valor da base";
        }
        return 0;

    }

//Cálculo da CTC a pH 7,0 (T)
//T = SB + (H+Al)
    public float calculo(float somaBase, float aluminio, float hidrogenio) {
        if (somaBase != 0) {
            calculoCTCaPH = somaBase + (hidrogenio + aluminio);

        } else {
            mensagem = "Por favor inclua o valor da base";
        }
        return 0;
    }
}
