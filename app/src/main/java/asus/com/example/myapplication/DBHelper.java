package asus.com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATEBASE_VERSION = 1;
    public static final String DATEBASE_NAME = "writersDb";
    public static final String TABLE_WRITE = "writers";

    public static final String KEY_WRITE_1 = "write_1";
    public static final String KEY_WRITE_2 = "write_2";
    public static final String KEY_WRITE_3 = "write_3";
    public static final String KEY_WRITE_4 = "write_4";
    public static final String KEY_WRITE_5 = "write_5";
    public static final String KEY_WRITE_6 = "write_6";
    public static final String KEY_WRITE_7 = "write_7";
    public static final String KEY_WRITE_8 = "write_8";
    public static final String KEY_WRITE_9 = "write_9";
    public static final String KEY_WRITE_10 = "write_10";

    public DBHelper(@Nullable Context context) {
        super(context, DATEBASE_NAME, null, DATEBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_WRITE + "(" + KEY_WRITE_1 + " text," + KEY_WRITE_2 + " text,"
                + KEY_WRITE_3 + " text," + KEY_WRITE_4 + " text," + KEY_WRITE_5 + " text,"
                + KEY_WRITE_6 + " text," + KEY_WRITE_7 + " text," + KEY_WRITE_8 + " text,"
                + KEY_WRITE_9 + " text," + KEY_WRITE_10 + " text " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists " + TABLE_WRITE);

        onCreate(db);

    }
}
