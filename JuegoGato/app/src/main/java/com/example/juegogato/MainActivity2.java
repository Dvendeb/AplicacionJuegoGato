package com.example.juegogato;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    TextView playerOne,playerTwo;
    Button aU,aD,aT,bU,bD,bT,cU,cD,cT;
    String nameOne,nameTwo;
    String [][] gato=new String[3][3];
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        playerOne = (TextView) findViewById(R.id.txtPlayerOne);
        playerTwo = (TextView) findViewById(R.id.txtPlayerTwo);
        Bundle bundle = this.getIntent().getExtras();
        nameOne = bundle.getString("PlayerOne");
        nameTwo = bundle.getString("PlayerTwo");
        int getRandom=(int) (Math.random()*(3-1))+1;
        if(getRandom==1){
            playerOne.setText(nameOne + ": o");
            playerTwo.setText(nameTwo + ": x");
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
        }else{
            playerOne.setText(nameOne + ": x");
            playerTwo.setText(nameTwo + ": o");
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
        }
    }

    public void gameCat(View view){
    }

    public void onClickBack(View view){
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
        finish();
    }
    public void onClickReset(View view){

    }
}