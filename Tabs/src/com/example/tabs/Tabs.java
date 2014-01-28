package com.example.tabs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.Button;
import android.widget.TabHost;
//import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class Tabs extends Activity implements OnClickListener {

	TabHost tabHost;
	//Git Test
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        //Button btnSearch = (Button) findViewById (R.id.btn_search);
		//btnSearch.setOnClickListener(this);
        editTab();
    }


	private void editTab() {
		
		tabHost = (TabHost)findViewById(R.id.tabhost);
		tabHost.setup();
		//first tab
		TabSpec tabSpec = tabHost.newTabSpec("tab1");
		tabSpec.setContent(R.id.tab1);
		tabSpec.setIndicator("Search");
		tabHost.addTab(tabSpec);
		//second tab
		tabSpec = tabHost.newTabSpec("tab2");
		tabSpec.setContent(R.id.tab2);
		tabSpec.setIndicator("Vehicles");
		tabHost.addTab(tabSpec);
		//third tab
		tabSpec = tabHost.newTabSpec("tab3");
		tabSpec.setContent(R.id.tab3);
		tabSpec.setIndicator("Profile");
		tabHost.addTab(tabSpec);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tabs, menu);
		return true;
	}

	@Override
	public void onClick(View v) {/**
		switch (v.getId()){
		case R.id.btn_search:
				TabSpec tabSpec = tabHost.newTabSpec("tab");
				tabSpec.setContent(new TabHost.TabContentFactory() {
					
					@Override
					public View createTabContent(String tag) {
						// TODO Auto-generated method stub
						TextView text = new TextView(Tabs.this);
						text.setText("You've create a new tab");
						return (text);
					}
				});
				tabSpec.setIndicator("New Tab");
				tabHost.addTab(tabSpec);
			break;
		
		}**/
	}
}
