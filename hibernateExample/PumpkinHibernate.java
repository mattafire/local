/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateExample;

import TaskManager.Task;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mattafire
 */
public class PumpkinHibernate {
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public PumpkinHibernate() {
    }

public void updatePumpkin(Pumpkin pumpkin) {
        
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        //save the account object to the database
        session.save(pumpkin);
        //commit the transaction to the database
        session.getTransaction().commit();
        //close the session
        session.close();
        
    }
        
    public Pumpkin getPumpkinsById(int id) {
        
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        Pumpkin pumpkin = (Pumpkin) session.get(Pumpkin.class, id);
        session.getTransaction().commit();
        //close the session
        session.close();
        
        return pumpkin;
        }
    
    public List<Pumpkin> getAllPumpkins() {

        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        List<Pumpkin> pumpkins = (List<Pumpkin>) session.createCriteria(Pumpkin.class).list();
        session.getTransaction().commit();
        //close the session
        session.close();
        
        System.out.println();
        
        return pumpkins;
        }
    

}
