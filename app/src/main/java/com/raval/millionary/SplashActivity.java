package com.raval.millionary;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;
import android.widget.ProgressBar;
import android.view.View;

public class SplashActivity extends Activity 
{

SharedPreferences pref;
String themeName;

  private ImageView logo,logo1,logo0;
  private TextView tx,tvt;

private Handler handle = new Handler();
	ProgressBar progressBar;
	int progress=0;

	private static int SPLASH_TIME_OUT=5120;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

pref =getSharedPreferences("data",Context.MODE_PRIVATE);

themeName=pref.getString("theme","ThemeBlue");

if (themeName.equals("ThemeBlue")) { 
			setTheme(R.style.ThemeBlue);
		} else if (themeName.equals("ThemeRed")) {
			
			setTheme(R.style.ThemeRed);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			setTheme(R.style.ThemeGreen);
		} 



        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

logo0=(ImageView)findViewById(R.id.imgr0);
logo=(ImageView)findViewById(R.id.imgr);
		logo1=(ImageView)findViewById(R.id.imgr1);
		tx=(TextView)findViewById(R.id.fn1);
   tvt=(TextView)findViewById(R.id.fnf);
progressBar=(ProgressBar)findViewById(R.id.progressbar);
		


if (themeName.equals("ThemeBlue")) { 
			logo0.setImageResource(R.drawable.quiz);
		} else if (themeName.equals("ThemeRed")) {
			
		logo0.setImageResource(R.drawable.quizred);
		} 
     else if (themeName.equals("ThemeGreen")) {
		logo0.setImageResource(R.drawable.quizgreen);	
			
		} 

progress();
		


		new Handler().postDelayed(new Runnable(){
		@Override
		public void run(){
			Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
			startActivity(homeIntent);

			finish();
		}
			
		},SPLASH_TIME_OUT);

Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
   logo0.startAnimation(myanim);
		logo.startAnimation(myanim);
		logo1.startAnimation(myanim);
		tx.startAnimation(myanim);
   progressBar.startAnimation(myanim);

Animation a = AnimationUtils.loadAnimation(this,R.anim.blink);

tvt.startAnimation(a);
    }
public void progress(){
		new Thread (new Runnable(){

				public void run()
				{
					while(progress<100){
						progress+=1;
						progressBar.setProgress(progress);
						
					
						handle.post(new Runnable(){


								public void run()
								{
									if(progress==100) {
										progressBar.setProgress(progress);
										
									
									}
								}

							});
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}


			}).start();
	}
}
    
