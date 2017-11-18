
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
        tfAluminio = new javax.swing.JTextField();
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
        jPanel3 = new javax.swing.JPanel();
        culturaPerene = new javax.swing.JRadioButton();
        culturaAnual = new javax.swing.JRadioButton();
        tfPorcentagemArgila = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mensagem1 = new javax.swing.JLabel();
        necessidadeGessagemArgila = new javax.swing.JLabel();
        btnCalcularPorcentagemArgila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        mensagem.setText("jLabel8");

        quantidadeGesso.setText("jLabel8");

        necessidadeGesso.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcularNecessidadeGessagem)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(tfSuperficieGesso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEspessuraCamada, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNecessidadeCalcario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantidadeGesso)
                    .addComponent(mensagem)
                    .addComponent(necessidadeGesso))
                .addGap(181, 181, 181))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSuperficieGesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(mensagem)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEspessuraCamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(quantidadeGesso)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(necessidadeGesso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNecessidadeCalcario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCalcularNecessidadeGessagem)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Necessidade de gessagem e quantidade de gesso", jPanel2);

        tipoDeCultura.add(culturaPerene);
        culturaPerene.setText("Cultura perene");

        tipoDeCultura.add(culturaAnual);
        culturaAnual.setText("Cultura anual");

        jLabel8.setText("Porcentagem de argila no solo:");

        mensagem1.setText("jLabel9");

        necessidadeGessagemArgila.setText("jLabel9");

        btnCalcularPorcentagemArgila.setText("Calcular");
        btnCalcularPorcentagemArgila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPorcentagemArgilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPorcentagemArgila, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(culturaAnual)
                            .addComponent(btnCalcularPorcentagemArgila)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(culturaPerene)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mensagem1)
                                    .addComponent(necessidadeGessagemArgila))))))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(culturaPerene)
                .addGap(18, 18, 18)
                .addComponent(culturaAnual)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPorcentagemArgila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(mensagem1)
                .addGap(18, 18, 18)
                .addComponent(necessidadeGessagemArgila)
                .addGap(58, 58, 58)
                .addComponent(btnCalcularPorcentagemArgila)
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Gessagem por teor de argila", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSaturacaoAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaturacaoAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    
    private boolean verificaCamposCalculoGessagem(String calcio, String aluminio, String saturacaoAluminio, String profundidade, String necessidadeCalcario, String superficieGesso, String espessuraCamada){
        if ((calcio.equals("")) || (aluminio.equals("")) || (saturacaoAluminio.equals("")) || (profundidade.equals("")) || (necessidadeCalcario.equals("")) || (superficieGesso.equals("")) || (espessuraCamada.equals(""))){
            return false;
        }else{
            return true;
        }      
    }
    
    private boolean verificaCamposCalculoArgila(String calcio, String aluminio, String saturacaoAluminio, String profundidade, String porcentagemArgila){
        if ((calcio.equals("")) || (aluminio.equals("")) || (saturacaoAluminio.equals("")) || (profundidade.equals("")) || (porcentagemArgila.equals(""))){
            return false;
        }else{
            return true;
        }      
    }
    
    private void btnCalcularNecessidadeGessagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularNecessidadeGessagemActionPerformed
        Gessagem calculo = new Gessagem(); 
       
        if (verificaCamposCalculoGessagem(tfCalcio.getText(), tfAluminio.getText(), tfSaturacaoAluminio.getText(), tfProfundidade.getText(), tfNecessidadeCalcario.getText(), tfSuperficieGesso.getText(), tfEspessuraCamada.getText())){
            if (calculo.NecessidadeDeGessagemEquantidadeDeGesso(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()), Float.parseFloat(tfProfundidade.getText()), Float.parseFloat(tfNecessidadeCalcario.getText()), Float.parseFloat(tfSuperficieGesso.getText()), Float.parseFloat(tfEspessuraCamada.getText()))){
                if (calculo.getMensagem().equals("")){
                    necessidadeGesso.setText("A necessidade de gesso para esse solo é: " + calculo.getNecessidadeDeGessagem());
                    quantidadeGesso.setText("A quantidade de gesso para esse solo é: " + calculo.getQuantidadeDeGesso());
                }else{
                    mensagem.setText(calculo.getMensagem());
                }
            }else{
                mensagem.setText(calculo.getMensagem());
            }
        }else{
            mensagem.setText("Os campos devem ser preenchidos corretamente");
        }
    }//GEN-LAST:event_btnCalcularNecessidadeGessagemActionPerformed

    private void btnCalcularPorcentagemArgilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPorcentagemArgilaActionPerformed
        Gessagem calculo = new Gessagem();
       
        if (verificaCamposCalculoArgila(tfCalcio.getText(), tfAluminio.getText(), tfSaturacaoAluminio.getText(), tfProfundidade.getText(),tfPorcentagemArgila.getText())){
            if (culturaPerene.isSelected()){
                necessidadeGessagemArgila.setText(" Necessidade de gessagem:" + calculo.GessagemPorTeorDeArgila(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()),2, Float.parseFloat(tfPorcentagemArgila.getText())));
            }
            if (culturaAnual.isSelected()){
                necessidadeGessagemArgila.setText(" Necessidade de gessagem:" + calculo.GessagemPorTeorDeArgila(Float.parseFloat(tfCalcio.getText()), Float.parseFloat(tfAluminio.getText()), Float.parseFloat(tfSaturacaoAluminio.getText()),1, Float.parseFloat(tfPorcentagemArgila.getText())));
            }
        }else{
            mensagem1.setText("Os campos devem ser preenchidos corretamente");
        }
    }//GEN-LAST:event_btnCalcularPorcentagemArgilaActionPerformed
 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
