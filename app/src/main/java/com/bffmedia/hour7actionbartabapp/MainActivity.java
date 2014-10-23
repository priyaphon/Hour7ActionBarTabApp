package com.bffmedia.hour7actionbartabapp;

import com.bffmedia.hour7actionbartabapp.R;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {
	String[] values = {"One", "Two", "Three", "One Hundred" };
	ArrayAdapter<String> mSpinnerAdapter;

	Tab mTab1;
	Tab mTab2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		mTab1= actionBar.newTab().setText("Tab 1").setTabListener(new ExampleTabListener());
		mTab2= actionBar.newTab().setText("Tab 2").setTabListener(new ExampleTabListener());
		actionBar.addTab(mTab1);
		actionBar.addTab(mTab2);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Toast toast = Toast.makeText(getApplicationContext(), "Option 1" , Toast.LENGTH_SHORT);
		switch (item.getItemId()) {
	    case android.R.id.home:
	    	toast.setText("You clicked home");
			toast.show();
			return true;
		case R.id.menu_item_1:
			toast.setText("Option 1");
			toast.show();
			return true;
		case R.id.menu_item_2:
			toast.setText("Option 2");
			toast.show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}	
	}

	private class ExampleTabListener implements ActionBar.TabListener {
		public ExampleTabListener() {
		}
		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
		}
		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			Toast toast = Toast.makeText(getApplicationContext(), "tab" , Toast.LENGTH_SHORT);
			if (tab.equals(mTab1)){
				toast.setText("Tab 1");
				toast.show();
			}else{
				toast.setText("Tab 2");
				toast.show();
			}
		}
		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		}
	}



}
