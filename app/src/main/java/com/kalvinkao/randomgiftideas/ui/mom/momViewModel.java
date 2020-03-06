package com.kalvinkao.randomgiftideas.ui.mom;

import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kalvinkao.randomgiftideas.R;

import java.util.Random;

public class momViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Chocolate", "Roses", "Socks", "Gardening Kit", "Scented Candles", "Flowers", "Avocado Plant", "Cashmere Sweater", "Cashmere Scarf", "Cake", "Books", "Laptop", "Stuffed Animals",
            "Birthday Card", "Watch", "Amazon Kindle", "Pots and Pans", "Anything from IKEA", "Boots", "Bath Salts", "Robe", "Pyjamas", "Comfy Slippers", "Good Soap", "Lotion", "Bracelet", "Gloves", "Hat", "Pillow Cases",
            "Earrings", "Necklace", "Purse", "Agendas / Planners", "Best Mom Mug", "Wine", "Water Bottle", "Puzzles of her Face", "Perfume", "Hand Bag", "Gift Card", "Waffle Maker", "Sunglasses", "Yoga Mat"
            , "Mineral Soap", "Luxurious Pillow", "Corn Poppers", "Family Cookbook", "Headphones", "Decorative tape", "Massage Seat Cushion", "Fruit Bowl", "Fruit Infuser Water Bottle", "Bookends", "Instrument",
    "Macaroons", "Mood Lamp", "Fancy Steak Dinner", "Self-Watering Seedling Kit", "Glass Vase", "Custom Bowls", "Photo Collage"};

    public momViewModel() {
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