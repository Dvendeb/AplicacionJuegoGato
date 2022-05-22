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
    TextView playerOne,playerTwo,winner;

    Button aU,aD,aT,bU,bD,bT,cU,cD,cT;
    String nameOne,nameTwo;
    String [][] gato=new String[3][3];
    Random random = new Random();
    int turno=0;

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
            playerTwo.setText(nameOne + ": x");
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            turno=0;
        }else{
            playerOne.setText(nameOne + ": o");
            playerTwo.setText(nameOne + ": x");
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
        }
    }

    public void onclickAU(View view){
        aU=(Button) findViewById(R.id.btnA1);
        if(turno==0){
            aU.setText("o");
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][0]="o";
        }else{
            aU.setText("X");
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][0]="X";
        }
        aU.setEnabled(true);
    }
    public void onclickAD(View view){
        aD=(Button) findViewById(R.id.btnA2);
        if(turno==0){
            aD.setText("o");
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][1]="o";
        }else{
            aD.setText("x");
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][1]="X";
        }
    }
    public void onclickAT(View view){
        winner=(TextView) findViewById(R.id.txtWinner);
        aT=(Button) findViewById(R.id.btnA3);
        if(turno==0){
            aT.setText("o");
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][1]="o";
        }else{
            aT.setText("x");
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][2]="X";
        }

        if(gato[0][0]=="o" && gato[0][1]=="o" && gato[0][2]=="o"){
            winner.setText("Ganador: "+ playerOne);
        }
    }
    public void onclickBU(View view){

    }
    public void onclickBD(View view){

    }
    public void onclickBT(View view){

    }

    public void onClickBack(View view){
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
        finish();
    }
    public void onClickReset(View view){

    }
}