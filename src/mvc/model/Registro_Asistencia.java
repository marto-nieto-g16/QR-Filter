/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hp
 */
public class Registro_Asistencia {
    private int identificacion_empleado;
    private String fecha;
    private String hora_ingreso_salida; 
    private String detalle_hora;
    
    
    public static Registro_Asistencia load(ResultSet rs) throws SQLException{
        Registro_Asistencia registro_asistencia = new Registro_Asistencia();
        registro_asistencia.setIdentificacion_Empleado(Integer.parseInt(rs.getString("identificacion_empleado"))); 
        registro_asistencia.setFecha(rs.getString("fecha"));
        registro_asistencia.setHora_ingreso_salida(rs.getString("hora_ingreso_salida"));
        registro_asistencia.setDetalle_hora(rs.getString("detalle_hora"));
        
        return registro_asistencia;
    }    

    /**
     * @return the identificacion_empleado
     */
    public int getIdentificacion_Empleado() {
        return identificacion_empleado;
    }

    /**
     * @param identificacion_empleado the identificacion_empleado to set
     */
    public void setIdentificacion_Empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora_ingreso_salida
     */
    public String getHora_ingreso_salida() {
        return hora_ingreso_salida;
    }

    /**
     * @param hora_ingreso_salida the hora_ingreso_salida to set
     */
    public void setHora_ingreso_salida(String hora_ingreso_salida) {
        this.hora_ingreso_salida = hora_ingreso_salida;
    }

    /**
     * @return the detalle_hora
     */
    public String getDetalle_hora() {
        return detalle_hora;
    }

    /**
     * @param detalle_hora the detalle_hora to set
     */
    public void setDetalle_hora(String detalle_hora) {
        this.detalle_hora = detalle_hora;
    }
    

    


}
