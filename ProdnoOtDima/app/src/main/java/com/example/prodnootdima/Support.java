package com.example.prodnootdima;

import android.graphics.Bitmap;
import android.media.Image;

import java.util.ArrayList;

public class Support {

    public static ArrayList<Card> coloda(ArrayList<Card> cm){
        ArrayList<Card> card = new ArrayList<>();
        ArrayList<Integer> sd=new ArrayList<>();
        final Integer max=30,min=1;
        for (int i = 0; i < 30; i++) {
            Integer a=(int)(Math.random() * ((max - min) + 1)) + min;
            while (true){
            if (ty(a, sd)){
                a=(int)(Math.random() * ((max - min) + 1)) + min;
            }
            else {
                sd.add(a);
                break;
            }
            }}
        for (int i = 0; i < 30; i++) {
           Card c = new Card(true,sd.get(i), cm.get(sd.get(i)-1).cart);
           card.add(c);
        }
        return card;
    }
    public static boolean ty(int a, ArrayList<Integer> sd){
        for (int i = 0; i < sd.size(); i++) {
            if (sd.get(i)==a){
                return true;
            }
        }
        return false;
    }
    public void icran(){

    }
    public static String obrez(String a){
        String s="";
        if (a.length()>6){
        for (int i = 0; i < 6; i++) {
            s+=a.charAt(i);        }}
        else {s=a;}
        return s;
    }



}
