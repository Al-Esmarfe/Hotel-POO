/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author mateu
 */
public class DaoRegistro {
    private Connection conn; 
     
    
 
    public DaoRegistro(Connection conn) {
        this.conn = conn;
    }
    
    public Registro consultar(int codigo) {

        Registro registro = null;

        PreparedStatement ps = null;

        try {

            ps = conn.prepareStatement("SELECT * FROM Registro WHERE codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            

            if (rs.next()) {
                Date dateEntrada = rs.getDate("dataEntrada");
                LocalDate dataEntrada = dateEntrada.toLocalDate();
                
                
                registro = new Registro(
                    rs.getInt("codigo"),
                    dataEntrada,
                    new DaoRecepcionista(conn).consultar(rs.getInt("RegFunc"))
                );
                
                registro.setHospede(new DaoHospede(conn).consultar(rs.getString("CPF")));
                registro.setQuarto(new DaoQuarto(conn).consultar(rs.getInt("NumeroQuarto")));
                registro.setValorHospedagem(rs.getDouble("valorHospedagem"));
                
                Date dateSaida = rs.getDate("dataSaida");
                LocalDate dataSaida = (dateSaida != null) ? dateSaida.toLocalDate() : null;
                registro.setDataSaida(dataSaida);
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

        return registro;
    }
    
    public void reservar (Registro registro) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO Registro "
                    + "(codigo, dataEntrada, RegFunc, CPF, NumeroQuarto) "
                    + "VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, registro.getCodigo());
            
            java.sql.Date sqlDate = java.sql.Date.valueOf(registro.getDataEntrada()); 
            ps.setDate(2, sqlDate);
            
            ps.setInt(3, registro.getRecepcionista().getRegFunc());
            ps.setString(4, registro.getHospede().getCpf());
            ps.setInt(5, registro.getQuarto().getNumero());
            ps.executeUpdate();
 
            System.out.println("Registro inserido com sucesso!");

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

    public void liberar(Registro registro) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Registro SET dataSaida = ?, valorhospedagem = ?" +
                                       "WHERE codigo = ?");
            java.sql.Date sqlDate = java.sql.Date.valueOf(registro.getDataSaida()); 
            ps.setDate(1, sqlDate);
            
            ps.setDouble(2, registro.getValorHospedagem());
            System.out.println("Valor Hospedagem " + registro.getValorHospedagem());
            ps.setInt(3, registro.getCodigo());
            ps.execute();
 
            System.out.println("DataSaida alterada com sucesso!");
        } catch (SQLException ex) {
            System.out.println("DaoRegistro (catch) " + ex.toString());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Dao Registro " + ex.toString());
            }
        }
    }
}