package com.jaxonian.canvasintoview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jaxonian on 7/10/15.
 */


public class MyView extends View {
    public MyView(Context cxt, AttributeSet attrs) {
        super(cxt, attrs);
        setMinimumHeight(100);
        setMinimumWidth(100);

    }

    @Override
    protected void onDraw(Canvas cv) {
        cv.drawColor(Color.rgb(255,125,0));
        Paint p = new Paint();
        Paint t = new Paint();
        p.setColor(Color.GREEN);
        t.setColor(Color.RED);
        p.setStrokeWidth(10);
        cv.drawLine(20, 0, 20, cv.getHeight()/2, p);
        //cv.drawRect(200, 20, 100, 100, t);
    }
}