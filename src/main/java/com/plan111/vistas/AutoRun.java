package com.plan111.vistas;

import com.plan111.controlador.GestorLocalidad;
import com.plan111.dao.BussinessException;
import com.plan111.util.HibernateUtil;

public class AutoRun {
  public static void main(String[] args) throws BussinessException{
//    Session session = HibernateUtil.getSessionFactory().openSession();
         HibernateUtil.buildSessionFactory();
         HibernateUtil.openSessionAndBindToThread();
//    Marca marca = new Marca();
//    marca.setDescripcion("ford");
//
//    Modelo modelo = new Modelo();
//    modelo.setDescripcion("mustang");
//
//    TipoMotor tipo = new TipoMotor();
//    tipo.setDescripcion("Naftero");
//
//    Calendar cal = Calendar.getInstance();

    // Instancia Auto
//    Auto auto = new Auto();
//    auto.setMarca(marca);
//    auto.setModelo(modelo);
//    auto.setMotor(tipo);
//    auto.setFechaFinFabricacion(cal.getTime());
//    auto.setFechaInicioFabricacion(cal.getTime());

    // Instancia DAO
//    AutoDAO nuevoAuto = new AutoDAO();
//    nuevoAuto.agregarAuto(auto);
//    LocalidadControlador gestorLoc = new LocalidadControlador();
//    gestorLoc.run();
//    Localidad loc = new Localidad();
//    loc.setNombre("Bell Ville");
//    gestorLoc.agregarLocalidad(loc);

    GestorLocalidad gestor = new GestorLocalidad(HibernateUtil.getSessionFactory());
    gestor.run();
  }
}
