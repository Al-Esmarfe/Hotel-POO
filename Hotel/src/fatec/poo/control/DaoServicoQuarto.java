
package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.ServicoQuarto;
/**
 * @author mikae
 */
public class DaoServicoQuarto {
     private Connection conn;
    
    public DaoServicoQuarto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(ServicoQuarto servicoquarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbServicoQuarto(codigo, descricao, valor) VALUES(?,?,?)");
            ps.setInt(1, servicoquarto.getCodigo());
            ps.setString(2, servicoquarto.getDescricao());
            ps.setDouble(3, servicoquarto.getValor());

            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ServicoQuarto servicoquarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbServicoQuarto set descricao = ? , valor = ?" +
                                                 "where Codigo = ?");
            
            
            ps.setString(1, servicoquarto.getDescricao());
            ps.setDouble(2, servicoquarto.getValor());
            ps.setInt(3, servicoquarto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  ServicoQuarto consultar (int codigo) {
        ServicoQuarto sq = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbServicoQuarto where " +
                                                 "codigo = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                sq = new ServicoQuarto (codigo, rs.getString("descricao"));//helpa euu
                sq.setValor(rs.getDouble("valor"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (sq);
    }    
     
     public void excluir(ServicoQuarto servicoquarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbServicoQuarto where codigo = ?");
            
            ps.setInt(1, servicoquarto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
