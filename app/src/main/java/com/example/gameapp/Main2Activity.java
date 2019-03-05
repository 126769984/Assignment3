package com.example.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    ImageView i6;
    ImageView i7;
    ImageView i8;
    ImageView i9;
    ImageView i10;
    int flag1 = 0;
    int flag2 = 0;
    int flag3 = 0;
    int flag4 = 0;
    int flag5 = 0;
    int flag6 = 0;
    int flag7 = 0;
    int flag8 = 0;
    int flag9 = 0;
    int flag10 = 0;
    int scores = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Toast toastCenter = Toast.makeText(Main2Activity.this,"Match！",Toast.LENGTH_SHORT);
        //toastCenter.setGravity(Gravity.CENTER,0,0);
        //toastCenter.show();

        i1 = (ImageView)findViewById(R.id.image1);
        i2 = (ImageView)findViewById(R.id.image2);
        i3 = (ImageView)findViewById(R.id.image3);
        i4 = (ImageView)findViewById(R.id.image4);
        i5 = (ImageView)findViewById(R.id.image5);
        i6 = (ImageView)findViewById(R.id.image6);
        i7 = (ImageView)findViewById(R.id.image7);
        i8 = (ImageView)findViewById(R.id.image8);
        i9 = (ImageView)findViewById(R.id.image9);
        i10 = (ImageView)findViewById(R.id.image10);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i1)
                {
                    if(flag1 == 0){
                        i1.setImageDrawable(getResources().getDrawable(R.drawable.cat2));
                        flag1 = 1;
                        if(flag10==1)
                        {
                            i1.setImageDrawable(getResources().getDrawable(R.drawable.cat3));
                            i10.setImageDrawable(getResources().getDrawable(R.drawable.cat3));
                            flag1 = 2;
                            flag10 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag1 == 1)
                    {
                        i1.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                        flag1=0;
                    }

                }
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i2)
                {
                    if(flag2 == 0){
                        i2.setImageDrawable(getResources().getDrawable(R.drawable.bird2));
                        flag2 = 1;
                        if(flag7==1)
                        {
                            i2.setImageDrawable(getResources().getDrawable(R.drawable.bird3));
                            i7.setImageDrawable(getResources().getDrawable(R.drawable.bird3));
                            flag2 = 2;
                            flag7 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag2 == 1)
                    {
                        i2.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                        flag2=0;
                    }

                }
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i3)
                {
                    if(flag3 == 0){
                        i3.setImageDrawable(getResources().getDrawable(R.drawable.bee2));
                        flag3 = 1;
                        if(flag8==1)
                        {
                            i3.setImageDrawable(getResources().getDrawable(R.drawable.bee3));
                            i8.setImageDrawable(getResources().getDrawable(R.drawable.bee3));
                            flag3 = 2;
                            flag8 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag3 == 1)
                    {
                        i3.setImageDrawable(getResources().getDrawable(R.drawable.bee));
                        flag3=0;
                    }

                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i4)
                {
                    if(flag4 == 0){
                        i4.setImageDrawable(getResources().getDrawable(R.drawable.fish2));
                        flag4 = 1;
                        if(flag5==1)
                        {
                            i4.setImageDrawable(getResources().getDrawable(R.drawable.fish3));
                            i5.setImageDrawable(getResources().getDrawable(R.drawable.fish3));
                            flag4 = 2;
                            flag5 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag4 == 1)
                    {
                        i4.setImageDrawable(getResources().getDrawable(R.drawable.fish));
                        flag4=0;
                    }

                }
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i5)
                {
                    if(flag5 == 0){
                        i5.setImageDrawable(getResources().getDrawable(R.drawable.fish2));
                        flag5 = 1;
                        if(flag4==1)
                        {
                            i4.setImageDrawable(getResources().getDrawable(R.drawable.fish3));
                            i5.setImageDrawable(getResources().getDrawable(R.drawable.fish3));
                            flag4 = 2;
                            flag5 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag5 == 1)
                    {
                        i5.setImageDrawable(getResources().getDrawable(R.drawable.fish));
                        flag5=0;
                    }

                }
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i6)
                {
                    if(flag6 == 0){
                        i6.setImageDrawable(getResources().getDrawable(R.drawable.pig2));
                        flag6 = 1;
                        if(flag9==1)
                        {
                            i6.setImageDrawable(getResources().getDrawable(R.drawable.pig3));
                            i9.setImageDrawable(getResources().getDrawable(R.drawable.pig3));
                            flag6 = 2;
                            flag9 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag6 == 1)
                    {
                        i6.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                        flag6=0;
                    }

                }
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i7)
                {
                    if(flag7 == 0){
                        i7.setImageDrawable(getResources().getDrawable(R.drawable.bird2));
                        flag7 = 1;
                        if(flag2==1)
                        {
                            i2.setImageDrawable(getResources().getDrawable(R.drawable.bird3));
                            i7.setImageDrawable(getResources().getDrawable(R.drawable.bird3));
                            flag2 = 2;
                            flag7 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag7 == 1)
                    {
                        i7.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                        flag7=0;
                    }

                }
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i8)
                {
                    if(flag8 == 0){
                        i8.setImageDrawable(getResources().getDrawable(R.drawable.bee2));
                        flag8 = 1;
                        if(flag3==1)
                        {
                            i3.setImageDrawable(getResources().getDrawable(R.drawable.bee3));
                            i8.setImageDrawable(getResources().getDrawable(R.drawable.bee3));
                            flag3 = 2;
                            flag8 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag8 == 1)
                    {
                        i8.setImageDrawable(getResources().getDrawable(R.drawable.bee));
                        flag8=0;
                    }

                }
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i9)
                {
                    if(flag9 == 0){
                        i9.setImageDrawable(getResources().getDrawable(R.drawable.pig2));
                        flag9 = 1;
                        if(flag6==1)
                        {
                            i6.setImageDrawable(getResources().getDrawable(R.drawable.pig3));
                            i9.setImageDrawable(getResources().getDrawable(R.drawable.pig3));
                            flag6 = 2;
                            flag9 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag9 == 1)
                    {
                        i9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                        flag9=0;
                    }

                }
            }
        });

        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v == i10)
                {
                    if(flag10 == 0){
                        i10.setImageDrawable(getResources().getDrawable(R.drawable.cat2));
                        flag10 = 1;
                        if(flag1 == 1)
                        {
                            i1.setImageDrawable(getResources().getDrawable(R.drawable.cat3));
                            i10.setImageDrawable(getResources().getDrawable(R.drawable.cat3));
                            flag10 = 2;
                            flag1 = 2;
                            scores = scores + 2;
                            Toast.makeText(Main2Activity.this,"Match!",Toast.LENGTH_SHORT).show();
                            //((TextView) findViewById(R.id.Scores)).setText(scores);
                        }
                    }else if(flag10 == 1)
                    {
                        i10.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                        flag10=0;
                    }

                }
            }
        });


    }
}
