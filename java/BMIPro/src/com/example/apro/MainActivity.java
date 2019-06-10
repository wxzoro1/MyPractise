package com.example.apro;

import java.math.BigDecimal;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button calculatorButton;
	private EditText weightEditText;
	private EditText heightEditText;
	private TextView resultTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		calculatorButton = (Button)findViewById(R.id.calculator);
		weightEditText = (EditText)findViewById(R.id.weight);
		heightEditText = (EditText)findViewById(R.id.height);
		resultTextView = (TextView)findViewById(R.id.result);
	}

	@Override
	protected void onStart() {
		super.onStart();
		registerEvent();
	}
	
	private void registerEvent() {
		calculatorButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!weightEditText.getText().toString().trim().equals("") && !heightEditText.getText().toString().trim().equals("") ) {
					double weight = 0;
					double height = 0;
					weight = Double.parseDouble(weightEditText.getText().toString());
					height = Double.parseDouble(heightEditText.getText().toString());
					StringBuffer sb = new StringBuffer();
					sb.append("---计算结果---\n");
					sb.append("您的BMI指数为：");
					double result = BMI(weight, height);
					sb.append(result);
					resultTextView.setText(sb.toString());
				}else if (weightEditText.getText().toString().trim().equals("") && !heightEditText.getText().toString().trim().equals("") ){
					showMessage("请输入体重！");
				}else if (heightEditText.getText().toString().trim().equals("") && !weightEditText.getText().toString().trim().equals("")) {
					showMessage("请输入体重！");
				}else {
					showMessage("请输入身高及体重");
				}
			}
			});
		}
	
	private double BMI(double weight, double height){
		double bmi;
		bmi = weight / (height * height) * 10000;
		BigDecimal b = new BigDecimal(bmi);
		bmi = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return bmi;
	}

	private void showMessage(String message)
	{
		AlertDialog alert = new AlertDialog.Builder(this).create();
		alert.setTitle("系统信息");
		alert.setMessage(message);
		alert.setButton("确定", new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int whichButton) {
				
				}
			});
		alert.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(Menu.NONE,1,Menu.NONE,"退出");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case 1:
			finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
	
