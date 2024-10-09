package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.content.Context;

public class FourthActivity extends Activity {
SharedPreferences pref;
String themeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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
        setContentView(R.layout.fourth);

Button bts=(Button)findViewById(R.id.bts);
    }
	public void bts (View view){
	
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://m.facebook.com/valentin.nomenjanahry"));
		startActivity(intent);
	}
	
}

//enfin un jeux ou tous le monde peut gagnez beaucoups d'argent alors ne rate pas..comme le devise du PMU c'est les personne qui joue seulement qui gagne...alors n'arrete jamais de jouer avant de gagner le 5000 ar... Bonne Chance!!!
