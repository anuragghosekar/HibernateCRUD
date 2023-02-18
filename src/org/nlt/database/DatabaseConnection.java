package org.nlt.database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DatabaseConnection {

   private static SessionFactory sf;
   private static Session ses;
   
   public static SessionFactory getSessionFactory()
   {
     sf=new Configuration().configure().buildSessionFactory();
       return sf;
   }
}
