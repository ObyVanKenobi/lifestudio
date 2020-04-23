package com.proect.lifestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String json = "empty";
    Gson gson = new Gson();
    Intent intent;
    Person[] persons;


    TextView textViewI_id_1;
    TextView textViewI_id_2;
    TextView textViewI_id_3;
    TextView textViewI_id_4;
    TextView textViewI_id_5;
    TextView textViewI_id_6;
    TextView textViewI_id_7;
    TextView textViewI_id_8;
    TextView textViewI_id_9;
    TextView textViewI_id_10;
    TextView textViewI_id_11;
    TextView textViewI_id_12;
    TextView textViewI_id_13;
    TextView textViewI_id_14;
    TextView textViewI_id_15;

    ImageView imageView_id_1;
    ImageView imageView_id_2;
    ImageView imageView_id_3;
    ImageView imageView_id_4;
    ImageView imageView_id_5;
    ImageView imageView_id_6;
    ImageView imageView_id_7;
    ImageView imageView_id_8;
    ImageView imageView_id_9;
    ImageView imageView_id_10;
    ImageView imageView_id_11;
    ImageView imageView_id_12;
    ImageView imageView_id_13;
    ImageView imageView_id_14;
    ImageView imageView_id_15;

    Button button_id_1;
    Button button_id_2;
    Button button_id_3;
    Button button_id_4;
    Button button_id_5;
    Button button_id_6;
    Button button_id_7;
    Button button_id_8;
    Button button_id_9;
    Button button_id_10;
    Button button_id_11;
    Button button_id_12;
    Button button_id_13;
    Button button_id_14;
    Button button_id_15;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CatTask catTask = new CatTask();
        catTask.execute();

        textViewI_id_1 = findViewById(R.id.id_1);
        textViewI_id_2 = findViewById(R.id.id_2);
        textViewI_id_3 = findViewById(R.id.id_3);
        textViewI_id_4 = findViewById(R.id.id_4);
        textViewI_id_5 = findViewById(R.id.id_5);
        textViewI_id_6 = findViewById(R.id.id_6);
        textViewI_id_7 = findViewById(R.id.id_7);
        textViewI_id_8 = findViewById(R.id.id_8);
        textViewI_id_9 = findViewById(R.id.id_9);
        textViewI_id_10 = findViewById(R.id.id_10);
        textViewI_id_11 = findViewById(R.id.id_11);
        textViewI_id_12 = findViewById(R.id.id_12);
        textViewI_id_13 = findViewById(R.id.id_13);
        textViewI_id_14 = findViewById(R.id.id_14);
        textViewI_id_15 = findViewById(R.id.id_15);

        imageView_id_1 = findViewById(R.id.image_id_1);
        imageView_id_2 = findViewById(R.id.image_id_2);
        imageView_id_3 = findViewById(R.id.image_id_3);
        imageView_id_4 = findViewById(R.id.image_id_4);
        imageView_id_5 = findViewById(R.id.image_id_5);
        imageView_id_6 = findViewById(R.id.image_id_6);
        imageView_id_7 = findViewById(R.id.image_id_7);
        imageView_id_8 = findViewById(R.id.image_id_8);
        imageView_id_9 = findViewById(R.id.image_id_9);
        imageView_id_10 = findViewById(R.id.image_id_10);
        imageView_id_11 = findViewById(R.id.image_id_11);
        imageView_id_12 = findViewById(R.id.image_id_12);
        imageView_id_13 = findViewById(R.id.image_id_13);
        imageView_id_14 = findViewById(R.id.image_id_14);
        imageView_id_15 = findViewById(R.id.image_id_15);


        button_id_1 =  findViewById(R.id.bottom_id_1);
        button_id_2 =  findViewById(R.id.bottom_id_2);
        button_id_3 =  findViewById(R.id.bottom_id_3);
        button_id_4 =  findViewById(R.id.bottom_id_4);
        button_id_5 =  findViewById(R.id.bottom_id_5);
        button_id_6 =  findViewById(R.id.bottom_id_6);
        button_id_7 =  findViewById(R.id.bottom_id_7);
        button_id_8 =  findViewById(R.id.bottom_id_8);
        button_id_9 =  findViewById(R.id.bottom_id_9);
        button_id_10 =  findViewById(R.id.bottom_id_10);
        button_id_11 =  findViewById(R.id.bottom_id_11);
        button_id_12 =  findViewById(R.id.bottom_id_12);
        button_id_13 =  findViewById(R.id.bottom_id_13);
        button_id_14 =  findViewById(R.id.bottom_id_14);
        button_id_15 =  findViewById(R.id.bottom_id_15);

        button_id_1.setOnClickListener(this);
        button_id_2.setOnClickListener(this);
        button_id_3.setOnClickListener(this);
        button_id_4.setOnClickListener(this);
        button_id_5.setOnClickListener(this);
        button_id_6.setOnClickListener(this);
        button_id_7.setOnClickListener(this);
        button_id_8.setOnClickListener(this);
        button_id_9.setOnClickListener(this);
        button_id_10.setOnClickListener(this);
        button_id_11.setOnClickListener(this);
        button_id_12.setOnClickListener(this);
        button_id_13.setOnClickListener(this);
        button_id_14.setOnClickListener(this);
        button_id_15.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.bottom_id_1:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[0].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_2:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[1].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_3:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[2].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_4:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[3].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_5:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[4].id);
                startActivity(intent);
                break;

          /* case R.id.bottom_id_6:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[5].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_7:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[6].id);
                startActivity(intent);
                break;*/

            case R.id.bottom_id_8:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[7].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_9:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[8].id);
                startActivity(intent);
                break;


            case R.id.bottom_id_10:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[9].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_11:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[10].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_12:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[11].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_13:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[12].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_14:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[13].id);
                startActivity(intent);
                break;

            case R.id.bottom_id_15:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("id", persons[14].id);
                startActivity(intent);
                break;

            default:
                break;
        }

    }

    class CatTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {


            try

            {
                URL url = new URL("http://megakohz.bget.ru/test_task/test.php");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = connection.getInputStream();
                Scanner scanner = new Scanner(inputStream);
                 json = scanner.nextLine();
                 persons = gson.fromJson(json, Person[].class);

            }catch (Exception e){


            }

            return null;

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[0].img).into(imageView_id_1 );
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[1].img).into(imageView_id_2);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[2].img).into(imageView_id_3);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[3].img).into(imageView_id_4);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[4].img).into(imageView_id_5);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[5].img).into(imageView_id_6);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[6].img).into(imageView_id_7);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[7].img).into(imageView_id_8);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[8].img).into(imageView_id_9);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[9].img).into(imageView_id_10);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[10].img).into(imageView_id_11);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[11].img).into(imageView_id_12);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[12].img).into(imageView_id_13);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[13].img).into(imageView_id_14);
            Picasso.get().load("http://megakohz.bget.ru/test_task/"+persons[14].img).into(imageView_id_15);

            textViewI_id_1.setText(persons[0].name);
            textViewI_id_2.setText(persons[1].name);
            textViewI_id_3.setText(persons[2].name);
            textViewI_id_4.setText(persons[3].name);
            textViewI_id_5.setText(persons[4].name);
            textViewI_id_6.setText(persons[5].name);
            textViewI_id_7.setText(persons[6].name);
            textViewI_id_8.setText(persons[7].name);
            textViewI_id_9.setText(persons[8].name);
            textViewI_id_10.setText(persons[9].name);
            textViewI_id_11.setText(persons[10].name);
            textViewI_id_12.setText(persons[11].name);
            textViewI_id_13.setText(persons[12].name);
            textViewI_id_14.setText(persons[13].name);
            textViewI_id_15.setText(persons[14].name);
        }
    }



    public class Person {
        public String id;
        public String name;
        public String img;

        @Override
        public String toString() {
            return "[ id: " + id + ", name: " + name +  ", img: " + img +" ]";
        }
    }

}
