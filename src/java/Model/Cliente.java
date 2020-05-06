package Model;
// Generated 06-may-2020 16:41:58 by Hibernate Tools 4.3.1



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer codCliente;
     private String nombres;
     private String apellidos;
     private String direccion;

    public Cliente() {
    }

	
    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public Cliente(String nombres, String apellidos, String direccion) {
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.direccion = direccion;
    }
   
    public Integer getCodCliente() {
        return this.codCliente;
    }
    
    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}

