package com.mds.teststartaforresult;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView inputTv;
	public static final int EDIT_MODE = 1;
	public static final int SEARCH_MODE = 2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inputTv = (TextView)findViewById(R.id.inputTextView);
	}
	
	//Event Create
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		switch (requestCode) {
		case EDIT_MODE:
			if(resultCode == RESULT_OK) {
				//Intent recv
				String recvData = data.getStringExtra("data");
				inputTv.setText(recvData);
			} else if(resultCode == RESULT_CANCELED) {
				inputTv.setText("CANCELED TEXT");
			}
			break;
		case SEARCH_MODE:
			
			break;
		default:
			break;
		}
	}
	
	public void editCall(View v) {	
		Toast.makeText(this, "a1 Click", Toast.LENGTH_SHORT).show();
		String sendData = inputTv.getText().toString().trim();
		Intent i = new Intent(this, EditActivity.class);
		i.putExtra("data", sendData);
		startActivityForResult(i, EDIT_MODE);
	}
	
	
}
