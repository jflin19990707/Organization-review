package com.example.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn01;
    private Switch sw01;
    private RelativeLayout r01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = findViewById(R.id.okbtn);
        sw01 = findViewById(R.id.nightswitch);
        r01 = findViewById(R.id.rel);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"您的反馈已提交~",Toast.LENGTH_SHORT).show();
            }
        });
        sw01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    r01.setBackgroundColor(Color.rgb(139,177,183));
                    Log.d("提示","已经切换至深夜模式！");
                }
                else{
                    r01.setBackgroundColor(Color.rgb(177,224,232));
                    Log.d("提示","已经切换至白天模式！");
                }
            }
        });

    }
}
