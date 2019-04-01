package android.example.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class NatureTrailsFragment extends Fragment {


    public NatureTrailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View natureView = inflater.inflate(R.layout.fragment_nature_trails, container, false);
        Button strollBtn = natureView.findViewById(R.id.strollAbout);
        strollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NatureTrails.class);
                startActivity(intent);
            }
        });
        return natureView;
    }

}
