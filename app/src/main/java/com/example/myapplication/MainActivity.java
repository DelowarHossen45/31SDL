package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btadd,btsub,btdiv,btdel,btclc,btequal,btmul,btfac,btmod,btsqrt;
    double var1,var2;
    boolean add,sub,mul,div,mod;
    TextView text;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1=findViewById(R.id.bt1);
        btsqrt=findViewById(R.id.btsqrt);
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

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");

            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    add=true;
                    text.setText(null);
                }
            }
        });


        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    sub=true;
                    text.setText(null);
                }
            }
        });


        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    mul=true;
                    text.setText(null);
                }
            }
        });

        btmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    mod=true;
                    text.setText(null);
                }

            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    add=true;
                    text.setText(null);
                }
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    div=true;
                    text.setText(null);
                }
            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(text.getText() + "");
                if (add == true) {
                    text.setText(var1 + var2 + "");
                    add = false;
                }
                if (sub == true) {
                    text.setText(var1 - var2 + "");
                    sub = false;
                }
                if (mul == true) {
                    text.setText(var1 * var2 + "");
                    mul = false;
                }
                if (div == true) {
                    text.setText(var1 / var2 + "");
                    div = false;
                }
                if (mod == true) {
                    if (var2 == 0) {
                        text.setText("error");
                    } else {
                        text.setText(var1 % var2 + "");
                        mod = false;
                    }
                }

                if (mod == true) {
                    if (var2 == 0) {
                        text.setText("error");
                    } else {
                        text.setText(var1 % var2 + "");
                        mod = false;
                    }
                }
            }
        });

        btsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(text.getText()+"");
                var2=sqrt(var1);
                text.setText(var2+"");


            }
        });

        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text.getText().toString().matches("")){
                    String tmp = text.getText().toString();
                    text.setText(tmp.substring(0,tmp.length()-1));
                }
            }
        });
    }

}
