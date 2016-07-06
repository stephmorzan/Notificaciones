package com.example.eq.notificaciones;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    EditText ed1,ed2,ed3;

    //fuente: http://www.tutorialspoint.com/android/android_push_notification.htm

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        Button b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tittle=ed1.getText().toString().trim();
                String subject=ed2.getText().toString().trim();
                String body=ed3.getText().toString().trim();

                NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify=new Notification(R.drawable.common_full_open_on_phone,tittle,System.currentTimeMillis());
                PendingIntent pending= PendingIntent.getActivity(getApplicationContext(), 0, new Intent(), 0);

                //notify.setLatestEventInfo(getApplicationContext(),subject,body,pending);
                notif.notify(0, notify);

            }
        });
    }



}
