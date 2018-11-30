/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DAO.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Model.PvendaModel;

/**
 *
 * @author innanplinio
 */
public class PvendaDAO {
    
    private final String SQLINCLUIR = "INSERT INTO Pvenda VALUES (?,?)";
    private final String SQLALTERAR = "UPDATE Pvenda SET precoVenda = ? WHERE idVeiculo = ?";
    private final String SQLEXCLUIR = "DELETE FROM Pvenda WHERE idVeiculo = ?";
    private final String SQLCONSULTAR = "SELECT * FROM Pvenda WHERE idVeiculo = ?";
    
    
    //TESTAR
    public boolean incluir(PvendaModel Pvenda){ //CHECK
        try{
            PreparedStatement ps = ConexaoBD.getConexaoBD().prepareStatement(SQLINCLUIR); // serve para substituir o codigo de cima
            ps.setInt(1, Pvenda.getIdVeiculo());
            ps.setFloat(2,Pvenda.getPrecoVenda());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterar(PvendaModel Pvenda){ //CHECK
        try{
            PreparedStatement ps = ConexaoBD.getConexaoBD().prepareStatement(SQLALTERAR);
            
            ps.setFloat(1, Pvenda.getPrecoVenda());
            ps.setInt(2, Pvenda.getIdVeiculo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(PvendaModel Pvenda){
        try{
            PreparedStatement ps = ConexaoBD.getConexaoBD().prepareStatement(SQLEXCLUIR);
            ps.setInt(1,Pvenda.getIdVeiculo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public PvendaModel consultar(int idVeiculo){ //CHECK
        try{
            PvendaModel Pvenda = new PvendaModel();
            PreparedStatement ps = ConexaoBD.getConexaoBD().prepareStatement(SQLCONSULTAR);
            ps.setInt(1,idVeiculo);
            ResultSet rs = ps.executeQuery(); // começa lendo o arquivo antes do primeiro registro (bof - bottom of file)
            if(rs.next()){ // peço pro rs pular pro primeiro registro encontrado
                Pvenda.setIdVeiculo(idVeiculo);
                Pvenda.setPrecoVenda(rs.getFloat(2));
                return Pvenda;
            }
        } catch (SQLException e){
            e.printStackTrace();
           
            return null;
        }
        return null;
    }
    
}
