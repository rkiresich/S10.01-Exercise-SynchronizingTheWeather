package com.example.android.sunshine.sync;

    // TODO (9) Create a class called SunshineSyncUtils
    //COMPLETE
    //  TODO (10) Create a public static void method called startImmediateSync
    //COMPLETE
    //  TODO (11) Within that method, start the SunshineSyncIntentService
    //COMPLETE

import android.content.Context;
import android.content.Intent;

public class SunshineSyncUtils {

    public static void startImmediateSync(final Context context){
        Intent syncImmediatelyIntent = new Intent(context, SunshineSyncIntentService.class);
        context.startService(syncImmediatelyIntent);
    }

}