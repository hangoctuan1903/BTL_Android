package com.example.btl_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnlogin;
    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        btnlogin = (Button) findViewById(R.id.button);
        btnlogin.setOnClickListener(this);
        txtview = (TextView) findViewById(R.id.addaccount);
        txtview.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent intent= new Intent();
                intent.setClass(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.addaccount:
                Intent intent1= new Intent();
                intent1.setClass(this,NewAccount.class);
                startActivity(intent1);
                break;
            default:
                // code block
                break;
        }
    }
}
