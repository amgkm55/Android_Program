package com.mds.testservice;


import android.app.Activity;
import android.content.Intent;
import android.mtp.MtpStorageInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText myEditT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myEditT = (EditText)findViewById(R.id.inputEditText);
	}
	
	public void startService(View v) {
		String TextInputData = myEditT.getText().toString().trim();
		Intent i = new Intent(this, myService.class);
		i.putExtra("data", TextInputData);
		startService(i);
				
	}
	
	public void stopService(View v) {
		Intent i = new Intent(this, myService.class);
		stopService(i);
	}
	
}
