/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class ClienteDao {
    
      public void addCliente(Cliente cliente) {  
 
     Transaction tx = null;
     Session session = NewHibernateUtil.getSessionFactory().openSession();
     try {  
 tx = session.beginTransaction();
 session.save(cliente);
 session.getTransaction().commit();
 
 }catch(Exception e){ 
     e.printStackTrace();
     if(tx !=null){  
     tx.rollback();
     }
 }finally{  
         session.flush();
         session.close();
     }
 }
    
 public List<Cliente> listaCliente(){
        
        List<Cliente> lista=null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction t= session.beginTransaction();
        String hql="from Cliente";
        try{
            lista = session.createQuery(hql).list();
           t.commit();
            session.close();
       }catch(Exception e){
           System.out.printf(e.getMessage());
            t.rollback();
        }
        return lista;
        }
   
    
    
    
    
}
