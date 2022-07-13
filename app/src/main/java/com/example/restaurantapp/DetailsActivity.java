package com.example.restaurantapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView myText2,myText3;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        button1=findViewById(R.id.button1);
        myText2 = findViewById(R.id.myText2);
        myText3 = findViewById(R.id.myText3);
        Bundle bundle = getIntent().getExtras();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        if(bundle!=null){
            String data2 = bundle.getString("ingredients");
            String data3 = bundle.getString("price");
            myText2.setText(data2);
            myText3.setText(data3);
        }


        imageView = findViewById(R.id.myImageView2);
        int image = bundle.getInt("images");
        imageView.setImageResource(image);


    }
}
