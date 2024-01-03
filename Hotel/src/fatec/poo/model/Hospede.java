package fatec.poo.model;

import java.util.ArrayList;



public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private String email;
    
    //atributos de multiplicidade 1 para muitos
    private ArrayList<Registro> registros;

    public Hospede(String cpf, String nome) {
        super(nome);

        this.cpf = cpf;
        this.registros = new ArrayList<>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        validarTaxaDesconto(taxaDesconto);
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
  
    public static boolean validarCPF(String cpf) {
        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
 
        // Verificar se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }
 
        // Verificar se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
 
        // Calcular o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int digito1 = soma % 11 < 2 ? 0 : 11 - (soma % 11);
 
        // Verificar o primeiro dígito verificador
        if (Character.getNumericValue(cpf.charAt(9)) != digito1) {
            return false;
        }
 
        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int digito2 = soma % 11 < 2 ? 0 : 11 - (soma % 11);
 
        // Verificar o segundo dígito verificador
        if (Character.getNumericValue(cpf.charAt(10)) != digito2) {
            return false;
        }
 
        // CPF válido
        return true;
    }
    

    private void validarTaxaDesconto(double taxaDesconto) {
        if (taxaDesconto < 0 || taxaDesconto > 100) {
            throw new IllegalArgumentException("Taxa de desconto inválida");
        }
    }
    
    // métodos adicionais para a multiplicidade
    public void addRegistro(Registro r) {
        registros.add(r);
        r.setHospede(this);
    }
}
