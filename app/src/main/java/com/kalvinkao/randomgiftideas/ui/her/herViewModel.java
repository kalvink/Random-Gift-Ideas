package com.kalvinkao.randomgiftideas.ui.her;

import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;

        import java.util.Random;

public class herViewModel extends ViewModel {
    private int s;
    private MutableLiveData<String> mText;
    private Random random = new Random();
    private String[] gift_ideas = {"Chocolate", "Roses", "Socks", "Scented Candles", "Flowers", "Engagement Ring", "Cake", "Books", "MacBook", "Stuffed Animals", "Birthday Card", "Watch",
            "Earrings", "Monogrammed Necklace", "Purse", "Agendas / Planners", "Mug", "Wine", "Water Bottle", "Custom Puzzle of You Both", "Perfume", "Hand Bag", "Gift Card", "Waffle Maker", "Sunglasses", "Yoga Mat"
            , "Mineral Soap", "Matching T-Shirts", "Corn Poppers", "Love Bracelet", "AirPods", "Sneakers", "Massage Seat Cushion", "Photo Collage", "Makeup & Vanity Mirror", "Makeup", "Luxurious Pillow", "Kylie Jenner Lip Kit",
            "Disney World", "Polaroid Camera", "Personalized Blanket", "Cashmere Scarf", "Board Games", "Matching Onesies", "Puppy", "Kitten", "Amazon Alexa", "E-Book Reader", "Herschel Backpack", "Bike", "Sexy Boot",
    "Essential Oils Bath Bomb Set", "Personalized Music Box", "Leggings", "Locket", "Jewellery", "Painting of You Both"};

    public herViewModel() {
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