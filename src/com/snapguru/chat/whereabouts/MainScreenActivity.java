package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends Activity {
	Button Btn_Login,Btn_SignUp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen_activity);
		init();
		// Login 
		Btn_Login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainScreenActivity.this, LoginActivity.class);
				startActivity(intent);
			}
		});
		// SignUp
		Btn_SignUp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainScreenActivity.this, SignUpActivity.class);
				startActivity(intent);
			}
		});
		
	}
	
	public void init(){
		Btn_Login=(Button)findViewById(R.id.btn_login);
		Btn_SignUp=(Button)findViewById(R.id.btn_signup);
	}
}
