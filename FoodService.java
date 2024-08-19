package Anudip.project.Online_food_delivery.services;

import Anudip.project.Online_food_delivery.entities.Food;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FoodService {

    public void createFood(Food food) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(food);
            tx.commit();
        }
    }

    public Food getFood(String foodId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(Food.class, foodId);
        }
    }

    public void updateFood(Food food) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(food);
            tx.commit();
        }
    }

    public void deleteFood(String foodId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Food food = session.get(Food.class, foodId);
            if (food != null) {
                session.delete(food);
            }
            tx.commit();
        }
    }
}
