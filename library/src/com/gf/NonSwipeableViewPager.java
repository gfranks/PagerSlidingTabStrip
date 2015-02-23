package com.gf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonSwipeableViewPager extends android.support.v4.view.ViewPager {

    private static final String TAG = "CustomViewPager";
    private boolean horizontalGestureEnabled;

    public NonSwipeableViewPager(Context context) {
        super(context);
        this.horizontalGestureEnabled = true;
    }

    public NonSwipeableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.horizontalGestureEnabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.horizontalGestureEnabled && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.horizontalGestureEnabled && super.onInterceptTouchEvent(event);
    }

    public void setHorizontalGestureEnabled(boolean enabled) {
        this.horizontalGestureEnabled = enabled;
    }

    public boolean isHorizontalGestureEnabled() {
        return horizontalGestureEnabled;
    }
}