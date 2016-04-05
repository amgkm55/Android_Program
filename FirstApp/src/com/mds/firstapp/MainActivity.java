package com.mds.firstapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {  //Class 상속관계 확인 Ctrl+T

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "Main onCreate", Toast.LENGTH_SHORT).show();;
	}

	public void a1Call(View v) {
		Toast.makeText(this, "a1 BTN Click", Toast.LENGTH_SHORT).show();
		
		//A1 Activity 호출
		//1. 같은 프로세스 내 컴포넌트를 호출하는 방법
		Intent i = new Intent(this, A1_Activity.class);
		startActivity(i);
	}
	public void a2Call(View v) {
		//2. 다른 프로세스에 있는 컴포넌트를 명시적으로 호출
		ComponentName cpName = new ComponentName("com.mds.secondproj", "com.mds.secondproj.MainActivity");
		Intent i = new Intent();
		i.putExtra("path", "myApp/data/test.dat");
		i.setComponent(cpName);
		startActivity(i);
	}
	public void a3Call(View v) {
		Intent i = new Intent("com.mds.action.VIEW");
		startActivity(i);
	}
	
	public void TestCall(View v) {
		Intent callI = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
		Intent callI3 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivity(callI3);
	}
	
	

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(this, "Main onStart", Toast.LENGTH_SHORT).show();;
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Toast.makeText(this, "Main onRestart", Toast.LENGTH_SHORT).show();;
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(this, "Main onResume", Toast.LENGTH_SHORT).show();;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(this, "Main onPause", Toast.LENGTH_SHORT).show();;
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Toast.makeText(this, "Main onStop", Toast.LENGTH_SHORT).show();;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "Main onDestroy", Toast.LENGTH_SHORT).show();;
	}
	

}
