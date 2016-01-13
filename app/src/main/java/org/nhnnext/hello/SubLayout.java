package org.nhnnext.hello;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by eunjooim on 16. 1. 13.
 */
public class SubLayout extends LinearLayout{

    // code에서 넣음
    public SubLayout(Context context) {
        super(context);
        init(context);
    }

    // xml 속성을 받아야 하므로
    public SubLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // true라고 정하면 바로 붙임
        inflater.inflate(R.layout.sub_layout, this, true);
    }
}
