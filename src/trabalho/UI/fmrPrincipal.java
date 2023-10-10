package trabalho.UI;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class fmrPrincipal extends javax.swing.JFrame {

    public fmrPrincipal() {
        initComponents();
        inserirIcone();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        mnuEstoque1 = new javax.swing.JMenu();
        itmFechar = new javax.swing.JMenuItem();
        mnuEstoque = new javax.swing.JMenu();
        itmInserir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        mnuEstoque1.setMnemonic('f');
        mnuEstoque1.setText("Aplicativo de Controle");

        itmFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmFechar.setMnemonic('x');
        itmFechar.setText("Fechar");
        itmFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFecharActionPerformed(evt);
            }
        });
        mnuEstoque1.add(itmFechar);

        menuBar.add(mnuEstoque1);

        mnuEstoque.setMnemonic('f');
        mnuEstoque.setText("Estoque");
        mnuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstoqueActionPerformed(evt);
            }
        });

        itmInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmInserir.setMnemonic('o');
        itmInserir.setText("Itens");
        itmInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInserirActionPerformed(evt);
            }
        });
        itmInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itmInserirKeyPressed(evt);
            }
        });
        mnuEstoque.add(itmInserir);

        menuBar.add(mnuEstoque);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInserirActionPerformed

    }//GEN-LAST:event_itmInserirActionPerformed

    private void itmInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itmInserirKeyPressed

    }//GEN-LAST:event_itmInserirKeyPressed

    private void itmFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFecharActionPerformed
        var confirmacaoSair = JOptionPane.showConfirmDialog(
                null,
                "Deseja Sair do Sistema? ",
                "Aplicativo de Controle",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacaoSair == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_itmFecharActionPerformed

    private void mnuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstoqueActionPerformed
        if ((fmrEstoque == null) || (!fmrEstoque.isVisible())) {
            fmrEstoque = new fmrEstoque();
            fmrEstoque.setVisible(true);
    }//GEN-LAST:event_mnuEstoqueActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmFechar;
    private javax.swing.JMenuItem itmInserir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuEstoque;
    private javax.swing.JMenu mnuEstoque1;
    // End of variables declaration//GEN-END:variables
    private fmrEstoque fmrEstoque;
    
    private void inserirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("estoque")));
    }
}
