package br.com.httpfluidobjects.myapplication;

import java.util.ArrayList;


/**
 * Created by gabrielabreu on 22/02/17.
 */

public class db_fields {
    String Name = "";
    String ATC = "";

    public void setName(String s)
    {
        Name = s;
    }

    public void setATC(String s)
    {
        ATC = s;
    }

    public String getName()
    {
        return Name;
    }

    public String getATC() {
        return ATC;
    }
}
