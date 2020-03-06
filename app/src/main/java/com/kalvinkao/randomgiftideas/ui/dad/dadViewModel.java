package com.kalvinkao.randomgiftideas.ui.dad;

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

public class dadViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Chocolate", "Boots", "Socks", "Scented Candles", "Survival Kit", "Ring", "Cake", "Books", "Laptop", "Stuffed Animals", "Birthday Card", "Watch",
            "Earrings", "Chains", "Wallet", "Agendas / Planners", "Mug", "Wine", "Water bottle", "Puzzles", "Cologne", "Backpack", "Gift Card", "Waffle Maker", "Sunglasses", "Dumbbells"
            , "Mineral Soap", "Zippo Lighter", "Corn poppers", "Video game console", "Headphones", "Decorative tape", "Massage seat cushion", "Hammer", "Screwdriver", "Shot Glass","Wine Soaps",
    "Eye Glasses Holder", "Tie", "Cuff links", "Dress Shoes", "Belt", "Grill", "Fishing Rod", "Shower Beer Holder", "Bottle Opener", "Soldering Iron", "Cooking Recipe Book", "Guitar", "Piano", "Slippers",
            "Banana Slicer", "Briefcase", "Suits", "Beer", "Big Bag of Pistachio", "Car DashCam", "TV", "Bluetooth Speakers", "Amazon Alexa", "Polo Shirt", "Posters", "Movies", "Funny Caricature", "Drones",
    "Spatula", "Poker set", "Camera", "Phone", "Hat", "Jacket", "Fancy Steak"};

    public dadViewModel() {
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