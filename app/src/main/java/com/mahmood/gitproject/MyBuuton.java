package com.mahmood.gitproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class MyBuuton extends Button {

    public MyBuuton(Context context) {
        super(context);

    }

    public MyBuuton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tpearr= context.obtainStyledAttributes(attrs,R.styleable.MyBuuton);
        setText(""+tpearr.getString(R.styleable.MyBuuton_Count));

    }

    public MyBuuton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyBuuton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
