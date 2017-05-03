package br.com.httpfluidobjects.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class NewClientFormActivity extends AppCompatActivity {
    AutoCompleteTextView culturesField;
    AutoCompleteTextView channelsField;
    AutoCompleteTextView srvField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_client_form);

        SQLiteDatabase db;
        db = myDBhelper.getInstance(getApplicationContext()).getWritableDatabase();


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_new_client_form);
        setContentView(R.layout.activity_new_client_form);
        TextView txtView = (TextView) findViewById(R.id.textView10);
        txtView.setText(message);

        EditText cidade = (EditText) findViewById(R.id.txtCidade);
        cidade.setFocusableInTouchMode(true);
        cidade.requestFocus();

        //Bundle extras = intent.getExtras();
        //String[] culturas = extras.getStringArray(MainActivity.EXTRA_MESSAGE2);
        //String[] channels = extras.getStringArray(MainActivity.EXTRA_MESSAGE3);

        ArrayList<String> culturesList = getItensFromDB("cultures", db);
        culturesField = (AutoCompleteTextView) findViewById(R.id.txtCultura);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,culturesList);


        //String[] channels = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE3);

        ArrayList<String> channelsList = getItensFromDB("channels", db);
        channelsField = (AutoCompleteTextView) findViewById(R.id.txtCanal);

        ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,channelsList);

        ArrayList<String> srvList = getItensFromDB("supervisions", db);
        srvField = (AutoCompleteTextView) findViewById(R.id.txtSupervisao);

        ArrayAdapter adapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,srvList);

        channelsField.setAdapter(adapter2);
        channelsField.setThreshold(1);

        culturesField.setAdapter(adapter);
        culturesField.setThreshold(1);

        srvField.setAdapter(adapter3);
        srvField.setThreshold(1);

        culturesField.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view = culturesField.findFocus();
                //TODO: set focus on next view
                EditText sizePropField = (EditText) findViewById(R.id.txtProp);
                sizePropField.setFocusableInTouchMode(true);
                sizePropField.requestFocus();
            }
        });

        channelsField.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view = channelsField.findFocus();
                //TODO: set focus on next view
                EditText cpfField = (EditText) findViewById(R.id.txtCPF);
                cpfField.setFocusableInTouchMode(true);
                cpfField.requestFocus();
            }
        });

        srvField.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view = srvField.findFocus();
                //TODO: set focus on next view
                Button cadastrar = (Button) findViewById(R.id.button2);
                cadastrar.setFocusableInTouchMode(true);
                cadastrar.requestFocus();
                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });

    }

    public void dbCadastrar(View view) {
        SQLiteDatabase db;

        db = myDBhelper.getInstance(getApplicationContext()).getWritableDatabase();

        ContentValues values = new ContentValues();

        EditText editText = (EditText) findViewById(R.id.txtCidade);
        String cidade = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtTelefone);
        String telefone = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtCultura);
        String culture = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtCanal);
        String channel = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtProp);
        String propSize = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtCPF);
        String cpf = editText.getText().toString();

        editText = (EditText) findViewById(R.id.txtSupervisao);
        String srv = editText.getText().toString();

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        Date d = new Date();
        String model = Build.SERIAL;


        values.put("name", name);
        values.put("atc", "");
        values.put("phone", telefone);
        values.put("city", cidade);
        values.put("size", propSize);
        values.put("cpf", cpf);
        values.put("culture ", culture);
        values.put("channel", channel);
        values.put("srv", srv);
        values.put("client", false);
        values.put("tablet", model);
        values.put("date", String.valueOf(d));
        db.insert("visitantes", "name", values);

        db.close();

        Intent newIntent = new Intent(this, MainActivity.class);
        startActivity(newIntent);
    }

    public ArrayList<String> getItensFromDB(String table_name, SQLiteDatabase db) {

        String selectQuery = "SELECT  * FROM "+ table_name;

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

}

