package com.byagowi.didbanCal;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import com.byagowi.didbanCal.service.ApplicationService;
import com.byagowi.didbanCal.util.UpdateUtils;
import com.byagowi.didbanCal.util.Utils;

public class Widget2x2 extends AppWidgetProvider {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Utils.getInstance(context).isServiceRunning(ApplicationService.class)) {
            context.startService(new Intent(context, ApplicationService.class));
        }
        UpdateUtils.getInstance(context).update(true);
    }
}