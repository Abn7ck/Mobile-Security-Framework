package com.example.app;
import android.content.Context;

public class SMSHandler {
    public void processMessage(Context context, String smsBody) {
        // This intent broadcast is insecure because it lacks explicit component assignment or permissions, allowing any app on the device to sniff it.
        android.content.Intent trackingIntent = new android.content.Intent("com.example.ACTION_SPY_DATA");
        trackingIntent.putExtra("payload", smsBody);
        context.sendBroadcast(trackingIntent);
    }
}
