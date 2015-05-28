package course.examples.ui.radiogroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroupActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button bt = (Button) findViewById(R.id.button);

		// Define a generic listener for all three RadioButtons in the RadioGroup
		final OnClickListener btListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView tv = (TextView) findViewById(R.id.textViewResult);
                tv.setText("[ ....   ennnyire    .... ]");
			}
		};
        bt.setOnClickListener(btListener);
		


	}
}