package com.example.dotavkasql;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    TextView e1,e2,e3,e4,e5,e6,e7,e8,c1,c2,c3,c4,c5,c6,c7,c8,t1,t2,t3,t4,t5,t6,t7,t8,k1,k2,k3,k4,k5,k6,k7,k8;
    Button b1,b2,b3;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }
    public void init(){

        ed1=findViewById(R.id.editText2);
        ed2=findViewById(R.id.editText);

        e1=findViewById(R.id.TextView1);
        e2=findViewById(R.id.TextView2);
        e3=findViewById(R.id.TextView3);
        e4=findViewById(R.id.TextView4);

        e5=findViewById(R.id.TextView20);
        e6=findViewById(R.id.TextView21);
        e7=findViewById(R.id.TextView22);
        e8=findViewById(R.id.TextView23);

        c1=findViewById(R.id.TextView5);
        c2=findViewById(R.id.TextView6);
        c3=findViewById(R.id.TextView7);
        c4=findViewById(R.id.TextView8);

        c5=findViewById(R.id.TextView24);
        c6=findViewById(R.id.TextView25);
        c7=findViewById(R.id.TextView26);
        c8=findViewById(R.id.TextView27);

        t1=findViewById(R.id.TextView9);
        t2=findViewById(R.id.TextView10);
        t3=findViewById(R.id.TextView11);
        t4=findViewById(R.id.TextView12);

        t5=findViewById(R.id.TextView28);
        t6=findViewById(R.id.TextView29);
        t7=findViewById(R.id.TextView30);
        t8=findViewById(R.id.TextView31);

        k1=findViewById(R.id.TextView13);
        k2=findViewById(R.id.TextView14);
        k3=findViewById(R.id.TextView15);
        k4=findViewById(R.id.TextView16);

        k5=findViewById(R.id.TextView32);
        k6=findViewById(R.id.TextView33);
        k7=findViewById(R.id.TextView34);
        k8=findViewById(R.id.TextView35);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }
    @SuppressLint("SetTextI18n")
    public void nit(int a, int s) {
        try {
            Output r1 = MainActivity.database.select("ed", a);
            Output r2 = MainActivity.database.select("ed", s);
            e1.setText(r1.KoleT + "");
            e2.setText(r1.ProfinTD + "₽");
            e3.setText(r1.LongT + "");
            e4.setText(r1.KoleF + "");
            if (r1.KoleT > r2.KoleT) {
                e5.setTextColor(Color.GREEN);
                e5.setText("(+" + String.valueOf(r1.KoleT * 100 / r2.KoleT - 100) + "%)");
            } else {
                e5.setTextColor(Color.RED);
                e5.setText("(-" + String.valueOf(100 - r1.KoleT * 100 / r2.KoleT) + "%)");
            }
            if (r1.ProfinTD > r2.ProfinTD) {
                e6.setTextColor(Color.GREEN);
                e6.setText("(+" + String.valueOf(r1.ProfinTD * 100 / r2.ProfinTD - 100) + "%)");
            } else {
                e6.setTextColor(Color.RED);
                e6.setText("(-" + String.valueOf(100 - r1.ProfinTD * 100 / r2.ProfinTD) + "%)");
            }

            if (r1.LongT > r2.LongT) {
                e7.setTextColor(Color.GREEN);
                e7.setText("(+" + String.valueOf(r1.LongT * 100 / r2.LongT - 100) + "%)");
            } else {
                e7.setTextColor(Color.RED);
                e7.setText("(-" + String.valueOf(100 - r1.LongT * 100 / r2.LongT) + "%)");
            }
            if (r1.KoleF > r2.KoleF) {
                e8.setTextColor(Color.GREEN);
                e8.setText("(+" + String.valueOf(r1.KoleF * 100 / r2.KoleF - 100) + "%)");
            } else {
                e8.setTextColor(Color.RED);
                e8.setText("(-" + String.valueOf(100 - r1.KoleF * 100 / r2.KoleF) + "%)");
            }
        } catch (Exception e) {
            Toast.makeText(this, "некоректные даные или я накосячил", Toast.LENGTH_LONG).show();
        }
    }
        @SuppressLint("SetTextI18n")
        public void nit1(int a, int s) {
            try {
                Output r1 = MainActivity.database.select("cd", a);
                Output r2 = MainActivity.database.select("cd", s);
                c1.setText(r1.KoleT + "");
                c2.setText(r1.ProfinTD + "₽");
                c3.setText(r1.LongT + "");
                c4.setText(r1.KoleF + "");
                if (r1.KoleT > r2.KoleT) {
                    c5.setTextColor(Color.GREEN);
                    c5.setText("(+" + String.valueOf(r1.KoleT * 100 / r2.KoleT - 100) + "%)");
                } else {
                    c5.setTextColor(Color.RED);
                    c5.setText("(-" + String.valueOf(100 - r1.KoleT * 100 / r2.KoleT) + "%)");
                }
                if (r1.ProfinTD > r2.ProfinTD) {
                    c6.setTextColor(Color.GREEN);
                    c6.setText("(+" + String.valueOf(r1.ProfinTD * 100 / r2.ProfinTD - 100) + "%)");
                } else {
                    c6.setTextColor(Color.RED);
                    c6.setText("(-" + String.valueOf(100 - r1.ProfinTD * 100 / r2.ProfinTD) + "%)");
                }

                if (r1.LongT > r2.LongT) {
                    c7.setTextColor(Color.GREEN);
                    c7.setText("(+" + String.valueOf(r1.LongT * 100 / r2.LongT - 100) + "%)");
                } else {
                    c7.setTextColor(Color.RED);
                    c7.setText("(-" + String.valueOf(100 - r1.LongT * 100 / r2.LongT) + "%)");
                }
                if (r1.KoleF > r2.KoleF) {
                    c8.setTextColor(Color.GREEN);
                    c8.setText("(+" + String.valueOf(r1.KoleF * 100 / r2.KoleF - 100) + "%)");
                } else {
                    c8.setTextColor(Color.RED);
                    c8.setText("(-" + String.valueOf(100 - r1.KoleF * 100 / r2.KoleF) + "%)");
                }
            } catch (Exception e) {
                Toast.makeText(this, "некоректные даные или я накосячил", Toast.LENGTH_LONG).show();
            }
        }
            @SuppressLint("SetTextI18n")
            public void nit2(int a, int s) {
                try {
                    Output r1 = MainActivity.database.select("td", a);
                    Output r2 = MainActivity.database.select("td", s);
                    t1.setText(r1.KoleT + "");
                    t2.setText(r1.ProfinTD + "₽");
                    t3.setText(r1.LongT + "");
                    t4.setText(r1.KoleF + "");
                    if (r1.KoleT > r2.KoleT) {
                        t5.setTextColor(Color.GREEN);
                        t5.setText("(+" + String.valueOf(r1.KoleT * 100 / r2.KoleT - 100) + "%)");
                    } else {
                        t5.setTextColor(Color.RED);
                        t5.setText("(-" + String.valueOf(100 - r1.KoleT * 100 / r2.KoleT) + "%)");
                    }
                    if (r1.ProfinTD > r2.ProfinTD) {
                        t6.setTextColor(Color.GREEN);
                        t6.setText("(+" + String.valueOf(r1.ProfinTD * 100 / r2.ProfinTD - 100) + "%)");
                    } else {
                        t6.setTextColor(Color.RED);
                        t6.setText("(-" + String.valueOf(100 - r1.ProfinTD * 100 / r2.ProfinTD) + "%)");
                    }

                    if (r1.LongT > r2.LongT) {
                        t7.setTextColor(Color.GREEN);
                        t7.setText("(+" + String.valueOf(r1.LongT * 100 / r2.LongT - 100) + "%)");
                    } else {
                        t7.setTextColor(Color.RED);
                        t7.setText("(-" + String.valueOf(100 - r1.LongT * 100 / r2.LongT) + "%)");
                    }
                    if (r1.KoleF > r2.KoleF) {
                        t8.setTextColor(Color.GREEN);
                        t8.setText("(+" + String.valueOf(r1.KoleF * 100 / r2.KoleF - 100) + "%)");
                    } else {
                        t8.setTextColor(Color.RED);
                        t8.setText("(-" + String.valueOf(100 - r1.KoleF * 100 / r2.KoleF) + "%)");
                    }
                } catch (Exception e) {
                    Toast.makeText(this, "некоректные даные или я накосячил", Toast.LENGTH_LONG).show();
                }
            }
                @SuppressLint("SetTextI18n")
                public void nit3(int a, int s){
                    try {
                        Output r1 = MainActivity.database.select("kd", a);
                        Output r2 = MainActivity.database.select("kd", s);
                        k1.setText(r1.KoleT + "");
                        k2.setText(r1.ProfinTD + "₽");
                        k3.setText(r1.LongT + "");
                        k4.setText(r1.KoleF + "");
                        if (r1.KoleT > r2.KoleT) {
                            k5.setTextColor(Color.GREEN);
                            k5.setText("(+" + String.valueOf(r1.KoleT * 100 / r2.KoleT - 100) + "%)");
                        } else {
                            k5.setTextColor(Color.RED);
                            k5.setText("(-" + String.valueOf(100 - r1.KoleT * 100 / r2.KoleT) + "%)");
                        }
                        if (r1.ProfinTD > r2.ProfinTD) {
                            k6.setTextColor(Color.GREEN);
                            k6.setText("(+" + String.valueOf(r1.ProfinTD * 100 / r2.ProfinTD - 100) + "%)");
                        } else {
                            k6.setTextColor(Color.RED);
                            k6.setText("(-" + String.valueOf(100 - r1.ProfinTD * 100 / r2.ProfinTD) + "%)");
                        }

                        if (r1.LongT > r2.LongT) {
                            k7.setTextColor(Color.GREEN);
                            k7.setText("(+" + String.valueOf(r1.LongT * 100 / r2.LongT - 100) + "%)");
                        } else {
                            k7.setTextColor(Color.RED);
                            k7.setText("(-" + String.valueOf(100 - r1.LongT * 100 / r2.LongT) + "%)");
                        }
                        if (r1.KoleF > r2.KoleF) {
                            k8.setTextColor(Color.GREEN);
                            k8.setText("(+" + String.valueOf(r1.KoleF * 100 / r2.KoleF - 100) + "%)");
                        } else {
                            k8.setTextColor(Color.RED);
                            k8.setText("(-" + String.valueOf(100 - r1.KoleF * 100 / r2.KoleF) + "%)");
                        }
                    } catch (Exception e) {
                        Toast.makeText(this,"некоректные даные или я накосячил", Toast.LENGTH_LONG).show();
                    }



    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button1:
                intent = new Intent(MainActivity4.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.button3:
                try {


                    Integer a = Integer.parseInt(String.valueOf(ed1.getText())), s = Integer.parseInt(String.valueOf(ed2.getText()));
                    nit(a, s);
                    nit1(a, s);
                    nit2(a, s);
                    nit3(a, s);
                    break;
                } catch (NumberFormatException e) {
                    Toast.makeText(this,"некоректные даные или я накосячил", Toast.LENGTH_LONG).show();
                }
        }
    }
}