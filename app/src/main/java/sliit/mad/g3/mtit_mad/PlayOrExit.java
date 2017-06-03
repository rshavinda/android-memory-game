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





    }
}
