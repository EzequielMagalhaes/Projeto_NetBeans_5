/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Teste;

import trabalho.DAL.estoqueDAL;
import trabalho.DTO.estoqueDTO;
import java.util.List;

/**
 *
 * @author mgome
 */
public class TesteListar {

    public static void main(String[] args) throws Exception {
        estoqueDAL estoqueDAL = new estoqueDAL();
        int estID = 1;

        List listaEstoque = estoqueDAL.SelecionarListaEstoque();
        estoqueDTO estoque = estoqueDAL.SelecionarEstoquePorID(estID);
        int quantidadeEstoque = listaEstoque.size();

        if (quantidadeEstoque > 1) {
            System.out.println("Lista de estoque possui " + quantidadeEstoque + " itens cadastrados!");
        }
        
        if (estoque != null) {
            System.out.println("Item de id " + estoque.getEstID() + " encontrado com sucesso!");
        }
    }
}
