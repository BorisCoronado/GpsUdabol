package orgasmo.hellfish.gpsudabol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pagina2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnA, btnC, btnD, btnG, btnCC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        btnA = (Button) findViewById(R.id.button7);
        btnC = (Button) findViewById(R.id.button8);
        btnD = (Button) findViewById(R.id.button9);
        btnG = (Button) findViewById(R.id.button10);
        btnCC = (Button) findViewById(R.id.button11);
        btnA.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnCC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.button7:
                i = new Intent(this, BloqueA.class);
                startActivity(i);
                break;
            case R.id.button8:
                i = new Intent(this, BloqueC.class);
                startActivity(i);
                break;
            case R.id.button9:
                i = new Intent(this, BloqueD.class);
                startActivity(i);
                break;
            case R.id.button10:
                i = new Intent(this, BloqueG.class);
                startActivity(i);
                break;
            case R.id.button11:
                i = new Intent(this, BloqueCC.class);
                startActivity(i);
                break;
        }
    }
}
