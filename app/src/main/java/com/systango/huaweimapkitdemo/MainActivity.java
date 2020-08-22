package com.systango.huaweimapkitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private HuaweiMap hMap;
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.mapView);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(HuaweiMap huaweiMap) {
        huaweiMap.setMyLocationEnabled(true);
        huaweiMap.getUiSettings().setCompassEnabled(true);
        huaweiMap.getUiSettings().setRotateGesturesEnabled(true);
        huaweiMap.getUiSettings().setScrollGesturesEnabled(true);
        huaweiMap.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(true); 
        huaweiMap.getUiSettings().setTiltGesturesEnabled (true);
        huaweiMap.getUiSettings().setZoomControlsEnabled (true);
        huaweiMap.getUiSettings().setIndoorLevelPickerEnabled (true);
        huaweiMap.getUiSettings().setMapToolbarEnabled (true);
        huaweiMap.getUiSettings().setZoomGesturesEnabled(false);
        huaweiMap.getUiSettings().setAllGesturesEnabled(true);
                
        hMap = huaweiMap;
    }
}