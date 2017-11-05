package com.example.sankalpsinha.sharedpref;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.transition.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button btnlogin;
    private Button btnreg;

    private ImageButton info;

    private ImageView logo;
    private ImageView logo1;
    private ImageView name1;
    private  ImageView cancel;


    private TextView name;
    private TextView infotext;


    private FloatingActionButton floatbtnf;
    private FloatingActionButton floatbtng;

    private  RelativeLayout layout;

    Dialog customDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //view initialisation
        btnlogin=(Button) findViewById(R.id.btnlogin);
        btnreg=(Button) findViewById(R.id.btnreg);

        logo=(ImageView)findViewById(R.id.logo);
        logo1=(ImageView)findViewById(R.id.logo1);

        name=(TextView) findViewById(R.id.name);
        name1=(ImageView) findViewById(R.id.name1);

        info=(ImageButton)findViewById(R.id.info);

        floatbtnf=(FloatingActionButton)findViewById(R.id.floatminf);
        floatbtng=(FloatingActionButton)findViewById(R.id.floatming);

        layout=(RelativeLayout)findViewById(R.id.layout);

        //custom dialog initialisation
        customDialog=new Dialog(Main2Activity.this);

        loadAnim();         //Animation loading fuction

        dialogCreate();     //custom dialog fuctionality

        //floating button listner
        floatbtng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Not integrated",Toast.LENGTH_LONG).show();
            }
        });

        floatbtnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Not integrated",Toast.LENGTH_LONG).show();

            }
        });






    }


    public void dialogCreate(){

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              String text = "“Laid foundation of the Foxogyan club’s dream project ‘CLAN-ITS’- It is a web\n" +
                        "based/android application for college students which enables them to quickly\n" +
                        "access tutorials, class notes, faculty reach, information of events and activities\n" +
                        "in college, communication among students as well as faculty. Individual profile\n" +
                        "management and online resume generator.”";

                customDialog.setContentView(R.layout.info);

                infotext=(TextView)customDialog.findViewById(R.id.infotext);
                cancel=(ImageView) customDialog.findViewById(R.id.canceli);
                customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                customDialog.setCanceledOnTouchOutside(false);
                infotext.setText(text);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        customDialog.dismiss();
                    }
                });
                customDialog.show();

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                customDialog.setContentView(R.layout.signin);

                customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cancel=(ImageView) customDialog.findViewById(R.id.cancels);
                customDialog.setCanceledOnTouchOutside(false);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        customDialog.dismiss();
                    }
                });
                customDialog.show();

            }
        });
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                customDialog.setContentView(R.layout.register);

                customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cancel=(ImageView) customDialog.findViewById(R.id.cancelr);
                customDialog.setCanceledOnTouchOutside(false);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        customDialog.dismiss();
                    }
                });

                customDialog.show();
            }
        });

    }


    public void loadAnim(){
        Animation translate;
        Animation transl_info;
        Animation btnBounce;
        Animation floatanim;
        Animation logoanim;
        Animation logoanim1;

        translate=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        translate.setStartOffset(800);
        layout.startAnimation(translate);


        btnBounce=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.buttonbounce);
        btnBounce.setStartOffset(3000);
        btnlogin.startAnimation(btnBounce);

        btnBounce=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.buttonbounce1);
        btnBounce.setStartOffset(3500);
        btnreg.startAnimation(btnBounce);

        transl_info=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.info_anim);
        transl_info.setStartOffset(4000);
        info.startAnimation(transl_info);

        floatanim=AnimationUtils.loadAnimation(getApplication(),R.anim.openfloatbtn);
        floatanim.setStartOffset(4500);
        floatbtnf.startAnimation(floatanim);
        floatbtng.startAnimation(floatanim);

        logoanim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim);
        logoanim1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim1);
        logoanim.setStartOffset(5000);
        logoanim1.setStartOffset(5000);
        logo.startAnimation(logoanim1);
        name.startAnimation(logoanim1);
        logo1.startAnimation(logoanim);
        name1.startAnimation(logoanim);




    }


}
