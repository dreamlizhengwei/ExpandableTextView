package com.example.expandabletextview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	boolean flag = false;
	ExpandableTextView expand_text_view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		expand_text_view = (ExpandableTextView) findViewById(R.id.expand_text_view);
//		expand_text_view.setText("123456789123456789123456789123456789123456789123456789123456789123456789");
//		expand_text_view.setmExpandDrawable(getDrawable(R.drawable.arrow_left));
//		expand_text_view.setmCollapseDrawable(getDrawable(R.drawable.arrow_right));
//		expand_text_view.setmMaxCollapsedLines(1);
		
		
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				expand_text_view.setmMaxCollapsedLines(1);
			}
		});
	}
}
