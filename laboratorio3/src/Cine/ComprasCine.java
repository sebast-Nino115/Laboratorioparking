/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author catal
 */
public class ComprasCine extends javax.swing.JFrame {

    /**
     * Creates new form ComprasCine
     */
    public ComprasCine() {
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

        jPanel1 = new javax.swing.JPanel();
        Retorno = new javax.swing.JButton();
        Boletasgenerales = new javax.swing.JButton();
        Boletaspreferenciales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Retorno.setText("Return");
        Retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornoActionPerformed(evt);
            }
        });
        jPanel1.add(Retorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 130, 40));

        Boletasgenerales.setText("General");
        Boletasgenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoletasgeneralesActionPerformed(evt);
            }
        });
        jPanel1.add(Boletasgenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, 60));

        Boletaspreferenciales.setText("Preferencial");
        Boletaspreferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoletaspreferencialesActionPerformed(evt);
            }
        });
        jPanel1.add(Boletaspreferenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoletaspreferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletaspreferencialesActionPerformed
        Interfazsillas abrir = new Interfazsillas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BoletaspreferencialesActionPerformed

    private void BoletasgeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletasgeneralesActionPerformed
      Interfazsillas abrir = new Interfazsillas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BoletasgeneralesActionPerformed

    private void RetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornoActionPerformed
        
    }//GEN-LAST:event_RetornoActionPerformed

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
            java.util.logging.Logger.getLogger(ComprasCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprasCine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boletasgenerales;
    private javax.swing.JButton Boletaspreferenciales;
    private javax.swing.JButton Retorno;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}