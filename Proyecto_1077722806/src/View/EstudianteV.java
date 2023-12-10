/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Conexion1.Conexion;
import Controller.EstudianteC;

/**
 *
 * @author SENA
 */
public class EstudianteV extends javax.swing.JFrame {

    /**
     * Creates new form EstudianteV
     */
    public EstudianteV() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnumero_telefono = new java.awt.TextField();
        txtgenero = new java.awt.TextField();
        txtdireccion = new java.awt.TextField();
        txtcorreo_electronico = new java.awt.TextField();
        txtestudiante_id = new java.awt.TextField();
        txtnombre = new java.awt.TextField();
        jbnModificar = new javax.swing.JButton();
        jbnEliminarLogico = new javax.swing.JButton();
        jbnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Estudiante id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Numero de telefono");

        jLabel1.setText("Genero");

        jLabel5.setText("Direccion");

        jLabel6.setText("Correo electronico");

        txtnumero_telefono.setBackground(new java.awt.Color(204, 204, 204));

        txtgenero.setBackground(new java.awt.Color(204, 204, 204));
        txtgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgeneroActionPerformed(evt);
            }
        });

        txtdireccion.setBackground(new java.awt.Color(204, 204, 204));

        txtcorreo_electronico.setBackground(new java.awt.Color(204, 204, 204));

        txtestudiante_id.setBackground(new java.awt.Color(204, 204, 204));

        txtnombre.setBackground(new java.awt.Color(204, 204, 204));

        jbnModificar.setBackground(new java.awt.Color(255, 177, 66));
        jbnModificar.setText("Modificar");
        jbnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnModificarActionPerformed(evt);
            }
        });

        jbnEliminarLogico.setBackground(new java.awt.Color(255, 177, 66));
        jbnEliminarLogico.setText("Eliminar logico");
        jbnEliminarLogico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarLogicoActionPerformed(evt);
            }
        });

        jbnGuardar.setBackground(new java.awt.Color(255, 177, 66));
        jbnGuardar.setText("Guardar");
        jbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(204, 204, 204));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante id", "Nombre", "Numero de telefono", "Genero", "Direccion", "Correo electronico"
            }
        ));
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(txtcorreo_electronico, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnumero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtestudiante_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jbnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jbnEliminarLogico, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnModificar)
                        .addComponent(jbnEliminarLogico)
                        .addComponent(jbnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtestudiante_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnumero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtgenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtcorreo_electronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgeneroActionPerformed

    private void jbnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnModificarActionPerformed
        // TODO add your handling code here:
        int estudiante_id;
        String nombre;
        String numero_telefono;
        String genero;
        String direccion;
        String correo_electronico;
        Conexion conn = new Conexion();

        //Capturar datos de entrada
        estudiante_id = Integer.parseInt(txtestudiante_id.getText());
        nombre = txtnombre.getText();
        numero_telefono = txtnumero_telefono.getText();
        genero = txtgenero.getText();
        direccion = txtdireccion.getText();
        correo_electronico = txtcorreo_electronico.getText();

        EstudianteC estudianteC = new EstudianteC();
        estudianteC.ModificarRegistro(estudiante_id, nombre, numero_telefono, genero, direccion, correo_electronico);
    }//GEN-LAST:event_jbnModificarActionPerformed

    private void jbnEliminarLogicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarLogicoActionPerformed
        // TODO add your handling code here:
        int estudiante_id = Integer.parseInt(txtestudiante_id.getText());

       EstudianteC estudianteC = new EstudianteC();
       estudianteC.EliminarRegistro(ICONIFIED);
    }//GEN-LAST:event_jbnEliminarLogicoActionPerformed

    private void jbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarActionPerformed
        // TODO add your handling code here:
        int estudiante_id;
        String nombre;
        String numero_telefono;
        String genero;
        String direccion;
        String correo_electronico;
        Conexion conn = new Conexion();

        //Capturar datos de entrada
        estudiante_id = Integer.parseInt(txtestudiante_id.getText());
        nombre = txtnombre.getText();
        numero_telefono = txtnumero_telefono.getText();
        genero = txtgenero.getText();
        direccion = txtdireccion.getText();
        correo_electronico = txtcorreo_electronico.getText();

        EstudianteC estudianteC = new EstudianteC();
        estudianteC.ModificarRegistro(estudiante_id, nombre, numero_telefono, genero, direccion, correo_electronico);
       
    }//GEN-LAST:event_jbnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(EstudianteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbnEliminarLogico;
    private javax.swing.JButton jbnGuardar;
    private javax.swing.JButton jbnModificar;
    private java.awt.TextField txtcorreo_electronico;
    private java.awt.TextField txtdireccion;
    private java.awt.TextField txtestudiante_id;
    private java.awt.TextField txtgenero;
    private java.awt.TextField txtnombre;
    private java.awt.TextField txtnumero_telefono;
    // End of variables declaration//GEN-END:variables
}
