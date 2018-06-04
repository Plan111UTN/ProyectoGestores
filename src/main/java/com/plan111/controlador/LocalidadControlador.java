/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.controlador;

import com.plan111.dao.BussinessException;
import com.plan111.dao.LocalidadDAO;
import com.plan111.dao.impl.LocalidadDAOImplHibernate;
import com.plan111.modelo.Localidad;
import java.util.List;

/**
 *
 * @author Nicolas Oliva
 */
public class LocalidadControlador
{
    // DECLARAR PANTALLAS COMO PRIVADAS
    // DECLARAR DAOS Como Finals
    private Localidad loc;
    private LocalidadDAO localidadDao;
    public void run()
    {
        localidadDao = new LocalidadDAOImplHibernate();
        // OBTENEMOS TODO LO NECESARIO PARA REALIZAR LA GESTION
        //CREAMOS UNA INSTANCIA DEL FORMULARIO PRINCIPAL Y LE PASAMOS LO QUE CARGAMOS PREVIAMENTE.                        
    }
    
    public void listarLocalidad() throws BussinessException
    {
        List<Localidad> listaLocalidad;
        try 
        {
            listaLocalidad = localidadDao.findAll();                                   
        } catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void agregarLocalidad(Localidad loc) throws BussinessException
    {
       localidadDao.saveOrUpdate(loc);
    }
    public void modificarLocalidad(Localidad loc) throws BussinessException
    {
       localidadDao.saveOrUpdate(loc);
    }
    public void eliminarLocalidad(Localidad loc) throws BussinessException
    {
       localidadDao.delete(loc.getIdLocalidad());
    }
}
