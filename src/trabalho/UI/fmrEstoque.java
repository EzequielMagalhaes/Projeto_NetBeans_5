package trabalho.UI;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalho.DAL.estoqueDAL;
import trabalho.DTO.estoqueDTO;

public class fmrEstoque extends javax.swing.JFrame {
    public fmrEstoque() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JTextField();
        lbQtd = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstoque = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListarEstoque = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mnuEstoque = new javax.swing.JMenu();
        itmFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lbQtd.setText("Quandidade");

        lbValor.setText("Valor");

        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        tableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tableEstoque);

        lbTitulo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("CONTROLE DE ESTOQUE");

        lbID.setText("ID");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListarEstoque.setText("LISTAR ESTOQUE");
        btnListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEstoqueActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        mnuEstoque.setMnemonic('f');
        mnuEstoque.setText("Estoque");

        itmFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmFechar.setMnemonic('x');
        itmFechar.setText("Fechar");
        itmFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFecharActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmFechar);

        menuBar.add(mnuEstoque);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbID)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbQtd)
                            .addComponent(lbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtValor)
                            .addComponent(txtID))
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscar)
                        .addContainerGap(315, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarEstoque)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addContainerGap())))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQtd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnListarEstoque)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmFecharActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // INSERIR //
        estoqueDAL estoqueDAL = new estoqueDAL();

        try {
            estoqueDAL.abrirBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar com o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        boolean campoQtdVazio = txtQtd.getText().isEmpty();
        boolean campoValorVazio = txtValor.getText().isEmpty();

        boolean seCadastroInvalido = campoQtdVazio || campoValorVazio;

        if (seCadastroInvalido) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");

            if (campoQtdVazio) {
                txtQtd.requestFocus();
                return;
            }

            txtValor.requestFocus();
            return;
        }

        estoqueDTO estoque = new estoqueDTO();
        estoque.setEstQTD(txtQtd.getText());
        estoque.setEstValorTotal(txtValor.getText());

        try {
            estoqueDAL.IncluirEstoque(estoque);
            JOptionPane.showMessageDialog(null, "Quantidade : " + txtQtd.getText() + " cadastrado(s) com sucesso! ");
            estoqueDAL.fecharBD();
            txtQtd.requestFocus();
            btnListarEstoque.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar novo usuário, por favor entre em contato com o administrador do sistema!");
        }

        this.limparCamposFormularioEstoque();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // EXCLUIR //
        estoqueDAL estoqueDAL = new estoqueDAL();

        try {
            estoqueDAL.abrirBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar com o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        boolean campoIDVazio = txtID.getText().isEmpty();

        if (campoIDVazio) {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente!");
            txtID.requestFocus();
            return;
        }

        try {
            int estID = Integer.parseInt(txtID.getText());
            boolean seEstoqueExiste = estoqueDAL.SelecionarEstoquePorID(estID).getEstID() == estID;

            if (!seEstoqueExiste) {
                return;
            }

            estoqueDAL.ExcluirEstoque(estID);
            JOptionPane.showMessageDialog(null, "Item de ID " + estID + " deletado com sucesso! ");

            estoqueDAL.fecharBD();
            txtID.requestFocus();
            btnListarEstoque.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao deletar este usuário, por favor entre em contato com o administrador do sistema!");
        }

        this.limparCamposFormularioEstoque();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // BUSCAR //
        estoqueDAL estoqueDAL = new estoqueDAL();

        try {
            estoqueDAL.abrirBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar com o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        boolean campoIDVazio = txtID.getText().isEmpty();

        if (campoIDVazio) {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente!");
            txtID.requestFocus();
            return;
        }

        int estID = Integer.valueOf(txtID.getText());
        estoqueDTO dadosEstoque = null;

        try {
            dadosEstoque = estoqueDAL.SelecionarEstoquePorID(estID);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        DefaultTableModel tblEstoque = (DefaultTableModel) tableEstoque.getModel();

        for (int contador = tableEstoque.getRowCount() - 1; contador >= 0; contador--) {
            tblEstoque.removeRow(contador);
        }

        tblEstoque.addRow(new String[1]);

        tableEstoque.setValueAt(dadosEstoque.getEstID(), 0, 0);
        tableEstoque.setValueAt(dadosEstoque.getEstQTD(), 0, 1);
        tableEstoque.setValueAt(dadosEstoque.getEstValorTotal(), 0, 2);

        this.limparCamposFormularioEstoque();
        txtID.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // ALTERAR //
        estoqueDAL estoqueDAL = new estoqueDAL();

        try {
            estoqueDAL.abrirBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar com o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        boolean campoIDVazio = txtID.getText().isEmpty();
        boolean campoQtdVazio = txtQtd.getText().isEmpty();
        boolean campoValorVazio = txtValor.getText().isEmpty();

        boolean seCadastroInvalido = campoQtdVazio || campoValorVazio || campoIDVazio;

        if (seCadastroInvalido) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");

            if (campoQtdVazio) {
                txtQtd.requestFocus();
                return;
            }

            if (campoValorVazio) {
                txtValor.requestFocus();
                return;
            }

            txtID.requestFocus();
            return;
        }

        estoqueDTO estoque = new estoqueDTO();
        estoque.setEstID(Integer.valueOf(txtID.getText()));
        try {
            int valorInteiro = Integer.parseInt(txtQtd.getText());
            String valorString = "" + valorInteiro;
            estoque.setEstQTD(valorString);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Formato inválido, por favor insira um número inteiro");
        }
        try {
            int valorDouble = (int)Double.parseDouble(txtValor.getText());
            String valorString = "" + valorDouble;
            estoque.setEstValorTotal(valorString);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Formato inválido, por favor insira um número inteiro");
        }
        //estoque.setEstQTD(txtQtd.getText());
        //estoque.setEstValorTotal(txtValor.getText());

        try {
            estoqueDAL.AlterarEstoque(estoque);
            JOptionPane.showMessageDialog(null, "Quantidade:  " + txtQtd.getText() + " atualizado com sucesso! ");
            estoqueDAL.fecharBD();
            txtID.requestFocus();
            btnListarEstoque.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar este usuário, por favor entre em contato com o administrador do sistema!");
        }

        this.limparCamposFormularioEstoque();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEstoqueActionPerformed
        // LISTAR TODOS OS ITENS DO ESTOQUE // 
        this.limparCamposFormularioEstoque();
        estoqueDAL estoqueDAL = new estoqueDAL();

        try {
            estoqueDAL.abrirBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao conectar com o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        List<estoqueDTO> listaTodoEstoque = new ArrayList<>();

        try {
            listaTodoEstoque = estoqueDAL.SelecionarListaEstoque();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar o banco de dados, por favor entre em contato com o administrador do sistema!");
        }

        DefaultTableModel tblEstoque = (DefaultTableModel) tableEstoque.getModel();

        for (int contador = tableEstoque.getRowCount() - 1; contador >= 0; contador--) {
            tblEstoque.removeRow(contador);
        }

        int contador = 0;
        for (estoqueDTO estoque : listaTodoEstoque) {
            //Mostra as informações dentro da Tabela
            tblEstoque.addRow(new String[1]);

            tableEstoque.setValueAt(estoque.getEstID(), contador, 0);
            tableEstoque.setValueAt(estoque.getEstQTD(), contador, 1);
            tableEstoque.setValueAt(estoque.getEstValorTotal(), contador, 2);

            contador++;
        }

        this.limparCamposFormularioEstoque();
        txtQtd.requestFocus();
    }//GEN-LAST:event_btnListarEstoqueActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // LIMPAR //
        this.limparCamposFormularioEstoque();
        DefaultTableModel tblEstoque = (DefaultTableModel) tableEstoque.getModel();
        for (int contador = tableEstoque.getRowCount() - 1; contador >= 0; contador--) {
            tblEstoque.removeRow(contador);
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    public void limparCamposFormularioEstoque() {
        txtID.setText("");
        txtQtd.setText("");
        txtValor.setText("");
    }
    
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListarEstoque;
    private javax.swing.JMenuItem itmFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbQtd;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuEstoque;
    private javax.swing.JTable tableEstoque;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private void inserirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("estoque")));
    }
}
