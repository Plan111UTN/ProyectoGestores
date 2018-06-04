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
import com.plan111.vistas.frmLocalidad;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Candelaria
 */
public class GestorLocalidad {

    private final SessionFactory sessionFactory;
    private final LocalidadDAO localidadDao;
    private Localidad localidad;

    /**
     * Constructor por defecto.
     *
     * @param sessionFactory
     */
    public GestorLocalidad(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        // creamos las instancias de los objetos de acceso a datos
        this.localidadDao = new LocalidadDAOImplHibernate();
    }

    public void run() throws BussinessException {
        new frmLocalidad(this).setVisible(true);
    }

    public List<Localidad> listarLocalidad() throws BussinessException {
        return localidadDao.findAll();
    }

    public void agregarLocalidad(Localidad loc) throws BussinessException {
        localidadDao.saveOrUpdate(loc);
    }

    public void modificarLocalidad(Localidad loc) throws BussinessException {
        localidadDao.saveOrUpdate(loc);
    }

    public void eliminarLocalidad(Localidad loc) throws BussinessException {
        localidadDao.delete(loc.getIdLocalidad());
    }

}
