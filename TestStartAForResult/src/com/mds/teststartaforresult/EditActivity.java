package com.mds.teststartaforresult;

import android.app.Activity;
import android.os.Bundle;
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
	}
	
	//OK Btn;
	
}

