package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
//import ny alert dialgue
import android.app.AlertDialog;
import android.widget.Toast;
//import ni Intent dialogue
import android.content.DialogInterface;

import android.content.SharedPreferences;
import android.content.Context;

public class MainActivity extends Activity {
SharedPreferences pref;
String themeName, language;
int SETTINGS_ACTION=1;

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
        setContentView(R.layout.activity_main);
Button btn=(Button)findViewById(R.id.btn);
Button btn1=(Button)findViewById(R.id.btn1);
Button btn2=(Button)findViewById(R.id.btn2);
Button btn3=(Button)findViewById(R.id.btn3);
Button btn4=(Button)findViewById(R.id.btn4);
Button btn5=(Button)findViewById(R.id.btn5);

    }
public void btn (View view){
  Intent i= new Intent(MainActivity.this,SecondActivity.class);
startActivity(i);
finish();
}

public void btn1 (View view){
  Intent i= new Intent(MainActivity.this,ThirdActivity.class);
startActivity(i);


}


public void btn2 (View view){
  Intent i= new Intent(MainActivity.this,FourthActivity.class);
startActivity(i);

}

public void btn3 (View view){
  Intent i= new Intent(MainActivity.this,FifthActivity.class);
startActivity(i);

}

public void btn5 (View view){
startActivityForResult(new Intent(MainActivity.this,
					SettingActivity.class), SETTINGS_ACTION);


}

protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		// TODO: Implement this method
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode==1){
			if(resultCode==Activity.RESULT_OK){
				finish();
				startActivity(getIntent());
				return;
			}
		}
	}


public void btn4 (View view){
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
}
