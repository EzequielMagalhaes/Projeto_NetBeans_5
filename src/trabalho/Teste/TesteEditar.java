package trabalho.Teste;

import trabalho.DAL.estoqueDAL;
import trabalho.DTO.estoqueDTO;

/**
 *
 * @author mgome
 */
public class TesteEditar {

    public static void main(String[] args) throws Exception {
        estoqueDTO estoque = new estoqueDTO();
        int estID = 1;

        estoque.setEstID(estID);
        estoque.setEstQTD(26);
        estoque.setEstValorTotal(123123);

        estoqueDAL estoqueDAL = new estoqueDAL();
        estoqueDAL.AlterarEstoque(estoque);

        System.out.println("Quantidade:  " + estoque.getEstQTD() + " itens editado(s) com sucesso!");
    }
}
