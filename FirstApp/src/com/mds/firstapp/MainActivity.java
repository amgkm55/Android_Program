package com.mds.firstapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {  //Class ��Ӱ��� Ȯ�� Ctrl+T

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void a1Call(View v) {
		Toast.makeText(this, "a1 Click", Toast.LENGTH_SHORT).show();
		
		//A1 Activity ȣ��
		//1. ���� ���μ��� �� ������Ʈ�� ȣ���ϴ� ���
		Intent i = new Intent(this, A1_Activity.class);
		startActivity(i);
	}
	public void a2Call(View v) {
		//2. �ٸ� ���μ����� �ִ� ������Ʈ�� ��������� ȣ��
		ComponentName cpName = new ComponentName("com.mds.secondproj", "com.mds.secondproj.MainActivity");
		Intent i = new Intent();
		i.putExtra("path", "myApp/data/test.dat");
		i.setComponent(cpName);
	}
	public void a3Call(View v) {
		Toast.makeText(this, "a3 Click", Toast.LENGTH_SHORT).show();
	}

}
