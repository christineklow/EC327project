package com.awesomeness.christine.ec327project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class gamelist extends Activity {

    Button ticbutton;
    Button numbersbutton;
    Button matchpairsbutton;
    Button watergunbutton;
    Button dontpush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelist);

        configuretictactoe();
        configurenumbers();
        configurematchpairs();
        configurewatergun();
        configuredontpush();
    }

    //Connecting to tictactoe
    public void configuretictactoe(){
        ticbutton = (Button) findViewById(R.id.ticbutton);
        ticbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("tictactoe"));
            }
        });
    }

    public void configurenumbers(){
        numbersbutton = (Button) findViewById(R.id.numbersbutton);
        numbersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("numbers"));
            }
        });
    }

    public void configurematchpairs(){
        matchpairsbutton = (Button) findViewById(R.id.matching);
        matchpairsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("matchingpairs"));
            }
        });
    }

    public void configurewatergun(){
        watergunbutton = (Button) findViewById(R.id.waterrace);
        watergunbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("watergunrace"));
            }
        });
    }

    public void configuredontpush(){
        dontpush = (Button) findViewById(R.id.buttongame);
        dontpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("dontpush"));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gamelist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
