package me.jamesnc.fueltrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.jamesnc.constants.Globals;

/**
 * Created by James on 2/13/2016.
 */
public class MainActivity extends Activity {

    public Button startMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(Globals.getThemeNum());
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        startMap = (Button) findViewById(R.id.startMap);
        startMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startLoc = ((EditText) findViewById(R.id.startPoint)).getText().toString();
                String endLoc = ((EditText) findViewById(R.id.endPoint)).getText().toString();
                loadMap();
            }
        });
    }

    public void loadMap() {
        Intent i = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(i);
    }

}
