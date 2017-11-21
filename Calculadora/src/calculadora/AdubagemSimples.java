/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author BMorais
 */
class AdubagemSimples {

    private float QuantidadeRecomendada; //QR
    private float TeorDeNutriente;          //TN
    private float QuantidadeAplicar;        //QA

    public AdubagemSimples() {
        QuantidadeRecomendada = TeorDeNutriente = 0;

    }

    public void setQuantidadeRecomendada(float QuantidadeRecomendada) {
        this.QuantidadeRecomendada = QuantidadeRecomendada;
    }

    public void setTeorDeNutriente(float TeorDeNutriente) {
        this.TeorDeNutriente = TeorDeNutriente;
    }

    public void setQuantidadeAplicar(float QuantidadeAplicar) {
        this.QuantidadeAplicar = QuantidadeAplicar;
    }

    public float getQuantidadeRecomendada() {
        return QuantidadeRecomendada;
    }

    public float getTeorDeNutriente() {
        return TeorDeNutriente;
    }

    public float getQuantidadeAplicar() {
        return QuantidadeAplicar;
    }

    public float calculo(float QuantidadeRecomendada, float TeorDeNutriente) {
        QuantidadeAplicar = (100 * QuantidadeRecomendada) / TeorDeNutriente;

        return QuantidadeAplicar;

    }

    void setQuantidadeRecomendada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTeorDeNutriente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    float calculo(float parseFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
