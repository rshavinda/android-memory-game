package sliit.mad.g3.mtit_mad;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class PlayOrExit extends Activity {


    ImageView btnExit,btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_play_or_exit);


        btnPlay=(ImageView)findViewById(R.id.btn_play);
        btnExit=(ImageView)findViewById(R.id.btn_Exit);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayOrExit.this,MainActivity.class));
            }
        });




        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb=new AlertDialog.Builder(PlayOrExit.this);

                final AlertDialog.Builder builder = adb.setMessage(" Are you sure you want to quit?")
                        .setTitle("Exit")
                        .setNeutralButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setCancelable(false)
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                AlertDialog alertDialog=adb.create();
                alertDialog.show();
            }
        });






    }
}
