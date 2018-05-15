package com.plan111.dao;

import com.plan111.modelo.Auto;
import com.plan111.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Nicolas Oliva
 */
public class AutoDAO {

  public void agregarAuto(Auto auto) {
    // Permite hacer un seguimiento hasta el commit a la base de datos.
    Transaction tx = null;

    Session session = HibernateUtil.getSessionFactory().openSession();

    try {
      tx = session.beginTransaction(); // Inicializa el seguimiento
      session.save(auto); // Guarda el objeto que recibe
      session.getTransaction().commit(); // Realiza el commit
    } catch (Exception e) {
      e.printStackTrace();
      if (tx != null) {
        tx.rollback(); // Vuelve al estado inicial
      }
    } finally {
      session.flush();
      session.close();
    }
  }
}