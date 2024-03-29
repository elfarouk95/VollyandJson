package com.zedy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        textView = findViewById(R.id.Txt);

    }

    Response.Listener<String> listener = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {

            ArrayList<Article> articles = JsonRead.Read(response);
            //  Toast.makeText(MainActivity.this, articles.get(0).getAuthor(), Toast.LENGTH_SHORT).show();
            textView.setText(articles.get(1).getDescription());

        }
    };

    Response.ErrorListener errorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

        }
    };

    private void getData() {

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://newsapi.org/v2/top-headlines?country=eg&apiKey=d88d2b3368a44b0e969b1c37e4fd9196";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, listener, errorListener);
        queue.add(stringRequest);

    }


}
