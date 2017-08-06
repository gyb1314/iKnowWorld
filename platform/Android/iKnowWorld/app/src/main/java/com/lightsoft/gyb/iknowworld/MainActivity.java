package com.lightsoft.gyb.iknowworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button btn_KnowWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_KnowWorld = (Button)findViewById(R.id.btn_konwworld);
        btn_KnowWorld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_konwworld:
                Intent camera = new Intent(this, CameraActivity.class);
                startActivity(camera);
                break;
        }
    }
}
