/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.vistas;

import com.plan111.dao.AutoDAO;
import com.plan111.modelo.Auto;
import com.plan111.modelo.Marca;
import com.plan111.modelo.Modelo;
import com.plan111.modelo.TipoMotor;
import com.plan111.util.HibernateUtil;
import java.util.Calendar;
import org.hibernate.Session;

/**
 *
 * @author Nicolas Oliva
 */
public class AutoRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        Marca marc = new Marca();
        marc.setIdMarca(3);
        marc.setDescripcion("Fiat");
        Modelo modelo = new Modelo();
        modelo.setDescripcion("Palio");
        modelo.setIdModelo(6);
//        modelo.set
        TipoMotor tipo = new TipoMotor();
        tipo.setIdTipoMotor(2);
        tipo.setDescripcion("Gasolero");
        Calendar cal = Calendar.getInstance();
        Auto auto = new Auto();
//        auto.setIdAuto(1);
        auto.setMarca(marc);
        auto.setModelo(modelo);
        auto.setMotor(tipo);
        auto.setFechaFinFabricacion(cal.getTime());
        auto.setFechaInicioFabricacion(cal.getTime());
        AutoDAO autoDao = new AutoDAO();
        autoDao.agregarAuto(auto);
        System.exit(0);
    }
    
}
