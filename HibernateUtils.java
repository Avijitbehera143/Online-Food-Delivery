package Anudip.project.Online_food_delivery.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import Anudip.project.Online_food_delivery.entities.Food;
import Anudip.project.Online_food_delivery.entities.Order;
import Anudip.project.Online_food_delivery.entities.Shop;
import Anudip.project.Online_food_delivery.entities.ShopOwner;
import Anudip.project.Online_food_delivery.entities.User;

public class HibernateUtils 
{
	/*--- Declare SessionFactory ----*/
	private static SessionFactory sessionFactory;
	/*---- Hibernate configuration -----*/
	static
	{
		try
		{
			/*----- Creating Configuration object ------*/
			Configuration config=new Configuration();
			/*---- Setting properties in Configuration -----*/
			config.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
			config.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/AnudipProject");
			config.setProperty("hibernate.connection.username","root");
			config.setProperty("hibernate.connection.password", "7682033126Av");
			config.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
			config.setProperty("hibernate.show_sql","true");
			config.setProperty("hibernate.format_sql", "true");
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            /*---- Add Annotated entity class -----------*/
            config.addAnnotatedClass(Food.class);
            config.addAnnotatedClass(Order.class);
            config.addAnnotatedClass(Shop.class);
            config.addAnnotatedClass(ShopOwner.class);
            config.addAnnotatedClass(User.class);
            /*---- Create Service Registry to apply settings -------*/
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            /*----- Creating SessionFactory -------*/
            sessionFactory = config.buildSessionFactory(serviceRegistry);

		}
		catch(Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}
	
	/*---- method to return sessionfactory object ----------*/
	 public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static void shutdown() {
	        // Close caches and connection pools
	        getSessionFactory().close();
	    }
}
