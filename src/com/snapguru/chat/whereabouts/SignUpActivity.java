package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends Activity {
	Button Login_btn_next,Next_btn,Facebook_SignUP,Twitter_SighUp,Google_SignUp;
	EditText Email_editsignup,Password_editsignup,Bith_editsignup;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup_activity);
		init();
		// Login 
		Login_btn_next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
				startActivity(intent);
				
			}
		});
		// SignUp
		Next_btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SignUpActivity.this, SignUpNewActivity.class);
				startActivity(intent);
			}
		});

		Facebook_SignUP.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Twitter_SighUp.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Google_SignUp.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

	}

	public void init(){
		Email_editsignup=(EditText)findViewById(R.id.email_editsignup);
		Password_editsignup=(EditText)findViewById(R.id.password_editsignup);
		Bith_editsignup =(EditText)findViewById(R.id.bith_editsignup);
		
		Login_btn_next=(Button)findViewById(R.id.login_btn_next);
		Next_btn=(Button)findViewById(R.id.next_btn);

		Facebook_SignUP=(Button)findViewById(R.id.facebook_btn_signup);
		Twitter_SighUp=(Button)findViewById(R.id.twitter_btn_signup);
		Google_SignUp=(Button)findViewById(R.id.google_btn_signup);
	}
}
