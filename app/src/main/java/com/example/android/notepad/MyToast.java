package com.example.android.notepad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
//import android.support.constraint.ConstraintLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast extends Toast {


    View mview;
    TextView mtitle;
    TextView mtext;
    public MyToast(Context context) {
        super(context);
    }
    public MyToast(Context context,int bodyview_id,int title_id,int text_id) {
        super(context);
        mview=LayoutInflater.from(context).inflate(bodyview_id,null);
        setView(mview);
        mtitle=mview.findViewById(title_id);
        mtext=mview.findViewById(text_id);
        mtitle.setText("我是自定义Toast标题");
        mtext.setText("我是自定义Toast内容\n默认位置\n默认速度");
        setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
        setDuration(Toast.LENGTH_LONG);

    }
    public MyToast(Context context,int bodyview_id,int title_id,int text_id,int fast) {
        super(context);
        mview=LayoutInflater.from(context).inflate(bodyview_id,null);
        setView(mview);
        mtitle=mview.findViewById(title_id);
        mtext=mview.findViewById(text_id);
        mtitle.setText("我是自定义Toast标题");
        mtext.setText("我是自定义Toast内容\n默认位置\n默认速度");
        setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
        setDuration(Toast.LENGTH_SHORT);

    }
    public MyToast(Context context,MyToastData myToastData) {
        super(context);
        mview=LayoutInflater.from(context).inflate(myToastData.mbodyview_id,null);
        setView(mview);
        mtitle=mview.findViewById(myToastData.mtitle_id);
        mtext=mview.findViewById(myToastData.mtext_id);
        mtitle.setText("我是自定义Toast标题");
        mtext.setText("我是自定义Toast内容\n默认位置\n默认速度");
        setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
        setDuration(Toast.LENGTH_LONG);

    }
    public MyToast(Context context,MyToastData myToastData,int fast) {
        //值要带了int参数，就执行短提示，否则长提示
        super(context);
        mview=LayoutInflater.from(context).inflate(myToastData.mbodyview_id,null);
        setView(mview);
        mtitle=mview.findViewById(myToastData.mtitle_id);
        mtext=mview.findViewById(myToastData.mtext_id);
        mtitle.setText("我是自定义Toast标题");
        mtext.setText("我是自定义Toast内容\n默认位置\n默认速度");
        setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 20);
        setDuration(Toast.LENGTH_SHORT);

    }

    public MyToast setMText(String title,String text){
        mtitle.setText(title);
        mtext.setText(text);
        return this;
    }


    public void setMTitle(String title){
        mtitle.setText(title);

    }
    public void setMText(String text){

        mtext.setText(text);
    }


}
