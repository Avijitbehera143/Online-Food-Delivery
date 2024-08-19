package Anudip.project.Online_food_delivery.services;

import Anudip.project.Online_food_delivery.entities.ShopOwner;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShopOwnerService {

    public void createShopOwner(ShopOwner shopOwner) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(shopOwner);
            tx.commit();
        }
    }

    public ShopOwner getShopOwner(String ownerId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(ShopOwner.class, ownerId);
        }
    }

    public void updateShopOwner(ShopOwner shopOwner) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(shopOwner);
            tx.commit();
        }
    }

    public void deleteShopOwner(String ownerId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            ShopOwner shopOwner = session.get(ShopOwner.class, ownerId);
            if (shopOwner != null) {
                session.delete(shopOwner);
            }
            tx.commit();
        }
    }
}
