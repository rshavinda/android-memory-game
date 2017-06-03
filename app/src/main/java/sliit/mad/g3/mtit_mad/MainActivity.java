package sliit.mad.g3.mtit_mad;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {

    TextView tv_Score, tv_Time;

    //-------------------------------------------------------------------------//
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12;

    //-------------------------------------------------------------------------//
    Integer [] imgArr={101,102,103,104,105,106,201,202,203,204,205,206};
    int [] imgLocation=new int [12];
    ArrayObjectClass imageSet=new ArrayObjectClass(imgArr,imgLocation);
    //-------------------------------------------------------------------------//

    //-------------------------------------------------------------------------//
    ImageView star1, star2,star3,star4,star5;

    //-------------------------------------------------------------------------//
    int firstImage,secondImg,firstClick,secondClick,imgNo=1;
    //-------------------------------------------------------------------------//
    int Score=0,count=0;
    //-------------------------------------------------------------------------//
    Timer T=new Timer();
    //-------------------------------------------------------------------------//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tv_Score =(TextView) findViewById(R.id.textView);
        tv_Time =(TextView) findViewById(R.id.textView2);


        star1 =(ImageView) findViewById(R.id.star1);
        star2 =(ImageView) findViewById(R.id.star2);
        star3=(ImageView) findViewById(R.id.star3);
        star4=(ImageView) findViewById(R.id.star4);
        star5=(ImageView) findViewById(R.id.star5);

        iv1=(ImageView) findViewById(R.id.image_view_1);
        iv2=(ImageView) findViewById(R.id.image_view_2);
        iv3=(ImageView) findViewById(R.id.image_view_3);
        iv4=(ImageView) findViewById(R.id.image_view_4);
        iv5=(ImageView) findViewById(R.id.image_view_5);
        iv6=(ImageView) findViewById(R.id.image_view_6);
        iv7=(ImageView) findViewById(R.id.image_view_7);
        iv8=(ImageView) findViewById(R.id.image_view_8);
        iv9=(ImageView) findViewById(R.id.image_view_9);
        iv10=(ImageView) findViewById(R.id.image_view_10);
        iv11=(ImageView) findViewById(R.id.image_view_11);
        iv12=(ImageView) findViewById(R.id.image_view_12);

        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");
        iv7.setTag("6");
        iv8.setTag("7");
        iv9.setTag("8");
        iv10.setTag("9");
        iv11.setTag("10");
        iv12.setTag("11");


        showImgFront(); //line No 375

        imageSet.shuffleArr(); //ArrayObjectClass Private method

        //tv_Score.setTextColor(Color.GRAY);


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv1,theCard);//line No 231
                put_Stars(); //line No 461
            }
        });


        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv2,theCard);//line No 231
                put_Stars();//line No 461
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv3,theCard);//line No 231
                put_Stars();//line No 461
            }
        });


        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv4,theCard);//line No 231
                put_Stars();//line No 461
            }
        });


        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv5,theCard);//line No 231
                put_Stars();//line No 461
            }
        });


        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv6,theCard);//line No 231
                put_Stars();//line No 461
            }
        });


        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv7,theCard);//line No 231
                put_Stars();//line No 461
            }
        });


        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv8,theCard);//line No 231
                put_Stars();//line No 461
            }
        });

        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv9,theCard);//line No 231
                put_Stars();//line No 461
            }
        });

        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv10,theCard);//line No 231
                put_Stars();//line No 461
            }
        });

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv11,theCard);//line No 231
                put_Stars();//line No 461
            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard=Integer.parseInt((String) v.getTag());
                main_method(iv12,theCard);//line No 231
                put_Stars();//line No 461
            }
        });



        T.scheduleAtFixedRate(new TimerTask() {
            @Override
            public boolean cancel() {
                return super.cancel();
            }

            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv_Time.setText("Time: "+count+"s");
                        count++;


                    }
                });
            }
        },1000,1000);
    }



    //-------------------------------------------------------------------------//
    private void main_method(ImageView v, int i){


        switch (imageSet.getArr(i)){
            case 101:v.setImageResource(imageSet.getImageRes(0)); break;
            case 102:v.setImageResource(imageSet.getImageRes(1)); break;
            case 103:v.setImageResource(imageSet.getImageRes(2)); break;
            case 104:v.setImageResource(imageSet.getImageRes(3)); break;
            case 105:v.setImageResource(imageSet.getImageRes(4)); break;
            case 106:v.setImageResource(imageSet.getImageRes(5)); break;
            case 201:v.setImageResource(imageSet.getImageRes(6));break;
            case 202:v.setImageResource(imageSet.getImageRes(7)); break;
            case 203:v.setImageResource(imageSet.getImageRes(8)); break;
            case 204:v.setImageResource(imageSet.getImageRes(9)); break;
            case 205:v.setImageResource(imageSet.getImageRes(10)); break;
            case 206:v.setImageResource(imageSet.getImageRes(11)); break;
            default:;

        }




        if(imgNo==1){
            firstImage=imageSet.getArr(i);
            if(firstImage>200){
                firstImage=firstImage-100;
            }
            imgNo=2;
            firstClick=i;
            v.setEnabled(false);
        }

        else if(imgNo==2){
            secondImg=imageSet.getArr(i);
            if(secondImg>200){
                secondImg=secondImg-100;
            }
            imgNo=1;
            secondClick=i;

            all_Image_Views_Enabled(false);// all image views disabled | line# 397



            android.os.Handler handler= new android.os.Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    try {
                        calc();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 700);

        }
    }



    //-------------------------------------------------------------------------//
    private void calc() throws InterruptedException {
            if(firstImage==secondImg) {

                set_selected_Image_View_INVISIBLE(firstClick);// 1st selected image -> Invisible | line# 416
                set_selected_Image_View_INVISIBLE(secondClick);//2nd selected image -> Invisible | line# 416


                setting_Score(count);//Line#439 | give score

            }
            else{
                    iv1.setImageResource(R.drawable.question_mark);
                    iv2.setImageResource(R.drawable.question_mark);
                    iv3.setImageResource(R.drawable.question_mark);
                    iv4.setImageResource(R.drawable.question_mark);
                    iv5.setImageResource(R.drawable.question_mark);
                    iv6.setImageResource(R.drawable.question_mark);
                    iv7.setImageResource(R.drawable.question_mark);
                    iv8.setImageResource(R.drawable.question_mark);
                    iv9.setImageResource(R.drawable.question_mark);
                    iv10.setImageResource(R.drawable.question_mark);
                    iv11.setImageResource(R.drawable.question_mark);
                    iv12.setImageResource(R.drawable.question_mark);



            }
        all_Image_Views_Enabled(true);// all image views enabled| line# 397


        checkEnd();

    }




    //-------------------------------------------------------------------------//
    private void checkEnd() throws InterruptedException {

        if(iv1.getVisibility()==View.INVISIBLE &&
                iv2.getVisibility()==View.INVISIBLE &&
                iv3.getVisibility()==View.INVISIBLE &&
                iv4.getVisibility()==View.INVISIBLE &&
                iv5.getVisibility()==View.INVISIBLE &&
                iv6.getVisibility()==View.INVISIBLE &&
                iv7.getVisibility()==View.INVISIBLE &&
                iv8.getVisibility()==View.INVISIBLE &&
                iv9.getVisibility()==View.INVISIBLE &&
                iv10.getVisibility()==View.INVISIBLE&&
                iv11.getVisibility()==View.INVISIBLE&&
                iv12.getVisibility()==View.INVISIBLE){

            T.cancel();

            AlertDialog.Builder adb=new AlertDialog.Builder(MainActivity.this);

            adb.setTitle("Great Job!").setMessage("\nScore: "+ Score +"\nTime : "+(count-1)+" seconds")
                .setCancelable(false)
                    .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog=adb.create();
            alertDialog.show();
        }
    }

    //-------------------------------------------------------------------------//
    //-------------------------------------------------------------------------//


}
