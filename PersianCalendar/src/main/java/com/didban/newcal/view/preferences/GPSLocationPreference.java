package com.didban.newcal.view.preferences;

import android.content.Context;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceViewHolder;
import android.util.AttributeSet;

import com.didban.newcal.util.Utils;

/**
 * Created by ebrahim on 3/26/16.
 */
public class GPSLocationPreference extends DialogPreference {

    public GPSLocationPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        Utils.getInstance(getContext()).setFontAndShape(holder);
    }

}
