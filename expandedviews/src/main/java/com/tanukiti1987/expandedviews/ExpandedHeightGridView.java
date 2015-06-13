package com.tanukiti1987.expandedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;

public class ExpandedHeightGridView extends GridView {

    public ExpandedHeightGridView(Context context) {
        this(context, null);
    }

    public ExpandedHeightGridView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExpandedHeightGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);

        ViewGroup.LayoutParams params = getLayoutParams();
        params.height = getMeasuredHeight();
    }

}
