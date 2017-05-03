package br.com.httpfluidobjects.myapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class list extends Activity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        SQLiteDatabase db;
        db = myDBhelper.getInstance(getApplicationContext()).getWritableDatabase();
        //getJSON("http://timacagro.develop.fluidobjects.com/get_all_clients.php");
        ArrayList<String> clientes = getNamesFromDB(db);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, clientes);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }


    public ArrayList<String> getNamesFromDB(SQLiteDatabase db) {

        final String TABLE_NAME = "visitantes";

        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(selectQuery, null);
        ArrayList<String> data = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                data.add(cursor.getString(cursor.getColumnIndex("name")));
                //data.add(" : ");
                //data.add(cursor.getString(cursor.getColumnIndex("ATC")));
            } while (cursor.moveToNext());
        }
        else{
            TextView semVisitantes = (TextView) findViewById(R.id.textView);
            semVisitantes.setText("Nenhum visitante foi registrado!!!");
        }
        cursor.close();
        return data;

    }
}

