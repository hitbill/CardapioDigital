/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardapio;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class Cadastros extends javax.swing.JFrame {
    

    /**
     * Creates new form Cadastros
     */
    public Cadastros() {
        initComponents();
        jInternalFrameCadastrarItem.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCadastrarItem = new javax.swing.JInternalFrame();
        jButton_Cadastar_Item_Salvar = new javax.swing.JButton();
        jButton_Cadastar_Item_Cancelar = new javax.swing.JButton();
        jText_Cadastar_Item_Name = new javax.swing.JTextField();
        jLabel_Nome_Do_Produto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuCadastrarBar = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemItem = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameCadastrarItem.setTitle("Cadastrar Novo Item");
        jInternalFrameCadastrarItem.setVisible(false);

        jButton_Cadastar_Item_Salvar.setBackground(new java.awt.Color(200, 255, 200));
        jButton_Cadastar_Item_Salvar.setText("Cadastrar");
        jButton_Cadastar_Item_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastar_Item_SalvarActionPerformed(evt);
            }
        });

        jButton_Cadastar_Item_Cancelar.setBackground(new java.awt.Color(255, 200, 200));
        jButton_Cadastar_Item_Cancelar.setText("Cancelar");
        jButton_Cadastar_Item_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastar_Item_CancelarActionPerformed(evt);
            }
        });

        jText_Cadastar_Item_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cadastar_Item_NameActionPerformed(evt);
            }
        });

        jLabel_Nome_Do_Produto.setText("Nome do Produto:");

        javax.swing.GroupLayout jInternalFrameCadastrarItemLayout = new javax.swing.GroupLayout(jInternalFrameCadastrarItem.getContentPane());
        jInternalFrameCadastrarItem.getContentPane().setLayout(jInternalFrameCadastrarItemLayout);
        jInternalFrameCadastrarItemLayout.setHorizontalGroup(
            jInternalFrameCadastrarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrarItemLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jInternalFrameCadastrarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrameCadastrarItemLayout.createSequentialGroup()
                        .addComponent(jButton_Cadastar_Item_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_Cadastar_Item_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jInternalFrameCadastrarItemLayout.createSequentialGroup()
                        .addComponent(jLabel_Nome_Do_Produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_Cadastar_Item_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jInternalFrameCadastrarItemLayout.setVerticalGroup(
            jInternalFrameCadastrarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrarItemLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jInternalFrameCadastrarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Cadastar_Item_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nome_Do_Produto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jInternalFrameCadastrarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cadastar_Item_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cadastar_Item_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jInternalFrameCadastrarItem);
        jInternalFrameCadastrarItem.setBounds(190, 70, 430, 259);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardapio/bg_cadastro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 500);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemItem.setText("Item");
        jMenuItemItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemItemActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemItem);

        jMenuCadastrarBar.add(jMenuCadastrar);

        jMenuAjuda.setText("Ajuda");

        jMenuAbout.setText("Sobre");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAbout);

        jMenuCadastrarBar.add(jMenuAjuda);

        setJMenuBar(jMenuCadastrarBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        JOptionPane.showMessageDialog(null,"Software desenvolvido por: \n Flávio \n Paulo \n\n versão: 0.1");
        
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuItemItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemItemActionPerformed
        jInternalFrameCadastrarItem.setVisible(true);        
    }//GEN-LAST:event_jMenuItemItemActionPerformed

    private void jButton_Cadastar_Item_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastar_Item_SalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cadastar_Item_SalvarActionPerformed

    private void jButton_Cadastar_Item_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastar_Item_CancelarActionPerformed
        jText_Cadastar_Item_Name.setText(null);
        jInternalFrameCadastrarItem.setVisible(false);
    }//GEN-LAST:event_jButton_Cadastar_Item_CancelarActionPerformed

    private void jText_Cadastar_Item_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cadastar_Item_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cadastar_Item_NameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastar_Item_Cancelar;
    private javax.swing.JButton jButton_Cadastar_Item_Salvar;
    private javax.swing.JInternalFrame jInternalFrameCadastrarItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Nome_Do_Produto;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuBar jMenuCadastrarBar;
    private javax.swing.JMenuItem jMenuItemItem;
    private javax.swing.JTextField jText_Cadastar_Item_Name;
    // End of variables declaration//GEN-END:variables
}