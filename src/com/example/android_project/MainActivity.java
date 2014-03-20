package com.example.android_project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView text = new TextView(this);
        text.setText("Hello World, Android - mkyong.com");
        setContentView(text);
    }
}
