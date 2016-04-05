package com.mds.testservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.webkit.WebView.FindListener;
import android.widget.EditText;
import android.widget.Toast;

public class myService extends Service {


	MediaPlayer player;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Toast.makeText(this, "Service Start", Toast.LENGTH_SHORT).show();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		String ToastText = intent.getStringExtra("data");
		if(player != null) {
			player.stop();
			player.release();
		}
		player = MediaPlayer.create(this, R.raw.test);
		player.setLooping(false);
		player.start();
		
		Toast.makeText(this, "Service Run"+ToastText, Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "Service End", Toast.LENGTH_SHORT).show();
		if(player != null) {
			player.stop();
			player.release();
		}
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
