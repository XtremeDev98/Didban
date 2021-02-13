package com.byagowi.didbanCal.view.preferences;

import android.content.Context;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceViewHolder;
import android.util.AttributeSet;

import com.byagowi.didbanCal.util.Utils;

import java.util.Set;

public class PrayerSelectPreference extends DialogPreference {
    Utils utils;

    public PrayerSelectPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        utils = Utils.getInstance(context);
    }

    public void setPrayers(Set<String> prayers) {
        final boolean wasBlocking = shouldDisableDependents();
        persistString(utils.setToCommaSeparated(prayers));
        final boolean isBlocking = shouldDisableDependents();
        if (isBlocking != wasBlocking) notifyDependencyChange(isBlocking);
    }

    public Set<String> getPrayers() {
        return utils.commaSeparatedToSet(getPersistedString(""));
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        utils.setFontAndShape(holder);
    }
}
