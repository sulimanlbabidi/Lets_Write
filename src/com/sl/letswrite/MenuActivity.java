package com.sl.letswrite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	        ListView menu_list = (ListView) findViewById(R.id.main_list);
	        String[] menu_items = {getResources().getString(R.string.menu_basics),
	        		getResources().getString(R.string.menu_next),
	        		getResources().getString(R.string.menu_translated),
	        		getResources().getString(R.string.menu_about)};
	        
	        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,R.layout.menu_item,menu_items);
	        menu_list.setAdapter(adapt);
	    }

}
