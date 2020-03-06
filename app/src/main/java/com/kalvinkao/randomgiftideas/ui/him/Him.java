package com.kalvinkao.randomgiftideas.ui.him;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.kalvinkao.randomgiftideas.R;

public class Him extends Fragment {

    private himViewModel himViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        himViewModel =
                ViewModelProviders.of(this).get(himViewModel.class);
        View root = inflater.inflate(R.layout.fragment_him, container, false);

        final TextView gifts = root.findViewById(R.id.random_gift_him);
        final Button button = root.findViewById(R.id.btn_him);
        final ImageView gift_closed = root.findViewById(R.id.giftImage);
        final boolean[] opened = {false};
        final TextView textView = root.findViewById(R.id.text_him);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!opened[0]) {
                    gift_closed.setImageResource(R.drawable.open);
                    opened[0] = true;
                }
                himViewModel.randomize();
            }
        });
        himViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                gifts.setText(s);
            }
        });
        return root;
    }
}