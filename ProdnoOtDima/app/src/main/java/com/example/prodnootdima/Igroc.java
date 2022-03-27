package com.example.prodnootdima;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

import java.util.ArrayList;

public class Igroc extends View {
    private Integer balans, stavka, shod, rez;
    ArrayList<Card> home= new ArrayList<>();

    public Igroc(Context context) {
        super(context);
    }

    public void setBalans(Integer balans) {
        this.balans = balans;
    }

    public void setStavka(Integer stavka) {
        this.stavka = stavka;
    }

    public void setShod(Integer shod) {
        this.shod = shod;
    }

    public Integer getBalans() {
        return balans;
    }

    public Integer getStavka() {
        return stavka;
    }

    public Integer getShod() {
        return shod;
    }
    public ArrayList<Bitmap> risbal(){
        int s,a;
        ArrayList<Bitmap> rez=new ArrayList<>();
        if (balans / 2>=2) {
            a = 2;
            s = balans-4;
        }
        else{
            a =balans / 2;
            s =balans-a*2;
        }
        Bitmap bitmap;
        for (int i = 0; i < s+a; i++) {
            if (i<a){
                bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img_30);
            }
            else {
                bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img_30);
            }
            rez.add(bitmap);
        }
        return rez;
    }
    public void addhome(Card c){
        home.add(c);
    }
    public ArrayList<Bitmap> drawhome(){
        ArrayList<Bitmap> f= new ArrayList<>();
        for (int i = 0; i < home.size(); i++) {
            f.add(home.get(i).cart);
        }
        return f;
    }
}
