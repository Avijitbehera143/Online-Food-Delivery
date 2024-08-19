document.addEventListener('DOMContentLoaded', () => {
    const foodForm = document.getElementById('food-form');
    const orderForm = document.getElementById('order-form');
    const shopForm = document.getElementById('shop-form');
    const shopOwnerForm = document.getElementById('shop-owner-form');
    const userForm = document.getElementById('user-form');

    foodForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Add functionality to handle adding food
        const foodId = document.getElementById('food-id').value;
        const foodName = document.getElementById('food-name').value;
        const foodCategory = document.getElementById('food-category').value;

        // Here you would typically send this data to your back-end API

        // Display the new food item in the food list
        document.getElementById('food-list').innerHTML += `<p>${foodName} (${foodCategory})</p>`;
        foodForm.reset();
    });

    orderForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Add functionality to handle adding orders
        // Similar to food form
    });

    shopForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Add functionality to handle adding shops
        // Similar to food form
    });

    shopOwnerForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Add functionality to handle adding shop owners
        // Similar to food form
    });

    userForm.addEventListener('submit', function(event) {
        event.preventDefault();
        // Add functionality to handle adding users
        // Similar to food form
    });
});
