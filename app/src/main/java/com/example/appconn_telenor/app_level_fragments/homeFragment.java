package com.example.appconn_telenor.app_level_fragments;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.appconn_telenor.CheersFeed;
import com.example.appconn_telenor.CheersFeedAdapter;
import com.example.appconn_telenor.R;
import com.example.appconn_telenor.Todo_adapter;
import com.example.appconn_telenor.todo_item;
import com.hsalf.smileyrating.SmileyRating;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public homeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static homeFragment newInstance(String param1, String param2) {
        homeFragment fragment = new homeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView taskview = view.findViewById(R.id.rc_todo);

        ArrayList<todo_item> tasks = new ArrayList<todo_item>();

        tasks.add(new todo_item("Meeting at 10 AM",false));
        tasks.add(new todo_item("User Story 3 review",false));
        tasks.add(new todo_item("Make changes requested by client",false));
        tasks.add(new todo_item("New Screen design of Chat View",false));


//                new todo_item("play games",false),
//                new todo_item("play games",false)


        // Create adapter passing in the sample user data
        Todo_adapter adapter = new Todo_adapter(tasks);
        // Attach the adapter to the recyclerview to populate items
        taskview.setAdapter(adapter);
        // Set layout manager to position the items
        taskview.setLayoutManager(new LinearLayoutManager(this.getContext()));

        /////////////////////////////////////////////////////////////////////////////


        RecyclerView cheersFeed = view.findViewById(R.id.rv_posts);
        ArrayList<CheersFeed> posts = new ArrayList<CheersFeed>();

        String profileImgUrl = getURLForResource(R.drawable.profile);

        String showImgUrl = getURLForResource(R.drawable.easypaisa);
        String postImgUrl = null;

        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",postImgUrl,"2 likes","20m ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",postImgUrl,"2 likes","20m ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",postImgUrl,"2 likes","20m ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",postImgUrl,"2 likes","20m ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",showImgUrl,"10 likes","1h ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",postImgUrl,"22 likes","1h ago"));
        posts.add(new CheersFeed("Zeeshan Waheed",profileImgUrl,"Android Dev","Cheers to @AbidIqbal for good " +
                "UI design. keep Rocking :)",showImgUrl,"11 likes","3h ago"));
        // Create adapter passing in the sample user data
        CheersFeedAdapter Postsadapter = new CheersFeedAdapter(posts);
        // Attach the adapter to the recyclerview to populate items
        cheersFeed.setAdapter(Postsadapter);
        // Set layout manager to position the items
        cheersFeed.setLayoutManager(new LinearLayoutManager(this.getContext()));



        ////////////// smileyr selected listener

        final CardView cardView = view.findViewById(R.id.feeling_card);


        final SmileyRating smileyRating;


        smileyRating = view.findViewById(R.id.smile_rating);
        smileyRating.setTitle(SmileyRating.Type.GREAT, "Awesome");
//        smileyRating.setFaceColor(SmileyRating.Type.GREAT, Color.BLACK);
//


        smileyRating.setSmileySelectedListener(new SmileyRating.OnSmileySelectedListener() {
            @Override
            public void onSmileySelected(SmileyRating.Type type) {


                int rating;
                String score;
                // You can compare it with rating Type
                if (SmileyRating.Type.GREAT == type) {
                    rating = type.getRating();
                    Log.i("Feedback", "Wow, the user gave high rating");

                    smileyRating.setFaceBackgroundColor(type,
                            Color.parseColor("#E6BA0C"));



                    score=Integer.toString(rating);

                }
                else if (SmileyRating.Type.GOOD == type){

                    rating = type.getRating();
                    Log.i("Feedback", "Wow, the user gave Good rating");

                    smileyRating.setFaceBackgroundColor(type,
                            Color.parseColor("#E6BA0C"));



                    score=Integer.toString(rating);
                }else if (SmileyRating.Type.OKAY == type){

                    rating = type.getRating();
                    Log.i("Feedback", "The user gave OKAY rating");

                    smileyRating.setFaceBackgroundColor(type,
                            Color.parseColor("#E6BA0C"));



                    score=Integer.toString(rating);
                }else if (SmileyRating.Type.BAD == type){

                    rating = type.getRating();
                    Log.i("Feedback", "User gave Good rating");

                    smileyRating.setFaceBackgroundColor(type,
                            Color.parseColor("#E6BA0C"));



                    score=Integer.toString(rating);
                }else if (SmileyRating.Type.TERRIBLE == type){

                    rating = type.getRating();
                    Log.i("Feedback", "User gave Good rating");

                    smileyRating.setFaceBackgroundColor(type,
                            Color.parseColor("#E6BA0C"));



                    score=Integer.toString(rating);
                }

                score ="Feeling Updated";
                Toast.makeText(getContext(), score,Toast.LENGTH_LONG).show();

//                cardView.setVisibility(View.GONE)

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        cardView.setVisibility(View.GONE);
                    }
                }, 5000);

            }
        });


        ////////////// smiley selected listener


        return view;
    }



    public String getURLForResource (int resourceId) {
        //use BuildConfig.APPLICATION_ID instead of R.class.getPackage().getName() if both are not same
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }
}