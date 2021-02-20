package com.didban.newcal;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import com.didban.newcal.service.ApplicationService;
import com.didban.newcal.util.UpdateUtils;
import com.didban.newcal.util.Utils;

/**
 * 1x1 widget provider, implementation is on {@code CalendarWidget}
 *
 * @author ebraminio
 */
public class Widget1x1 extends AppWidgetProvider {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Utils.getInstance(context).isServiceRunning(ApplicationService.class)) {
            context.startService(new Intent(context, ApplicationService.class));
        }
        UpdateUtils.getInstance(context).update(true);
    }
}
