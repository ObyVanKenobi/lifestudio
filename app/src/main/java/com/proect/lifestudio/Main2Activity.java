package com.proect.lifestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import static android.location.Location.FORMAT_DEGREES;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView textView_name;
    TextView textView_www;
    TextView textView_phone;
    TextView textView_description;
    TextView textView_map;



    String URL1 = "http://megakohz.bget.ru/test_task/test.php?id=";
    Intent intent;
    Company []company;
    Gson gson = new Gson();
    String id;
    String json;
    String mapLatLog;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        id = intent.getStringExtra("id");

        CatTask at = new CatTask();
        at.execute();

        imageView = findViewById(R.id.image);
        textView_name = findViewById(R.id.text_name);
        textView_description = findViewById(R.id.text_description);
        textView_phone = findViewById(R.id.text_phone);
        textView_www = findViewById(R.id.text_www);
        textView_map = findViewById(R.id.text_map);








    }

    class CatTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {


           try

            {
                URL url = new URL(URL1+id);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = connection.getInputStream();
                Scanner scanner = new Scanner(inputStream);
                json = scanner.nextLine();
                company = gson.fromJson(json, Company[].class);
                mapLatLog = "geo:" + company[0].lat + "," +company[0].lon;


            }catch (Exception e){



            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);


            Picasso.get().load("http://megakohz.bget.ru/test_task/" + company[0].img).into(imageView);

           textView_name.setText(company[0].name);
           textView_description.setText(company[0].description);
           textView_phone.setText(company[0].phone);
           textView_www.setText(company[0].www);
           textView_map.setText(mapLatLog);


        }
    }


    public void onClick_map(View view) {
        String geoUriString = mapLatLog;
        Uri geoUri = Uri.parse(geoUriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }



    public class Company {

        public String id;
        public String name;
        public String img;
        public String description;
        public String lat;
        public String lon;
        public String www;
        public String phone;

        @Override
        public String toString() {
            return "[ id: " + id + ", name: " + name +  ", img: " + img + ", description: " + description + ", lat: " + lat + ", lon: " + lon + ", www: " + www + ", phone: "+ phone+" ]";
        }
    }

}
