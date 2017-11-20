package calculadora;


//A soma de bases (SB) nos indica o número de cargas negativas dos coloides do solo que está ocupado pelos cátions básicos trocáveis.
// A soma de bases é utilizado no cálculo das CTC's efetiva 
//e a pH 7 ou potencial, no cálculo da percentagem de saturação por bases (V%) ]
//e no cálculo da percentagem de saturação por Al³+.
public class CalcularSolo {
    
    private float somaBase; 
   
    
    //Metodo Construtor
    public CalcularSolo()
{
        somaBase = 0;
}
    
    
    public void setsomaBase(float somaBase)
    {
        this.somaBase = somaBase;
    }
    
    public float getsomaBase()
    {
       return somaBase;
    }
    
    //SB = K + Ca + Mg + (Na)
    public float calculo(float somaBase,float potassio, float calcio, float magnesio, float sodio)
    {
        somaBase = (potassio + calcio + magnesio + sodio);
        return somaBase;
    }
    
    
    
}
    
