
package fatec.poo.model;

/**
 * @author mikae
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }

    public void reservar(){
        this.situacao = true;
    }
    
    public double liberar(int dias){
        this.situacao = false;
        double valorHospedagem = dias * valorDiaria;
        this.totalFaturado += valorHospedagem;
        return valorHospedagem;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setTotalFaturado(double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    
}
