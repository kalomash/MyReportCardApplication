package com.example.admin.myreportcardapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.name;

/**
 * Created by Admin on 8/25/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


        private static  final int DATABASE_VERSION =1;
        private static  final String DATABASE_NAME = "contacts.db";
        private static final String TABLE_NAME = "contacts";
        private static final  String COLUMS_ID= "id";
        private static  final String COLUMS_NAME= "name";
        private static  final String COLUMS_USERNAME= "username";
        private static final  String COLUMS_PASSWORD= "password";
    private static final  String CONFIRMCOLUMS_PASSWORD= "confirmpassword";
        private static final String COLUMS_GENDER= "gender";
    SQLiteDatabase sqLiteDatabase;

    public static final String TABLE_CREATE ="create table contacts (id integer primary key not null ," +
            " name text not null, username text not null , password text not null ,gender text not null );";


    public DatabaseHelper(Context context)
    {
        super(context,TABLE_NAME, null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        this.sqLiteDatabase = sqLiteDatabase;
    }
public void insertDetails(Details d)
{
    sqLiteDatabase = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(COLUMS_ID, d.getId());
    values.put(COLUMS_NAME, d.getName());
    values.put(COLUMS_USERNAME, d.getUsername());
    values.put(COLUMS_PASSWORD, d.getPassword());
    values.put(CONFIRMCOLUMS_PASSWORD, d.getConfrimpassword());
    sqLiteDatabase.insert(TABLE_NAME,null,values);
}

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String queary = "DROP TABLE IF EXISTS"+ TABLE_NAME;
        sqLiteDatabase.execSQL(queary);
        this.onCreate(sqLiteDatabase);
    }
}
