package com.latihanmopro.juliwaoutdoor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.txt_tenda1)
    EditText txtTenda1;
    @BindView(R.id.txt_tenda2)
    EditText txtTenda2;
    @BindView(R.id.txt_tas_kerrir)
    EditText txtTasKerrir;
    @BindView(R.id.txt_sleeping_bag)
    EditText txtSleepingBag;
    @BindView(R.id.txt_flysheet)
    EditText txtFlysheet;
    @BindView(R.id.txt_matras)
    EditText txtMatras;
    @BindView(R.id.txt_sepatu)
    EditText txtSepatu;
    @BindView(R.id.txt_lampu_tenda)
    EditText txtLampuTenda;
    @BindView(R.id.btn_cek_harga)
    Button btnCekHarga;
    @BindView(R.id.tex_tampil_harga)
    TextView texTampilHarga;
    @BindView(R.id.btn_sewa)
    Button btnSewa;


    int tenda4Person=35000, tenda2Person=30000, tasKerrir=30000, sleepingBag5=000, flysheet=15000, matras=3000, sepatu=35000,lampuTenda=20000;
    int total=0;
    int tenda4=0, tenda2=0, kerrir=0, sb=0, fs=0, mtrs=0, spt=0, lt=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        init();
    }
    public void init(){

    }

    @OnClick({R.id.btn_cek_harga, R.id.btn_sewa})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_cek_harga:
            tenda4= Integer.valueOf(txtTenda1.getText().toString());
            tenda2 =Integer.valueOf(txtTenda2.getText().toString());
            kerrir =Integer.valueOf(txtTasKerrir.getText().toString());
            sb =Integer.valueOf(txtSleepingBag.getText().toString());
            fs =Integer.valueOf(txtFlysheet.getText().toString());
            mtrs =Integer.valueOf(txtMatras.getText().toString());
            spt =Integer.valueOf(txtSepatu.getText().toString());
            lt =Integer.valueOf(txtLampuTenda.getText().toString());
            total=(tenda4*tenda4Person)+(tenda2*tenda2Person)+(kerrir*tasKerrir)+(sb*sleepingBag5)+(fs*flysheet)+(mtrs*matras)+(spt*sepatu)+(lt*lampuTenda);
            texTampilHarga.setText(String.valueOf(total));

                break;
            case R.id.btn_sewa:
                Toast.makeText(this, "Terimakasih Sudah Percaya Menyewa di Tempat Kami", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
