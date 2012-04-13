package com.kunahk.newmoon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class startingPoint extends Activity {
	/** Called when the activity is first created. */

	int counter;
	Button add, sub;
	TextView display;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		counter = 0;
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvDisplay);
		add.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				counter = counter +1;
				display.setText("Your total is " + counter);
				Toast.makeText(getApplication(), "Hello", 25); //does not work
			}
		});

		sub.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				counter = counter - 1;
				display.setText("Your total is " + counter);
			}
		});
	}
}