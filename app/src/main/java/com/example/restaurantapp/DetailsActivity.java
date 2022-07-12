package com.example.restaurantapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView myText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        myText2 = findViewById(R.id.myText2);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String data2 = bundle.getString("ingredients");
            myText2.setText(data2);
        }


        imageView = findViewById(R.id.myImageView2);
        int image = bundle.getInt("images");
        imageView.setImageResource(image);


    }
}
