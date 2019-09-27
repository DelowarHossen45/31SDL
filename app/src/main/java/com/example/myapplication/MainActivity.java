package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btadd,btsub,btdiv,btdel,btclc,btequal,btmul,btfac,btmod,btans;
    double var1,var2;
    boolean add,sub,mul,div,mod;
    TextView text;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1=findViewById(R.id.bt1);
        btans=findViewById(R.id.btans);
        bt2=findViewById(R.id.bt2);

        bt3 =findViewById(R.id.bt3);

        bt4=findViewById(R.id.bt4);

        bt5=findViewById(R.id.bt5);

        bt6=findViewById(R.id.bt6);

        bt7=findViewById(R.id.bt7);

        bt8=findViewById(R.id.bt8);

        bt9=findViewById(R.id.bt9);

        bt0=findViewById(R.id.bt0);

        btadd=findViewById(R.id.btadd);
        btsub=findViewById(R.id.btsub);

        btmul=findViewById(R.id.btmul);
        btmod=findViewById(R.id.btmod);
        btdiv=findViewById(R.id.btdiv);
        btdel=findViewById(R.id.btdel);

        btclc=findViewById(R.id.btclc);
        btequal=findViewById(R.id.btequal);
        btfac=findViewById(R.id.btfac);
        text=findViewById(R.id.text);



        btclc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(null);
            }
        });
        btfac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");

            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");

            }
        });


        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");

            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");

            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");

            }
        });




    }

}
