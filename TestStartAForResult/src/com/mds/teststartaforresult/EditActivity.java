package com.mds.teststartaforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends Activity {

	EditText myEditT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_layout);
		myEditT = (EditText)findViewById(R.id.myEditText);
		//MainActivity���� ������ ���ٵ带 ���� �� �ش簪�� Edit�� �����Ѵ�
		Intent recvI = getIntent();
		String recvData = recvI.getStringExtra("data");
		if(recvData != null) {
			myEditT.setText("���� Data :"+recvData);
		}
	}
	
	//OK Btn;
	
	void callOK(View v) {
		
	}
	
	void callCancel(View v) {
		
	}
	
	
}

