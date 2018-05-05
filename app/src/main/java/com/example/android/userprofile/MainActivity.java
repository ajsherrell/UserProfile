package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // initialize TextViews
    TextView nameText;
    TextView birthdayText;
    TextView countryText;

    // initialize ImageView
    ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach views to ids
        // texts
        nameText = findViewById(R.id.name);
        birthdayText = findViewById(R.id.birthday);
        countryText = findViewById(R.id.country);

        //image
        profileImage = findViewById(R.id.profile_picture);

        // set the text
        nameText.setText(R.string.name);
        birthdayText.setText(R.string.birthday);
        countryText.setText(R.string.country);

        // set the image -- jumper photo by Miguel Bruna - Unsplash
        // skeletor image by NeatoShop - Alienbiker23
        profileImage.setImageResource(R.drawable.skeletor);
    }
}
