/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Juan Diego
 */
public class ConsultaValorFila extends javax.swing.JFrame {
    LógicaCine preciosfila = new LógicaCine();

    /**
     * Creates new form ConsultaValorFila
     */
    public ConsultaValorFila() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fila1 = new javax.swing.JTextField();
        fila2 = new javax.swing.JTextField();
        fila3 = new javax.swing.JTextField();
        fila4 = new javax.swing.JTextField();
        fila5 = new javax.swing.JTextField();
        fila6 = new javax.swing.JTextField();
        fila7 = new javax.swing.JTextField();
        fila8 = new javax.swing.JTextField();
        fila9 = new javax.swing.JTextField();
        fila10 = new javax.swing.JTextField();
        fila11 = new javax.swing.JTextField();
        fila12 = new javax.swing.JTextField();
        fila13 = new javax.swing.JTextField();
        fila14 = new javax.swing.JTextField();
        fila15 = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRECIO POR FILA  CINE COLOMBIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio fila 8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio Fila 9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio Fila 10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio Fila 11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio Fila 12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio Fila 7");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 100, 20));

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio Fila 13");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio Fila 14");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio Fila 15");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        fila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila1ActionPerformed(evt);
            }
        });
        jPanel1.add(fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 120, -1));

        fila2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila2ActionPerformed(evt);
            }
        });
        jPanel1.add(fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, -1));

        fila3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila3ActionPerformed(evt);
            }
        });
        jPanel1.add(fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, -1));

        fila4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila4ActionPerformed(evt);
            }
        });
        jPanel1.add(fila4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, -1));

        fila5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila5ActionPerformed(evt);
            }
        });
        jPanel1.add(fila5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 120, -1));

        fila6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila6ActionPerformed(evt);
            }
        });
        jPanel1.add(fila6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, -1));
        jPanel1.add(fila7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 120, -1));
        jPanel1.add(fila8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, -1));
        jPanel1.add(fila9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 120, -1));
        jPanel1.add(fila10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, -1));
        jPanel1.add(fila11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 120, -1));
        jPanel1.add(fila12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 120, -1));
        jPanel1.add(fila13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, -1));
        jPanel1.add(fila14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 120, -1));
        jPanel1.add(fila15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 40));

        jLabel18.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio Fila 1");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 20));

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio Fila 2");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 100, 20));

        jLabel20.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Precio Fila 3");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 20));

        jLabel21.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Precio Fila 4");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 20));

        jLabel22.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Precio Fila 5");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 20));

        jLabel23.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Precio Fila 6");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        Interfazsillas abrir = new Interfazsillas();
        abrir.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_VolverActionPerformed

    private void fila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila1ActionPerformed
        // TODO add your handling code here:
        fila1.setText(String.valueOf(preciosfila.preciof1));
        fila2.setText(String.valueOf(preciosfila.preciof2));
        fila3.setText(String.valueOf(preciosfila.preciof3));
        fila4.setText(String.valueOf(preciosfila.preciof4));
        fila5.setText(String.valueOf(preciosfila.preciof5));
        fila6.setText(String.valueOf(preciosfila.preciof6));
        fila7.setText(String.valueOf(preciosfila.preciof7));
        fila8.setText(String.valueOf(preciosfila.preciof8));
        fila9.setText(String.valueOf(preciosfila.preciof9));
        fila10.setText(String.valueOf(preciosfila.preciof10));
        fila11.setText(String.valueOf(preciosfila.preciof11));
        fila12.setText(String.valueOf(preciosfila.preciof12));
        fila13.setText(String.valueOf(preciosfila.preciof13));
        fila14.setText(String.valueOf(preciosfila.preciof14));
        fila15.setText(String.valueOf(preciosfila.preciof15));
            
    }//GEN-LAST:event_fila1ActionPerformed

    private void fila2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila2ActionPerformed

    private void fila3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila3ActionPerformed

    private void fila4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila4ActionPerformed

    private void fila5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila5ActionPerformed

    private void fila6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila6ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaValorFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaValorFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaValorFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaValorFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaValorFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JTextField fila1;
    private javax.swing.JTextField fila10;
    private javax.swing.JTextField fila11;
    private javax.swing.JTextField fila12;
    private javax.swing.JTextField fila13;
    private javax.swing.JTextField fila14;
    private javax.swing.JTextField fila15;
    private javax.swing.JTextField fila2;
    private javax.swing.JTextField fila3;
    private javax.swing.JTextField fila4;
    private javax.swing.JTextField fila5;
    private javax.swing.JTextField fila6;
    private javax.swing.JTextField fila7;
    private javax.swing.JTextField fila8;
    private javax.swing.JTextField fila9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
