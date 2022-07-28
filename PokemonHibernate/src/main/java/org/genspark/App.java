package org.genspark;

import org.genspark.Entity.Pokemon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

//        Pokemon p = new Pokemon();
//        p.setName("Inteleon V");
//        p.setSetName("Fusion Strike");
//        p.setRarity("Ultra Rare");
//        p.setQuantity(1);
//
//        session.save(p);

//        Query q= session.createQuery("update Pokemon set quantity=:q where id=:i");
//        q.setParameter("q",2);
//        q.setParameter("i","Inteleon V");
//        int status = q.executeUpdate();
//        System.out.println(status);

        tx.commit();
        System.out.println("Successfully Saved");
        factory.close();
        session.close();

    }
}
