package com.example.appconn_telenor.recognition_level_fragments;

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
import com.example.appconn_telenor.chat_level_fragments.ChatMsgAdapter;
import com.example.appconn_telenor.chat_level_fragments.Contact_Row;

import java.util.ArrayList;

public class LeaderBoard_fragment extends Fragment {

    RecyclerView rv;
    ArrayList<Emp_Points_Row> employees = new ArrayList<Emp_Points_Row>();

    LeaderBoardAdapter adapter;

//    ArrayAdapter<String> arrayAdapter;

//    String[] msgFrom = {"Zeeshan", "Hamza","Hammad"};

    public LeaderBoard_fragment(){

        String profileImgUrl = getURLForResource(R.drawable.profile);


        employees.add(new Emp_Points_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20 points"));
        employees.add(new Emp_Points_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20 points"));
        employees.add(new Emp_Points_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20 points"));


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
        return inflater.inflate(R.layout.leaderboard_screen,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv = view.findViewById(R.id.leaderboard_rv);

//        arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_gallery_item, msgFrom);

        adapter = new LeaderBoardAdapter(getContext(),employees);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));






//        listView.setAdapter(arrayAdapter);


    }
}

