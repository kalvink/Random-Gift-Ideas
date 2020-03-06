package com.kalvinkao.randomgiftideas.ui.brother;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kalvinkao.randomgiftideas.R;

import java.util.Random;

public class brotherViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Sneakers", "Wallet", "Jacket", "Hoodie", "Gift Cards", "Basketball", "Baseball Bat", "Comic Books", "Headphones", "Backpack", "Duffel Bag", "Water bottle", "Poster",
            "Bluetooth Speaker", "Amazon Alexa", "E-book Readers", "Laptop", "Mug", "Waffle Maker", "Coffee Maker", "Socks", "Funny T-Shirt", "Shaving Kit", "Scented Candles", "Board Games", "Video Games"
    ,"Sunglasses", "Hats", "Dumbbells", "Cologne", "Chocolate", "Dart Set", "Soccer Ball", "Football", "Funny Drawing of Him", "Drone", "Skateboard", "Bike", "Hoverboard", "Toys", "LEGO", "Movie Blu-rays",
            "Music Vinyls", "Watch", "Chains", "Belts", "Cuff links", "Poker Set", "Cotton Candy Machine", "Banana Slicer", "Keyboard", "Mouse", "Boxing Gloves", "Painting Set", "Crayons", "Whiteboard",
            "VR Headset", "Concert Tickets", "Tickets to Ball Game"};

    public brotherViewModel() {
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