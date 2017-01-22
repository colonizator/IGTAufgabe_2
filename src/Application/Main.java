package Application;

import Classes.Bestellung;
import Classes.Kunde;
import dao.PersonDAO;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;




public class Main {

    public static void main(String[] args) {

        Kunde kunde = new Kunde("Mike", "Müller", 10101990);
        Kunde kunde1 = new Kunde("Heg", "Schultz", 11121998);
        Kunde kunde2 = new Kunde("Gek", "Kai", 12121985);
        PersonDAO personDAO = new PersonDAO();
        personDAO.createPerson(kunde);
        personDAO.createPerson(kunde1);
        personDAO.createPerson(kunde2);

        Bestellung best1 = new Bestellung(22012016);
        Bestellung best2 = new Bestellung(21012016);

        best1.setKunde(kunde);
        best2.setKunde(kunde);

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(best1);
        //transaction.commit();
        session.saveOrUpdate(best2);
        transaction.commit();




    }
}
