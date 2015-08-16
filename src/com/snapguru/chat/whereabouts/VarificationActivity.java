package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VarificationActivity extends Activity {
	Button Skip_btn,Varify_btn;
	EditText EditText_code,EditText_Phone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.phone_vari_activity);
		init();
		
		Skip_btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Varify_btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(VarificationActivity.this, LinkAccountActivity.class);
				startActivity(intent);
			}
		});
	}
	
	public void init(){
		EditText_Phone=(EditText)findViewById(R.id.editText_Phone);
		EditText_code=(EditText)findViewById(R.id.editText_code);
		
		Skip_btn=(Button)findViewById(R.id.skip_Btn);	
		Varify_btn=(Button)findViewById(R.id.Varify_btn);	
	}
}
