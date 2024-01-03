package fatec.poo.control;

import fatec.poo.model.Hospede;
import static fatec.poo.model.Hospede.validarCPF;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author Joâo Antonio Martins Ghizzi
 */
public class DaoHospede {
    private Connection conn;
    
    public DaoHospede(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Hospede hospede) {
        if (validarCPF(hospede.getCpf())) {
            PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("INSERT INTO tbHospede (nome, email, endereco, telefone, CPF, taxaDesconto) VALUES (?, ?, ?, ?, ?, ?)");
                ps.setString(1, hospede.getNome());
                ps.setString(2, hospede.getEmail());
                ps.setString(3, hospede.getEndereco());
                ps.setString(4, hospede.getTelefone());
                ps.setString(5, hospede.getCpf());
                ps.setDouble(6, hospede.getTaxaDesconto());

                ps.executeUpdate();

                System.out.println("Hóspede inserido com sucesso!");
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        } else {
            System.out.println("CPF inválido. Hóspede não inserido.");
        }
    }

    
    public void alterar(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbHospede SET nome = ?, email = ?, endereco = ?, telefone = ?, taxaDesconto = ? " +
                                       "WHERE CPF = ?");

            ps.setString(1, hospede.getNome());
            ps.setString(2, hospede.getEmail());
            ps.setString(3, hospede.getEndereco());
            ps.setString(4, hospede.getTelefone());
            ps.setDouble(5, hospede.getTaxaDesconto());
            ps.setString(6, hospede.getCpf());

            ps.execute();

            System.out.println("Hóspede alterado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public Hospede consultar(String cpf) {
        Hospede hospede = null;
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM tbHospede WHERE CPF = ?");
            ps.setString(1, cpf);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                hospede = new Hospede(
                    cpf,
                    rs.getString("nome")
                );
                hospede.setEmail(rs.getString("email"));
                hospede.setEndereco(rs.getString("endereco"));
                hospede.setTelefone(rs.getString("telefone"));
                hospede.setTaxaDesconto(rs.getDouble("taxaDesconto"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

        return hospede;
    }
    
    public void excluir(String cpf) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("DELETE FROM tbHospede WHERE CPF = ?");
            ps.setString(1, cpf);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Hóspede excluído com sucesso!");
            } else {
                System.out.println("Hóspede com CPF " + cpf + " não encontrado.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
