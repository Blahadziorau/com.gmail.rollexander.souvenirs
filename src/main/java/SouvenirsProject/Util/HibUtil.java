package SouvenirsProject.Util;

import SouvenirsProject.Entity.Country;
import SouvenirsProject.Entity.Producer;
import SouvenirsProject.Entity.Souvenir;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by Java on 09.07.2016.
 */
public class HibUtil {
    private static SessionFactory factory = init();

    private HibUtil() {
    }

    public static Session getSession() {
        return factory.openSession();
    }

    public static void closeFactory() {
        factory.close();
    }

    private static SessionFactory init() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure().build();
        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(Producer.class)
                .addAnnotatedClass(Souvenir.class)
                .addAnnotatedClass(Country.class)
                .buildMetadata();
        return metadata.buildSessionFactory();
    }

}
