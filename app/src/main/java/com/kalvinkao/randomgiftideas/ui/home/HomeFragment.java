package com.kalvinkao.randomgiftideas.ui.home;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.randomgiftideas.MainActivity;
import com.kalvinkao.randomgiftideas.R;
import com.kalvinkao.randomgiftideas.ui.brother.Brother;
import com.kalvinkao.randomgiftideas.ui.dad.Dad;
import com.kalvinkao.randomgiftideas.ui.her.Her;
import com.kalvinkao.randomgiftideas.ui.him.Him;
import com.kalvinkao.randomgiftideas.ui.mom.Mom;
import com.kalvinkao.randomgiftideas.ui.sister.Sister;

import java.io.IOException;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Button btn_him = root.findViewById(R.id.btn_himHome);
        final Button btn_dad = root.findViewById(R.id.btn_dadHome);
        final Button btn_bro = root.findViewById(R.id.btn_broHome);
        final Button btn_her = root.findViewById(R.id.btn_herHome);
        final Button btn_mom = root.findViewById(R.id.btn_momHome);
        final Button btn_sis = root.findViewById(R.id.btn_sisHome);
        btn_him.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Him();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Him");

            }
        });
        btn_dad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Dad();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Dad");

            }
        });
        btn_bro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Brother();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Brother");

            }
        });
        btn_her.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Her();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Her");

            }
        });
        btn_mom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Mom();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Mom");

            }
        });
        btn_sis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Sister();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("For Sister");

            }
        });
        return root;
    }


}