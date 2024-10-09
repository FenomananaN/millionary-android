package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.Intent;
import android.app.AlertDialog;
import android.widget.Toast;
//import ni Intent dialogue
import android.content.DialogInterface;
import android.widget.ImageView;

public class SeventhActivity extends Activity {


SharedPreferences pref;
String themeName, language;

private TextView tv2;
private TextView tv4;
private TextView tv1,tvf,tv6,tv7,tv8,hsca;
private Button btf1;
private Button btf2;
private Button btf3;
private ImageView img;

String na,ne,marinaf,disof,b1,b2,b3;
double a,b;
int c,isaf,best1,best2,best3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


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
        setContentView(R.layout.seven);
tv1=(TextView)findViewById(R.id.tv1);
tv2=(TextView)findViewById(R.id.tv2);
tv4=(TextView)findViewById(R.id.tv4);
tv6=(TextView)findViewById(R.id.tv6);
tv7=(TextView)findViewById(R.id.tv7);
tv8=(TextView)findViewById(R.id.tv8);
tvf=(TextView)findViewById(R.id.tvf);
hsca=(TextView)findViewById(R.id.hsca);
btf1=(Button)findViewById(R.id.btf1);
btf2=(Button)findViewById(R.id.btf2);
btf3=(Button)findViewById(R.id.btf3);
img=(ImageView)findViewById(R.id.img);

na=getIntent().getExtras().getString("feno");
ne=getIntent().getExtras().getString("isa");
marinaf=getIntent().getExtras().getString("marinav");
disof=getIntent().getExtras().getString("disov");


bilan();

a=Double.parseDouble(ne);
b=Double.parseDouble(marinaf);
b=b*10;
c=(int)b;
tahapa();

if(a>=5 && a!=10)
{
tv2.setText("Ry  "+na);
strikesOne();
tv4.setText(ne+"/10");
tv1.setText("BRAVO !!!!!");
}
else if(a== 10)
{if(na.contentEquals("Mouma34")){
na="Mouma";
img.setImageResource(R.drawable.dollar);
tv2.setText("Ry  Feno");
tv4.setText("10/10");
tvf.setText("(Arabaina fa azonao ni lela vola 5000 ar.. Misaotra anao nandray anjara)");
tv1.setText("VITANAO IHANY !!!!!");
}
 else{
a=a-1;
int d=(int)a;
tv2.setText("Ry  "+na);
tv4.setText(d+"/10");
tvf.setText("(AZAFADY!!! tsy misy mpianatra mahazo 10/10 izany an-dakilasy noho izany tsy azo nao ny lela-vola 5000 ar)");
tv1.setText("TENA MAHAY !!!!!");
strikes();
}

}
else{
tv2.setText("Ry  "+na);
tv4.setText(ne+"/10");
tv1.setText("RATSY !!!!!");
strikesTwo();

}

//HIGH SCORE


best1=pref.getInt("best1",0);
b1=pref.getString("b1","N/A");
best2=pref.getInt("best2",0);
b2=pref.getString("b2","N/A");
best3=pref.getInt("best3",0);
b3=pref.getString("b3","N/A");

isaf=(int)a;

if(isaf>=best3){

best3 = isaf;
b3=na;
SharedPreferences.Editor editor=pref.edit();
editor.putInt("best3",best3);
editor.putString("b3",b3);
editor.apply();
}


if(isaf>=best2){
int tmp=best2;
String tmps=b2;
best2=isaf;
b2=na;
best3 = tmp;
b3=tmps;

SharedPreferences.Editor editor=pref.edit();
editor.putInt("best3",best3);
editor.putString("b3",b3);
editor.putInt("best2",best2);
editor.putString("b2",b2);
editor.apply();
}

if(isaf>=best1){
int tmp=best1;
String tmps=b1;
best1=isaf;
b1=na;
best2 = tmp;
b2=tmps;

SharedPreferences.Editor editor=pref.edit();
editor.putInt("best2",best2);
editor.putString("b2",b2);
editor.putInt("best1",best1);
editor.putString("b1",b1);
editor.apply();
}

hsca.setText(""+b1+" : "+best1+"/10");

}
	public void btf1 (View view){
		Intent i= new Intent(SeventhActivity.this,MainActivity.class);
		startActivity(i);
finish();

	}
	public void btf2 (View view){
		Intent i= new Intent(SeventhActivity.this,SixthActivity.class);
i.putExtra("name",na);
		startActivity(i);
finish();

	}

public void btf3 (View view){
  AlertDialog.Builder builder = new AlertDialog.Builder(this);
//title ni alert dialogue
 builder.setTitle("Confirmation ny fialana");
//message ni alert
 builder.setMessage("Tena hiala ve ianao??");
//bouton eny
 builder.setPositiveButton("Eny", new DialogInterface.OnClickListener() { 
 @Override
public void onClick(DialogInterface arg0, int arg1) {
   finish () ;
} 
}); 
builder.setNegativeButton("Tsia", new DialogInterface.OnClickListener() { 
@Override
public void onClick(DialogInterface dialog, int which) { 
Toast.makeText(getApplicationContext(),"misaotra tsy niala", Toast.LENGTH_SHORT).show();
} 
});
 builder.setCancelable(false); 
 builder.show();
    
}
public void strikes(){

if (themeName.equals("ThemeBlue")) { 
			img.setImageResource(R.drawable.strike);
		} else if (themeName.equals("ThemeRed")) {
			
			img.setImageResource(R.drawable.strikered);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			img.setImageResource(R.drawable.strikegreen);
		} 

}

public void strikesOne(){

if (themeName.equals("ThemeBlue")) { 
			img.setImageResource(R.drawable.strike1);
		} else if (themeName.equals("ThemeRed")) {
			
			img.setImageResource(R.drawable.strikered2);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			img.setImageResource(R.drawable.strikegreen2);
		} 

}

public void strikesTwo(){

if (themeName.equals("ThemeBlue")) { 
			img.setImageResource(R.drawable.strike2);
		} else if (themeName.equals("ThemeRed")) {
			
			img.setImageResource(R.drawable.strikered3);
		} 
     else if (themeName.equals("ThemeGreen")) {
			
			img.setImageResource(R.drawable.strikegreen3);
		} 

}
public void bilan(){

if(language.equals("MLG")){
tv6.setText("     Ny fanotaniana marina dia  : "+marinaf);
tv7.setText("     Ny fanotaniana diso dia      : "+disof);
}
if(language.equals("EN")){
tv6.setText("     The right answer is        : "+marinaf);
tv7.setText("     The wrong answer is     : "+disof);
}
else{
tv6.setText("     Nombre de reponse vrai sont        : "+marinaf);
tv7.setText("     Nombre de reponse Fausse sont : "+disof);
}

}

public void tahapa(){
if(language.equals("MLG")){
tv8.setText("     Ny taha-pahamarinana dia : "+c+"%");
}
else if(language.equals("EN")){
tv8.setText("     The success Rate is      : "+c+"%");

}
else{
tv8.setText("     Le Taux de reussite                       : "+c+"%");
}
}
}


/* if(language.equals("MLG")){}
else if(language.equals("EN")){
}
else{}
}
*/
