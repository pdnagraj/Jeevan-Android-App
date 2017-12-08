package com.example.partharya.bump;

import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        var = SavedProfiles.index;
        Profile p = SavedProfiles.profileList.get(var);

        TextView name = (TextView)findViewById(R.id.textViewName);
        TextView number = (TextView)findViewById(R.id.textViewNumber);
        TextView facebook = (TextView)findViewById(R.id.textViewFacebook);
        TextView snapchat = (TextView)findViewById(R.id.textViewSnapchat);
        TextView linkedin = (TextView)findViewById(R.id.textViewLinkedIn);
        name.setText(p.getName());
        number.setText(p.getNumber());
        facebook.setText(p.getFacebook());
        snapchat.setText(p.getSnapchat());
        linkedin.setText(p.getLinkedin());
    }
}
