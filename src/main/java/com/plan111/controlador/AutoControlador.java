/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.controlador;

import com.plan111.dao.AutoDAO;
import com.plan111.modelo.Auto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Oliva
 */

public class AutoControlador implements Serializable
{
  private List<Auto> listaAuto = new ArrayList();
    private Auto auto = new Auto();    
    
    public AutoControlador() {
    }

    public List<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
    public void limpiarAuto() {
        this.auto = new Auto();
    }               
    
    private void registrar() throws Exception {
        AutoDAO dao;
        try {
            dao = new AutoDAO();
            dao.agregarAuto(auto); 
            listarAuto("V");
        } catch (Exception e)
        {
            System.out.println("Error al grabar");
           throw e;
        }
    }

    private void modificar() throws Exception {
        AutoDAO dao;
        try {
            dao = new AutoDAO();
            dao.modificarAuto(auto); // ESTA PERSONA LA SACA DEL MANAGER BEAN 
            listarAuto("V");
        } catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void listarAuto(String valor) throws Exception {
        AutoDAO dao;
        try {            
                dao = new AutoDAO();                
                listaAuto = dao.listarAuto();                        
        } catch (Exception e) {
            System.out.println("Error al grabar");
            throw e;
        }
    }

    
    public void leerID(Auto auto) throws Exception {
        AutoDAO dao;
        Auto temp;        
        try {            
            dao = new AutoDAO();            
            temp = dao.traerAuto(auto);            
            if (temp != null) {
                this.auto = temp;               
            }
        } catch (Exception e) {
            throw e;
        }                                       
    }
   
    public void eliminar(Auto auto) throws Exception {
        AutoDAO dao;        
        try {
            dao = new AutoDAO();
            dao.eliminarAuto(auto); 
            limpiarAuto();
            listarAuto("V");
        } catch (Exception e) 
        {
            System.out.println("Error al grabar");
            throw e;            
        }
    }
  
}
