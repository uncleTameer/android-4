package com.example.usernameandpassword;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.usernameandpassword.MainActivity2;
import com.example.usernameandpassword.R;

public class MainActivity extends AppCompatActivity {

     EditText editTextUsername;
     EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText fields
        editTextUsername = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextText2);
    }

    // This method is called when the "Login" button is clicked
    public void btn(View view) {
        // Get the entered username and password
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        // Create an intent to navigate to the second activity
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        // Pass the username and password to the second activity
        intent.putExtra("USERNAME", username);
        intent.putExtra("PASSWORD", password);
        // Start the second activity
        startActivity(intent);
    }
}
