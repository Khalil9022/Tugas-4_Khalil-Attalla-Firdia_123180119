package com.example.mangadex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername, etEmail, etPhone;
    Button btnSave, btnCancel;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "my_pref";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        setContentView(R.layout.activity_edit);

        etUsername = findViewById(R.id.et_username);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        btnSave = findViewById(R.id.btn_save);
        btnCancel = findViewById(R.id.btn_cancel);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String sUsername = sharedPreferences.getString(KEY_USERNAME,null);
        String sEmail = sharedPreferences.getString(KEY_EMAIL,null);
        String sPhone = sharedPreferences.getString(KEY_PHONE,null);

        if (sUsername != null || sEmail != null || sPhone != null){
            etUsername.setText(sUsername);
            etEmail.setText(sEmail);
            etPhone.setText(sPhone);
        }

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_save:
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_USERNAME,etUsername.getText().toString());
                editor.putString(KEY_EMAIL,etEmail.getText().toString());
                editor.putString(KEY_PHONE,etPhone.getText().toString());
                Toast.makeText(getApplicationContext(),"Profile berhasil di Edit!",Toast.LENGTH_SHORT).show();
                editor.apply();
                finish();
                break;

            case R.id.btn_cancel:
                finish();
                break;
        }
    }
}