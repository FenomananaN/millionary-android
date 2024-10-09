package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import android.content.SharedPreferences;
import android.content.Context;

public class SecondActivity extends Activity {
	
SharedPreferences pref;
String themeName, language, msgError;



Button btd;
EditText et;
String name;

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
        setContentView(R.layout.second);
btd=(Button)findViewById(R.id.mainButton);
		et=(EditText)findViewById(R.id.et);

    }
    public void btd (View view){
		 name= et.getText().toString();
		if(name.length()==0){
			msgError=error();
			et.setError(msgError);
			
		}
		
		else{
  Intent i= new Intent(SecondActivity.this,SixthActivity.class);
i.putExtra("name",name);
startActivity(i);
finish();

}
}
public String error(){
String msg;
if(language.equals("MLG")){
msg="Azafady!!! tsy maintsy manome anarana ianao";

}
else if(language.equals("EN")){
msg="Sorry!!!! you must enter your name";
}

else{
msg="Desolé!!! tu dois donner ton nom";
}
return msg;
}
}
