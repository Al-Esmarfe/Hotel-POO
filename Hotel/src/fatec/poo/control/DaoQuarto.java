package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fatec.poo.model.Quarto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoQuarto {
    private Connection conn;

    public DaoQuarto(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Quarto quarto) {
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO tbQuarto(Numero, tipo, situacao, valorDiaria) VALUES(?,?,?,?)")) {
            ps.setInt(1, quarto.getNumero());
            ps.setString(2, quarto.getTipo());
            ps.setString(3, "0");
            ps.setDouble(4, quarto.getValorDiaria());

            ps.execute();
        } catch (SQLException ex) {
            System.err.println("Erro ao inserir quarto: " + ex.getMessage());
        }
    }

    public void alterar(Quarto quarto) {
        try (PreparedStatement ps = conn.prepareStatement("UPDATE tbQuarto SET valorDiaria = ?, tipo = ?, situacao = ?, totalFaturado = ? "
                + "WHERE Numero = ?")) {
            ps.setDouble(1, quarto.getValorDiaria());
            ps.setString(2, quarto.getTipo());
            
            int situacao;
            if(quarto.getSituacao() == false){
                situacao = 0;
            } else {
                situacao = 1;
            }
                
            ps.setInt(3, situacao);
            ps.setDouble(4, quarto.getTotalFaturado());
            System.out.println("Total Faturado depois do update sql" + quarto.getTotalFaturado());
            ps.setInt(5, quarto.getNumero());

            ps.execute();
        } catch (SQLException ex) {
            System.err.println("Erro ao alterar quarto: " + ex.getMessage());
        }
    }

    public Quarto consultar(int numero) {
        Quarto q = null;

        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM tbQuarto WHERE Numero = ?")) {
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                q = new Quarto(numero, rs.getString("tipo"), rs.getDouble("valorDiaria"));
                if(rs.getInt("Situacao") == 1) {
                    q.setSituacao(true);
                } else {
                    q.setSituacao(false);
                }
                q.setTotalFaturado(rs.getDouble("totalFaturado"));
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao consultar quarto: " + ex.getMessage());
        }
        return q;
    }

    public void excluir(Quarto quarto) {
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM tbQuarto WHERE Numero = ?")) {
            ps.setInt(1, quarto.getNumero());

            ps.execute();
        } catch (SQLException ex) {
            System.err.println("Erro ao excluir quarto: " + ex.getMessage());
        }
    }
    
    public double pesquisarTotalFaturamento(String tipoEstadia) {
    double totalFaturado = 0;
        if(tipoEstadia == "Todos") {
            try (PreparedStatement ps = conn.prepareStatement("SELECT SUM(totalFaturado) AS Total_Faturado FROM tbQuarto");) {


                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    totalFaturado = rs.getDouble("Total_Faturado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoQuarto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           try (PreparedStatement ps = conn.prepareStatement("SELECT SUM(totalFaturado) AS Total_Faturado FROM tbQuarto WHERE tipo = ?");) {

                ps.setString(1, tipoEstadia);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    totalFaturado = rs.getDouble("Total_Faturado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoQuarto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return totalFaturado;
    }


}