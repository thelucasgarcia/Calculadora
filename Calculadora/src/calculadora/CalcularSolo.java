package calculadora;


//A soma de bases (SB) nos indica o número de cargas negativas dos coloides do solo que está ocupado pelos cátions básicos trocáveis.
// A soma de bases é utilizado no cálculo das CTC's efetiva 
//e a pH 7 ou potencial, no cálculo da percentagem de saturação por bases (V%) ]
//e no cálculo da percentagem de saturação por Al³+.
public class CalcularSolo {
    
    private float SomaBase; 
   
    
    //Metodo Construtor
    public CalcularSolo()
{
        SomaBase = 0;
}
    
    
    public void setSomaBase(float somaBase)
    {
        this.SomaBase = SomaBase;
    }
    
    public float getSomaBase()
    {
       return SomaBase;
    }
    
    //SB = K + Ca + Mg + (Na)
    public float calculo(float SomaBase,float potassio, float calcio, float magnesio, float sodio)
    {
        SomaBase = (potassio + calcio + magnesio + sodio);
        return SomaBase;
    }
    
    
    
}
    
