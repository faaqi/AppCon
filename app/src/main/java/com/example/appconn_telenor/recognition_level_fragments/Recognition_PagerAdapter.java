package com.example.appconn_telenor.recognition_level_fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Recognition_PagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentsList = new ArrayList<>();
    ArrayList<String> fragmentsTitle = new ArrayList<>();


    public Recognition_PagerAdapter(FragmentManager fm) {

        super(fm);
    }    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentsList.add(fragment);
        fragmentsTitle.add(title);
    }
}