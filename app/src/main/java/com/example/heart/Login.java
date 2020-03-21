package com.example.heart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText editText=findViewById(R.id.name);
        final CheckBox checkBox=findViewById(R.id.check_box);
        Button button=findViewById(R.id.confirm_Button);
        Button bt2=findViewById(R.id.user_agreement);

        context=this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked() && editText.getText().toString().equals("任乐天")){
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                }else if(!editText.getFreezesText()){
                    Toast.makeText(context,"憨憨，输名字",Toast.LENGTH_SHORT).show();
                }
                else if(!editText.getText().toString().equals("任乐天")){
                    Toast.makeText(context,"憨憨，回答错了",Toast.LENGTH_SHORT).show();
                }
                else if(!checkBox.isChecked() && editText.getText().toString().equals("任乐天")){
                    Toast.makeText(context,"憨憨，勾用户协议",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,UserAgreement.class);
                startActivity(intent);
            }
        });
    }
}
