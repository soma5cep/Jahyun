package com.example.somaproject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<Option> op = new ArrayList<Option>();
		op.add(new Option("성장주", "제대","됨",0));
		
		Intent intent = this.getIntent();
		intent.putExtra("name", op);
		this.setResult(RESULT_OK, intent);
		finish();
	}
}
