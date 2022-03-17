package com.example.btl_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewAccount extends AppCompatActivity implements View.OnClickListener {
    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newaccount);
        initView();
}
    private void initView() {
        txtview = (TextView) findViewById(R.id.content3);
        txtview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.content3:
                Intent intent= new Intent();
                intent.setClass(this,LoginActivity.class);
                startActivity(intent);
                break;
            default:
                // code block
                break;
        }
    }}
