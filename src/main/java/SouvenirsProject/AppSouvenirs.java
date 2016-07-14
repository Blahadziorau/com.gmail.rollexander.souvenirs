package SouvenirsProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppSouvenirs {

    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration().configure().buildSessionFactory();


    }
}
