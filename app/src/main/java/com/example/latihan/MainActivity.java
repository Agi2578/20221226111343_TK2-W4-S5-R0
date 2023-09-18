package com.example.latihan;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class MainActivity extends AppCompatActivity {

    private EditText editTextUser;
    private EditText editTextPassword;

    MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.attr.layout.activity_main);

        editTextUser = findViewById(android.R.attr.id.editTextUser);
        editTextPassword = findViewById(android.R.attr.id.editTextPassword);
        Button buttonLogin = findViewById(android.R.attr.id.buttonLogin);

        buttonLogin.setOnClickListener(view -> {
            String username = editTextUser.getText().toString();
            String password = editTextPassword.getText().toString();

            if (username.equals("pengguna") && password.equals("masuk")) {
                // Login berhasil, navigasi ke halaman aplikasi
                // Anda dapat mengganti Activity atau Fragment sesuai kebutuhan
                Toast.makeText(MainActivity.this, "Login berhasil!", Toast.LENGTH_SHORT).show();
                // Tambahkan navigasi ke halaman aplikasi di sini
            } else {
                // Login gagal
                Toast.makeText(MainActivity.this, "Login gagal. Coba lagi.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
