package com.latihanmopro.juliwaoutdoor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_Lokasi)
    Button btnLokasi;
    @BindView(R.id.btn_telepon)
    Button btnTelepon;
    @BindView(R.id.btn_menu)
    Button btnMenu;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String location = "-6.815728, 107.592960";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_Lokasi, R.id.btn_telepon, R.id.btn_menu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_Lokasi:
                gmmIntentUri = Uri.parse("google.navigation:q=" + location);
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(MainActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_telepon:
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "089683834288"));
                startActivity(intent);
                break;
            case R.id.btn_menu:
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
                break;
        }
    }
}
