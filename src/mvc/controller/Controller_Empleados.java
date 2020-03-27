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
import mvc.model.Empleados;
import mvc.vista.FiltroEmpleados;

public class Controller_Empleados {
    private static Connection con;
    private  static List emple;
    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection aCon) {
        con = aCon;
    }
    public static Empleados Buscar(String identificacion) throws SQLException{
        if(identificacion == null) {
            JOptionPane.showMessageDialog(null,"No Se Encontro El Empleado");
     }
     ResultSet rs = null;
     PreparedStatement pst = null;
     Empleados cliente = null;
     try {
       ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
       mbd.conectar();
       setCon((Connection) mbd.getConexion());
       pst = (PreparedStatement) getCon().prepareStatement("select * from empleados where identificacion = ?");
       pst.setString(1, identificacion.trim());
       rs = pst.executeQuery();
       while(rs.next()) {
         cliente= Empleados.load(rs);
       }
     }finally {
         if (rs != null) {
          rs.close();
         }
         if (pst != null) {
           pst.close();
          }
       return cliente;
     }
 }
    public static void listarEmpleados() throws SQLException, Exception {
        ResultSet rs = null;
        PreparedStatement pst = null;
        setEmpleados(new LinkedList());
        try {
            ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
            mbd.conectar();
            setCon((Connection) mbd.getConexion());
            pst = (PreparedStatement) getCon().prepareStatement("select * from empleados");
            rs = pst.executeQuery();
            while(rs.next()) {
              getEmpleados().add(Empleados.load(rs));
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
    
public static Empleados enlistarEmpleados() throws Exception{
        Empleados empleado = null;
        FiltroEmpleados.dtm.setNumRows(0);
        listarEmpleados();
        Iterator it = getEmpleados().iterator();
        while(it.hasNext()){
            Empleados empleados = (Empleados) it.next();
            empleado = empleados;
            String[] fila = {empleados.getTipo_documento(), empleados.getCedula()+"", empleados.getNombres()+" "+empleados.getApellidos()};
            FiltroEmpleados.dtm.addRow(fila);
        }
        return empleado;
    }
    
public static void FiltrarEmpleados(String identificacion) throws SQLException, Exception {
        ResultSet rs = null;
        PreparedStatement pst = null;
        setEmpleados(new LinkedList());
        try {
            ManejadorBaseDatos mbd=ManejadorBaseDatos.getInstancia();
            mbd.conectar();
            setCon((Connection) mbd.getConexion());
            pst = (PreparedStatement) getCon().prepareStatement("select * from empleados where identificacion like '%"+identificacion+"%'");
            rs = pst.executeQuery();
            while(rs.next()) {
              getEmpleados().add(Empleados.load(rs));
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
public static Empleados FiltroEmpleados(String identificacion) throws Exception{
        Empleados empleado = null;
        FiltroEmpleados.dtm.setNumRows(0);
        FiltrarEmpleados(identificacion);
        Iterator it = getEmpleados().iterator();
        while(it.hasNext()){
            Empleados empleados = (Empleados) it.next();
            empleado = empleados;
            String[] fila = {empleados.getTipo_documento(), empleados.getCedula()+"", empleados.getNombres()+" "+empleados.getApellidos()};
            FiltroEmpleados.dtm.addRow(fila);
        }
        return empleado;
    }
    public static List getEmpleados() {
        return emple;
    }

    public static void setEmpleados(List xclient) {
        emple = xclient;
    }
}
