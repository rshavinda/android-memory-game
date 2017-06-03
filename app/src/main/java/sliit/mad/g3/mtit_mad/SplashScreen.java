 package sliit.mad.g3.mtit_mad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

 /**
  * Created by Rajitha Shavinda on 5/24/2017.
  */

 public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);



    }
}
