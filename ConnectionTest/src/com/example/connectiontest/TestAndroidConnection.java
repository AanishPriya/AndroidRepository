package com.example.connectiontest;



import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class TestAndroidConnection extends Activity implements OnClickListener {
	
	String insertData;
	HttpClient httpclient;
	HttpPost httppost;
	HttpResponse response;
	
	ArrayList<NameValuePair> nameValuePairs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_android_connection);
		
		EditText data = (EditText) findViewById (R.id.txt_data);
		insertData = data.getText().toString();
		
		Button btnSave = (Button) findViewById (R.id.btnSave);
		btnSave.setOnClickListener(this);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test_android_connection, menu);
		return true;
	}



	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		httpclient = new DefaultHttpClient();
		httppost = new HttpPost("http://10.0.2.2/ConnectionExample/db_connect.php");
		try{
			nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("data", insertData));
			
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			response = httpclient.execute(httppost);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
