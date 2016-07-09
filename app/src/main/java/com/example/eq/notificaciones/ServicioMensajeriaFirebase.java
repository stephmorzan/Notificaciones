package com.example.eq.notificaciones;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by sodm on 09/07/2016.
 */
public class ServicioMensajeriaFirebase extends FirebaseMessagingService{

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e("Notificacion_Firebase", remoteMessage.getNotification().getBody());
    }
}
