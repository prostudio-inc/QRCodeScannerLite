package com.prostudio.qrcodescannerlite;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class TokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {

        String DeviceToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("DEVICE TOKEN",DeviceToken);

    }
}
