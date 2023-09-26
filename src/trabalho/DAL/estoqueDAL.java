package trabalho.DAL;

import java.util.ArrayList;
import java.util.List;
import trabalho.DTO.estoqueDTO;

/**
 *
 * @author autologon
 */
public class estoqueDAL extends ConexaoMySQL {
    public void incluirEstoque(estoqueDTO estoque) throws Exception
    {
        //Prepara a conexão com o MySQL
        abrirBD();
        SQL = "INSERT INTO estoque (estID,estQTD, estValorTotal) VALUES (?, ?, ?)";
        ps = con.prepareStatement(SQL);
        //Busca os valores da classe clienteDTO
        ps.setInt(1, estoque.getEstID());
        ps.setInt(3, estoque.getEstQTD());
        ps.setDouble(4, estoque.getEstValorTotal());
        ps.execute();
        fecharBD();
    }

    public estoqueDTO selecionarEstoquePorID(Integer estID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM estoque WHERE est_ID=?";
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
    //Método que vai selecionar todos os clientes no nosso Banco de Dados
    //e ordenar por nome do cliente
    public List selecionarListaEstoque() throws Exception
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
    //Método que vai fazer as alterações necessárias nos dados dos clientes
    //selecionados por seu código no nosso Banco de Dados
    
    public void alterarEstoque(estoqueDTO estoque) throws Exception
    {
        abrirBD();         
        SQL = "UPDATE estoque SET estQTD = ?, estValorTotal = ? WHERE estID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estoque.getEstID());
        ps.setInt(2, estoque.getEstQTD());
        ps.setDouble(3, (estoque.getEstValorTotal()));
        ps.execute();
        fecharBD();
    }
    
    public void excluirEstoque(Integer estID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM estoque WHERE estID=?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, estID);
        ps.execute();
        fecharBD();
    }
}