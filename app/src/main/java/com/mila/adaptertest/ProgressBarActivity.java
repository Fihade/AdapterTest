package com.mila.adaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends AppCompatActivity implements View.OnClickListener {
    private ProgressBar progressBar;
    private Button add;
    private Button reduce;
    private Button reset;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_progress_bar);
        setProgressBarVisibility(true);
        setProgressBarIndeterminateVisibility(true);
        setProgress(100);
        init();
    }

    private void init() {
        progressBar = findViewById(R.id.progressBar2);
        add = findViewById(R.id.add);
        reduce = findViewById(R.id.reduce);
        reset = findViewById(R.id.reset);
        tv = findViewById(R.id.tv2);
        int first = progressBar.getProgress();
        int second = progressBar.getSecondaryProgress();
        int max = progressBar.getMax();
        tv.setText("first:"+(int)(progressBar.getProgress()/(float)max*100)+"%"+"Second:"+(int)(progressBar.getSecondaryProgress()/(float)max*100)+"%");
        add.setOnClickListener(this);
        reduce.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add:{
                 progressBar.incrementProgressBy(10);
                 progressBar.incrementSecondaryProgressBy(10);
                 break;
             }
            case R.id.reduce:{
                progressBar.incrementProgressBy(-10);
                progressBar.incrementSecondaryProgressBy(-10);
                 break;
             }
            case R.id.reset:{
                progressBar.setProgress(0);
                progressBar.setSecondaryProgress(10);
                 break;
             }

        }
        tv.setText("first:"+(int)(progressBar.getProgress()/(float)progressBar.getMax()*100)+"%"+"Second:"+(int)(progressBar.getSecondaryProgress()/(float)progressBar.getMax()*100)+"%");

    }
}
