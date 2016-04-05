package com.mds.testbr;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
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
	 * 1. Notification�� �����ϴ� NotificationManager ��ü ���ϱ�
	 * 2. �߻��� Notification�� Buider Ŭ������ �̿��Ͽ� �����ϱ�
	 * 	3. Ȯ����¹� ���ý� Ư�� �۾� ������ ���� PendingIntent ����
	 * 	4. Manager Ŭ������ �̿��Ͽ� Notification �߻��ϱ�
	 * */ 
	public void notiTest(View v) {
		Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kma.go.kr"));
		PendingIntent pIn = PendingIntent.getActivity(this, 1, i, PendingIntent.FLAG_CANCEL_CURRENT);
		
		
		Notification.Builder notiB = new Notification.Builder(this);
		notiB.setSmallIcon(R.drawable.ic_launcher);
		notiB.setContentTitle("Noti Test");
		notiB.setContentText("Notification Test working..");
		notiB.setUsesChronometer(true);
		notiB.setContentInfo("Under Right");
		notiB.setContentIntent(pIn);
		notiB.setDefaults(Notification.DEFAULT_ALL);
		
		notiMgr.notify(1, notiB.build());
	}
}
