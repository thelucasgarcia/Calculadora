/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Lucas
 */
public class CalculodeCalagemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculodeCalagemJFrame
     */
    public CalculodeCalagemJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        capacidadeDeTrocaCationicaTF = new javax.swing.JTextField();
        ValorAtualDeSaturacaoDeBasesTF = new javax.swing.JTextField();
        ValorDesejadoDeSaturacaoDeBasesTF = new javax.swing.JTextField();
        PoderRelativoDeNeutralizacaoTotalTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ValorAtualDeSaturacaoDeBasesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAtualDeSaturacaoDeBasesTFActionPerformed(evt);
            }
        });

        PoderRelativoDeNeutralizacaoTotalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoderRelativoDeNeutralizacaoTotalTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Capacidade de Troca Cationica :");

        jLabel3.setText("Valor Atual de Saturação de Bases :");

        jLabel4.setText("Valor Desejado de Saturação de Bases :");

        jLabel5.setText("Poder Relativo de Neutralização Total :");

        jButton1.setText("Cancelar");

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacidadeDeTrocaCationicaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ValorAtualDeSaturacaoDeBasesTF)
                                .addComponent(ValorDesejadoDeSaturacaoDeBasesTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PoderRelativoDeNeutralizacaoTotalTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultado)
                        .addGap(190, 190, 190))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadeDeTrocaCationicaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorAtualDeSaturacaoDeBasesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorDesejadoDeSaturacaoDeBasesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PoderRelativoDeNeutralizacaoTotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorAtualDeSaturacaoDeBasesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAtualDeSaturacaoDeBasesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorAtualDeSaturacaoDeBasesTFActionPerformed

    private void PoderRelativoDeNeutralizacaoTotalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoderRelativoDeNeutralizacaoTotalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoderRelativoDeNeutralizacaoTotalTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CalculodeCalagem calculo = new CalculodeCalagem();
        float retorno;
        
        float CTC = Float.parseFloat(capacidadeDeTrocaCationicaTF.getText());
        float V1 = Float.parseFloat(ValorAtualDeSaturacaoDeBasesTF.getText());
        float V2 = Float.parseFloat(ValorDesejadoDeSaturacaoDeBasesTF.getText());
        float PRNT = Float.parseFloat(PoderRelativoDeNeutralizacaoTotalTF.getText());
        retorno = calculo.NecessidadeDeCalagem(CTC,V1,V2,PRNT);
        
        resultado.setText("" + retorno);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculodeCalagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculodeCalagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculodeCalagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculodeCalagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculodeCalagemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PoderRelativoDeNeutralizacaoTotalTF;
    private javax.swing.JTextField ValorAtualDeSaturacaoDeBasesTF;
    private javax.swing.JTextField ValorDesejadoDeSaturacaoDeBasesTF;
    private javax.swing.JTextField capacidadeDeTrocaCationicaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
