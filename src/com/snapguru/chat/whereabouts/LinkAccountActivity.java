package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinkAccountActivity extends Activity {
	Button Btn_skip,Button_facebook,Button_twitter,Button_google,Button_instagram,Button_linked;
	EditText EditText_next;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.link_account_activity);
		init();
		
		Btn_skip.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button_facebook.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LinkAccountActivity.this, FindFriendActivity.class);
				startActivity(intent);
			}
		});
		
		Button_twitter.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button_google.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button_instagram.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button_linked.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void init(){
		EditText_next=(EditText)findViewById(R.id.editText_next);
		Btn_skip=(Button)findViewById(R.id.Btn_skip);	
		 
		Button_facebook=(Button)findViewById(R.id.button_facebook);		
		Button_twitter=(Button)findViewById(R.id.button_twitter);
		Button_google=(Button)findViewById(R.id.button_google);
		Button_instagram=(Button)findViewById(R.id.button_instagram);
		Button_linked=(Button)findViewById(R.id.button_linked);
	}

}
