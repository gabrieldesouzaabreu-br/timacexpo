package br.com.httpfluidobjects.myapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String NAME = "name";
    SQLiteDatabase db;
    AutoCompleteTextView visitor_name;
    ArrayList<String> namesList;
    ArrayAdapter adapter;
    Boolean selectedClient = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mainToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);

        db = myDBhelper.getInstance(getApplicationContext()).getWritableDatabase();

        namesList = getNamesFromDB();
        visitor_name = (AutoCompleteTextView) findViewById(R.id.visitor_name);
        final TextView atcTextView = (TextView) findViewById(R.id.atcTextView);


        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,namesList);

        visitor_name.setThreshold(1);
        visitor_name.setAdapter(adapter);

        visitor_name.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view = visitor_name.findFocus();
                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(view.getWindowToken(), 0);
                String client = visitor_name.getText().toString();
                atcTextView.setText("ATC: " + getATC(client));
                selectedClient = true;
                //Toast.makeText(MainActivity.this, (int) id, Toast.LENGTH_SHORT).show();

            }
        });


    }

    public String getATC(String client)
    {
        String selectQuery = "SELECT atc FROM client_name where name='"+client+"'";
        Cursor c = db.rawQuery(selectQuery, null);
        String atc = null;
        if (c.moveToFirst()) {
            atc = c.getString(c.getColumnIndex("ATC"));
        }
        c.close();

        return atc;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.import_db:
                import_db();
                return true;
            case R.id.export_db:
                try {
                    export_db();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return true;
            case R.id.list:
                list_db();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void list_db()
    {
        Intent intent = new Intent(this, list.class);
        startActivity(intent);
    }

    public void import_db()
    {
        getJSON("http://timacagro.cloud.fluidobjects.com/get_all_clients.php");
    }

    public void export_db() throws JSONException {
        Cursor cursor = getAllData();  //cursor hold all your data

        if(cursor.moveToFirst()) {
            JSONObject jobj ;
            JSONArray jsonArray = new JSONArray();
            do {
                jobj = new JSONObject();
                jobj.put("name", cursor.getString(cursor.getColumnIndex("name")));
                jobj.put("atc", cursor.getString(cursor.getColumnIndex("atc")));
                jobj.put("phone", cursor.getInt(cursor.getColumnIndex("phone")));
                jobj.put("city", cursor.getString(cursor.getColumnIndex("city")));
                jobj.put("culture", cursor.getString(cursor.getColumnIndex("culture")));
                jobj.put("channel", cursor.getString(cursor.getColumnIndex("channel")));
                jobj.put("size", cursor.getInt(cursor.getColumnIndex("size")));
                jobj.put("cpf", cursor.getInt(cursor.getColumnIndex("cpf")));
                jobj.put("srv", cursor.getString(cursor.getColumnIndex("srv")));
                jobj.put("date", cursor.getString(cursor.getColumnIndex("date")));
                jobj.put("tablet", cursor.getString(cursor.getColumnIndex("tablet")));
                jobj.put("client", cursor.getInt(cursor.getColumnIndex("client")));
                jsonArray.put(jobj);
            }
            while (cursor.moveToNext());

            jobj = new JSONObject();
            jobj.put("data", jsonArray);

            String data = jobj.toString();
            sendJSON("http://timacagro.cloud.fluidobjects.com/receive_clients.php", data);
        }
    }

    public Cursor getAllData() {
        String selectQuery = "Select * from visitantes";
        Cursor cursor = db.rawQuery(selectQuery, null);
        return cursor;
    }

    public void showDB(View view){
        String selectQuery = "SELECT * FROM client_name where name='Jair Sulzbach'";
        String message = ":-/";
        Cursor c = db.rawQuery(selectQuery, null);
        if (c.moveToFirst()) {
            message = c.getString(c.getColumnIndex("name"));
        }
        c.close();

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }


    public void newClient(View view) {
        // Do something in response to button
        EditText editText = (EditText) findViewById(R.id.visitor_name);
        String message = editText.getText().toString();
        if (!message.equals("")) {
            Intent intent = new Intent(this, NewClientFormActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }

    public void oldClient(View view) {

        if(selectedClient == true) {
            selectedClient = false;
            EditText editText = (EditText) findViewById(R.id.visitor_name);
            String name = editText.getText().toString();

            TextView atcTV = (TextView) findViewById(R.id.atcTextView);
            String atc = atcTV.getText().toString();

            Date d = new Date();
            String model = Build.SERIAL;

            ContentValues values = new ContentValues();
            values.put("name", name);
            values.put("atc", atc);
            values.put("phone", 0);
            values.put("city", "");
            values.put("size", 0);
            values.put("cpf", 0);
            values.put("culture ", "");
            values.put("channel", "");
            values.put("srv", "");
            values.put("tablet", model);
            values.put("date", String.valueOf(d));
            values.put("client", true);
            db.insert("visitantes", "name", values);
            Toast.makeText(MainActivity.this, "Registrada a visita de " + name, Toast.LENGTH_SHORT).show();
            AutoCompleteTextView txtView = (AutoCompleteTextView) findViewById(R.id.visitor_name);
            txtView.setText("");
            TextView atcTextView = (TextView) findViewById(R.id.atcTextView);
            atcTextView.setText("");
        }
    }

    public ArrayList<String> getNamesFromDB() {

        final String TABLE_NAME = "client_name";

        String selectQuery = "SELECT name FROM " + TABLE_NAME;
        Cursor cursor      = db.rawQuery(selectQuery, null);
        ArrayList<String> data      = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                data.add(cursor.getString(cursor.getColumnIndex("name")));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return data;


    }

    public void putNamesInDB(ArrayList<db_fields> fieldsArray)
    {
        final String TABLE_NAME = "client_name";
        ContentValues values = new ContentValues();
        int i;
        for(i=0; i < fieldsArray.size(); i++)
        {
            values.put(NAME, fieldsArray.get(i).getName());
            values.put("ATC", fieldsArray.get(i).getATC());
            db.insert(TABLE_NAME, NAME, values);
        }

        int x = i;
        db.close();

    }


    private void getJSON(String url)  {
        class GetJSON extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this, "Por favor aguarde...",null,true,false);
              //  Activity ab = null;
              //  ab.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
            }

            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];

                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;

                    while((json = bufferedReader.readLine())!= null){
                        sb.append(json+"\n");
                    }
                    sb.append("");
                    //Log.d("TAG", sb.toString().trim());
                    String s = sb.toString().trim();
                    ArrayList<db_fields> fieldsArray = new ArrayList<db_fields>();
                    fieldsArray = parseJSON.Main(s);


                    putNamesInDB(fieldsArray);
                    namesList = getNamesFromDB();

                    return s;
                    //String x =  String.valueOf(i);
                    //return x.toString().trim();

                }catch(Exception e){
                    return null;
                }

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                finish();
                //Intent intent = new Intent(MainActivity.this, list.class);
                //startActivity(intent);
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);


                //Log.d("TAG", String.valueOf(NamesArray));
                //Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute(url);

    }


    private void sendJSON(String url, final String data)  {
        class SendJSON extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this, "Por favor aguarde...",null,true,false);
            }

            @Override
            protected String doInBackground(String... params) {

                String s = "";

                HttpURLConnection httpURLConnection = null;
                try {

                    httpURLConnection = (HttpURLConnection) new URL(params[0]).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty( "Content-Type", "application/json");
                    httpURLConnection.setRequestProperty( "charset", "utf-8");
                    //httpURLConnection.setRequestProperty( "Content-Length", Integer.toString(data.length()));
                    //httpURLConnection.setUseCaches( false );
                    httpURLConnection.setDoInput(true);

                    //Writer writer = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()));
                    //writer.write(data);

                    //writer.close();

                    DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
                    wr.writeBytes(data);

                    int responseCode = httpURLConnection.getResponseCode();

                    InputStream in = httpURLConnection.getInputStream();
                    InputStreamReader inputStreamReader = new InputStreamReader(in);

                    int inputStreamData = inputStreamReader.read();
                    while (inputStreamData != -1) {
                        char current = (char) inputStreamData;
                        inputStreamData = inputStreamReader.read();
                        s += current;
                    }
                    s += "";
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
/*
                HttpURLConnection urlConnection = null;
                try {
                    URL url = new URL("http://timacagro.develop.fluidobjects.com/receive_clients.php");


                    urlConnection = (HttpURLConnection) url.openConnection();
                    urlConnection.setRequestMethod("POST");
                    urlConnection.setRequestProperty( "Content-Type", "application/json");
                    urlConnection.setRequestProperty( "charset", "utf-8");
                    urlConnection.setRequestProperty( "Content-Length", Integer.toString(data.length()));

                    urlConnection.setDoOutput(true);
                    urlConnection.setChunkedStreamingMode(0);

                    byte[] b = data.getBytes();
                    OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
                    out.write(b, 0, data.length());
                    out.flush();
                    out.close();

                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    InputStreamReader inputStreamReader = new InputStreamReader(in);

                    int inputStreamData = inputStreamReader.read();
                    while (inputStreamData != -1) {
                        char current = (char) inputStreamData;
                        inputStreamData = inputStreamReader.read();
                        s += current;
                    }
                    s += "";
                }
                catch (Exception e) {

                }
                finally {
                    urlConnection.disconnect();
                }
*/
                return s;

            }


            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                finish();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                //Log.d("TAG", String.valueOf(NamesArray));
                //Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        }
        SendJSON sj = new SendJSON();
        sj.execute(url);

    }

}