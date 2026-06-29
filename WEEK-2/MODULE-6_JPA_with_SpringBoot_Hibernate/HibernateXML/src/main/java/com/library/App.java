package com.library;

import com.library.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Student student = new Student(4,"Pooja",21,550);
        Configuration configuration = new Configuration().configure();
        SessionFactory factor = configuration.buildSessionFactory();
        Session session = factor.openSession();
        Transaction transaction = session.beginTransaction();
        Student pooja = session.find(Student.class, 4);
        session.remove(pooja);
        transaction.commit();
        session.close();
        factor.close();
    }
}
