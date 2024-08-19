package Anudip.project.Online_food_delivery.services;

import Anudip.project.Online_food_delivery.entities.Shop;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShopService {

    public void createShop(Shop shop) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(shop);
            tx.commit();
        }
    }

    public Shop getShop(String shopId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(Shop.class, shopId);
        }
    }

    public void updateShop(Shop shop) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(shop);
            tx.commit();
        }
    }

    public void deleteShop(String shopId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Shop shop = session.get(Shop.class, shopId);
            if (shop != null) {
                session.delete(shop);
            }
            tx.commit();
        }
    }
}
