package com.example.foodieshub2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {
   final static String DBNAME="myDataBase.db";
   final static int  DBVERSION=5;

    public DBhelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(
            "create table orders"+
                    "(id integer primary key autoincrement,"+
                    "name text,"+
                    "phone text," +
                    "price int,"+
                    "img int," +
                    "quantity,int"+
                    "description text,"+
                    "foodName text)"

            );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP table if exists orders");
     onCreate(db);
    }
    public boolean InsertOrder(String name,String phone,int price,int img,int quantity,String desc,String foodName){
        SQLiteDatabase database=getReadableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("img",img);
        values.put("quantity",quantity);
        values.put("desc",desc);
        values.put("foodName",foodName);
       long id= database.insert("orders",null,values);
       if(id<=0)
       {
           return false;
       }
       else
       {
           return true;
       }
    }
}
