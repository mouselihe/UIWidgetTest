package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private ProgressBar progressBar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        imageView = findViewById(R.id.image_view);
        progressBar = findViewById(R.id.progress_bar);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                // 添加逻辑代码
//                imageView.setImageResource(R.drawable.img_2);
//                if (progressDialog.getVisibility() == View.GONE){
//                    progressDialog.setVisibility(View.VISIBLE);
//                }else{
//                    progressDialog.setVisibility(View.GONE);
//                }
//                int progress =progressDialog.getProgress();
//                progress=  progress + 10;
//                progressDialog.setProgress(progress);

//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("这是一个警告对话框");
//                dialog.setMessage("this something important data");
//
//                dialog.setCancelable(false); //cancelable 设置是否可取消
//
//                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() { // 设置警告对话框的确定按钮监听
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//
//                dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {// 取消监听按钮
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//
//                dialog.show();

                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle("this is ProgressDialog");
                progressDialog.setMessage("Loading");
                progressDialog.setCancelable(true);// false 是无法通过返回键 取消掉的  
                progressDialog.show();

//                注意   当数据加载完的时候，调用dismiss 方法来关闭对话框，否则ProgressDialog将会一直存在。
//                progressDialog.dismiss();

                break;
            default:
                break;
        }
    }
}
