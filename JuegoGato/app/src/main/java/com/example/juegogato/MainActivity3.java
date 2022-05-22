package com.example.juegogato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    public String playerOne="";
    public String playerTwo="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClickAceptar (View view){
        EditText nameOne=(EditText) findViewById(R.id.txtName1);
        EditText nameTwo=(EditText) findViewById(R.id.txtName2);
        playerOne=nameOne.toString();
        playerTwo=nameTwo.toString();
        Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
        intent.putExtra("PlayerOne",playerOne);
        intent.putExtra("PlayerTwo",playerTwo);
        startActivity(intent);
        finish();
    }
}
