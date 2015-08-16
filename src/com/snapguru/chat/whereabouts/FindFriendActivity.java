package com.snapguru.chat.whereabouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class FindFriendActivity extends Activity {
   ListView FriendList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_friend_activity);
		init();
    }
	
	public void init(){
		FriendList=(ListView)findViewById(R.id.friend_list);
		
	}
}
