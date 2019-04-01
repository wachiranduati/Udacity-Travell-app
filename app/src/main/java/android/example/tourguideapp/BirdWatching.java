package android.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class BirdWatching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_watching);
        ArrayList<SiteDetails> watchSites = new ArrayList<SiteDetails>();
        watchSites.add(new SiteDetails("Keroko", R.mipmap.ic_launcher, "John Jun"));
        watchSites.add(new SiteDetails("Puntalnad", R.mipmap.ic_launcher, "Brain Mulwa"));
        watchSites.add(new SiteDetails("Mwovovio", R.mipmap.ic_launcher, "Kennedy Hus"));
        watchSites.add(new SiteDetails("Nkirote", R.mipmap.ic_launcher, "Yeiger Meister"));
        watchSites.add(new SiteDetails("WonderWoman", R.mipmap.ic_launcher, "Nun more"));

        SiteAdapter adapter = new SiteAdapter(this, watchSites);
        GridView birdWatching = findViewById(R.id.birdWatchingSites);
        birdWatching.setAdapter(adapter);
    }
}
