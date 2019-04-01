package android.example.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NatureTrails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_trails);

        GridView lv = (GridView) findViewById(R.id.trailsListview);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        ArrayList<SiteDetails> watchSites = new ArrayList<SiteDetails>();
        watchSites.add(new SiteDetails("Longonot", R.mipmap.ic_launcher, "John Jun"));
        watchSites.add(new SiteDetails("Maasai Mara", R.mipmap.ic_launcher, "Brain Mulwa"));
        watchSites.add(new SiteDetails("Kempinski", R.mipmap.ic_launcher, "Kennedy Hus"));
        watchSites.add(new SiteDetails("Uganda", R.mipmap.ic_launcher, "Yeiger Meister"));
        watchSites.add(new SiteDetails("Mu7", R.mipmap.ic_launcher, "Nun more"));

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        SiteAdapter adapter = new SiteAdapter(this, watchSites);
        lv.setAdapter(adapter);
    }
}
