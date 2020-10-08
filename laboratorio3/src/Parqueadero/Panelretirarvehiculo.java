
package Parqueadero;

import static Parqueadero.interfazparqueadero.parqueadero2;
import java.util.Date;
import javax.swing.JOptionPane;


public class Panelretirarvehiculo extends javax.swing.JFrame {

 //   public Logicaparqueadero parqueadero = new Logicaparqueadero();
    

    public Panelretirarvehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Placasalida = new javax.swing.JTextField();
        pla = new javax.swing.JLabel();
        Retirar = new javax.swing.JButton();
        tipovehiculo = new javax.swing.JComboBox<>();
        Cedulasalir = new javax.swing.JTextField();
        cedu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaInfo1 = new javax.swing.JTextArea();
        Return = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Placa");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("Parqueadero Motos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel4.setText("Salida de vehiculos al parquedero");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 11, 307, -1));

        Placasalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacasalidaActionPerformed(evt);
            }
        });
        jPanel2.add(Placasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 116, 47));

        pla.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pla.setText("Placa");
        jPanel2.add(pla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 44, -1));

        Retirar.setBackground(new java.awt.Color(0, 102, 102));
        Retirar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Retirar.setForeground(new java.awt.Color(255, 255, 255));
        Retirar.setText("Retirar");
        Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarActionPerformed(evt);
            }
        });
        jPanel2.add(Retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 102, 44));

        tipovehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Bicicleta" }));
        tipovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipovehiculoActionPerformed(evt);
            }
        });
        jPanel2.add(tipovehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        Cedulasalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulasalirActionPerformed(evt);
            }
        });
        jPanel2.add(Cedulasalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 50));

        cedu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedu.setText("Cedula");
        jPanel2.add(cedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, -1));

        txtAreaInfo.setColumns(20);
        txtAreaInfo.setRows(5);
        jScrollPane2.setViewportView(txtAreaInfo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 200, 230));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 230));

        txtAreaInfo1.setColumns(20);
        txtAreaInfo1.setRows(5);
        jScrollPane4.setViewportView(txtAreaInfo1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 200, 230));

        Return.setBackground(new java.awt.Color(0, 102, 102));
        Return.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 255, 255));
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        jPanel2.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 40));

        jLabel6.setText("Parqueadero Bicicletas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 140, 20));

        jLabel7.setText("Parqueadero Carros");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 140, -1));

        jLabel9.setText("Parqueadero Motos");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlacasalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacasalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacasalidaActionPerformed

    private void tipovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipovehiculoActionPerformed
        if (tipovehiculo.getSelectedItem()== "Carro"||tipovehiculo.getSelectedItem()== "Moto")
        {
            Placasalida.setVisible(true);
            pla.setVisible(true);
            Cedulasalir.setVisible(false);
            cedu.setVisible(false);
        }
        else if (tipovehiculo.getSelectedItem() == "Bicicleta")
        {
            Cedulasalir.setVisible(true);
            cedu.setVisible(true);
            Placasalida.setVisible(false);
            pla.setVisible(false);
        }
        else {
            System.out.println("Elija una opcion de Vehiculo");
        }
    }//GEN-LAST:event_tipovehiculoActionPerformed

    private void CedulasalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulasalirActionPerformed
        
    }//GEN-LAST:event_CedulasalirActionPerformed

    private void RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarActionPerformed
        String placa = this.Placasalida.getText();
        String cedula=this.Cedulasalir.getText();
        Date hfinal = new Date(); 
        
        if (tipovehiculo.getSelectedItem() == "Bicicleta")
        {
            if(Cedulasalir.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Ingrese cedula del dueño de bicicleta");
            }else{
            parqueadero2.retirarBici(cedula, hfinal);
            
            }
        }
      
    }//GEN-LAST:event_RetirarActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
       interfazparqueadero abrir = new interfazparqueadero();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Panelretirarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panelretirarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panelretirarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panelretirarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panelretirarvehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedulasalir;
    private javax.swing.JTextField Placasalida;
    private javax.swing.JButton Retirar;
    private javax.swing.JButton Return;
    private javax.swing.JLabel cedu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel pla;
    private javax.swing.JComboBox<String> tipovehiculo;
    private javax.swing.JTextArea txtAreaInfo;
    private javax.swing.JTextArea txtAreaInfo1;
    // End of variables declaration//GEN-END:variables
}
