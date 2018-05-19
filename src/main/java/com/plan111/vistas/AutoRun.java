package com.plan111.vistas;

import com.plan111.dao.AutoDAO;
import com.plan111.modelo.Auto;
import com.plan111.modelo.Marca;
import com.plan111.modelo.Modelo;
import com.plan111.modelo.TipoMotor;
import com.plan111.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Calendar;

public class AutoRun {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();

    Marca marca = new Marca();
    marca.setDescripcion("ford");

    Modelo modelo = new Modelo();
    modelo.setDescripcion("mustang");

    TipoMotor tipo = new TipoMotor();
    tipo.setDescripcion("Naftero");

    Calendar cal = Calendar.getInstance();

    // Instancia Auto
    Auto auto = new Auto();
    auto.setMarca(marca);
    auto.setModelo(modelo);
    auto.setMotor(tipo);
    auto.setFechaFinFabricacion(cal.getTime());
    auto.setFechaInicioFabricacion(cal.getTime());

    // Instancia DAO
    AutoDAO nuevoAuto = new AutoDAO();
    nuevoAuto.agregarAuto(auto);
  }
}
