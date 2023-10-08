package trabalho.DAL;

import java.util.ArrayList;
import java.util.List;
import trabalho.DTO.estoqueDTO;

/**
 *
 * @author autologon
 */
public class estoqueDAL extends ConexaoMySQL {
    public void IncluirEstoque(estoqueDTO estoque) throws Exception
    {
        abrirBD();
        SQL = "INSERT INTO estoque (estQTD, estValorTotal) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        
        ps.setInt(3, estoque.getEstQTD());
        ps.setDouble(4, estoque.getEstValorTotal());
        
        ps.execute();
        fecharBD();
    }

    public estoqueDTO SelecionarEstoquePorID(int estID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM estoque WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estID);
        rs = ps.executeQuery();
        
        estoqueDTO estoque = new estoqueDTO();
        if(rs.next())
        {
            estoque.setEstID(rs.getInt("estID"));
            estoque.setEstQTD(rs.getInt("estQTD"));
            estoque.setEstValorTotal(rs.getDouble("estValorTotal"));
            fecharBD();            
        }
        return estoque;
    }
    
    public List SelecionarListaEstoque() throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM estoque ORDER BY estID";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaEstoque = new ArrayList();
        while(rs.next())
        {
            estoqueDTO estoque = new estoqueDTO();
            estoque.setEstID(rs.getInt("estID"));
            estoque.setEstQTD(rs.getInt("estQTD"));
            estoque.setEstValorTotal(rs.getDouble("estValorTotal"));
            listaEstoque.add(estoque);         
        }
        fecharBD();
        return listaEstoque;
    }
    
    public void AlterarEstoque(estoqueDTO estoque) throws Exception
    {
        abrirBD();         
        SQL = "UPDATE estoque SET estQTD = ?, estValorTotal = ? WHERE estID = ?";
        ps = con.prepareStatement(SQL);
 
        ps.setInt(1, estoque.getEstQTD());
        ps.setDouble(2,estoque.getEstValorTotal());
        ps.setInt(3, estoque.getEstID());
        ps.execute();
        fecharBD();
    }
    
    public void ExcluirEstoque(int estID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM estoque WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estID);
        ps.execute();
        fecharBD();
    }
}