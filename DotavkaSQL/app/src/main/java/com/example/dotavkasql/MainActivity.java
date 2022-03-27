package com.example.dotavkasql;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
static MyDB database;
TextView e1,e2,e3,e4,c1,c2,c3,c4,t1,t2,t3,t4,k1,k2,k3,k4;
static Root root;
Button b1, b2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        print();
    }
    public void ins(){
        InputStream inputStream = getResources().openRawResource(R.raw.dt);
        GsonParser gsonParser = new GsonParser();
        root = gsonParser.parce(inputStream);
        Log.d("Main",root.Tumen.getNumberLongdistanceOrdersTheDay());
        Output e=Support.ekb(root),t=Support.tum(root),k=Support.kur(root),c=Support.chel(root);
        e.setTown("ed");
        t.setTown("td");
        k.setTown("kd");
        c.setTown("cd");
        e.setDate(1);
        t.setDate(1);
        k.setDate(1);
        c.setDate(1);
        Log.d("Main", e.toString());
        Log.d("Main", String.valueOf(database.insertM(e)));
        database.insertM(t);
        database.insertM(k);
        database.insertM(c);
        Support.chelM(root);
        Support.ekbM(root);
        Support.kurM(root);
        Support.tumM(root);
    }
    public void init(){
        database = new MyDB(this);

        e1=findViewById(R.id.TextView1);
        e2=findViewById(R.id.TextView2);
        e3=findViewById(R.id.TextView3);
        e4=findViewById(R.id.TextView4);

        c1=findViewById(R.id.TextView5);
        c2=findViewById(R.id.TextView6);
        c3=findViewById(R.id.TextView7);
        c4=findViewById(R.id.TextView8);

        t1=findViewById(R.id.TextView9);
        t2=findViewById(R.id.TextView10);
        t3=findViewById(R.id.TextView11);
        t4=findViewById(R.id.TextView12);

        k1=findViewById(R.id.TextView13);
        k2=findViewById(R.id.TextView14);
        k3=findViewById(R.id.TextView15);
        k4=findViewById(R.id.TextView16);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }
    @SuppressLint("SetTextI18n")
    public  void print(){

       Output e=database.select("ed",1);
       Log.e("Main",e.toString());
       e1.setText(e.KoleT+"");
       e2.setText(e.ProfinTD+"₽");
       e3.setText(e.LongT+" ("+e.KprD+"%)");
       e4.setText(e.KoleF+" ("+e.KprF+"%)");

        Output c=database.select("cd", 1);
        Log.e("Main",c.toString());
        c1.setText(c.KoleT+"");
        c2.setText(c.ProfinTD+"₽");
        c3.setText(c.LongT+" ("+c.KprD+"%)");
        c4.setText(c.KoleF+" ("+c.KprF+"%)");

        Output t=database.select("td", 1);
        Log.e("Main",t.toString());
        t1.setText(t.KoleT+"");
        t2.setText(t.ProfinTD+"₽");
        t3.setText(t.LongT+" ("+t.KprD+"%)");
        t4.setText(t.KoleF+" ("+t.KprF+"%)");

        Output k=database.select("kd",1);
        Log.e("Main",k.toString());
        k1.setText(k.KoleT+"");
        k2.setText(k.ProfinTD+"₽");
        k3.setText(k.LongT+" ("+k.KprD+"%)");
        k4.setText(k.KoleF+" ("+k.KprF+"%)");
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button:
                intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
                break;

        }
    }
}