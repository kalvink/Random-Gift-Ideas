package com.kalvinkao.randomgiftideas.ui.him;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kalvinkao.randomgiftideas.R;

import java.util.Random;

public class himViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Chocolate", "Photo Collage", "Matching Socks", "Matching Shirts", "Matching Onesies", "Scented Candles", "Letters of Appreciation", "Macaroons", "Cake", "Books", "Laptop", "Stuffed Animals",
            "Birthday Card", "Watch", "Joggers", "Basketball", "Guitar", "Beer", "Illustration of Him & You", "Ultimate Shaving Kit", "Beer Brewing Kit", "HD Dash Cam", "Fancy Steak", "Sneakers", "Dress Shoes",
            "Tie", "Suit", "Custom Bracelet", "Duffel Bag", "Gym Equipment", "Football", "Soccer Ball", "Boxing Gloves", "Punching Bag", "Fishing Rod", "Tent", "Bottle Opener",
            "Earrings", "Chains", "Wallet", "Agendas / Planners", "Mug", "Wine", "Water Bottle", "Puzzles of His Face", "Cologne", "LV Bag", "Gift Card", "Waffle Maker", "Sunglasses", "Tickets To Ball Game"
            , "Mineral Soap", "Zippo Lighter", "Corn poppers", "Cuff Links","Video game console", "Headphones", "Decorative tape", "Massage Seat Cushion", "Mouse", "Keyboard", "VR Headset"};

    public himViewModel() {
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