package com.example.button_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button LoginButton,LogoutButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton=findViewById(R.id.Login_ButtonId);
        LogoutButton=findViewById(R.id.Logout_ButtonId);
        textView=findViewById(R.id.Text_viewID);
    }

    public void showMessage(View v) {
        if (v.getId()==R.id.Login_ButtonId){
            Log.v("tag","Log in button is clicked");
        }
            else
            Log.v("tag","Log out button is clicked");


    }
}