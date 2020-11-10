package com.example.appconn_telenor.chat_level_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appconn_telenor.R;

public class Channels_Fragment extends Fragment {

    ListView listView;

    ArrayAdapter<String> arrayAdapter;

    String[] msgFrom = {"Zeeshan", "Hamza","Hammad"};

    public Channels_Fragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat_inbox,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.list_msgz);

        arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, msgFrom);

        listView.setAdapter(arrayAdapter);


    }
}
