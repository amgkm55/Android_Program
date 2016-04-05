package com.mds.testservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void startService(View v) {
		Intent i = new Intent(this, myService.class);
		startService(i);
		
	}
	
	public void stopService(View v) {
		
	}
	
}
