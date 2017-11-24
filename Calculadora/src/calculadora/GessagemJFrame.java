package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class GessagemJFrame extends javax.swing.JFrame {

    public GessagemJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeCultura = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tfCalcio = new javax.swing.JTextField();
        tfProfundidade = new javax.swing.JTextField();
        tfSaturacaoAluminio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tfSuperficieGesso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEspessuraCamada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfNecessidadeCalcario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCalcularNecessidadeGessagem = new javax.swing.JButton();
        mensagem = new javax.swing.JLabel();
        quantidadeGesso = new javax.swing.JLabel();
        necessidadeGesso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        culturaPerene = new javax.swing.JRadioButton();
        culturaAnual = new javax.swing.JRadioButton();
        tfPorcentagemArgila = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mensagem1 = new javax.swing.JLabel();
        necessidadeGessagemArgila = new javax.swing.JLabel();
        btnCalcularPorcentagemArgila = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfAluminio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculo de gessagem");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfCalcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCalcioActionPerformed(evt);
            }
        });

        jLabel1.setText("Calcio:");

        jLabel2.setText("Aluminio:");

        jLabel3.setText("Saturação Aluminio:");

        jLabel4.setText("Profundidade da amostra:");

        jLabel5.setText("Superfície coberta pelo gesso:");

        jLabel6.setText("Espessura da camada onde o gesso deverá agir:");

        jLabel7.setText("Necessidade de calcário recomendada para o solo:");

        btnCalcularNecessidadeGessagem.setText("Calcular");
        btnCalcularNecessidadeGessagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularNecessidadeGessagemActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Quantidade de Gesso (t/ha):");

        jLabel15.setText("Necessidade de gessagem (t/ha):");

        jLabel16.setText("%");

        jLabel17.setText("cm");

        jLabel19.setText("kg/ha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnCalcularNecessidadeGessagem)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfSuperficieGesso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfEspessuraCamada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensagem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(quantidadeGesso))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(necessidadeGesso))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNecessidadeCalcario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagem)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSuperficieGesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEspessuraCamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfNecessidadeCalcario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularNecessidadeGessagem)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(quantidadeGesso))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(necessidadeGesso))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Necessidade de gessagem e quantidade de gesso", jPanel2);

        tipoDeCultura.add(culturaPerene);
        culturaPerene.setText("Cultura perene");

        tipoDeCultura.add(culturaAnual);
        culturaAnual.setText("Cultura anual");

        jLabel8.setText("Porcentagem de argila no solo:");

        btnCalcularPorcentagemArgila.setText("Calcular");
        btnCalcularPorcentagemArgila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPorcentagemArgilaActionPerformed(evt);
            }
        });

        jLabel13.setText("%");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setText("Necessidade de gessagem:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcularPorcentagemArgila)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(409, 409, 409))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mensagem1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPorcentagemArgila, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(culturaPerene)
                        .addGap(98, 98, 98)
                        .addComponent(culturaAnual))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(necessidadeGessagemArgila)))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(mensagem1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(culturaPerene)
                    .addComponent(culturaAnual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPorcentagemArgila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnCalcularPorcentagemArgila))
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(necessidadeGessagemArgila))
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Gessagem por teor de argila", jPanel3);

        jLabel9.setText("cmolc/dm³");

        jLabel10.setText("cmolc/dm³");

        jLabel11.setText("%");

        jLabel12.setText("cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSaturacaoAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(tfSaturacaoAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCalcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCalcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCalcioActionPerformed
    
    public void cancelar(){
        tfAluminio.setText("");
        tfCalcio.setText("");
        tfSaturacaoAluminio.setText("");
        tfProfundidade.setText("");
        tfSuperficieGesso.setText("");
        tfPorcentagemArgila.setText("");
        tfNecessidadeCalcario.setText("");
        tfEspessuraCamada.setText("");
        mensagem.setText("");
        mensagem1.setText("");
        necessidadeGessagemArgila.setText("");
        necessidadeGesso.setText("");
        quantidadeGesso.setText("");
    }
   
    public boolean verificaCamposCalculoGessagem(String calcio, String aluminio, String saturacaoAluminio, String profundidade, String necessidadeCalcario, String superficieGesso, String espessuraCamada) {
        if ((calcio.equals("")) || (aluminio.equals("")) || (saturacaoAluminio.equals("")) || (profundidade.equals("")) || (necessidadeCalcario.equals("")) || (superficieGesso.equals("")) || (espessuraCamada.equals(""))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificaCamposCalculoArgila(String calcio, String aluminio, String saturacaoAluminio, String profundidade, String porcentagemArgila) {
        if ((calcio.equals("")) || (aluminio.equals("")) || (saturacaoAluminio.equals("")) || (profundidade.equals("")) || (porcentagemArgila.equals(""))) { 
            return false;
        } else {
            return true;
        }
    }
    
    private void btnCalcularNecessidadeGessagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularNecessidadeGessagemActionPerformed
        
        Gessagem calculo = new Gessagem();

        if (verificaCamposCalculoGessagem(tfCalcio.getText(), tfAluminio.getText(), tfSaturacaoAluminio.getText(), tfProfundidade.getText(), tfNecessidadeCalcario.getText(), tfSuperficieGesso.getText(), tfEspessuraCamada.getText())) {
            if (calculo.NecessidadeDeGessagemEquantidadeDeGesso(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()), Float.parseFloat(tfProfundidade.getText()), Float.parseFloat(tfNecessidadeCalcario.getText()), Float.parseFloat(tfSuperficieGesso.getText()), Float.parseFloat(tfEspessuraCamada.getText()))) {
                if (calculo.getMensagem().equals("")) {
                    cancelar();
                    necessidadeGesso.setText("A necessidade de gesso para esse solo é: " + calculo.getNecessidadeDeGessagem());
                    quantidadeGesso.setText("A quantidade de gesso para esse solo é: " + calculo.getQuantidadeDeGesso());
                } else {
                    mensagem.setText(calculo.getMensagem());
                }
            } else {
                mensagem.setText(calculo.getMensagem());
            }
        } else {
            mensagem.setText("Os campos devem ser preenchidos corretamente");
        }
    }//GEN-LAST:event_btnCalcularNecessidadeGessagemActionPerformed
    
    
    private void btnCalcularPorcentagemArgilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPorcentagemArgilaActionPerformed
        
        Gessagem calculo = new Gessagem();

        if (verificaCamposCalculoArgila(tfCalcio.getText(), tfAluminio.getText(), tfSaturacaoAluminio.getText(), tfProfundidade.getText(), tfPorcentagemArgila.getText())) {
            if (culturaPerene.isSelected()) {
                necessidadeGessagemArgila.setText(" Necessidade de gessagem:" + calculo.GessagemPorTeorDeArgila(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()), 2, Float.parseFloat(tfPorcentagemArgila.getText())));
            }
            if (culturaAnual.isSelected()) {
                necessidadeGessagemArgila.setText(" Necessidade de gessagem:" + calculo.GessagemPorTeorDeArgila(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()), 1, Float.parseFloat(tfPorcentagemArgila.getText())));
            }
        } else {
            mensagem1.setText("Os campos devem ser preenchidos corretamente");
        }
    }//GEN-LAST:event_btnCalcularPorcentagemArgilaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cancelar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cancelar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GessagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GessagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GessagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GessagemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GessagemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularNecessidadeGessagem;
    private javax.swing.JButton btnCalcularPorcentagemArgila;
    private javax.swing.JRadioButton culturaAnual;
    private javax.swing.JRadioButton culturaPerene;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel mensagem1;
    private javax.swing.JLabel necessidadeGessagemArgila;
    private javax.swing.JLabel necessidadeGesso;
    private javax.swing.JLabel quantidadeGesso;
    private javax.swing.JTextField tfAluminio;
    private javax.swing.JTextField tfCalcio;
    private javax.swing.JTextField tfEspessuraCamada;
    private javax.swing.JTextField tfNecessidadeCalcario;
    private javax.swing.JTextField tfPorcentagemArgila;
    private javax.swing.JTextField tfProfundidade;
    private javax.swing.JTextField tfSaturacaoAluminio;
    private javax.swing.JTextField tfSuperficieGesso;
    private javax.swing.ButtonGroup tipoDeCultura;
    // End of variables declaration//GEN-END:variables
}
