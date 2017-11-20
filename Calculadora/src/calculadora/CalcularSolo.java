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
   
    
    //Metodo Construtor
    public CalcularSolo()
{
        somaBase = 0;
        somaCTC = 0;
}
    //SET
    
    public void setsomaBase(float somaBase)
    {
        this.somaBase = somaBase;
    }
    
    public void setsomaCTC(float somaCTC)
    {
        this.somaCTC = somaCTC;
    }
  
    
    //GET
    
    public float getsomaBase()
    {
       return somaBase;
    }
    public float getsomaCTC()
    {
        return somaCTC;
    }
    
    
    
   
    //SB = K + Ca + Mg + (Na)
    public float calculo(float potassio, float calcio, float magnesio, float sodio)
    {
        somaBase = (potassio + calcio + magnesio + sodio);
        return somaBase;
    }
    
// CTC efetiva (T) = K + Ca + Mg + Al  ou (T) = SB + Al
    public float calculo(float somaBase, float Aluminio)
    {   
        
        somaCTC = (somaBase + Aluminio);
                return somaCTC;
    }
    
    
    
    
}