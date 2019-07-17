package com.zedy.myapplication;

import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonRead {

    public static ArrayList<Article> Read(String j) {

        ArrayList<Article> articles = new ArrayList<>();

        try {

            JSONObject object = new JSONObject(j);
            JSONArray jsonArray = object.getJSONArray("articles");

            for (int i = 0; i < jsonArray.length(); i++) {
                  JSONObject jsonObject = jsonArray.getJSONObject(i);

                  String Author = jsonObject.getString("author");
                  String Title= jsonObject.getString("title");
                  String Description= jsonObject.getString("description");
                  String UrlToImage= jsonObject.getString("urlToImage");
                  String PublishedAt = jsonObject.getString("publishedAt");
                  String content = jsonObject.getString("content");

                  Article a = new Article(Author,Title,Description,UrlToImage,PublishedAt,content);

                  articles.add(a);

            }


        } catch (Exception e) {

        }

        return articles;
    }
}
