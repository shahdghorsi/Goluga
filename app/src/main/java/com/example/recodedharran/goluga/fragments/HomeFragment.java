package com.example.recodedharran.goluga.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.recodedharran.goluga.R;

import com.gigamole.library.ShadowLayout;

import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    ImageView scienceImageView;
    ImageView businessImageView;
    ImageView medicineImageView;
    ImageView engineeringImageView;
    ImageView politicsImageView;
    ImageView sportsImageView;
    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ButterKnife.setDebug(true);
        return view;
    }

}
