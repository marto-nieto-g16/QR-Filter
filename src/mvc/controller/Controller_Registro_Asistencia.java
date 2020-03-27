/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.model.Registro_Asistencia;
import mvc.vista.Historial_Asistencia;


/**
 *
 * @author Hp
 */
public class Controller_Registro_Asistencia {
    private static Connection con;
    private  static List registro_asistencia;

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }

    /**
     * @return the gestionar_horarios
     */
    public static List getRegistro_Asistencia() {
        return registro_asistencia;
    }

    /**
     * @param aRegistro_Asistencia
     */
    public static void setRegistro_Asistencia(List aRegistro_Asistencia) {
        registro_asistencia = aRegistro_Asistencia;
    }
    public static void Registrar_Hora_Ingreso_Salida(Registro_Asistencia asistencia) throws Exception{
       ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
        mbd.conectar();
        setCon((Connection) mbd.getConexion());
        if (getCon() == null ) {
            JOptionPane.showMessageDialog(null, " No hay Conexion ");
        }
        PreparedStatement pst = null;
        try {
              pst = (PreparedStatement) getCon().prepareStatement("Insert Into registro_asistencia values(?,?,?,?)");
              pst.setInt(1,asistencia.getIdentificacion_Empleado());
              pst.setString(2,asistencia.getFecha());
              pst.setString(3,asistencia.getHora_ingreso_salida());
              pst.setString(4,asistencia.getDetalle_hora());              
              pst.executeUpdate();
        }finally {
            if (pst != null) {
                 pst.close();
            }
        }

       }
    
    public static void listarAsistencia() throws SQLException, Exception {
     ResultSet rs = null;
     PreparedStatement pst = null;
     setRegistro_Asistencia(new LinkedList());
     try {
         ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
         mbd.conectar();
         setCon((Connection) mbd.getConexion());
         pst = (PreparedStatement) getCon().prepareStatement("select * from registro_asistencia");
         rs = pst.executeQuery();
         while(rs.next()) {
           getRegistro_Asistencia().add(Registro_Asistencia.load(rs));
         }
     } finally {
        if (rs != null) {
           rs.close();
        }
        if (pst != null) {
          pst.close();
        }
    }
 }
    public static Registro_Asistencia Historial(int identificacion) throws Exception{
        Registro_Asistencia asistencia = null;
        Historial_Asistencia.dtm.setNumRows(0);
        listarAsistencia();
        Iterator it = getRegistro_Asistencia().iterator();
        while(it.hasNext()){
            Registro_Asistencia asistencias = (Registro_Asistencia) it.next();
            asistencia = asistencias;
            if(asistencias.getIdentificacion_Empleado() == identificacion){
                String[] fila = {asistencias.getFecha(), asistencias.getHora_ingreso_salida(), asistencias.getDetalle_hora()};
                Historial_Asistencia.dtm.addRow(fila);
            }
        }
        return asistencia;
    }

}
