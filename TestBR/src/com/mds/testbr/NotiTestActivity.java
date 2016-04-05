package com.mds.testbr;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NotiTestActivity extends Activity {

	NotificationManager notiMgr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noti_test);
		notiMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
	}
	
	/*
	 * 1. Notification을 관리하는 NotificationManager 객체 구하기
	 * 2. 발생할 Notification을 Buider 클래스를 이용하여 구현하기
	 * 	3. 확장상태바 선택시 특정 작업 수행을 위한 PendingIntent 생성
	 * 	4. Manager 클래스를 이용하여 Notification 발생하기
	 * */ 
	public void notiTest(View v) {
		
		
		Notification.Builder notiB = new Notification.Builder(this);
		notiB.setSmallIcon(R.drawable.ic_launcher);
		notiB.setContentTitle("Noti Test");
		notiB.setContentText("Notification Test working..");
		notiB.setUsesChronometer(true);
		notiB.setContentInfo("Under Right");
		notiB.setDefaults(Notification.DEFAULT_ALL);
		notiMgr.notify(1, notiB.build());
	}
}
