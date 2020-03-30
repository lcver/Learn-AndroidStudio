package com.example.latihanandroidstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.view;
import android.widget.button;
import android.widget.Toas;

public class MainActivity extends AppCompatActivity implements View.OnclickListener{

    // deklarasi komponen
    Button btnClose, btnStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisialisasi komponen
        btnClose = (Button) = findViewById(R.id.btn_close);
        btnStartActivity = (Button) findViewById(R.id.btn_start_activity);

        btnClose.setOnClickListener(this);
        btnStartActivity.setOnClickListener(this);

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGHT_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Activity: onStart()", Toast.LENGHT_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "Activity: onResume()", Toast.LENGHT_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast.makeText(this, "Activity: onPause()", Toast.LENGHT_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast.makeText(this, "Activity: onStop()", Toast.LENGHT_SHORT).show();
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_start_activity:
                //buka activity
                Intent openBrowser = new Intent(Intent.ACTION_VIEW);
                openBrowser.setData(Uri.parse("http://google.com"));
                startActivity(openBrowser);
                break;
            case R.id.btn_close:
                finish();
                break;
        }
    }






}
