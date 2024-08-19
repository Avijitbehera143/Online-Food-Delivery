package Anudip.project.Online_food_delivery.services;

import Anudip.project.Online_food_delivery.entities.Order;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrderService {

    public void createOrder(Order order) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(order);
            tx.commit();
        }
    }

    public Order getOrder(String foodId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(Order.class, foodId);
        }
    }

    public void updateOrder(Order order) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(order);
            tx.commit();
        }
    }

    public void deleteOrder(String foodId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Order order = session.get(Order.class, foodId);
            if (order != null) {
                session.delete(order);
            }
            tx.commit();
        }
    }
}
