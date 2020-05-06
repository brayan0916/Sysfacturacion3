/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.ClienteDao;
import Model.Cliente;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author pc
 */
@Named(value = "clienteBean")
@SessionScoped

public class ClienteBean implements Serializable {

    
     private String nombres;
     private String apellidos;
     private String direccion;
    
    
      private List<Cliente> listaCliente;
    
    
    
    public ClienteBean() {
      
    }

     public List<Cliente> getListaCliente() {
       ClienteDao cDao = new ClienteDao();
        listaCliente = cDao.listaCliente();
        return listaCliente;
    }
    
      
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /////////////////////////////////////////////////////////////
    
    
   
    
     public void allCliente() {
        Cliente cliente = new Cliente(getNombres(), getApellidos(), getDireccion());
        ClienteDao clienteDaO = new ClienteDao();
        clienteDaO.addCliente(cliente);
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("cliente creado correctamente, nuevo ID es" + cliente.getIdCliente()));

    }
    
}
