
package Parqueadero;
import static Parqueadero.interfazparqueadero.parqueadero2;
import java.util.Date;
import javax.swing.JOptionPane;


public class Panelingresarvehiculo extends javax.swing.JFrame {
    
    public Panelingresarvehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        Placa.setVisible(false); 
        Cedula.setVisible(false);
        jLabel2.setVisible(false);        
        jLabel5.setVisible(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Placa = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TipoVehiculo = new javax.swing.JComboBox<>();
        Cedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textbici = new javax.swing.JTextArea();
        Retirar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textcarros = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textmotos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lista3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Lista1 = new javax.swing.JComboBox<>();
        Lista2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Nombre Propietario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 63, 146, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Placa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 188, 44, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Tipo De Vehiculo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 129, 139, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 91, 271, -1));

        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });
        jPanel1.add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 246, 119, 44));

        Registrar.setBackground(new java.awt.Color(0, 102, 102));
        Registrar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar ");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 119, 41));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel4.setText("Ingreso de vehiculos al parquedero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 460, -1));

        TipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Vehiculo...", "Carro", "Moto", "Bicicleta" }));
        TipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(TipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 157, 90, -1));

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 244, 119, 44));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 211, 64, -1));

        textbici.setColumns(20);
        textbici.setRows(5);
        jScrollPane1.setViewportView(textbici);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 220, 240));

        Retirar.setBackground(new java.awt.Color(0, 102, 102));
        Retirar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Retirar.setForeground(new java.awt.Color(255, 255, 255));
        Retirar.setText("Retirar");
        Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarActionPerformed(evt);
            }
        });
        jPanel1.add(Retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 120, 40));

        textcarros.setColumns(20);
        textcarros.setRows(5);
        jScrollPane2.setViewportView(textcarros);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 200, 240));

        textmotos.setColumns(20);
        textmotos.setRows(5);
        jScrollPane3.setViewportView(textmotos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 210, 240));

        jLabel6.setText("Parqueadero Bicicletas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel7.setText("Parqueadero Carros");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        jLabel8.setText("Parqueadero Motos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        Lista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista3ActionPerformed(evt);
            }
        });
        jPanel1.add(Lista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 110, 50));

        jLabel9.setText("Búsqueda");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        Lista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista1ActionPerformed(evt);
            }
        });
        jPanel1.add(Lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 110, 50));

        Lista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista2ActionPerformed(evt);
            }
        });
        jPanel1.add(Lista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PlacaActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        String placa = this.Placa.getText();
        String cedula=this.Cedula.getText();
        Date Tinicial = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
  
        
        if (TipoVehiculo.getSelectedItem()== "Carro")
        {
            if(Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del propietario");
            }else if(Placa.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Ingrese la placa del carro");
            }else{
            parqueadero2.parquearCarro(placa, Tinicial);
            }
        }
        else if(TipoVehiculo.getSelectedItem()== "Moto")
        {
            if(Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del propietario");
            }else if(Placa.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Ingrese la placa de la moto");
            }else{
            parqueadero2.parquearMoto(placa, Tinicial);
            }
        }
        else if (TipoVehiculo.getSelectedItem() == "Bicicleta")
        {
            if(Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del propietario");
            }else if(Cedula.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Ingrese la cedula de la bicicleta");
            }else{
            parqueadero2.parquearBici(cedula, Tinicial);
            }
        }
        this.textbici.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoBici());
        this.textcarros.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoCarro());
        this.textmotos.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoMoto());
        this.Cedula.setText("");
        this.Placa.setText("");
        this.llenarCarro();
        this.llenarBici();
        this.llenarMoto();
        
    }//GEN-LAST:event_RegistrarActionPerformed

    private void TipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoVehiculoActionPerformed
        // TODO add your handling code here:
        if (TipoVehiculo.getSelectedItem()== "Carro"||TipoVehiculo.getSelectedItem()== "Moto")
        {
            Placa.setVisible(true);
            jLabel2.setVisible(true);
            Cedula.setVisible(false);
            jLabel5.setVisible(false);
        }
        else if (TipoVehiculo.getSelectedItem() == "Bicicleta")
        {
            Cedula.setVisible(true);
            jLabel5.setVisible(true);
            Placa.setVisible(false);
            jLabel2.setVisible(false);
        }
        else {
            System.out.println("Elija una opcion de Vehiculo");
        }
    }//GEN-LAST:event_TipoVehiculoActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarActionPerformed
       
        Date hfinal = new Date(); 
        if (TipoVehiculo.getSelectedItem()== "Carro")
        {
            String placa = this.Lista2.getSelectedItem().toString();
            String resul = parqueadero2.retirarcarro(placa, hfinal);
            this.llenarCarro();
            JOptionPane.showMessageDialog(null,resul);
            this.textcarros.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoCarro());
        }
        else if(TipoVehiculo.getSelectedItem()== "Moto")
        {
            String placa = this.Lista3.getSelectedItem().toString();
            String resul = parqueadero2.retirarmoto(placa, hfinal);
             this.llenarMoto();
             JOptionPane.showMessageDialog(null,resul);
             this.textmotos.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoMoto());
             
        }
        else if (TipoVehiculo.getSelectedItem() == "Bicicleta")
        {
            String cedula = this.Lista1.getSelectedItem().toString();
            String resul = parqueadero2.retirarBici(cedula, hfinal);
             this.llenarBici();
             JOptionPane.showMessageDialog(null,resul);
             this.textbici.setText("Parqueadero\n\n"+parqueadero2.concatenarInfoBici());
        }
        
    }//GEN-LAST:event_RetirarActionPerformed

    private void Lista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista3ActionPerformed
       
    }//GEN-LAST:event_Lista3ActionPerformed

    private void Lista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lista1ActionPerformed

    private void Lista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lista2ActionPerformed
        public void llenarCarro(){
        String []carro = parqueadero2.concatenarPlacasCarros().split("~");
        this.Lista2.removeAllItems();
        for(String c: carro)
            this.Lista2.addItem(c);
        
    }
public void llenarBici(){
        String []bici = parqueadero2.concatenarCedulasBicicletas().split("~");
        this.Lista1.removeAllItems();
        for(String b: bici)
            this.Lista1.addItem(b);
}
public void llenarMoto(){
        String []moto = parqueadero2.concatenarPlacasMotos().split("~");
        this.Lista3.removeAllItems();
        for(String m: moto)
            this.Lista3.addItem(m);
}
        
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
            java.util.logging.Logger.getLogger(Panelingresarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panelingresarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panelingresarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panelingresarvehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panelingresarvehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JComboBox<String> Lista1;
    private javax.swing.JComboBox<String> Lista2;
    private javax.swing.JComboBox<String> Lista3;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Placa;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Retirar;
    private javax.swing.JComboBox<String> TipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textbici;
    private javax.swing.JTextArea textcarros;
    private javax.swing.JTextArea textmotos;
    // End of variables declaration//GEN-END:variables
}

