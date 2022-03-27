package com.example.prodnootdima;

import android.graphics.Bitmap;
import android.media.Image;

public class Card {

    Boolean type;
    Integer znach;
    Bitmap cart;

    public Card(Boolean type, Integer znach, Bitmap cart) {
        this.type = type;
        this.znach = znach;
        this.cart = cart;
    }
}
