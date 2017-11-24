
package calculadora;

import javax.swing.ImageIcon;
/**
 *
 * @author Erick
 */
public class IndexJFrame extends javax.swing.JFrame {

    public IndexJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGessagem = new javax.swing.JButton();
        btnAdubagemComposta = new javax.swing.JButton();
        btnCalagem = new javax.swing.JButton();
        btnAdubagemSimples = new javax.swing.JButton();
        btnCalculoCTC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Agrônoma");

        btnGessagem.setText("Gessagem");
        btnGessagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGessagemActionPerformed(evt);
            }
        });

        btnAdubagemComposta.setText("Adubagem Composta");
        btnAdubagemComposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdubagemCompostaActionPerformed(evt);
            }
        });

        btnCalagem.setText("Calagem");
        btnCalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalagemActionPerformed(evt);
            }
        });

        btnAdubagemSimples.setText("Adubagem Simples");
        btnAdubagemSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdubagemSimplesActionPerformed(evt);
            }
        });

        btnCalculoCTC.setText("Calculo CTC");
        btnCalculoCTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoCTCActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agro_logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGessagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalculoCTC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdubagemComposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdubagemSimples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnCalagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGessagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculoCTC))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnAdubagemComposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdubagemSimples)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGessagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGessagemActionPerformed

        GessagemJFrame telaGessagem = new GessagemJFrame();
        telaGessagem.setVisible(true);
    }//GEN-LAST:event_btnGessagemActionPerformed

    private void btnAdubagemCompostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdubagemCompostaActionPerformed
        AdubagemCompostaJFrame telaAdubagemComposta = new AdubagemCompostaJFrame();
        telaAdubagemComposta.setVisible(true);
    }//GEN-LAST:event_btnAdubagemCompostaActionPerformed

    private void btnCalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalagemActionPerformed
        CalculodeCalagemJFrame telaCalculodeCalagem = new CalculodeCalagemJFrame();
        telaCalculodeCalagem.setVisible(true);
    }//GEN-LAST:event_btnCalagemActionPerformed

    private void btnAdubagemSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdubagemSimplesActionPerformed
        AdubagemSimplesJFrame telaAdubasSimples = new AdubagemSimplesJFrame();
        telaAdubasSimples.setVisible(true);
    }//GEN-LAST:event_btnAdubagemSimplesActionPerformed

    private void btnCalculoCTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoCTCActionPerformed
        CalcularSoloJFrame telaCalcularSolo = new CalcularSoloJFrame();
        telaCalcularSolo.setVisible(true);
    }//GEN-LAST:event_btnCalculoCTCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexJFrame().setVisible(true);
                boolean retorno = true;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdubagemComposta;
    private javax.swing.JButton btnAdubagemSimples;
    private javax.swing.JButton btnCalagem;
    private javax.swing.JButton btnCalculoCTC;
    private javax.swing.JButton btnGessagem;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
