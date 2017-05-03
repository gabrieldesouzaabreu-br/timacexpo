package br.com.httpfluidobjects.myapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by gabrielabreu on 22/02/17.
 */

public class parseJSON {

    public static ArrayList<db_fields> Main(String s)
    {
        try
        {
            JSONObject jsonObject = new JSONObject(s); //cria um objeto Json a partir da string recebida
            JSONArray newJSON = jsonObject.getJSONArray("clients"); //pega o array clients e coloca em um jsonArray
            //System.out.println(newJSON.toString());

            ArrayList<db_fields> fieldsArray = new ArrayList<db_fields>();
            int y = newJSON.length();


            for(int i = 0; i < y; i++)
            {
                JSONObject jsonNameObject = new JSONObject(newJSON.getString(i)); //pega o primeiro elemento desse Array, transforma em string e cria um novo objeto
                db_fields temp = new db_fields();
                temp.setName(jsonNameObject.getString("name"));
                temp.setATC(jsonNameObject.getString("atc"));
                fieldsArray.add(temp);
                //String atc  = jsonNameObject.getString("atc");
                //String name = new JSONObject(newJSON.getString(i)).getString("name");

            }

             return fieldsArray;
            //System.out.println(jsonObject.getString("rcv"));
            //System.out.println(jsonObject.getJSONArray("argv"));
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }


}
