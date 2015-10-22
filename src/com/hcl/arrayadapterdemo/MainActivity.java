package com.hcl.arrayadapterdemo;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listView = getListView();
		Resources r = getResources();
		String item[] = r.getStringArray(R.array.fruit);
		
		//String item[] = {"Apple","Banana","Orange","Mango"};
		setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, item));
		
	}



}
