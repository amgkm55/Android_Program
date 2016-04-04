package com.mds.secondproj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent recI = getIntent();
		String data = recI.getStringExtra("path");
		Toast.makeText(this, "data : "+data, Toast.LENGTH_SHORT).show();
	}
	
	
}
