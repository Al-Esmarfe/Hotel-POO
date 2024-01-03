
package fatec.poo.model;

/**
 *
 * @author mikae
 */
public class ServicoQuarto {
    private final int codigo;
    private final String descricao;
    private double valor;

    public ServicoQuarto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public ServicoQuarto() {
        this.codigo = 0;
        this.descricao = "";
    }

    // Métodos de acesso
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
