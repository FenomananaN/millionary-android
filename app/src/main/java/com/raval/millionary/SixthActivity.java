package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.Gravity;
import android.view.ViewGroup;
import android.content.Intent;
import java.util.Random;


import android.content.SharedPreferences;
import android.content.Context;

public class SixthActivity extends Activity 
{
SharedPreferences pref;
String themeName, language;



	private Question mQuestions = new Question();
	
	private TextView mScoreMarina;
 private TextView mScoreDiso;
	private TextView mScoreView;
	private TextView mQuestionView;
	private Button mButtonChoice1;
	private Button mButtonChoice2;
	private Button mButtonChoice3;
	private Button mButtonChoice4;

	
	private String mAnswer;

	private int mScore = 0;
	private int mMarina=0;
 private int mDiso=0;
	private int mQuestionLength=mQuestions.mQuestions.length;
  private int numQuest=1;

 // for stocking question number
int t[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
int j=0;
int na;
  
  String names,isa,marinav,disov;
	
	Random r;
 
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
pref =getSharedPreferences("data",Context.MODE_PRIVATE);

themeName=pref.getString("theme","ThemeBlue");
language=pref.getString("lang","MLG");


if (themeName.equals("ThemeBlue")&& language.equals("MLG")) { 
			setTheme(R.style.blueMG);
		} else if (themeName.equals("ThemeRed")&& language.equals("MLG")) {
			
			setTheme(R.style.redMG);
		} 
     else if (themeName.equals("ThemeGreen")&& language.equals("MLG")) {
			
			setTheme(R.style.greenMG);
		} 

else if (themeName.equals("ThemeBlue")&& language.equals("EN")) { 
			setTheme(R.style.blueEn);
		} else if (themeName.equals("ThemeRed")&& language.equals("EN")) {
			
			setTheme(R.style.redEn);
		} 
     else if (themeName.equals("ThemeGreen")&& language.equals("EN")) {
			
			setTheme(R.style.greenEn);
		} 

else if (themeName.equals("ThemeBlue")&& language.equals("FR")) { 
			setTheme(R.style.blueFr);
		} else if (themeName.equals("ThemeRed")&& language.equals("FR")) {
			
			setTheme(R.style.redFr);
		} 
     else if (themeName.equals("ThemeGreen")&& language.equals("FR")) {
			
			setTheme(R.style.greenFr);
		} 

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
		
		r= new Random();
		
		mScoreMarina=(TextView)findViewById(R.id.marina);
mScoreDiso=(TextView)findViewById(R.id.diso);
		mScoreView = (TextView)findViewById(R.id.score);
		mQuestionView = (TextView)findViewById(R.id.question);
		mButtonChoice1 = (Button)findViewById(R.id.choice1);
		mButtonChoice2 =(Button)findViewById(R.id.choice2);
		mButtonChoice3 =(Button)findViewById(R.id.choice3);
		mButtonChoice4 =(Button)findViewById(R.id.choice4);


		//Alaina NY valeuran'lah NY anarana
names=getIntent().getExtras().getString("name");
 //////////////////////////////////////

 
   na=norepeate();
		updateQuestion(na);
   updateScore(numQuest);

		
		//start for listener button1 beta
		mButtonChoice1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{if(numQuest != 10){
					if (mButtonChoice1.getText() == mAnswer){
						mScore=mScore+1;
         mMarina=mMarina+1;
						updateMarina(mMarina);
					
			 na=norepeate();			
     updateQuestion(na);
						//this code is optional
					//	toast marina
      toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
						updateDiso(mDiso);
						na=norepeate();			
        updateQuestion(na);
             
					}

numQuest=numQuest+1;
updateScore(numQuest);


}
else{ if(mButtonChoice1.getText() == mAnswer){
						mScore=mScore+1;
				
					

         //	toast marina
      toastMarina();

      mMarina=mMarina+1;
            
					}
					else{
						//toastDiso
         toastDiso();
						mDiso=mDiso+1;
					
					
             
					}


						
           gameOver();
					



}
					// TODO: Implement this method
				}


			});

		//end for listener button1 beta









		//start for listener button2 beta
		mButtonChoice2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{if(numQuest != 10){
					if (mButtonChoice2.getText() == mAnswer){
						mScore=mScore+1;
					//	updateScore(mScore);
         mMarina=mMarina+1;
						updateMarina(mMarina);
						na=norepeate();			
     updateQuestion(na);
						//this code is optional
						
         //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
						updateDiso(mDiso);
						na=norepeate();			
     updateQuestion(na);
             
					}
//i=i+1;
numQuest=numQuest+1;
updateScore(numQuest);


}
else{ if(mButtonChoice2.getText() == mAnswer){
						mScore=mScore+1;
				mMarina=mMarina+1;

						 //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();
						mDiso=mDiso+1;
					
					
             
					}


						
           gameOver();
					



}
					// TODO: Implement this method
				}


			});

		//end for listener button2 beta



		

		//start for listener button3 beta
		mButtonChoice3.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{if(numQuest != 10){
					if (mButtonChoice3.getText() == mAnswer){
						mScore=mScore+1;
					//	updateScore(mScore);
         mMarina=mMarina+1;
						updateMarina(mMarina);
						na=norepeate();			
     updateQuestion(na);
						//this code is optional


						 //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
						updateDiso(mDiso);
						na=norepeate();			
     updateQuestion(na);
             
					}

numQuest=numQuest+1;
updateScore(numQuest);


}
else{ if(mButtonChoice3.getText() == mAnswer){
						mScore=mScore+1;
				mMarina=mMarina+1;
						
         //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
					
					
             
					}


						
           gameOver();
					



}
					// TODO: Implement this method
				}


			});

		//end for listener button3 beta


		
		//start for listener button4
		mButtonChoice4.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{if(numQuest != 10){
					if (mButtonChoice4.getText() == mAnswer){
						mScore=mScore+1;
					//	updateScore(mScore);
        mMarina=mMarina+1;
						updateMarina(mMarina);

						na=norepeate();			
     updateQuestion(na);
						//this code is optional

						 //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
						updateDiso(mDiso);
						na=norepeate();			
     updateQuestion(na);
             
					}

numQuest=numQuest+1;
updateScore(numQuest);


}
else{ if(mButtonChoice4.getText() == mAnswer){
						mScore=mScore+1;
				mMarina=mMarina+1;
						 //	toast marina
          toastMarina();
            
					}
					else{
						//toastDiso
         toastDiso();

						mDiso=mDiso+1;
					
					
             
					}


						
           gameOver();
					



}
					// TODO: Implement this method
				}


			});

		//end for listener button4
		
    }
	
	private void updateQuestion(int num){
		mQuestionView.setText(mQuestions.getQuestion(num));
		mButtonChoice1.setText(mQuestions.getChoice1(num));
		mButtonChoice2.setText(mQuestions.getChoice2(num));
		mButtonChoice3.setText(mQuestions.getChoice3(num));
		mButtonChoice4.setText(mQuestions.getChoice4(num));
		
		mAnswer = mQuestions.getCorrectAnsewrs(num);
		
	}
	
	private void updateScore(int point)
	{
	mScoreView.setText(""+numQuest+"/10");
		// TODO: Implement this method
	}
	private void updateMarina(int point)
	{
		mScoreMarina.setText(""+mMarina);
		// TODO: Implement this method
	}

  private void updateDiso(int point)
	{
		mScoreDiso.setText(""+mDiso);
		// TODO: Implement this method
	}

private void gameOver(){


isa=String.valueOf(mScore);
marinav=String.valueOf(mMarina);
disov=String.valueOf(mDiso);
		Intent i= new Intent(SixthActivity.this,SeventhActivity.class);
i.putExtra("feno",names);
i.putExtra("isa",isa);
i.putExtra("marinav",marinav);
i.putExtra("disov",disov);
	startActivity(i);
   finish ();
		
		
	}

public void toastMarina(){

LayoutInflater inf=getLayoutInflater();
				  View layout =inf.inflate(R.layout.ctoast,(ViewGroup)findViewById(R.id.customToast));
				  
				  TextView tTv=(TextView)layout.findViewById(R.id.textCustom);
				  ImageView tIV=(ImageView)layout.findViewById(R.id.cIV);
				  
				  tTv.setText("Marina");
				  strikes(tIV);
				  
				  Toast t = new Toast(getApplicationContext());
				  t.setDuration(Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
				  t.setView(layout);
				  t.show();

}


public void toastDiso(){

LayoutInflater inf=getLayoutInflater();
				  View layout =inf.inflate(R.layout.ctoast,(ViewGroup)findViewById(R.id.customToast));
				  
				  TextView tTv=(TextView)layout.findViewById(R.id.textCustom);
				  ImageView tIV=(ImageView)layout.findViewById(R.id.cIV);
				  
				  tTv.setText("Diso");
				  strikesOne(tIV);
				  
				  Toast t = new Toast(getApplicationContext());
				  t.setDuration(Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
				  t.setView(layout);
				  t.show();

}

public void strikes(ImageView img){

if (themeName.equals("ThemeBlue")) { 
			img.setImageResource(R.drawable.strike);
		} else if (themeName.equals("ThemeRed")) {
			
			img.setImageResource(R.drawable.strikered);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			img.setImageResource(R.drawable.strikegreen);
		} 

}

public void strikesOne(ImageView img){

if (themeName.equals("ThemeBlue")) { 
			img.setImageResource(R.drawable.strike2);
		} else if (themeName.equals("ThemeRed")) {
			
			img.setImageResource(R.drawable.strikered3);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			img.setImageResource(R.drawable.strikegreen3);
		} 

}

private int norepeate(){
int i; 
int b,a;
	b=1;
	a=0;
	
while(b>0){
	b=0;
	a=r.nextInt(mQuestionLength);
	for(i=0;i<10;i++){
		if(t[i]==a){
			b++;
		}}
		if(b==0){
		t[j]=a;
		j++;
		}
	
		
	}
	return a;
}






}
