package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mateu
 */
public class Registro {
    // Atributos
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;

    // Atributos de multiplicidade 1
    private Hospede hospede;
    private Recepcionista recepcionista;
    private Quarto quarto;

    // Atributo de multiplicidade 1..*
    private ArrayList<ServicoQuarto> servicoQuarto;

    // Conjunto para armazenar códigos existentes
    private static Set<Integer> codigosExistentes = new HashSet<>();

    // Método construtor
    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;

        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        this.servicoQuarto = new ArrayList<>();
    }

    // Métodos set e get

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public Quarto getQuarto() {
        return quarto;
    }
    
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setValorHospedagem(double valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }
    
    
    // Outros métodos da classe
    public void reservarQuarto(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        hospede.addRegistro(this);
        this.quarto = quarto;
        quarto.reservar();
    }

    public double liberarQuarto() {
        int diasHospedados = (int) dataEntrada.until(dataSaida).getDays();
        double valorLiberacao = quarto.liberar(diasHospedados);

        double totalServicos = 0;
        for (int i = 0; i < servicoQuarto.size(); i++) {
            totalServicos += servicoQuarto.get(i).getValor();
        }

        return (valorLiberacao - (valorLiberacao * hospede.getTaxaDesconto() / 100) + totalServicos);
    }

    // Métodos adicionais para multiplicidade
    public void addServicoQuarto(ServicoQuarto sQ) {
        servicoQuarto.add(sQ);
    }
    
}
