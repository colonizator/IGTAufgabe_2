package dao;

import Application.HibernateUtil;
import Classes.Bestellung;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Mike on 21.01.2017.
 */
public class BestellungDAO {

    public void createBestellung(Bestellung bestellung){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(bestellung);
        transaction.commit();
   }
}
