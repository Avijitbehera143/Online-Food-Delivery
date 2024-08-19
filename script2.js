import axios from 'axios';

const apiUrl = "http://localhost:3306/AnudipProject"; // Adjust this URL based on your backend server configuration

// Function to get all food items
async function getAllFood() {
    try {
        const response = await axios.get(`${apiUrl}/food`);
        const foodItems = response.data;
        console.log(foodItems);
        // Update the UI accordingly
    } catch (error) {
        console.error("Error fetching food items:", error);
    }
}

// Function to add a new food item
async function addFood(food) {
    try {
        const response = await axios.post(`${apiUrl}/food`, food);
        console.log("Food added successfully:", response.data);
        // Update the UI accordingly
    } catch (error) {
        console.error("Error adding food:", error);
    }
}

// Example usage
const newFoodItem = {
    foodId: "1",
    foodName: "Pizza",
    foodCategory: "Fast Food"
};

addFood(newFoodItem);
getAllFood();
