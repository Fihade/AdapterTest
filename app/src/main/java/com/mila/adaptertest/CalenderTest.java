package com.mila.adaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class CalenderTest extends AppCompatActivity {
    private TimePicker timerPicker;
    private DatePicker datePicker;
    private Calendar cal;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_test);
        //获取一个日历对象
        cal = Calendar.getInstance();
        //获取年月日时分秒的信息
        year = cal.get(Calendar.DAY_OF_YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
    }
}
