package calculadora;

/**
 *
 * @author rafael
 */
public class AdubagemComposta {
    
    public float multiplicaAeB(float quiloMistura, float elementoMistura){
    float resultado;
    resultado = (quiloMistura * (quiloMistura *elementoMistura /100));
    return resultado;
    }

    public float divideAeBcomC(float quiloMistura,float resultado1, float porcentagemElementoAdubo){
    float resultado;
    resultado = (resultado1 / (quiloMistura*porcentagemElementoAdubo/100));
    return resultado;
    }
    
}
