package sg.edu.rp.c346.id21005622.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declare Variable
    ListView lvVersion;
    ArrayList<AndroidVersion> alVersion;
    //ArrayAdapter<AndroidVersion> aaVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Variable
        lvVersion = findViewById(R.id.listViewVersions);
        alVersion = new ArrayList<>();

        //Add Values into List
        alVersion.add(new AndroidVersion("Pie", "9.0"));
        alVersion.add(new AndroidVersion("Oreo","8.0-8.1" ));
        alVersion.add(new AndroidVersion("Nougat", "7.0  7.1.2"));
        //alVersion.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        //alVersion.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        //alVersion.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        //alVersion.add(new AndroidVersion("Jelly Bean", "4.3.1"));

        // Link Adapter
        //aaVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alVersion);
        adapter = new CustomAdapter(this, R.layout.row, alVersion);

        // Set Adapter
        //lvVersion.setAdapter(aaVersion);
        lvVersion.setAdapter(adapter);
    }
}