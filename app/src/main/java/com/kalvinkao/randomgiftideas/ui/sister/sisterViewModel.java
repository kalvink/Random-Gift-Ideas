package com.kalvinkao.randomgiftideas.ui.sister;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kalvinkao.randomgiftideas.R;

import java.util.Random;

public class sisterViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Barbie doll", "Stuffed Animals", "Socks", "Scented Candles", "Bath Bombs", "Pasta Maker", "Cake", "Books", "MacBook", "AirPods", "Birthday Card", "Watch",
            "Earrings", "Necklace", "Purse", "Agendas / Planners", "Mug", "Wine", "Water Bottle", "Puzzles", "Board Games", "Perfume", "Hand Bag", "Gift Card", "Waffle Maker", "Sunglasses", "Yoga Mat"
            , "Mineral Soap", "Jacket", "Corn Poppers", "Macaroon Maker Kit", "Headphones", "Decorative Tape", "Massage Seat Cushion", "DIY Lip Balm Kit", "Volleyball", "Tennis Racket & Balls", "Bubble Tea Kit",
    "Cooking Book", "Bluetooth Speaker", "Running Shoes", "Towel", "Funko Pop", "Velvet Scrunchies", "Cozy Blanket", "Cardigans", "Ancestry DNA Kit", "Personalized Starbucks Cup"};

    public sisterViewModel() {
        mText = new MutableLiveData<>();
        randomize();

    }

    void randomize() {
        int r = random.nextInt(gift_ideas.length);
        while (r == s) {
            r = random.nextInt(gift_ideas.length);
        }
        mText.setValue(gift_ideas[r]);
        s = r;

    }

    public LiveData<String> getText() {
        return mText;
    }
}