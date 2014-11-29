package com.awesomeness.christine.ec327project;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class tictactoe extends Activity {

    ImageButton tic_1;
    ImageButton tic_2;
    ImageButton tic_3;
    ImageButton tic_4;
    ImageButton tic_5;
    ImageButton tic_6;
    ImageButton tic_7;
    ImageButton tic_8;
    ImageButton tic_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        configurebutton1();
        configurebutton2();
        configurebutton3();
        configurebutton4();
        configurebutton5();
        configurebutton6();
        configurebutton7();
        configurebutton8();
        configurebutton9();
    }

    public void configurebutton1(){
        tic_1 = (ImageButton) findViewById(R.id.tic1);
        tic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_1.setImageResource(R.drawable.xcorner);
            }
        });
    }

    public void configurebutton2(){
        tic_2 = (ImageButton) findViewById(R.id.tic2);
        tic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_2.setImageResource(R.drawable.xtwoandeigth);
            }
        });
    }

    public void configurebutton3(){
        tic_3 = (ImageButton) findViewById(R.id.tic3);
        tic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_3.setImageResource(R.drawable.xcorner);
            }
        });
    }

    public void configurebutton4(){
        tic_4 = (ImageButton) findViewById(R.id.tic4);
        tic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_4.setImageResource(R.drawable.xfour);
            }
        });
    }

    public void configurebutton5(){
        tic_5 = (ImageButton) findViewById(R.id.tic5);
        tic_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_5.setImageResource(R.drawable.xfive);
            }
        });
    }

    public void configurebutton6(){
        tic_6 = (ImageButton) findViewById(R.id.tic6);
        tic_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_6.setImageResource(R.drawable.xsix);
            }
        });
    }

    public void configurebutton7(){
        tic_7 = (ImageButton) findViewById(R.id.tic7);
        tic_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_7.setImageResource(R.drawable.xcorner);
            }
        });
    }

    public void configurebutton8(){
        tic_8 = (ImageButton) findViewById(R.id.tic8);
        tic_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_8.setImageResource(R.drawable.xtwoandeigth);
            }
        });
    }

    public void configurebutton9(){
        tic_9 = (ImageButton) findViewById(R.id.tic9);
        tic_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tic_9.setImageResource(R.drawable.xcorner);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tictactoe, menu);
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

/*public class tictactoe {

    public static void main(String[] args) {
        //display the board
        //let the player choose the mode(player vs.player, player vs computer(player go first),player vs computer(computer go first))
        if(//pvp(player vs.player))
        do{
            //user input,get the board[]

        }while(check()==false);
        //}end the game

        if (//player vs.computer, player go first(i.e player is the x)){
        int step=0;
        do{
            //user input,get the board[]
            if(check()==true)
                break;
            step=minimax_min();
            //put the step on the board and get the board[]
        }while(check()==false);
        //}end the game

        if (//player vs.computer, computer go first(i.e player is the p)){
        int step=0;
        //randomly pick place to place a x
        do{
            //user input,get the board[]
            if(check()==true)
                break;
            step=minimax_max();
            //put the step on the board and get the board[]
        }while(check()==false);
        //}end the game


    }


//Assume this game is start by player, X goes first(player), O is computer goes behind.
    //using Minimax Search Algorithm



    static final int[][] WIN_STATUS = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };
    //0,1,2
    //3,4,5
    //6,7,8  is the Number for the game button


    public static int gameState(int board[]){
        //function to check if one lose/win
        int result=0;
        for(int[] status:WIN_STATUS){

            int i=0 ;
            int j=0;
            for(i=0; i<status.length; i++){
                j=j+board[status[i]];
                //here, button[i] is the int number for each cell(0 for empty, 1 for x, -1 for o)

            }
            if(j=3)
                result++;
            if(j=-3)
                result--;

        }
        return result;//here, result=0 indicats tie, result>0 indicates x win, else o win;
    }


    public boolean check(board[]){
        if(gameState()>0)
            //output the X win
            return true;
        if(gameState()<0)
            //output for o win
            return true;
        if(//the board is full){
        if(gameState()=0){
            //output for tie
            return true;
        }
    }
    return false;
}
<<<<<<< Updated upstream

    public int minimax_min(){
        int[] board=new int[9];
        //board==input;
        //get the board work here, for example board=(0,0,0,0,0,0,0,0,0)
        //which means the board is clear, and 1 for X, -1 for o that already exist
        int[] board1=new int[9];
        int i=0;
        int judge=-10000;
        int postion;
        for(i:board){//find a non-empty place to put o, and do the check ,find the minmum value place
            if(board[i]!=0)
                continue;
            board1=board;
            board1[i]=-1;
            int judge1=max(board1)+min(board1);
            if(judge1<judge){
                judge=judge1;
                postion =i
            }
        }
        return postion;
    }
    public int minimax_max(){
        int[] board=new int[9];
        //board==input;
        //get the board work here, for example board=(0,0,0,0,0,0,0,0,0)
        //which means the board is clear, and 1 for X, -1 for o that already exist
        int[] board1=new int[9];
        int i=0;
        int judge=-10000;
        int postion;
        for(i:board){//find a non-empty place to put x, and do the check ,find the maxmium value place
            if(board[i]!=0)
                continue;
            board1=board;
            board1[i]=1;
            int judge1=max(board1)+min(board1);
            if(judge1>judge){
                judge=judge1;
                postion =i
            }
        }
        return postion;
    }


    public int max(board2[]){
        int i=0
        for(i:board2){
            if( board2[i]==0)
                board2[i]==1;
        }//get all the empty cells of board1 full of X
        int m
        m=gameState(board2);
        return m;
    }


    public int min(board3[]){
        int i=0;
        for(i:board3){
            if(board3[i]==0)
                board3[i]=-1
        }//get all the empty cells of board1 full of o
        n=gameState(board3);
        return n;
    }
}*/

