package com.example.appconn_telenor.recognition_level_fragments;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appconn_telenor.R;
import com.example.appconn_telenor.chat_level_fragments.ChatMsgAdapter;
import com.example.appconn_telenor.chat_level_fragments.Contact_Row;

import java.util.ArrayList;

public class Recognitions_fragment extends Fragment {

    RecyclerView rv;
    ArrayList<Post_Row> posts = new ArrayList<Post_Row>();

    RecognitionAdapter adapter;

    public Recognitions_fragment(){

        String profileImgUrl = getURLForResource(R.drawable.profile);

        posts.add(new Post_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai","12","20m ago"));
        posts.add(new Post_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai","12","20m ago"));
        posts.add(new Post_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","Cheers to @EZbhai","12","20m ago"));



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
        return inflater.inflate(R.layout.fragment_recognition_post,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        rv = view.findViewById(R.id.recognition_rv);

//        arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_gallery_item, msgFrom);

        adapter = new RecognitionAdapter(getContext(),posts);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));




//        listView.setAdapter(arrayAdapter);


    }
}
