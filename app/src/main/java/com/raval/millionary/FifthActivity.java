package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.Context;

public class FifthActivity extends Activity {

SharedPreferences pref;
String themeName, language;

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
        setContentView(R.layout.fifth);


    }
    
}
