package com.raval.millionary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.view.View.OnClickListener;
import android.view.View;

public class SettingActivity extends Activity {

Button rd;
RadioButton rgb,rgr,rgv;
RadioGroup rg;
TextView tvg;

SharedPreferences pref;
String themeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
		
		
		rd=(Button)findViewById(R.id.rd);

   rgb=(RadioButton)findViewById(R.id.rgb);
		rgr=(RadioButton)findViewById(R.id.rgr);
		rgv=(RadioButton)findViewById(R.id.rgv);
		rg=(RadioGroup)findViewById(R.id.rg);

   tvg=(TextView)findViewById(R.id.barse);
	
	pref =getSharedPreferences("data",Context.MODE_PRIVATE);
themeName=pref.getString("theme","ThemeBlue");

if(themeName.equals("ThemeBlue")){
tvg.setBackgroundColor(Color.parseColor("#008fed"));
}
else if(themeName.equals("ThemeRed")){
tvg.setBackgroundColor(Color.parseColor("#ff4950"));
}

else if(themeName.equals("ThemeGreen")){
tvg.setBackgroundColor(Color.parseColor("#43c372"));
}

rd.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{PopupMenu popup = new PopupMenu(SettingActivity.this, rd);
					//Inflating the Popup using xml file
					popup.getMenuInflater().inflate(R.menu.menu_theme, popup.getMenu());

					//registering popup with OnMenuItemClickListener
					popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
							public boolean onMenuItemClick(MenuItem item) {
								switch (item.getItemId()){ 
									case R.id.manga: 
										themeName="ThemeBlue";
		SharedPreferences.Editor editor=pref.edit();
		editor.putString("theme",themeName);
		editor.apply();

tvg.setBackgroundColor(Color.parseColor("#008fed"));

//return value for result
							Intent ret = new Intent();
							setResult(Activity.RESULT_OK,ret);
							//finish(); 
										return true; 



									case R.id.mena: 
										themeName="ThemeRed";
		SharedPreferences.Editor editorR=pref.edit();
		editorR.putString("theme",themeName);
		editorR.apply();
  tvg.setBackgroundColor(Color.parseColor("#ff4950"));

//return value for result
							Intent retr = new Intent();
							setResult(Activity.RESULT_OK,retr);
							//finish();

										return true; 
									case R.id.maitso: 
			themeName="ThemeGreen";
		SharedPreferences.Editor editorv=pref.edit();
		editorv.putString("theme",themeName);
		editorv.apply();	


tvg.setBackgroundColor(Color.parseColor("#43c372"));

//return value for result
							Intent retv = new Intent();
							setResult(Activity.RESULT_OK,retv);
							//finish();



										Toast.makeText(SettingActivity.this, "Item three selected", Toast.LENGTH_SHORT).show(); 
										return true; 
						
									default: 
										return false;
								
								
								
							}
						}});
					popup.show();}
});

		



rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(RadioGroup p1, int p2)
				{
					switch (p2){
						case R.id.rgb:
							
		SharedPreferences.Editor editor=pref.edit();
		editor.putString("lang","MLG");
		editor.apply();

//tvg.setBackgroundColor(Color.parseColor("#008fed"));

//return value for result
							Intent ret = new Intent();
							setResult(Activity.RESULT_OK,ret);
							//finish();

							break;
						case R.id.rgr:
							
		SharedPreferences.Editor editorR=pref.edit();
		editorR.putString("lang","EN");
		editorR.apply();
  //tvg.setBackgroundColor(Color.parseColor("#ff4950"));

//return value for result
							Intent retr = new Intent();
							setResult(Activity.RESULT_OK,retr);
							//finish();

							break;
						case R.id.rgv:
						
		SharedPreferences.Editor editorv=pref.edit();
		editorv.putString("lang","FR");
		editorv.apply();	


//tvg.setBackgroundColor(Color.parseColor("#43c372"));

//return value for result
							Intent retv = new Intent();
							setResult(Activity.RESULT_OK,retv);
							//finish();


							break;
						default:
							break;
				}
			}	
			
		});
}   
}
