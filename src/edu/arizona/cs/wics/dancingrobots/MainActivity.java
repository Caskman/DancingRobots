package edu.arizona.cs.wics.dancingrobots;

import edu.arizona.cs.dancingrobots.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 
 * @author Eric Cascketta
 *
 * Dancing robots!!!
 *
 */
public class MainActivity extends Activity {

	private ImageView img_view;
	private int dance_counter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button b = (Button) findViewById(R.id.dance_button);
		b.setOnClickListener(new MyClickListener());
		
		dance_counter = 0;
		
		img_view = (ImageView) findViewById(R.id.img_view);
	}

	private int getFrameId(int c) {
		switch (c) {
		case 0: return R.drawable.dance1;
		case 1: return R.drawable.dance3;
		case 2: return R.drawable.dance2;
		case 3: return R.drawable.dance3;
		default: return -1;
		}
	}
	
	private class MyClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			dance_counter = (dance_counter + 1) % 4;
			img_view.setImageResource(getFrameId(dance_counter));
		}
		
	}

}
