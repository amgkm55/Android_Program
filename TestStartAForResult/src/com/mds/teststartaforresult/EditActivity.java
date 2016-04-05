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
		//MainActivity에서 전달한 인텐드를 받을 것 해당값을 Edit에 설정한다
		Intent recvI = getIntent();
		String recvData = recvI.getStringExtra("data");
		if(recvData != null) {
			myEditT.setText(recvData);
		}
	}
	
	//OK Btn;
	
	public void callOK(View v) {
		//Intent i = new Intent(this, MainActivity.class); //이 방식도 문제가 없지만 그냥 아래코드처럼 날려도 프레임웍이 알아서 보내준다. 
		String sendData = myEditT.getText().toString().trim();
		Intent i = new Intent();
		i.putExtra("data", sendData);
		setResult(RESULT_OK, i);
		finish();
	}
	
	public void callCancel(View v) {
		
	}
	
	
}

