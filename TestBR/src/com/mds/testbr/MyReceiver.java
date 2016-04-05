package com.mds.testbr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "onRecv", Toast.LENGTH_SHORT).show();
		Intent i = new Intent();
		context.startActivity(i);
	}

}
