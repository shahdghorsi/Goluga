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

import com.example.william.esp.R;
import com.example.william.esp.utils.Utility;
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

        ShadowLayout shadowLayout = (ShadowLayout)view.findViewById(R.id.shadow_layout);
        shadowLayout.setIsShadowed(true);
        shadowLayout.setShadowAngle(90);
        shadowLayout.setShadowRadius(5);
        shadowLayout.setShadowDistance(8);
        shadowLayout.setShadowColor(Color.DKGRAY);

        ShadowLayout shadowLayout2 = (ShadowLayout) view.findViewById(R.id.shadow_layout_2);
        shadowLayout2.setIsShadowed(true);
        shadowLayout2.setShadowAngle(90);
        shadowLayout2.setShadowRadius(5);
        shadowLayout2.setShadowDistance(8);
        shadowLayout2.setShadowColor(Color.DKGRAY);

        ShadowLayout shadowLayout3 = (ShadowLayout) view.findViewById(R.id.shadow_layout_3);
        shadowLayout3.setIsShadowed(true);
        shadowLayout3.setShadowAngle(90);
        shadowLayout3.setShadowRadius(5);
        shadowLayout3.setShadowDistance(8);
        shadowLayout3.setShadowColor(Color.DKGRAY);

        ShadowLayout shadowLayout4 = (ShadowLayout) view.findViewById(R.id.shadow_layout_4);
        shadowLayout4.setIsShadowed(true);
        shadowLayout4.setShadowAngle(90);
        shadowLayout4.setShadowRadius(5);
        shadowLayout4.setShadowDistance(8);
        shadowLayout4.setShadowColor(Color.DKGRAY);

        ShadowLayout shadowLayout5 = (ShadowLayout) view.findViewById(R.id.shadow_layout_5);
        shadowLayout5.setIsShadowed(true);
        shadowLayout5.setShadowAngle(90);
        shadowLayout5.setShadowRadius(5);
        shadowLayout5.setShadowDistance(8);
        shadowLayout5.setShadowColor(Color.DKGRAY);

        ShadowLayout shadowLayout6 = (ShadowLayout) view.findViewById(R.id.shadow_layout_6);
        shadowLayout6.setIsShadowed(true);
        shadowLayout6.setShadowAngle(90);
        shadowLayout6.setShadowRadius(5);
        shadowLayout6.setShadowDistance(8);
        shadowLayout6.setShadowColor(Color.DKGRAY);


        scienceImageView = view.findViewById(R.id.science_image_view);
        businessImageView = view.findViewById(R.id.business_image_view);
        medicineImageView = view.findViewById(R.id.medicine_image_view);
        engineeringImageView = view.findViewById(R.id.engineering_image_view);
        politicsImageView = view.findViewById(R.id.politics_image_view);
        sportsImageView = view.findViewById(R.id.sports_image_view);




        scienceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                // perform haptic feedback and sound effect when button clicked
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                view.playSoundEffect(SoundEffectConstants.CLICK);


            }
        });

        businessImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);

                RadioButtomFragment nextFrag= new RadioButtomFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_frame, nextFrag,"findThisFragment")
                                .addToBackStack(null)
                                .commit();

            }
        });
        medicineImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                view.playSoundEffect(SoundEffectConstants.CLICK);
            }
        });
        engineeringImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                view.playSoundEffect(SoundEffectConstants.CLICK);
            }
        });
        politicsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                view.playSoundEffect(SoundEffectConstants.CLICK);
            }
        });

        sportsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setOnTouchListener(Utility.imgPress());
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                view.playSoundEffect(SoundEffectConstants.CLICK);
            }
        });
        return view;
    }

}
