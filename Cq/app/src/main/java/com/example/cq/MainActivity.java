package com.example.cq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView iv;
    boolean isChanged = false;
    EditText ed_get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_send=findViewById(R.id.button);
        iv= findViewById(R.id.imageView);
        ed_get=findViewById(R.id.editText);
        btn_send.setOnClickListener(this);
    }
    public void onClick(View v) {
        String text = ed_get.getText().toString();
        Log.i("cq", text);
        if (text.equals("陈前")) {
            if (isChanged) {
                iv.setImageDrawable(getResources().getDrawable(R.drawable.c1));
            } else {
                iv.setImageDrawable(getResources().getDrawable(R.drawable.q));
            }
            isChanged = !isChanged;
            Toast.makeText(this, "陈前的头像已切换", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "输入姓名", Toast.LENGTH_LONG).show();
        }
    }
}
