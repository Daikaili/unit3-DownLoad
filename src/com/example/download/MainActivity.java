package com.example.download;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button btnDown=null;
    private TextView myText=null;
    private ProgressBar myBar=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
          
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnDown=(Button)findViewById(R.id.btnDown);
		myText=(TextView)findViewById(R.id.myText);
		myBar=(ProgressBar)findViewById(R.id.myBar);
		
		
		btnDown.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DownTask downTask=new DownTask(myText,myBar);
				downTask.execute(100);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
