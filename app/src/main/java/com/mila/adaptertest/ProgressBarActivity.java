package com.mila.adaptertest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressBarActivity extends AppCompatActivity implements View.OnClickListener {
    private ProgressBar progressBar;
    private Button add;
    private Button reduce;
    private Button reset;
    private TextView tv;
    private ProgressDialog prodialog;
    private Button show;

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
        show = findViewById(R.id.show);
        int first = progressBar.getProgress();
        int second = progressBar.getSecondaryProgress();
        int max = progressBar.getMax();
        tv.setText("first:"+(int)(progressBar.getProgress()/(float)max*100)+"%"+"Second:"+(int)(progressBar.getSecondaryProgress()/(float)max*100)+"%");
        add.setOnClickListener(this);
        reduce.setOnClickListener(this);
        reset.setOnClickListener(this);
        show.setOnClickListener(this);
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
            case R.id.show:{
                prodialog = new ProgressDialog(this);
                //设置显示风格
                prodialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                prodialog.setTitle("Believe in Progress");
                prodialog.setMessage("Welcome!!");
                prodialog.setIcon(R.drawable.ic_launcher_background);
                //设定进度条属性
                prodialog.setMax(100);
                prodialog.incrementProgressBy(50);
                //是否精确显示
                prodialog.setIndeterminate(false);
                //添加按钮
                prodialog.setButton(DialogInterface.BUTTON_POSITIVE, "true", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ProgressBarActivity.this,"dab us",Toast.LENGTH_SHORT).show();
                    }
                });
                prodialog.setCancelable(true);
                prodialog.show();
                break;
            }

        }
        tv.setText("first:"+(int)(progressBar.getProgress()/(float)progressBar.getMax()*100)+"%"+"Second:"+(int)(progressBar.getSecondaryProgress()/(float)progressBar.getMax()*100)+"%");

    }
}
