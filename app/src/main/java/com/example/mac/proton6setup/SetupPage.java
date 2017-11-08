package com.example.mac.proton6setup;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SetupPage extends Activity {
    Button update_edit_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_page);

        update_edit_url = (Button) findViewById(R.id.update_edit_url);
        update_edit_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.example.mac.proton6web", "com.example.mac.proton6web.SetupAppdata"));
                    SetupPage.this.startActivity(intent);
                    Toast.makeText(SetupPage.this.getApplicationContext(), "App Url Requested!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
