package trabalho.Teste;

import trabalho.DAL.estoqueDAL;
import trabalho.DTO.estoqueDTO;

/**
 *
 * @author mgome
 */
public class TesteCadastrar {

    public static void main(String[] args) throws Exception {
        estoqueDTO estoque = new estoqueDTO();
        estoque.setEstQTD(13);
        estoque.setEstValorTotal(135);
        estoqueDAL eleitorDAL = new estoqueDAL();
        eleitorDAL.IncluirEstoque(estoque);
        System.out.println("Quantidade : " + estoque.getEstQTD() + " cadastrado(s) com sucesso!");
    }

}
