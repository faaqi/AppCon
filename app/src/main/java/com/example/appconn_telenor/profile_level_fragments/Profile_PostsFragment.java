package com.example.appconn_telenor.profile_level_fragments;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appconn_telenor.R;
import com.example.appconn_telenor.recognition_level_fragments.Post_Row;
import com.example.appconn_telenor.recognition_level_fragments.RecognitionAdapter;

import java.util.ArrayList;

public class Profile_PostsFragment extends Fragment {

    RecyclerView rv;
    ArrayList<ProfilePost_Row> posts = new ArrayList<ProfilePost_Row>();

    PostsAdapter adapter;


    public Profile_PostsFragment(){

        String showImgUrl = getURLForResource(R.drawable.easypaisa);
        String postImgUrl = null;
        String profileImgUrl = getURLForResource(R.drawable.profile);

        posts.add(new ProfilePost_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai",showImgUrl,"12","20m ago"));
        posts.add(new ProfilePost_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai",postImgUrl,"12","20m ago"));
        posts.add(new ProfilePost_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai",showImgUrl,"12","20m ago"));

    }

    public String getURLForResource (int resourceId) {
        //use BuildConfig.APPLICATION_ID instead of R.class.getPackage().getName() if both are not same
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile_post_screen,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        rv = view.findViewById(R.id.profile_post_rv);

//        arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_gallery_item, msgFrom);

        adapter = new PostsAdapter(getContext(),posts);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));




//        listView.setAdapter(arrayAdapter);


    }

}
