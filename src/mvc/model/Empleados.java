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
 * @author SERVIDOR
 */
public class Empleados {
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String tipo_documento;
    
    public static Empleados load(ResultSet rs) throws SQLException{
        Empleados empleado = new Empleados();
        empleado.setCedula(Integer.parseInt(rs.getString("identificacion")));
        empleado.setNombres(rs.getString("nombres"));
        empleado.setApellidos(rs.getString("apellidos"));
        empleado.setDireccion(rs.getString("direccion"));
        empleado.setTelefono(rs.getString("telefono"));
        empleado.setTipo_documento(rs.getString("tipo_documento"));
        return empleado;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
}
