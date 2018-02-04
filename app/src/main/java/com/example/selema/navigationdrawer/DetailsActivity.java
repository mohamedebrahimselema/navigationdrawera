package com.example.selema.navigationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2,Toast.LENGTH_LONG).show();

        TextView t1 = (TextView)findViewById(R.id.textV);
        ImageView image= (ImageView) findViewById(R.id.imageView2);
        t1.setText(value1.toString());
        Picasso.with(getBaseContext()).load("http://image.tmdb.org/t/p/w185/" + value2).into(image);


    }
}
