package com.kalvinkao.randomgiftideas.ui.sister;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.randomgiftideas.R;

public class Sister extends Fragment {

    private sisterViewModel sisterViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sisterViewModel =
                ViewModelProviders.of(this).get(sisterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sister, container, false);

        final TextView gifts = root.findViewById(R.id.random_gift_sis);
        final Button button = root.findViewById(R.id.btn_sis);
        final ImageView gift_closed = root.findViewById(R.id.giftImage);
        final boolean[] opened = {false};
        final TextView textView = root.findViewById(R.id.text_sis);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!opened[0]) {
                    gift_closed.setImageResource(R.drawable.open);
                    opened[0] = true;
                }
                sisterViewModel.randomize();
            }
        });
        sisterViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                gifts.setText(s);
            }
        });
        return root;
    }
}