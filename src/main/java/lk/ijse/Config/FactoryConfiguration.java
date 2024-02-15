
package lk.ijse.Config;

import lk.ijse.Entity.Author;
import lk.ijse.Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Author.class).addAnnotatedClass(Book.class);
        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        if (factoryConfiguration == null){
            factoryConfiguration = new FactoryConfiguration();
        }
        return factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
