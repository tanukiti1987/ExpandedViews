package com.tanukiti1987.expandedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;

public class ExpandedHeightListView extends ListView {

    public ExpandedHeightListView(Context context) {
        this(context, null);
    }

    public ExpandedHeightListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExpandedHeightListView(Context context, AttributeSet attrs, int defStyle) {
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
