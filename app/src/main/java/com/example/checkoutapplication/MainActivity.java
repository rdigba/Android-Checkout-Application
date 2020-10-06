package com.example.checkoutapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TextViews for each foods, and totalText which is the price we will calculate
    private TextView numBurgersText, numFriesText, numDrinksText, totalText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBurger();
    }

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
}