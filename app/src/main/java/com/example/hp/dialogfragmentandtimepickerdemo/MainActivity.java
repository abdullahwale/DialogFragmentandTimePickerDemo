package com.example.hp.dialogfragmentandtimepickerdemo;

import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    Button btnClick;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=(Button) findViewById(R.id.btnSelectTime);
        tvDisplay=(TextView) findViewById(R.id.tvShowTime);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment time=new TimePickerClass();
                time.show(getSupportFragmentManager(),"Time Picker ");
            }
        });
    }
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        tvDisplay.setText("Hour :" + i + " Minuts: " + i1);
    }
}
