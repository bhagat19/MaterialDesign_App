package com.example.xyzreader.data;

import android.content.Context;
import android.database.Cursor;

import java.io.Serializable;

/**
 * Created by amit on 22-08-2016.
 */
public class ArticleItem implements Serializable {
    int ID;
    String title;
    String date;
    String author;
    String thumb_url;
    String photo_url;
    int aspect_ratio;
    String body;

    public ArticleItem(Context context, int itemId){
        Cursor cursor = (Cursor) ArticleLoader.newInstanceForItemId(context, itemId);
        while(cursor.moveToNext()){
//            this.ID = cursor.
        }
    }



}
