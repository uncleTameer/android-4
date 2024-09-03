package com.example.usernameandpassword;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewUsername;
    TextView textViewPassword;
    EditText editTextNum1;
    EditText editTextNum2;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize TextView and EditText fields
        textViewUsername = findViewById(R.id.uname);
        textViewPassword = findViewById(R.id.password);
        editTextNum1 = findViewById(R.id.num1);
        editTextNum2 = findViewById(R.id.num2);
        textViewResult = findViewById(R.id.result);

        String username = getIntent().getStringExtra("USERNAME");
        String password = getIntent().getStringExtra("PASSWORD");

        textViewUsername.setText(username);
        textViewPassword.setText(password);
    }

    public void onCalculate(View view) {
        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());
        int result = 0;

        if (view.getId() == R.id.button) {
            result = num1 + num2;
        } else if (view.getId() == R.id.button3) {
            result = num1 - num2;
        } else if (view.getId() == R.id.button4) {
            result = num1 * num2;
        } else if (view.getId() == R.id.button6) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                textViewResult.setText("Cannot divide by zero :");
                return;
            }
        }

        textViewResult.setText(String.valueOf(result));
    }
}
