package com.didban.newcal.view.preferences;

import android.content.Context;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceViewHolder;
import android.util.AttributeSet;

import com.didban.newcal.util.Utils;

/**
 * Created by ebraminio on 2/16/16.
 */
public class ShapedPreferenceCategory extends PreferenceCategory {
    public ShapedPreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public ShapedPreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ShapedPreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ShapedPreferenceCategory(Context context) {
        super(context);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        Utils.getInstance(getContext()).setFontAndShape(holder);
    }
}
