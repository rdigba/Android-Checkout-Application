package com.example.checkoutapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TextViews for each foods, and totalText which is the price we will calculate
    private TextView numBurgersText, numFriesText, numDrinksText, totalText;
    int burgerPrice = 3;
    int friesPrice = 2;
    int drinkPrice = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBurger();
        removeBurger();
        addFries();
        removeFries();
        addDrink();
        removeDrink();
        checkout();
        clear();
        orderHistroy();
    }

    // Function to add burger to cart when + button is pressed
    private void addBurger() {

        numBurgersText = findViewById(R.id.burgerCountTextView);
        // Getting button
        Button addBurgerButton = findViewById(R.id.addBurgerButton);
        // What happens when user clicks button
        addBurgerButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numBurgers = Integer.parseInt(numBurgersText.getText().toString());
                numBurgers++;
                numBurgersText.setText(Integer.toString(numBurgers));
            }
        });
    }

    // Function to remove burger from cart when - button is pressed
    private void removeBurger() {

        numBurgersText = findViewById(R.id.burgerCountTextView);
        // Getting button
        Button removeBurgerButton = findViewById(R.id.removeBurgerButton);
        // What happens when user clicks button
        removeBurgerButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numBurgers = Integer.parseInt(numBurgersText.getText().toString());
                // Prevent negative burgers
                if (numBurgers > 0)
                    numBurgers--;
                numBurgersText.setText(Integer.toString(numBurgers));
            }
        });
    }

    // Function to add fries to cart when + button is pressed
    private void addFries() {

        numFriesText = findViewById(R.id.friesCountTextView);
        // Getting button
        Button addFriesButton = findViewById(R.id.addFriesButton);
        // What happens when user clicks button
        addFriesButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numFries = Integer.parseInt(numFriesText.getText().toString());
                numFries++;
                numFriesText.setText(Integer.toString(numFries));
            }
        });
    }

    // Function to remove fries from cart when - button is pressed
    private void removeFries() {

        numFriesText = findViewById(R.id.friesCountTextView);
        // Getting button
        Button removeFriesButton = findViewById(R.id.removeFriesButton);
        // What happens when user clicks button
        removeFriesButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numFries = Integer.parseInt(numFriesText.getText().toString());
                // Prevent negative burgers
                if (numFries > 0)
                    numFries--;
                numFriesText.setText(Integer.toString(numFries));
            }
        });
    }

    // Function to add drink to cart when + button is pressed
    private void addDrink() {

        numDrinksText = findViewById(R.id.drinkCountTextView);
        // Getting button
        Button addDrinkButton = findViewById(R.id.addDrinkButton);
        // What happens when user clicks button
        addDrinkButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numDrinks = Integer.parseInt(numDrinksText.getText().toString());
                numDrinks++;
                numDrinksText.setText(Integer.toString(numDrinks));
            }
        });
    }

    // Function to remove drink from cart when - button is pressed
    private void removeDrink() {

        numDrinksText = findViewById(R.id.drinkCountTextView);
        // Getting button
        Button removeDrinkButton = findViewById(R.id.removeDrinkButton);
        // What happens when user clicks button
        removeDrinkButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // numBurgers will increase by 1
                int numDrinks = Integer.parseInt(numDrinksText.getText().toString());
                if (numDrinks > 0)
                    numDrinks--;
                numDrinksText.setText(Integer.toString(numDrinks));
            }
        });
    }

    // Function to add the value of all the burgers, fries, and drinks to compute and show total
    private void checkout() {
        totalText = findViewById(R.id.totalTextView);
        // Getting button
        Button checkoutButton = findViewById(R.id.checkoutButton);
        // What happens when user clicks button
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // Show user total
                numBurgersText = findViewById(R.id.burgerCountTextView);
                numFriesText = findViewById(R.id.friesCountTextView);
                numDrinksText = findViewById(R.id.drinkCountTextView);
                int numBurgers = Integer.parseInt(numBurgersText.getText().toString());
                int numFries = Integer.parseInt(numFriesText.getText().toString());
                int numDrinks = Integer.parseInt(numDrinksText.getText().toString());
                int total = (numBurgers * burgerPrice) + (numFries * friesPrice) +
                        (numDrinks * drinkPrice);
                totalText.setText("$" + total);
                if (total > 0)
                    toastMessage("Order Made!");
                else
                    toastMessage("Add something to your cart to checkout");
            }
        });
    }

    // Function to reset everything and if an order was made to log it into order history
    private void clear() {
        // Get button
        Button clearButton = findViewById(R.id.clearButton);
        // Clear everything if clicked
        clearButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // Show user total
                numBurgersText = findViewById(R.id.burgerCountTextView);
                numFriesText = findViewById(R.id.friesCountTextView);
                numDrinksText = findViewById(R.id.drinkCountTextView);
                totalText = findViewById(R.id.totalTextView);
                totalText.setText("$0");
                numBurgersText.setText("0");
                numFriesText.setText("0");
                numDrinksText.setText("0");
            }
        });
    }

    // Show message to user
    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Go to next activity if user clikcs order history
    private void orderHistroy() {
        Button orderHistoryButton = findViewById(R.id.orderHistoryButton);
        orderHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        OrderHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}