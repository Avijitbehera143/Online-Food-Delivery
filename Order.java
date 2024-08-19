package Anudip.project.Online_food_delivery.entities;

import javax.persistence.*;

@Entity
public class Order {
	@Id
	@Column(name="FoodID")
	private String FoodId;
	private int OrderDate;
	private int Amount;
	private String DeliveryAddress;
	private String PaymentStatus;
	private int DeliveryDate;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String foodId, int orderDate, int amount, String deliveryAddress, String paymentStatus,
			int deliveryDate) {
		super();
		FoodId = foodId;
		OrderDate = orderDate;
		Amount = amount;
		DeliveryAddress = deliveryAddress;
		PaymentStatus = paymentStatus;
		DeliveryDate = deliveryDate;
	}
	public String getFoodId() {
		return FoodId;
	}
	public void setFoodId(String foodId) {
		FoodId = foodId;
	}
	public int getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(int orderDate) {
		OrderDate = orderDate;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDeliveryAddress() {
		return DeliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	public int getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(int deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	@Override
	public String toString() {
		return "Order [FoodId=" + FoodId + ", OrderDate=" + OrderDate + ", Amount=" + Amount + ", DeliveryAddress="
				+ DeliveryAddress + ", PaymentStatus=" + PaymentStatus + ", DeliveryDate=" + DeliveryDate
				+ ", getFoodId()=" + getFoodId() + ", getOrderDate()=" + getOrderDate() + ", getAmount()=" + getAmount()
				+ ", getDeliveryAddress()=" + getDeliveryAddress() + ", getPaymentStatus()=" + getPaymentStatus()
				+ ", getDeliveryDate()=" + getDeliveryDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
