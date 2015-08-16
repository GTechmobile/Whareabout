package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpNewActivity extends Activity {
	Button Next_btn;
	EditText EditText_next;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup_new_activity);
		init();
		
		Next_btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SignUpNewActivity.this, VarificationActivity.class);
				startActivity(intent);
				
			}
		});
	}
	
	public void init(){
		EditText_next=(EditText)findViewById(R.id.editText_next);
		Next_btn=(Button)findViewById(R.id.Vari_next_Btn);	
	}
}