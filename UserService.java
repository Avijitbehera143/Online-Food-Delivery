package Anudip.project.Online_food_delivery.services;

import Anudip.project.Online_food_delivery.entities.User;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserService {

    public void createUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(user);
            tx.commit();
        }
    }

    public User getUser(String userId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(User.class, userId);
        }
    }

    public void updateUser(User user) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(user);
            tx.commit();
        }
    }

    public void deleteUser(String userId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            User user = session.get(User.class, userId);
            if (user != null) {
                session.delete(user);
            }
            tx.commit();
        }
    }
}
