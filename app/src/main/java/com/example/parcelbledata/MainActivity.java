package com.example.parcelbledata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.parcelblelibrary.ShowData;


public class MainActivity extends AppCompatActivity {
    private EditText etUserName, etPassword;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.et_user_name);
        etPassword = findViewById(R.id.et_password);
        btnSubmit = findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pojo pojo = new Pojo(etUserName.getText().toString(), etPassword.getText().toString());
                ShowData showData = new ShowData(pojo.getUserName(), pojo.getPassWord());
                ComponentName cName = new ComponentName("com.example.laststep","com.example.laststep.MainActivity");
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.putExtra("data", showData);
                intent.setComponent(cName);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });


    }
}