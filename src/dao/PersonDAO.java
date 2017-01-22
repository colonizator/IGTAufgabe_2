package dao;

import Application.HibernateUtil;
import Classes.Kunde;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PersonDAO {



    public void createPerson(Kunde kunde){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(kunde);
        transaction.commit();
    }
}
