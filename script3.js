const apiUrl = "http://localhost:3306/AnudipProject"; // Adjust this URL based on your backend server configuration

// Function to get all food items
async function getAllFood() {
    try {
        const response = await fetch(`${apiUrl}/food`);
        const foodItems = await response.json();
        console.log(foodItems);
        // Update the UI accordingly
    } catch (error) {
        console.error("Error fetching food items:", error);
    }
}

// Function to add a new food item
async function addFood(food) {
    try {
        const response = await fetch(`${apiUrl}/food`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(food)
        });
        if (response.ok) {
            const newFood = await response.json();
            console.log("Food added successfully:", newFood);
            // Update the UI accordingly
        } else {
            console.error("Error adding food:", response.statusText);
        }
    } catch (error) {
        console.error("Error:", error);
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
