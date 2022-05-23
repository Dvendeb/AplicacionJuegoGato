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
    TextView playerOne,playerTwo,winner,array;
    public Button aU,aD,aT,bU,bD,bT,cU,cD,cT;
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
        playerOne.setText(nameOne + ": o");
        playerTwo.setText(nameTwo + ": x");
        if(getRandom==1){
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            turno=0;
        }else{
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
        }
    }

    public void onclickAU(View view){
        aU=(Button) findViewById(R.id.btnA1);
        aU.setEnabled(false);
        if(turno==0){
            aU.setText("o");
            aU.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][0]="o";
        }else{
            aU.setText("x");
            aU.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][0]="x";
        }
        verifyWinner(view);
    }
    public void onclickAD(View view){
        aD=(Button) findViewById(R.id.btnA2);
        aD.setEnabled(false);
        if(turno==0){
            aD.setText("o");
            aD.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][1]="o";
        }else{
            aD.setText("x");
            aD.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][1]="x";
        }
        verifyWinner(view);
    }
    public void onclickAT(View view){
        aT=(Button) findViewById(R.id.btnA3);
        aT.setEnabled(false);
        if(turno==0){
            aT.setText("o");
            aT.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][2]="o";
        }else{
            aT.setText("x");
            aT.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[0][2]="x";
        }
        verifyWinner(view);
    }
    public void onclickBU(View view){
        bU=(Button) findViewById(R.id.btnB1);
        bU.setEnabled(false);
        if(turno==0){
            bU.setText("o");
            bU.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][0]="o";
        }else{
            bU.setText("x");
            bU.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][0]="x";
        }
        verifyWinner(view);
    }
    public void onclickBD(View view){
        bD=(Button) findViewById(R.id.btnB2);
        bD.setEnabled(false);
        verifyWinner(view);
        if(turno==0){
            bD.setText("o");
            bD.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][1]="o";
        }else{
            bD.setText("x");
            bD.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][1]="x";
        }
        verifyWinner(view);
    }
    public void onclickBT(View view){
        bT=(Button) findViewById(R.id.btnB3);
        bT.setEnabled(false);
        if(turno==0){
            bT.setText("o");
            bT.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][2]="o";
        }else{
            bT.setText("x");
            bT.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[1][2]="x";
        }
        verifyWinner(view);
    }
    public void onclickCU(View view){
        cU=(Button) findViewById(R.id.btnC1);
        cU.setEnabled(false);
        if(turno==0){
            cU.setText("o");
            cU.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][0]="o";
        }else{
            cU.setText("x");
            cU.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][0]="x";
        }
        verifyWinner(view);
    }
    public void onclickCD(View view){
        cD=(Button) findViewById(R.id.btnC2);
        cD.setEnabled(false);
        if(turno==0){
            cD.setText("o");
            cD.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][1]="o";
        }else{
            cD.setText("x");
            cD.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][1]="x";
        }
        verifyWinner(view);
    }
    public void onclickCT(View view){
        cT=(Button) findViewById(R.id.btnC3);
        cT.setEnabled(false);
        if(turno==0){
            cT.setText("o");
            cT.setTextColor(getResources().getColor(R.color.teal_200));
            turno=1;
            playerOne.setBackgroundResource(R.color.black);
            playerOne.setTextColor(getResources().getColor(R.color.white));
            playerTwo.setBackgroundResource(R.color.pink);
            playerTwo.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][2]="o";
        }else{
            cT.setText("x");
            cT.setTextColor(getResources().getColor(R.color.pink));
            turno=0;
            playerTwo.setBackgroundResource(R.color.black);
            playerTwo.setTextColor(getResources().getColor(R.color.white));
            playerOne.setBackgroundResource(R.color.pink);
            playerOne.setTextColor(getResources().getColor(R.color.teal_200));
            gato[2][2]="x";
        }
        verifyWinner(view);
    }

    public void onClickBack(View view){
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
        finish();
    }
    public void onClickReset(View view){
        aU=(Button) findViewById(R.id.btnA1);
        aD=(Button) findViewById(R.id.btnA2);
        aT=(Button) findViewById(R.id.btnA3);
        bU=(Button) findViewById(R.id.btnB1);
        bD=(Button) findViewById(R.id.btnB2);
        bT=(Button) findViewById(R.id.btnB3);
        cU=(Button) findViewById(R.id.btnC1);
        cD=(Button) findViewById(R.id.btnC2);
        cT=(Button) findViewById(R.id.btnC3);
        winner=(TextView) findViewById(R.id.txtWinner);
        winner.setText("");
        aU.setText(" ");
        aD.setText(" ");
        aT.setText(" ");
        bU.setText(" ");
        bD.setText(" ");
        bT.setText(" ");
        cU.setText(" ");
        cD.setText(" ");
        cT.setText(" ");
        aU.setEnabled(true);
        aD.setEnabled(true);
        aT.setEnabled(true);
        bU.setEnabled(true);
        bD.setEnabled(true);
        bT.setEnabled(true);
        cU.setEnabled(true);
        cD.setEnabled(true);
        cT.setEnabled(true);
        for (int i=0;i<3;i++){
            for (int x=0;x<3;x++){
                gato[i][x]="";
            }
        }

    }
    public void verifyWinner(View view){
        winner=(TextView) findViewById(R.id.txtWinner);
        if(gato[0][0]=="o" && gato[0][1]=="o" && gato[0][2]=="o" || gato[1][0]=="o" && gato[1][1]=="o" && gato[1][2]=="o"
        || gato[2][0]=="o" && gato[2][1]=="o" && gato[2][2]=="o" || gato[0][0]=="o" && gato[1][0]=="o" && gato[2][0]=="o"
        || gato[0][1]=="o" && gato[1][1]=="o" && gato[2][1]=="o" || gato[0][2]=="o" && gato[1][2]=="o" && gato[2][2]=="o"
        || gato[0][0]=="o" && gato[1][1]=="o" && gato[2][2]=="o" || gato[0][2]=="o" && gato[1][1]=="o" && gato[2][0]=="o"){
            winner.setText("el ganador es "+nameOne);
            diseableButtons(view);
        }else if(gato[0][0]=="x" && gato[0][1]=="x" && gato[0][2]=="x" || gato[1][0]=="x" && gato[1][1]=="x" && gato[1][2]=="x"
        || gato[2][0]=="x" && gato[2][1]=="x" && gato[2][2]=="x" || gato[0][0]=="x" && gato[1][0]=="x" && gato[2][0]=="x"
        || gato[0][1]=="x" && gato[1][1]=="x" && gato[2][1]=="x" || gato[0][2]=="x" && gato[1][2]=="x" && gato[2][2]=="x"
        || gato[0][0]=="x" && gato[1][1]=="x" && gato[2][2]=="x" || gato[0][2]=="x" && gato[1][1]=="x" && gato[2][0]=="x"){
            winner.setText("El ganador es "+nameTwo);
            diseableButtons(view);
        }

    }

    public void diseableButtons(View view){
        aU=(Button) findViewById(R.id.btnA1);
        aD=(Button) findViewById(R.id.btnA2);
        aT=(Button) findViewById(R.id.btnA3);
        bU=(Button) findViewById(R.id.btnB1);
        bD=(Button) findViewById(R.id.btnB2);
        bT=(Button) findViewById(R.id.btnB3);
        cU=(Button) findViewById(R.id.btnC1);
        cD=(Button) findViewById(R.id.btnC2);
        cT=(Button) findViewById(R.id.btnC3);
        aU.setEnabled(false);
        aD.setEnabled(false);
        aT.setEnabled(false);
        bU.setEnabled(false);
        bD.setEnabled(false);
        bT.setEnabled(false);
        cU.setEnabled(false);
        cD.setEnabled(false);
        cT.setEnabled(false);
    }

}