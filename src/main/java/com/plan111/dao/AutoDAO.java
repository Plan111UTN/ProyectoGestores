/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.dao;

import com.plan111.util.HibernateUtil;
import com.plan111.modelo.Auto;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nicolas Oliva
 */
public class AutoDAO {

    public void agregarAuto(Auto auto) {
        Transaction tx = null; // Permite hacer un seguimiento hasta el commit a
        // la base de datos, si algo surge mal realiza rollback (Deshacer cambios)
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction(); // INICIALIZA EL SEGUIMIENTO
            session.save(auto); // GUARDA OBJETO QUE RECIBE
            session.getTransaction().commit(); // REALIZA EL 
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    public void modificarAuto(Auto auto) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(auto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    public void eliminarAuto(Auto auto) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.delete(auto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    public Auto traerAuto(Auto auto) {
        Auto objAuto = new Auto();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            objAuto = (Auto) session.get(Auto.class, auto.getIdAuto());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return objAuto;
    }

//    public Auto comprobarCredenciales(Auto auto) {
//        Auto objAuto = new Auto();
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            objAuto = (Auto) session.createQuery("FROM Auto WHERE LOGIN  = '" + auto.getLOGIN() + "' and CONTRASENA ='" + auto.getCONTRASENA() + "'").uniqueResult();
//            if (objAuto == null) {
//                objAuto = null;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            session.flush();
//            session.close();
//        }
//        return objAuto;
//    }   
    
    public List<Auto> listarAuto() {
//        Transaction tx = null;
        List<Auto> listaAuto = new ArrayList();
        Auto objAuto = new Auto();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
//            tx = session.beginTransaction();
            listaAuto = (List<Auto>) session.createQuery("from Auto").list();
//            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            session.flush();
            session.close();
        }
        return listaAuto;
    }

    public int ultimoCodAuto() {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int codAuto = 0;
            String sql = "SELECT MAX(CODUSUARIO) FROM TBUSUARIOS";
            Query query = session.createSQLQuery(sql);
            if (query.uniqueResult() != null) {
                codAuto = (Integer) query.uniqueResult();
            } else {
                codAuto = 0;
            }
            System.out.println("Cod Auto: " + codAuto);
            session.close();
            return codAuto + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

}
