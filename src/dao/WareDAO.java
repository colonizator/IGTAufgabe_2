package dao;

import Application.HibernateUtil;
import Classes.Ware;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Mike on 21.01.2017.
 */
public class WareDAO {
    public void createWare(Ware ware){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(ware);
        transaction.commit();
    }
}
