package com.example.appconn_telenor.chat_level_fragments;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appconn_telenor.CheersFeed;
import com.example.appconn_telenor.R;
import com.example.appconn_telenor.Todo_adapter;
import com.example.appconn_telenor.todo_item;

import java.util.ArrayList;

public class Inbox_Fragment extends Fragment {

//    ListView listView;

    RecyclerView rv;
    ArrayList<Contact_Row> chats = new ArrayList<Contact_Row>();

    ChatMsgAdapter adapter;


//    ArrayAdapter<String> arrayAdapter;

//    String[] msgFrom = {"Zeeshan", "Hamza","Hammad"};

    public Inbox_Fragment(){

        String profileImgUrl = getURLForResource(R.drawable.profile);

        chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));
  chats.add(new Contact_Row("Zeeshan Waheed",profileImgUrl,
                "Android Dev","20m ago"));


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
        return inflater.inflate(R.layout.fragment_chat_inbox,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv = view.findViewById(R.id.list_msgz);

//        arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_gallery_item, msgFrom);

         adapter = new ChatMsgAdapter(getContext(),chats);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));






//        listView.setAdapter(arrayAdapter);


    }
}
