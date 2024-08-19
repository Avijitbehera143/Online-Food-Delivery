package Anudip.project.Online_food_delivery.Main;

import Anudip.project.Online_food_delivery.entities.Food;
import Anudip.project.Online_food_delivery.entities.Order;
import Anudip.project.Online_food_delivery.entities.Shop;
import Anudip.project.Online_food_delivery.entities.ShopOwner;
import Anudip.project.Online_food_delivery.entities.User;
import Anudip.project.Online_food_delivery.services.FoodService;
import Anudip.project.Online_food_delivery.services.OrderService;
import Anudip.project.Online_food_delivery.services.ShopService;
import Anudip.project.Online_food_delivery.services.ShopOwnerService;
import Anudip.project.Online_food_delivery.services.UserService;
import Anudip.project.Online_food_delivery.utils.HibernateUtils;

import java.util.Scanner;

public class Main {
    private static FoodService foodService = new FoodService();
    private static OrderService orderService = new OrderService();
    private static ShopService shopService = new ShopService();
    private static ShopOwnerService shopOwnerService = new ShopOwnerService();
    private static UserService userService = new UserService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nOnline Food Delivery System");
            System.out.println("1. Manage Food");
            System.out.println("2. Manage Orders");
            System.out.println("3. Manage Shops");
            System.out.println("4. Manage Shop Owners");
            System.out.println("5. Manage Users");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    manageFood(scanner);
                    break;
                case 2:
                    manageOrders(scanner);
                    break;
                case 3:
                    manageShops(scanner);
                    break;
                case 4:
                    manageShopOwners(scanner);
                    break;
                case 5:
                    manageUsers(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    HibernateUtils.shutdown();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageFood(Scanner scanner) {
        System.out.println("\nManage Food");
        System.out.println("1. Add Food");
        System.out.println("2. View Food");
        System.out.println("3. Update Food");
        System.out.println("4. Delete Food");
        System.out.print("Enter your choice: ");
        int foodChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        switch (foodChoice) {
            case 1:
                System.out.print("Enter Food ID: ");
                String foodId = scanner.nextLine();
                System.out.print("Enter Food Name: ");
                String foodName = scanner.nextLine();
                System.out.print("Enter Food Category: ");
                String foodCategory = scanner.nextLine();
                Food food = new Food(foodId, foodName, foodCategory);
                foodService.createFood(food);
                System.out.println("Food added successfully.");
                break;
            case 2:
                System.out.print("Enter Food ID to view: ");
                foodId = scanner.nextLine();
                Food foodItem = foodService.getFood(foodId);
                if (foodItem != null) {
                    System.out.println(foodItem);
                } else {
                    System.out.println("Food not found.");
                }
                break;
            case 3:
                System.out.print("Enter Food ID to update: ");
                foodId = scanner.nextLine();
                Food existingFood = foodService.getFood(foodId);
                if (existingFood != null) {
                    System.out.print("Enter new Food Name: ");
                    foodName = scanner.nextLine();
                    System.out.print("Enter new Food Category: ");
                    foodCategory = scanner.nextLine();
                    existingFood.setFoodName(foodName);
                    existingFood.setFoodCategory(foodCategory);
                    foodService.updateFood(existingFood);
                    System.out.println("Food updated successfully.");
                } else {
                    System.out.println("Food not found.");
                }
                break;
            case 4:
                System.out.print("Enter Food ID to delete: ");
                foodId = scanner.nextLine();
                foodService.deleteFood(foodId);
                System.out.println("Food deleted successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void manageOrders(Scanner scanner) {
        System.out.println("\n Manage Orders");
        System.out.println("1. Add Order");
        System.out.println("2. View Order");
        System.out.println("3. Update Order");
        System.out.println("4. Delete Order");
        System.out.print("Enter your choice: ");
        int orderChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (orderChoice) {
            case 1:
                System.out.print("Enter Food ID: ");
                String foodId = scanner.nextLine();
                System.out.print("Enter Order Date (YYYYMMDD): ");
                int orderDate = scanner.nextInt();
                System.out.print("Enter Amount: ");
                int amount = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                System.out.print("Enter Delivery Address: ");
                String deliveryAddress = scanner.nextLine();
                System.out.print("Enter Payment Status: ");
                String paymentStatus = scanner.nextLine();
                System.out.print("Enter Delivery Date (YYYYMMDD): ");
                int deliveryDate = scanner.nextInt();
                Order order = new Order(foodId, orderDate, amount, deliveryAddress, paymentStatus, deliveryDate);
                orderService.createOrder(order);
                System.out.println("Order added successfully.");
                break;
            case 2:
                System.out.print("Enter Food ID to view order: ");
                foodId = scanner.nextLine();
                Order orderItem = orderService.getOrder(foodId);
                if (orderItem != null) {
                    System.out.println(orderItem);
                } else {
                    System.out.println("Order not found.");
                }
                break;
            case 3:
                System.out.print("Enter Food ID to update order: ");
                foodId = scanner.nextLine();
                Order existingOrder = orderService.getOrder(foodId);
                if (existingOrder != null) {
                    System.out.print("Enter new Order Date (YYYYMMDD): ");
                    orderDate = scanner.nextInt();
                    System.out.print("Enter new Amount: ");
                    amount = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new Delivery Address: ");
                    deliveryAddress = scanner.nextLine();
                    System.out.print("Enter new Payment Status: ");
                    paymentStatus = scanner.nextLine();
                    System.out.print("Enter new Delivery Date (YYYYMMDD): ");
                    deliveryDate = scanner.nextInt();
                    existingOrder.setOrderDate(orderDate);
                    existingOrder.setAmount(amount);
                    existingOrder.setDeliveryAddress(deliveryAddress);
                    existingOrder.setPaymentStatus(paymentStatus);
                    existingOrder.setDeliveryDate(deliveryDate);
                    orderService.updateOrder(existingOrder);
                    System.out.println("Order updated successfully.");
                } else {
                    System.out.println("Order not found.");
                }
                break;
            case 4:
                System.out.print("Enter Food ID to delete order: ");
                foodId = scanner.nextLine();
                orderService.deleteOrder(foodId);
                System.out.println("Order deleted successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void manageShops(Scanner scanner) {
        System.out.println("\nManage Shops");
        System.out.println("1. Add Shop");
        System.out.println("2. View Shop");
        System.out.println("3. Update Shop");
        System.out.println("4. Delete Shop");
        System.out.print("Enter your choice: ");
        int shopChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (shopChoice) {
            case 1:
                System.out.print("Enter Shop ID: ");
                String shopId = scanner.nextLine();
                System.out.print("Enter Shop Name: ");
                String shopName = scanner.nextLine();
                System.out.print("Enter Shop Address: ");
                String shopAddress = scanner.nextLine();
                System.out.print("Enter Bank Account: ");
                int bankAccount = scanner.nextInt();
                System.out.print("Enter GST Number: ");
                int gstNo = scanner.nextInt();
                Shop shop = new Shop(shopId, shopName, shopAddress, bankAccount, gstNo);
                shopService.createShop(shop);
                System.out.println("Shop added successfully.");
                break;
            case 2:
                System.out.print("Enter Shop ID to view: ");
                shopId = scanner.nextLine();
                Shop shopItem = shopService.getShop(shopId);
                if (shopItem != null) {
                    System.out.println(shopItem);
                } else {
                    System.out.println("Shop not found.");
                }
                break;
            case 3:
                System.out.print("Enter Shop ID to update: ");
                shopId = scanner.nextLine();
                Shop existingShop = shopService.getShop(shopId);
                if (existingShop != null) {
                    System.out.print("Enter new Shop Name: ");
                    shopName = scanner.nextLine();
                    System.out.print("Enter new Shop Address: ");
                    shopAddress = scanner.nextLine();
                    System.out.print("Enter new Bank Account: ");
                    bankAccount = scanner.nextInt();
                    System.out.print("Enter new GST Number: ");
                    gstNo = scanner.nextInt();
                    existingShop.setShopName(shopName);
                    existingShop.setShopAddress(shopAddress);
                    existingShop.setBankAccount(bankAccount);
                    existingShop.setGstNo(gstNo);
                    shopService.updateShop(existingShop);
                    System.out.println("Shop updated successfully.");
                } else {
                    System.out.println("Shop not found.");
                }
                break;
            case 4:
                System.out.print("Enter Shop ID to delete: ");
                shopId = scanner.nextLine();
                shopService.deleteShop(shopId);
                System.out.println("Shop deleted successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void manageShopOwners(Scanner scanner) {
        System.out.println("\nManage Shop Owners");
        System.out.println("1. Add Shop Owner");
        System.out.println("2. View Shop Owner");
        System.out.println("3. Update Shop Owner");
        System.out.println("4. Delete Shop Owner");
        System.out.print("Enter your choice: ");
        int shopOwnerChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (shopOwnerChoice) {
            case 1:
                System.out.print("Enter Owner ID: ");
                String ownerId = scanner.nextLine();
                System.out.print("Enter Shop ID: ");
                String shopId = scanner.nextLine();
                System.out.print("Enter Owner Name: ");
                String ownerName = scanner.nextLine();
                System.out.print("Enter Owner Address: ");
                String ownerAddress = scanner.nextLine();
                System.out.print("Enter Owner Phone: ");
                String ownerPhone = scanner.nextLine();
                ShopOwner shopOwner = new ShopOwner(ownerId, shopId, ownerName, ownerAddress, ownerPhone);
                shopOwnerService.createShopOwner(shopOwner);
                System.out.println("Shop Owner added successfully.");
                break;
            case 2:
                System.out.print("Enter Owner ID to view: ");
                ownerId = scanner.nextLine();
                ShopOwner shopOwnerItem = shopOwnerService.getShopOwner(ownerId);
                if (shopOwnerItem != null) {
                    System.out.println(shopOwnerItem);
                } else {
                    System.out.println("Shop Owner not found.");
                }
                break;
            case 3:
                System.out.print("Enter Owner ID to update: ");
                ownerId = scanner.nextLine();
                ShopOwner existingShopOwner = shopOwnerService.getShopOwner(ownerId);
                if (existingShopOwner != null) {
                    System.out.print("Enter new Shop ID: ");
                    shopId = scanner.nextLine();
                    System.out.print("Enter new Owner Name: ");
                    String OwnerName = scanner.nextLine();
                    System.out.print("Enter new Owner Address: ");
                    String OwnerAddress = scanner.nextLine();
                    System.out.print("Enter new Owner Phone: ");
                    String OwnerPhone = scanner.nextLine();
                    existingShopOwner.setShopId(shopId);
                    existingShopOwner.setOwnername(OwnerName);
                    existingShopOwner.setOwnerAddress(OwnerAddress);
//                    existingShopOwner.setOwnerPhone(OwnerPhone);
                    shopOwnerService.updateShopOwner(existingShopOwner);
                    System.out.println("Shop Owner updated successfully.");
                } else {
                    System.out.println("Shop Owner not found.");
                }
                break;
            case 4:
                System.out.print("Enter Owner ID to delete: ");
                ownerId = scanner.nextLine();
                shopOwnerService.deleteShopOwner(ownerId);
                System.out.println("Shop Owner deleted successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void manageUsers(Scanner scanner) {
        System.out.println("\nManage Users");
        System.out.println("1. Add User");
        System.out.println("2. View User");
        System.out.println("3. Update User");
        System.out.println("4. Delete User");
        System.out.print("Enter your choice: ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        switch (userChoice) {
            case 1:
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter User Name: ");
                String userName = scanner.nextLine();
                System.out.print("Enter User Address: ");
                String userAddress = scanner.nextLine();
                System.out.print("Enter User Phone: ");
                int userPhone = scanner.nextInt();
                User user = new User();
                userService.createUser(user);
                System.out.println("User added successfully.");
                break;
            case 2:
                System.out.print("Enter User ID to view: ");
                userId = scanner.nextLine();
                User userItem = userService.getUser(userId);
                if (userItem != null) {
                    System.out.println(userItem);
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 3:
                System.out.print("Enter User ID to update: ");
                userId = scanner.nextLine();
                User existingUser = userService.getUser(userId);
                if (existingUser != null) {
                    System.out.print("Enter new User Name: ");
                    String UserName = scanner.nextLine();
                    System.out.print("Enter new User Address: ");
                    String UserAddress = scanner.nextLine();
                    System.out.print("Enter new User Phone: ");
                    int UserPhone = scanner.nextInt();
                    existingUser.setUsername(UserName);
                    existingUser.setAddress(UserAddress);
                    existingUser.setContact(UserPhone);
                    userService.updateUser(existingUser);
                    System.out.println("User updated successfully.");
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 4:
                System.out.print("Enter User ID to delete: ");
                userId = scanner.nextLine();
                userService.deleteUser(userId);
                System.out.println("User deleted successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
