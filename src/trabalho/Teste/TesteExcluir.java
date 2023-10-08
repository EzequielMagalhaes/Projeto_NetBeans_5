/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Teste;

import trabalho.DAL.estoqueDAL;
import trabalho.DTO.estoqueDTO;

/**
 *
 * @author mgome
 */
public class TesteExcluir {

    public static void main(String[] args) throws Exception {
        estoqueDAL estoqueDAL = new estoqueDAL();

        int EstID = 1;
        estoqueDAL.ExcluirEstoque(EstID);

        System.out.println("Item de id " + EstID + " excluido com sucesso!");
    }
}
