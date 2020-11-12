package com.example.appconn_telenor.app_level_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appconn_telenor.R;
import com.example.appconn_telenor.profile_level_fragments.Profile_PagerAdapter;
import com.example.appconn_telenor.profile_level_fragments.Profile_PostsFragment;
import com.example.appconn_telenor.recognition_level_fragments.LeaderBoard_fragment;
import com.example.appconn_telenor.recognition_level_fragments.Recognition_PagerAdapter;
import com.example.appconn_telenor.recognition_level_fragments.Recognitions_fragment;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_profile, container, false);

        Profile_PagerAdapter profile_pagerAdapter;
        TabLayout tabLayout;
        tabLayout = (TabLayout) view.findViewById(R.id.profile_tablayout);

        ViewPager viewpager;

        viewpager= view.findViewById(R.id.profile_Viewpager);

        profile_pagerAdapter = new Profile_PagerAdapter(getChildFragmentManager());

        profile_pagerAdapter.addFragment(new Recognitions_fragment(),"Recognitions");
        profile_pagerAdapter.addFragment(new Profile_PostsFragment(),"Posts");

        viewpager.setAdapter(profile_pagerAdapter);
        tabLayout.setupWithViewPager(viewpager);


        return view;
    }
}