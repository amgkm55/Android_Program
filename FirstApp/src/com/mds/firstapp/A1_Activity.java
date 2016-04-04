package com.mds.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A1_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a1_layout);
	}
	
	public void mainCall(View v){
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		//finish();
	}
}
