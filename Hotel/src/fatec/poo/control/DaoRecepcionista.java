package fatec.poo.control;

import fatec.poo.model.Recepcionista;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

/**
*
* @author 0030482211028
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class DaoRecepcionista {

    private Connection conn;
 
    public DaoRecepcionista(Connection conn) {
        this.conn = conn;
    }
 
    public void inserir(Recepcionista recepcionista) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbRecepcionista (nome, endereco, Telefone, RegFunc, Turno) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setInt(4, recepcionista.getRegFunc());
            ps.setString(5, recepcionista.getTurno());
            ps.executeUpdate();
 
            System.out.println("Recepcionista inserido com sucesso!");

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

    public void alterar(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbRecepcionista SET nome = ?, endereco = ?, telefone = ?, Turno = ? " +
                                       "WHERE RegFunc = ?");
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getTurno());
            ps.setInt(5, recepcionista.getRegFunc());
            ps.execute();
 
            System.out.println("Recepcionista alterado com sucesso!");
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

    public Recepcionista consultar(int regFunc) {

        Recepcionista recepcionista = null;

        PreparedStatement ps = null;

        try {

            ps = conn.prepareStatement("SELECT * FROM tbRecepcionista WHERE regFunc = ?");
            ps.setInt(1, regFunc);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                recepcionista = new Recepcionista(
                    rs.getInt("regFunc"),
                    rs.getString("nome")
                );

                recepcionista.setEndereco(rs.getString("endereco"));
                recepcionista.setTelefone(rs.getString("telefone"));
                recepcionista.setTurno(rs.getString("Turno"));
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

        return recepcionista;
    }

     public void excluir(String regFunc) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbRecepcionista WHERE regFunc = ?");
            ps.setString(1, regFunc);
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Recepcionista excluído com sucesso!");
            } else {
                System.out.println("Recepcionista com Registro Funcional " + regFunc + " não encontrado.");
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
