package com.rrcreatedworks.intrestcalci;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	private Button button1;
	private TextView txt;
	private EditText EditText1,EditText2,EditText3,EditText4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		button1 =(Button)findViewById(R.id.button1);

		txt=(TextView)findViewById(R.id.txt);


		EditText1=(EditText)findViewById(R.id.EditText1);
		EditText2=(EditText)findViewById(R.id.EditText2);
		EditText3=(EditText)findViewById(R.id.EditText3);
		EditText4=(EditText)findViewById(R.id.EditText4);
		button1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					double a=Double.parseDouble(EditText1.getText().toString());
					double b=Double.parseDouble(EditText2.getText().toString());
					double c=Double.parseDouble(EditText3.getText().toString());
					double d=Double.parseDouble(EditText4.getText().toString());

					double result=(a*b*c/100);

					double result1=(a*b/100);

					double result2=result1/30;
					double result3=result2*d;
					double result4=result3+result;
					txt.setText(String.valueOf((result4)));
				}
			});





    }}
