package com.example.juegogato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView playerOne,playerTwo;
    String nameOne,nameTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        playerOne=(TextView) findViewById(R.id.txtPlayerOne);
        playerTwo=(TextView) findViewById(R.id.txtPlayerTwo);
        Bundle bundle=this.getIntent().getExtras();
        nameOne=bundle.getString("PlayerOne");
        nameTwo=bundle.getString("PlayerTwocd ");

    }
}