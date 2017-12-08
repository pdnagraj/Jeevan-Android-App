package com.example.partharya.bump;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Settings extends AppCompatActivity {
    
    private Button button;
    private EditText name, number, facebook, snapchat, linkedIn;

    //settings for home
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final Context context = this; //this is the context
        name = (EditText) this.findViewById(R.id.editText);
        number = (EditText) this.findViewById(R.id.editText2);
        facebook = (EditText) this.findViewById(R.id.editText3);
        snapchat = (EditText) this.findViewById(R.id.editText4);
        linkedIn = (EditText) this.findViewById(R.id.editText5);

        final CheckBox cbNumber = (CheckBox)findViewById(R.id.checkBoxNumber);
        final CheckBox cbFacebook = (CheckBox)findViewById(R.id.checkBoxFacebook);
        final CheckBox cbSnapchat = (CheckBox)findViewById(R.id.checkBoxSnapchat);
        final CheckBox cbLinkedIn = (CheckBox)findViewById(R.id.checkBoxLinkedIn);

        button = (Button) this.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text2Qr = "Name: "+ name.getText().toString() + "/";

                if(cbNumber.isChecked()){
                    text2Qr = text2Qr + "Number: " + number.getText().toString() + "/";
                }
                else{
                    text2Qr = text2Qr + "Number:/";
                }
                if(cbFacebook.isChecked()){
                    text2Qr = text2Qr + "Facebook: " + facebook.getText().toString() + "/";
                }
                else{
                    text2Qr = text2Qr + "Facebook:/";
                }

                if(cbSnapchat.isChecked()){
                    text2Qr = text2Qr + "Snapchat: " + snapchat.getText().toString() + "/";
                }
                else{
                    text2Qr = text2Qr + "Snapchat:/";
                }

                if(cbLinkedIn.isChecked()){
                    text2Qr = text2Qr + "LinkedIn: " + linkedIn.getText().toString() + "/";
                }
                else{
                    text2Qr = text2Qr + "LinkedIn:/";
                }

                Home.information = text2Qr;

                try {
                    FileOutputStream fOut = openFileOutput("myprofile",MODE_PRIVATE);
                    fOut.write(text2Qr.getBytes());
                    fOut.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                switchActivity();

                }
        });
    }

    private void switchActivity(){
        startActivity(new Intent(this, MainActivity.class));
    }



}
