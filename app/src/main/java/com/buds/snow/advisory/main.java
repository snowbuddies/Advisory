package com.buds.snow.advisory;


import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.view.KeyEvent;
import android.view.View;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;


public class main extends AppCompatActivity {

    private MapView mapView;


    private TextInputEditText.OnKeyListener startLocListener;
    private TextInputEditText st;
    private TextInputEditText ed;
    private String sLoc;
    private String eLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1IjoiYWN2aW9sYSIsImEiOiJjanNoODJrY2owZ3B2NDRxemFuZWEzc2hrIn0.FI4zY9I5DT6fdSOkg0knqg");
        setContentView(R.layout.activity_main);

        InitializeApp();

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {
                mapboxMap.setStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() {
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {

// Map is set up and the style has loaded. Now you can add data or make other map adjustments


                    }
                });
            }
        });
    }


    private void InitializeApp() {
        st = (TextInputEditText) findViewById(R.id.st);
        ed = (TextInputEditText) findViewById(R.id.ed);


        //Get this to work!!!:
//        startLocListener = new TextInputEditText.OnKeyListener() {
//            public void onKey(View v, int i, KeyEvent k){
//
//            }
//        }

    }






    //Map Stuff:

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }


}
