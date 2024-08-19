package Anudip.project.Online_food_delivery.entities;

import javax.persistence.*;

@Entity
public class Food {
	@Id
	@Column(name="FoodID")
	private String FoodId;
	private String FoodName;
	private String FoodCategory;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String foodId, String foodName, String foodCategory) {
		super();
		FoodId = foodId;
		FoodName = foodName;
		FoodCategory = foodCategory;
	}
	public String getFoodId() {
		return FoodId;
	}
	public void setFoodId(String foodId) {
		FoodId = foodId;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getFoodCategory() {
		return FoodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}
	@Override
	public String toString() {
		return "Food [FoodId=" + FoodId + ", FoodName=" + FoodName + ", FoodCategory=" + FoodCategory + ", getFoodId()="
				+ getFoodId() + ", getFoodName()=" + getFoodName() + ", getFoodCategory()=" + getFoodCategory()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
