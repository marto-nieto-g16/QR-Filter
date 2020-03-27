/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.controller.Controller_Empleados;
import mvc.controller.Controller_Registro_Asistencia;
import mvc.model.Empleados;
import mvc.model.Registro_Asistencia;
import mvc.vista.reloj.Reloj_Digital;

public class FiltroEmpleados extends javax.swing.JFrame {
  Reloj_Digital reloj_digital = new Reloj_Digital();
  WebCamQR wcam = new WebCamQR();
  Historial_Asistencia historial_asistencia = new Historial_Asistencia();

    public FiltroEmpleados() throws Exception {
        initComponents();
        Controller_Empleados.enlistarEmpleados();
        Panel_WebCam.add(WebCamQR.Panel_Principal);
        jPanel4.add(reloj_digital.Panel_Reloj_Digital);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuItem_Ingreso = new javax.swing.JMenuItem();
        MenuItem_Salida = new javax.swing.JMenuItem();
        MenuItem_Historial = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Boton_Iniciar = new javax.swing.JButton();
        Campo_Identificacion = new javax.swing.JTextField();
        Panel_WebCam = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Actualizar_Lista_Empleados = new javax.swing.JMenuItem();

        MenuItem_Ingreso.setText("Ingreso");
        MenuItem_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_IngresoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuItem_Ingreso);

        MenuItem_Salida.setText("Salida");
        MenuItem_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_SalidaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuItem_Salida);

        MenuItem_Historial.setText("Historial de Asistencia");
        MenuItem_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_HistorialActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuItem_Historial);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Asistencia - Empleados");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Empleados"));

        dtm.addColumn("Tipo de Documento");
        dtm.addColumn("Identificacion");
        dtm.addColumn("Nombres y Apellidos");
        jTable1.setModel(dtm);
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Lector QR"));

        Boton_Iniciar.setText("Iniciar Lector QR");
        Boton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IniciarActionPerformed(evt);
            }
        });

        Campo_Identificacion.setEditable(false);
        Campo_Identificacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Campo_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Campo_Identificacion))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_WebCamLayout = new javax.swing.GroupLayout(Panel_WebCam);
        Panel_WebCam.setLayout(Panel_WebCamLayout);
        Panel_WebCamLayout.setHorizontalGroup(
            Panel_WebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        Panel_WebCamLayout.setVerticalGroup(
            Panel_WebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jMenu1.setText("Empleados");

        Actualizar_Lista_Empleados.setText("Actualizar Lista de Empleados");
        Actualizar_Lista_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_Lista_EmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(Actualizar_Lista_Empleados);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_WebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel_WebCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if(Controller_Empleados.Buscar(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString())!= null){
                Empleados cliente = Controller_Empleados.Buscar(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiltroEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void Boton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IniciarActionPerformed
        wcam.Iniciar();
        Boton_Iniciar.setEnabled(false);
    }//GEN-LAST:event_Boton_IniciarActionPerformed

    private void MenuItem_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_IngresoActionPerformed
     Registrar_Hora_Ingreso_Salida("Ingreso");
    }//GEN-LAST:event_MenuItem_IngresoActionPerformed

    private void MenuItem_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_SalidaActionPerformed
        Registrar_Hora_Ingreso_Salida("Salida");
    }//GEN-LAST:event_MenuItem_SalidaActionPerformed

    private void MenuItem_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_HistorialActionPerformed
      try {
          Controller_Registro_Asistencia.Historial(Integer.parseInt((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
      } catch (Exception ex) {
          Logger.getLogger(FiltroEmpleados.class.getName()).log(Level.SEVERE, null, ex);
      }
        historial_asistencia.setVisible(true);
    }//GEN-LAST:event_MenuItem_HistorialActionPerformed

    private void Actualizar_Lista_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_Lista_EmpleadosActionPerformed
      try {
          Controller_Empleados.enlistarEmpleados();
      } catch (Exception ex) {
          Logger.getLogger(FiltroEmpleados.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_Actualizar_Lista_EmpleadosActionPerformed
 public void Registrar_Hora_Ingreso_Salida(String detalle){
     try {
          asistencia.setIdentificacion_Empleado(Integer.parseInt((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
          asistencia.setHora_ingreso_salida(reloj_digital.lbReloj.getText());
          asistencia.setFecha(reloj_digital.lbFecha.getText());
          asistencia.setDetalle_hora(detalle);
          JOptionPane.showMessageDialog(null,jTable1.getValueAt(jTable1.getSelectedRow(), 2)+" : "+detalle, "Empleado", JOptionPane.INFORMATION_MESSAGE);
          Controller_Registro_Asistencia.Registrar_Hora_Ingreso_Salida(asistencia);
          Controller_Empleados.enlistarEmpleados();
          
      } catch (Exception ex) {
          Logger.getLogger(FiltroEmpleados.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
    public static void FiltroQR(){
     try {
          if(Controller_Empleados.FiltroEmpleados(Campo_Identificacion.getText()) != null){
            Controller_Empleados.FiltroEmpleados(Campo_Identificacion.getText());
          }else{
              JOptionPane.showMessageDialog(null,"No Se Encontro Resultados, En La Bases de Datos. ", "Resultado No Encontrado", JOptionPane.ERROR_MESSAGE);
              Controller_Empleados.enlistarEmpleados();
          }
      } catch (Exception ex) {}
 }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FiltroEmpleados().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(FiltroEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    public static DefaultTableModel dtm=new DefaultTableModel();
    Registro_Asistencia asistencia = new Registro_Asistencia();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar_Lista_Empleados;
    private javax.swing.JButton Boton_Iniciar;
    public static javax.swing.JTextField Campo_Identificacion;
    private javax.swing.JMenuItem MenuItem_Historial;
    private javax.swing.JMenuItem MenuItem_Ingreso;
    private javax.swing.JMenuItem MenuItem_Salida;
    private javax.swing.JPanel Panel_WebCam;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
