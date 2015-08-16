package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread thread = new Thread(runable);
		thread.start();
	}
	public Runnable runable = new Runnable() {
		public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
				Intent intent = new Intent(Splash.this, MainScreenActivity.class);
				startActivity(intent);
				finish();

		}
	};

}
