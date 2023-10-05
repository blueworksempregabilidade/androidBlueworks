package com.example.login_blueworks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Password extends Activity {
    private EditText editTextEmail;
    private Button buttonResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        editTextEmail = findViewById(R.id.emailBox);
        buttonResetPassword = findViewById(R.id.btnReset);

        buttonResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the email entered by the user
                String userEmail = editTextEmail.getText().toString().trim();

                // Check if the email exists in the database
                boolean emailExists = checkEmailExistsInDatabase(userEmail);

                if (emailExists) {
                    // Generate a reset token and send it to the user's email
                    sendPasswordResetEmail(userEmail);

                    // tirar o erro do "button reset password"

                    Toast.makeText(getApplicationContext(), "Reset link sent to your email.", Toast.LENGTH_SHORT).show();
                } else {
                    // Inform the user that the email doesn't exist in the database
                    Toast.makeText(getApplicationContext(), "Email not found.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to check if the email exists in the database (you should implement this)
    private boolean checkEmailExistsInDatabase(String email) {
        return false;
    }

// API DE ENVIO DE EMAIL
    private void sendPasswordResetEmail(String userEmail) {

    }
}
