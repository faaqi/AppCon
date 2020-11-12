package com.example.appconn_telenor.app_level_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appconn_telenor.R;
import com.example.appconn_telenor.chat_level_fragments.Channels_Fragment;
import com.example.appconn_telenor.chat_level_fragments.Chats_PagerAdapter;
import com.example.appconn_telenor.chat_level_fragments.Inbox_Fragment;
import com.example.appconn_telenor.recognition_level_fragments.LeaderBoard_fragment;
import com.example.appconn_telenor.recognition_level_fragments.Recognition_PagerAdapter;
import com.example.appconn_telenor.recognition_level_fragments.Recognitions_fragment;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecognitionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecognitionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecognitionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecognitionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecognitionFragment newInstance(String param1, String param2) {
        RecognitionFragment fragment = new RecognitionFragment();
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
        View view = inflater.inflate(R.layout.fragment_recognition, container, false);

        Recognition_PagerAdapter recognition_pagerAdapter;
        TabLayout tabLayout;
        tabLayout = (TabLayout) view.findViewById(R.id.recognition_tablayout);

        ViewPager viewpager;

        viewpager= view.findViewById(R.id.Recognition_Viewpager);

        recognition_pagerAdapter = new Recognition_PagerAdapter(getChildFragmentManager());

        recognition_pagerAdapter.addFragment(new Recognitions_fragment(),"Recognitions");
        recognition_pagerAdapter.addFragment(new LeaderBoard_fragment(),"Leaderboard");

        viewpager.setAdapter(recognition_pagerAdapter);
        tabLayout.setupWithViewPager(viewpager);



        return view;
    }
}