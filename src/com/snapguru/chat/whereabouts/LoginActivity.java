package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	Button Login_Btn,SignUp_Btn,Facebook_Login,Twitter_Login,Google_Login;
	EditText Email_Text,Password_text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		init();
		// Login 
		Login_Btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		// SignUp
		SignUp_Btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Facebook_Login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Twitter_Login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Google_Login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

	}

	public void init(){
		Email_Text=(EditText)findViewById(R.id.email_editText);
		Password_text=(EditText)findViewById(R.id.password_editText);
		
		Login_Btn=(Button)findViewById(R.id.login_btn);
		SignUp_Btn=(Button)findViewById(R.id.signup_btn);

		Facebook_Login=(Button)findViewById(R.id.facebook_btn_login);
		Twitter_Login=(Button)findViewById(R.id.twitter_btn_login);
		Google_Login=(Button)findViewById(R.id.google_btn_login);
	}
}
