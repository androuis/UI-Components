package com.andreibacalu.android.ui_components;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;

/**
 * Created by andreibacalu on 25/09/2017.
 */

public class AutoHidingTextView extends AppCompatTextView {
    public AutoHidingTextView(Context context) {
        super(context);
    }

    public AutoHidingTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoHidingTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        if (TextUtils.isEmpty(text)) {
            setVisibility(GONE);
        } else {
            setVisibility(VISIBLE);
        }
    }
}
