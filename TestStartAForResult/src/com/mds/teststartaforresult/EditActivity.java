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
			myEditT.setText(recvData);
		}
	}
	
	//OK Btn;
	
	public void callOK(View v) {
		//Intent i = new Intent(this, MainActivity.class); //�� ��ĵ� ������ ������ �׳� �Ʒ��ڵ�ó�� ������ �����ӿ��� �˾Ƽ� �����ش�. 
		String sendData = myEditT.getText().toString().trim();
		Intent i = new Intent();
		i.putExtra("data", sendData);
		setResult(RESULT_OK, i);
		finish();
	}
	
	public void callCancel(View v) {
		
	}
	
	
}

