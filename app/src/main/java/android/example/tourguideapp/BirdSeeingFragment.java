package android.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BirdSeeingFragment extends Fragment {
    Button buttonWatch;

    public BirdSeeingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_bird_seeing, container, false);
        buttonWatch = myView.findViewById(R.id.birdWatch);
        buttonWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BirdWatching.class);
                startActivity(intent);
            }
        });
        return myView;
    }



}
